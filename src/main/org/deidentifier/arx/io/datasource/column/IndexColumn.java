/*
 * ARX: Efficient, Stable and Optimal Data Anonymization
 * Copyright (C) 2014 Karol Babioch <karol@babioch.de>
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package org.deidentifier.arx.io.datasource.column;

import org.deidentifier.arx.DataType;
import org.deidentifier.arx.io.datasource.ICanContainHeader;


/**
 * Superclass for column types that are only referred to by an index
 *
 * @see {@link ExcelColumn}
 * @see {@link CSVColumn}
 */
abstract public class IndexColumn extends Column implements IIndexedColumn {

    /**
     * Index this column refers to
     *
     * @note Counting starts usually at 0
     */
    private int index;


    /**
     * Creates a new instance of this object with the given parameters
     *
     * @param index {@link #index}
     * @param datatype {@link #dataType}
     *
     * @note This does not assign a name to the column explicitly. The name
     * will be assigned later on either from a header {@link ICanContainHeader}
     * or by some automatic naming scheme.
     */
    public IndexColumn(int index, DataType<?> datatype) {

        this(index, null, datatype);

    }

    /**
     * Creates a new instance of this object with the given parameters
     *
     * @param index {@link #index}
     * @param aliasName {@link Column#setAliasName(String)}
     * @param datatype {@link #dataType}
     *
     * @note This does assign an alias name to the column explicitly.
     */
    public IndexColumn(int index, String aliasName, DataType<?> datatype)
    {

        super(aliasName, datatype);
        setIndex(index);

    }

    /**
     * @return {@link #index}
     */
    public int getIndex() {

        return index;

    }

    /**
     * @param index {@link #index}
     */
    public void setIndex(int index) {

        this.index = index;

    }

}

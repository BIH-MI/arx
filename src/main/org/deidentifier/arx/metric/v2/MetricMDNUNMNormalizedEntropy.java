/*
 * ARX: Powerful Data Anonymization
 * Copyright 2012 - 2017 Fabian Prasser, Florian Kohlmayer and contributors
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.deidentifier.arx.metric.v2;

import org.deidentifier.arx.framework.lattice.Transformation;
import org.deidentifier.arx.metric.MetricConfiguration;


/**
 * This class provides an implementation of normalized non-uniform entropy
 * 
 * @author Fabian Prasser
 * @author Florian Kohlmayer
 */
public class MetricMDNUNMNormalizedEntropy extends MetricMDNUNMNormalizedEntropyPrecomputed {

    /** SVUID. */
    private static final long serialVersionUID = 8815423510640657624L;

    /**
     * Creates a new instance.
     */
    protected MetricMDNUNMNormalizedEntropy() {
        super();
    }
    
    /**
     * Creates a new instance.
     *
     * @param function
     */
    protected MetricMDNUNMNormalizedEntropy(AggregateFunction function){
        super(function);
    }

    /**
     * Returns the configuration of this metric.
     *
     * @return
     */
    public MetricConfiguration getConfiguration() {
        return new MetricConfiguration(false,                      // monotonic
                                       0.5d,                       // gs-factor
                                       false,                      // precomputed
                                       0.0d,                       // precomputation threshold
                                       this.getAggregateFunction() // aggregate function
                                       );
    }

    @Override
    public String getName() {
        return "Normalized non-uniform entropy";
    }

    @Override
    public String toString() {
        return "Normalized non-uniform entropy";
    }

    @Override
    protected AbstractILMultiDimensional getLowerBoundInternal(Transformation node) {
        return null;
    }
}

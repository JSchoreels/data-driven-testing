package com.github.karamelsoft.testing.data.driven.testing.api.builders;

import java.util.function.Function;

/**
 * Created by frederic on 01/05/15.
 */
public interface FunctionBuilder<I, O, R> {

    /**
     *
     * @param function
     * @return
     */
    R function(Function<I, O> function);
}

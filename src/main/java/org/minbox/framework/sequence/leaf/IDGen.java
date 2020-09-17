package org.minbox.framework.sequence.leaf;


import org.minbox.framework.sequence.leaf.common.Result;

public interface IDGen {
    Result get(String key);
    boolean init();
}

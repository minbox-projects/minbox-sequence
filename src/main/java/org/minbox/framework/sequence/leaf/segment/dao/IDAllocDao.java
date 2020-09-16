package org.minbox.framework.sequence.leaf.segment.dao;


import org.minbox.framework.sequence.leaf.segment.model.LeafAlloc;

import java.util.List;

public interface IDAllocDao {
    List<LeafAlloc> getAllLeafAllocs();

    LeafAlloc updateMaxIdAndGetLeafAlloc(String tag);

    LeafAlloc updateMaxIdByCustomStepAndGetLeafAlloc(LeafAlloc leafAlloc);

    List<String> getAllTags();
}

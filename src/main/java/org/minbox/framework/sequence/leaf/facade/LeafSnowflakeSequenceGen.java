package org.minbox.framework.sequence.leaf.facade;


import org.minbox.framework.sequence.SequenceGen;
import org.minbox.framework.sequence.leaf.exception.InitException;
import org.minbox.framework.sequence.leaf.service.SnowflakeService;

/**
 * 基于美团 Leaf 雪花算法生成 id
 */
public class LeafSnowflakeSequenceGen implements SequenceGen {

    private final SnowflakeService snowflakeService;

    public LeafSnowflakeSequenceGen(String zkpath, int port) throws InitException {
        this.snowflakeService = new SnowflakeService(zkpath, port);
    }

    @Override
    public long get() {
        return snowflakeService.getId(DEFAULT_KEY).getId();
    }

    @Override
    public long get(String key) {
        return snowflakeService.getId(key).getId();
    }
}

package org.minbox.framework.sequence.snawflake;

import org.minbox.framework.sequence.SequenceGen;

/**
 * @author 码哥字节
 * @date 2020/9/14 18:34
 * 使用雪花算法实现
 */
public class SnawflakeGen implements SequenceGen {

    private final SnowflakeIdWorker snowflakeIdWorker;

    public SnawflakeGen(SnowflakeIdWorker snowflakeIdWorker) {
        this.snowflakeIdWorker = snowflakeIdWorker;
    }

    @Override
    public long get() {
        return snowflakeIdWorker.nextId();
    }

    @Override
    public long get(String key) {
        return snowflakeIdWorker.nextId();
    }
}

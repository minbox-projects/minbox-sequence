package org.minbox.framework.sequence.id.leaf;

import org.junit.Test;
import org.minbox.framework.sequence.leaf.common.PropertyFactory;
import org.minbox.framework.sequence.leaf.exception.InitException;
import org.minbox.framework.sequence.leaf.facade.LeafSnowflakeSequenceGen;

public class SnowflakeIDGenImplTest {
    @Test
    public void testGetId() throws InitException {
        // Properties properties = PropertyFactory.getProperties();
        // PropertyFactory.setLeafName(properties.getProperty("snawflake.name"));
        LeafSnowflakeSequenceGen sequenceGen = new LeafSnowflakeSequenceGen("dev-zk.lls.com:2181"
                , 8688);
        for (int i = 1; i < 1000; ++i) {
            long a = sequenceGen.get("a");
            System.out.println(a);
        }

    }

    /**
     * 当 properties 文件不存在的时候防止启动报错
     */
    @Test
    public void testProperties() {
        PropertyFactory.getProperties().getProperty("ss");
    }
}
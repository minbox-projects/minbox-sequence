package org.minbox.framework.sequence.id.leaf;

import org.junit.Test;
import org.minbox.framework.sequence.leaf.common.PropertyFactory;
import org.minbox.framework.sequence.leaf.exception.InitException;
import org.minbox.framework.sequence.leaf.facade.LeafSnowflakeSequenceGen;

import java.util.Properties;

public class SnowflakeIDGenImplTest {
    @Test
    public void testGetId() throws InitException {
        Properties properties = PropertyFactory.getProperties();
        PropertyFactory.setLeafName(properties.getProperty("snawflake.name"));
        LeafSnowflakeSequenceGen sequenceGen = new LeafSnowflakeSequenceGen(properties.getProperty("zk.list")
                , Integer.parseInt(properties.getProperty("snowflake.port")));
        for (int i = 1; i < 1000; ++i) {
            long a = sequenceGen.get("a");
            System.out.println(a);
        }

    }
}
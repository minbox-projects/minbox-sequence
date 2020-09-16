package org.minbox.framework.sequence.id.leaf;

import org.junit.Before;
import org.junit.Test;
import org.minbox.framework.sequence.SequenceGen;
import org.minbox.framework.sequence.leaf.common.PropertyFactory;
import org.minbox.framework.sequence.leaf.exception.InitException;
import org.minbox.framework.sequence.leaf.facade.LeafSegmentSequenceGen;

import java.sql.SQLException;
import java.util.Properties;

public class IDGenServiceTest {
    SequenceGen idGen;

    @Before
    public void before() throws InitException, SQLException {
        // Load Db Config
        Properties properties = PropertyFactory.getProperties();
        idGen = new LeafSegmentSequenceGen(properties.getProperty("jdbc.url"), properties.getProperty("jdbc.username")
                , properties.getProperty("jdbc.password"));
    }
    @Test
    public void testGetId() {
        for (int i = 0; i < 100; ++i) {
            long l = idGen.get("leaf-segment-test");
            System.out.println(l);
        }
    }

}
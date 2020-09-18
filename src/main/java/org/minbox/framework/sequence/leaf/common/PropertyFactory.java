package org.minbox.framework.sequence.leaf.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 加载 leaf.properties
 */
public class PropertyFactory {

    private static final Logger logger = LoggerFactory.getLogger(PropertyFactory.class);

    private static final Properties prop = new Properties();

    public static String leafname = "leaf-snowflake";
    public static void setLeafName(String leafName){
        PropertyFactory.leafname=leafName;
    }

    static {
        try (InputStream resourceAsStream = PropertyFactory.class.getClassLoader().getResourceAsStream("leaf.properties")) {
            if (resourceAsStream != null) {
                prop.load(resourceAsStream);
            }
        } catch (IOException e) {
            logger.warn("Load Properties Ex", e);
        }
    }
    public static Properties getProperties() {
        return prop;
    }
}

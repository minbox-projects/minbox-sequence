package org.minbox.framework.sequence.id.snawflake;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.minbox.framework.sequence.snawflake.SnawflakeGen;
import org.minbox.framework.sequence.snawflake.SnowflakeIdWorker;

import java.util.ArrayList;

/**
 * @author lijianqing
 * @date 2020/9/14 19:23
 */
@Slf4j
public class SnowflakeIdWorkerTest {

    @Test
    public void test() {
        SnawflakeGen snawflakeGen = new SnawflakeGen(new SnowflakeIdWorker());
        ArrayList<Long> list = new ArrayList<>();
        for (int i = 1; i < 1000; ++i) {
            long id = snawflakeGen.get("leaf-segment-test");
            list.add(id);
        }
        log.info("list = {}", list.toString());
    }

}

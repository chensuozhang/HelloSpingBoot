package com.helloworld.test;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LoggingTest {
    Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    public void contextLoads(){
        // 日志的级别 trace debug info warn error；
        // 可以调整日志的输出级别，默认的输出级别是info，只会输出info以及info后默认的级别；
        logger.trace("这个是trace信息");
        logger.debug("这个是debug信息");
        logger.info("这个是info信息");
        logger.warn("这个是warning信息");
        logger.error("这个是error信息");
    }
}

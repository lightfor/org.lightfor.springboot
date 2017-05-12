package org.lightfor.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * 测试类
 * Created by Light on 2017/5/11.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootConfiguration
@WebAppConfiguration
public class ReadingListApplicationTests {

    @Test
    public void contextLoads(){
        //测试配置加载是否正确
    }
}

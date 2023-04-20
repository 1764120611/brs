package com.hainiu;

import org.junit.Assert;
import org.junit.Test;

public class DemoTest {
    @Test
    public  void testSay(){
        Demo d=new Demo();
        String ret = d.say("brs");
        Assert.assertEquals("hello brs",ret);
    }
}

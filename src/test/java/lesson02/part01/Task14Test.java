package lesson02.part01;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import util.SystemOutGatewayUtil;

import java.io.ByteArrayOutputStream;

import static org.junit.Assert.*;
@RunWith(JUnit4.class)

public class Task14Test {
    @Before
    public void setUp() throws Exception {
        SystemOutGatewayUtil.setCustomOut();

    }
    @After
    public void tearDown() throws Exception {
        SystemOutGatewayUtil.setOriginalOut();
    }
    @Test
    public void CheckOutput(){
        Task14.main(null);
        ByteArrayOutputStream s = SystemOutGatewayUtil.getOutputArray();
        String s2 = s.toString();
        Assert.assertEquals("Red\r\n" +
                "Orange\r\n" +
                "Yellow\r\n" +
                "Green\r\n" +
                "Blue\r\n" +
                "Indigo\r\n" +
                "Violet\r\n", s2);
    }
}
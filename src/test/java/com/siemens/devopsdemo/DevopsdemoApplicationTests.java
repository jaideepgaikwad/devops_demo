package com.siemens.devopsdemo;

import com.siemens.devopsdemo.service.MyService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DevopsdemoApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void testMyService(){
		MyService myService = new MyService();
		Assert.assertEquals(2, myService.addNumber(1,1));
	}
}

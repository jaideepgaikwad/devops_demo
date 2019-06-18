package com.siemens.devopsdemo;

import com.siemens.devopsdemo.service.MyService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DevopsdemoApplicationTests {

	@Autowired
	MyService myService;

	@Test
	public void contextLoads() {
		new DevopsdemoApplication();
	}

	@Test
	public void testMyService(){
		Assert.assertEquals(2, myService.addNumber(1,1));
	}
}

package org.example.javalin.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HelloWorldTest {

	@Test
	void helloWorldExampleTest() {
		Assert.assertEquals(1, 1, "1 == 1");
	}

}
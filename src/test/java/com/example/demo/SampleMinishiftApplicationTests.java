package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.testcontainers.containers.MongoDBContainer;
import org.testcontainers.utility.DockerImageName;

@SpringBootTest
class SampleMinishiftApplicationTests {

	@Test
	void contextLoads() {
		final MongoDBContainer mongoDBContainer = new MongoDBContainer("mongo:4.0.10");
		mongoDBContainer.start();

		System.out.println(">Is Running??????????????????????????????????????" +mongoDBContainer.isRunning());
	}

}

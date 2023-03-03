package com.example.operationlogtest;

import com.example.operationlogtest.service.OrderRequest;
import com.example.operationlogtest.service.OrderServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@SpringBootTest
class OperationLogTestApplicationTests {
	@Autowired
	OrderServiceImpl orderService;

	@Test
	void test1() throws InterruptedException {
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 5; i++) {
			executorService.execute(() -> {
				OrderRequest orderRequest = new OrderRequest();
				orderRequest.setUserId("123");
				orderService.creteOrder(orderRequest);
			});

		}
		TimeUnit.SECONDS.sleep(10);
	}

}

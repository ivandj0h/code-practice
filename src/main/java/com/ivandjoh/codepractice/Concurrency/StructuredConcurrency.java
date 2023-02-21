package com.ivandjoh.codepractice.Concurrency;

import java.time.Duration;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class StructuredConcurrency {

    Response handleUnStructureAPI() throws ExecutionException, InterruptedException, ExecutionException {
        try (var executor = Executors.newFixedThreadPool(10)) {
            Future<String> user = executor.submit(this::findUser);
            Future<Integer> order = executor.submit(this::fetchOrder);
            String theUser = user.get();   // Join findUser
            int theOrder = order.get();  // Join fetchOrder
            return new Response(theUser, theOrder);
        }
    }

    private String findUser() throws InterruptedException {
        Thread.sleep(Duration.ofSeconds(5));
        return "Ivandjoh";
    }

    private Integer fetchOrder() throws InterruptedException {
        Thread.sleep(Duration.ofSeconds(5));
        return 5;
    }

    record Response(String x, int y) {
    }

    public static void executeStructuredConcurrency() throws ExecutionException, InterruptedException {
        StructuredConcurrency structuredConcurrency = new StructuredConcurrency();
        Response response = structuredConcurrency.handleUnStructureAPI();
        System.out.println(response);
    }
}

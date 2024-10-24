package com.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
	
	public static void main(String[] args) throws InterruptedException {
		
		double beforeTime = System.currentTimeMillis();
		System.out.println("beforeTime : "+beforeTime/1000.0 +"초");
		Tmethod();
		methodOne();
		methodTwo();
		methodThree();
		double afterTime = System.currentTimeMillis();
		System.out.println("afterTime : "+afterTime);
		double secDiffTime = (double) ((afterTime - beforeTime)/1000.0);
		System.out.println("걸린시간은 : "+secDiffTime +"초");
		Thread currentThread = Thread.currentThread();
		System.out.println("현재 실행중인 스레드: " + currentThread.getName());
		/* 시작  */
		// 01 더미데이터 생성
        Thread currentThread1 = Thread.currentThread();
        System.out.println("현재 실행중인 스레드: " + currentThread1.getName());
        
		List<Map<Integer, String>> list = new ArrayList<>();

        for (int i = 0; i < 500; i++) {
            Map<Integer, String> map = new HashMap<>();
            for (int j = 0; j < 50; j++) {
                map.put(j, "value" + j);
            }
            if (i == 50){break;}

            list.add(map);
        }

        System.out.println(list);
        //System.out.println(list.get(2).get(3));
        
		// 02 쓰레드 풀 생성
		ExecutorService threadExecutor = Executors.newFixedThreadPool(5);
		
		
        // 03  작업 분배
		for (Map<Integer, String> data : list) {
			threadExecutor.submit(() -> { // 이 람다식을 이용하면 단점: 로컬 변수는 변경및 재할당이 불가능함 
				// 04 비즈니스 로직들 실행 스레드 세이프하게 로직 실행
				Tmethod();
				try {
					methodOne();
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
				methodTwo();
				methodThree();
				Thread currentThread2 = Thread.currentThread();
				System.out.println("현재 실행중인 스레드: " + currentThread2.getName());
            });
        }


        // 스레드 풀 종료
        threadExecutor.shutdown();
        
        
        
        
        
        
		
		
	}
	
	
	
/*	public void process1(List<CoreMap> dataList, DataSource dataSource) throws InterruptedException {
	    int numWorkers = Runtime.getRuntime().availableProcessors(); // CPU 코어 수만큼 스레드 생성

	    ExecutorService executor = Executors.newFixedThreadPool(numWorkers);

	    int chunkSize = (dataList.size() + numWorkers - 1) / numWorkers; // 데이터 리스트를 적절한 크기의 청크로 분할

	    for (int i = 0; i < numWorkers; i++) {
	        int startIndex = i * chunkSize;
	        int endIndex = Math.min(startIndex + chunkSize, dataList.size());
	        executor.execute(new Worker(dataList, startIndex, endIndex, dataSource));
	    }

	    executor.shutdown();
	    executor.awaitTermination(Long.MAX_VALUE, TimeUnit.MILLISECONDS);
	}*/
	
/*	public void ParrelProc(){
		ExecutorService executor = Executors.newFixedThreadPool(5);
		List<Future<String>> futures = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
		    final int index = i;
		    Future<String> future = executor.submit(() -> {
		        Thread.sleep(5000);
		        return Thread.currentThread().getName() + ", index=" + index + ", ended at " + new Date();
		    });
		    futures.add(future);
		}

		for (Future<String> future : futures) {
		    String result = future.get();
		    System.out.println("Thread result: " + result);
		}

		executor.shutdown();
	}*/

	
	public static void Tmethod(){
		int result = 0;
	
		for(int i=0; i < 100000000;  i++){ 
			result += i;
		}
		System.out.println("Tmethod : "+"총 sum 은 : "+result);
	}
	
	public static void methodOne() throws InterruptedException {
	    Thread.sleep(3000); // 3초 대기
	    System.out.println("Method One");
	}

	public static void methodTwo() {
	    int result = 0;
	    for(int i=0; i < 100000000;  i++){ 
	        result += i;
	    }
	    System.out.println("Method Two");
	}

	public static void methodThree() {
	    double x = 0.0001;
	    for(int i=0; i < 100000000;  i++){ 
	        x += Math.sqrt(x);
	    }
	    System.out.println("Method Three");
	}

	/*public static void methodFour() {
	    String s = "A";
	    for(int i=0; i < 100000000;  i++){ 
	        s += "A";
	    }
	    System.out.println("Method Four");
	}*/
}

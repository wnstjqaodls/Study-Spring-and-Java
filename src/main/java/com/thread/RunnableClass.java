package com.thread;

public class RunnableClass implements Runnable {
	// 2. Runnable 인터페이스 추상메서드 run 구현!

	@Override
	public void run() {
		System.out.println("임플리먼트 스레드 : 런너블 오버라이딩");
		
		long num = (long) Math.random();
		try {
			System.out.printf("임플리먼트 스레드 : %d 밀리세컨드 만큼 스레드가 중지됩니다.",num);
			Thread.sleep(num);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		System.out.println("스레드의 마지막실행");
	}

}

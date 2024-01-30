package com.thread;

	public class ThreadClass extends Thread {
		// 1. Thread 클래스의 run() 메소드 오버라이딩으로 구현
		// Thread 상속받으면 다른클래스 상속못받아서 보통 Runnable 인터페이스 구현하는게 일반적임
		@Override
		public void run() {
			System.out.println("상속 스레드 : 런메소드 오버라이딩");
			
			long num = (long) Math.random();
			try {
				System.out.printf("상속 스레드 : %d 밀리세컨드 만큼 스레드가 중지됩니다.",num);
				Thread.sleep(num);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			System.out.println("스레드의 마지막실행");
		}
		
	}

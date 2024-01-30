package com.run;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.thread.RunnableClass;
import com.thread.ThreadClass;

public class Program {

	public static void main(String[] args) {

		// 첫번째인자
		
		String IO_option = null;
		String fullFilePath = null;
		
		for (int i =0; i< args.length; i++)	{
			 IO_option = args[i];
			 fullFilePath = args[i];
		}
		// 두번째인자
		
		System.out.println("프로그램의 실행인자갯수 : "+args.length);
		System.out.println("프로그램이 실행되었습니다");
		System.out.println("실행시 받은 인자들 : "+args.toString());
		System.out.println("실행옵션 \n fr : FileRead from file");
		System.out.println(" ir : Read from Stream");
		System.out.println(" fw : FileWrite from file");
		System.out.println(" iw : Write from outStrem");

		
		System.out.println("메인 스레드 : 쓰레드가 잠시 중지됩니다");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		
		
		IOProgram instance = new IOProgram();
		
		if (args.length != 0) {
			
		
		try {
			
			if (IO_option.equals("fr")) {
				instance.doFileRead(fullFilePath);
			} else if (IO_option.equals("ir")) {
				instance.doInputRead(fullFilePath);
			} else if (IO_option.equals("fw")) {
				instance.doFileWirte(fullFilePath);
			} else if (IO_option.equals("iw")) {
				instance.doInputWirte(fullFilePath);
			}
			
			
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		
		}
		
		ThreadClass t1 =  new ThreadClass();
		Thread t2 = new Thread(new RunnableClass());
		
		// 스레드를 실행할때는 run이아닌 start 해야한다.
		t1.start();
		t2.start();
		

		System.out.println("프로그램이 종료됩니다.");
		
	}

}

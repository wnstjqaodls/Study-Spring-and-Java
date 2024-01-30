package com.run;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class IOProgram {
	
	
	
	public IOProgram() {
		super();

	}

	public void doInputRead(String fullFilePath) throws FileNotFoundException{
		// read from file
		// Buffer default is 8kb
		// BufferedReader reader = new BufferedReader(new FileReader(fullFilePath));
			
		// ex ) 16kb Buffer Size
		// BufferedReader reader = new BufferedReader(new FileReader(fullFilePath), 16384);
		
		// read from Input
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String line;
		
		try {
			while ((line = reader.readLine()) != null ){
				System.out.println(line);
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	public void doFileRead(String fullFilePath) throws FileNotFoundException{
		// read from file
		// Buffer default is 8kb
		
		// 파일객체 생성
		 BufferedReader reader = new BufferedReader(new FileReader(fullFilePath));
		// ex ) 16kb Buffer Size
		// BufferedReader reader = new BufferedReader(new FileReader(fullFilePath), 16384);
		
		// read from Input
		//BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String line;
		
		try {
			while ((line = reader.readLine()) != null ){
				System.out.println(line);
			}
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
	
	public void doFileWirte(String fullFilePath) throws IOException {
		
		File File1 = new File("D:/skylark-2.0.0/wildfly-10.1.0.Final/standalone/configuration/standalone.xml");
		BufferedWriter writer = new BufferedWriter(new FileWriter(fullFilePath));
		
		writer.append("Test\n");
		// flush 호출시 버퍼의 내용이 파일에 저장됨!
		writer.flush();
		
		writer.append("TEST\n");
		// append 호출시 버퍼보다 큰 양의 데이터 입력시 자동으로 flush()가 호출되면서 버퍼데이터가 파일에 저장됨!
		writer.flush();
		
		writer.close();
		
		
		
	}
	
	
	public void doInputWirte(String fullFilePath) throws IOException {
		
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		writer.append("Test\n");
		// flush 호출시 버퍼의 내용이 파일에 저장됨!
		writer.append("BufferWirter\n");
		writer.flush();
		// append 호출시 버퍼보다 큰 양의 데이터 입력시 자동으로 flush()가 호출되면서 버퍼데이터가 파일에 저장됨!
		writer.close();
		
		
		
	}
	
	
	

}

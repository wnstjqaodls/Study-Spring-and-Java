package com.mycompany.myapp;

import java.util.HashMap;
import java.util.Map;

public class LinkCallMethod {
	

		
		
		
	    // 문제가있던 메서드
		public int returnInt (boolean flag) {
			HashMap<String, String> adParam = new HashMap<String, String>();
			boolean trueOrFalse = flag;
			
			if (trueOrFalse) {
				adParam.put("Error", "groupErr");
			} else {
				adParam.put("Error", "groupErr1");
			}
			
			String msg = adParam.get("Error");
			
			if (msg.indexOf("groupErr") > 0) {
				System.out.println("1");
			} else if (msg.indexOf("groupErr1") > 0) {
				System.out.println("2");
			} else {
				System.out.println("3");
				
			}
			
			return 0;
			
		}
		
		// 개선된 메서드
		public int returnInt (boolean flag , String meaningless) {
		    HashMap<String, String> adParam = new HashMap<String, String>();
		    boolean tf = flag;
		    
		    if (tf) {
		        adParam.put("Error", "groupErr");
		    } else {
		        adParam.put("Error", "groupErr1");
		    }
		    
		    String msg = adParam.get("Error");
		    
		    if (msg.indexOf("groupErr") == 0) {
		        System.out.println("1");
		    } else if (msg.indexOf("groupErr1") == 0) {
		        System.out.println("2");
		    } else {
		        System.out.println("Invalid message");
		    }
		    
		    return 0;
		}

}

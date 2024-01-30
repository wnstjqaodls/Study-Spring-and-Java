package com.encoding;

import java.util.Base64;

public class EncodingExample {
	
	public static void main(String[] args) {
		 String originalMessage = "Hello, World!";

	        // Encoding
	        byte[] encodedBytes = Base64.getEncoder().encode(originalMessage.getBytes());
	        String encodedMessage = new String(encodedBytes);
	        System.out.println("Encoded Message: " + encodedMessage);

	        // Decoding
	        byte[] decodedBytes = Base64.getDecoder().decode(encodedMessage);
	        String decodedMessage = new String(decodedBytes);
	        System.out.println("Decoded Message: " + decodedMessage);
	}

}

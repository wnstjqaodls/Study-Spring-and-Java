package com;

public class MakeData {
	public static void main(String[] args) {
	        String baseString = "OANEGO-1248101111-29000003333";
	        int count = 500;

	        for (int i = 0; i < count; i++) {
	            String incrementedString = incrementLastDigit(baseString, i);
	            System.out.println(incrementedString);
	        }
	    }

	    private static String incrementLastDigit(String baseString, int increment) {
	        int lastDigitIndex = baseString.length() - 1;
	        int lastDigit = Character.getNumericValue(baseString.charAt(lastDigitIndex));
	        int newLastDigit = (lastDigit + increment) % 10;
	        String incrementedString = baseString.substring(0, lastDigitIndex) + newLastDigit;
	        return incrementedString;
	    }

}

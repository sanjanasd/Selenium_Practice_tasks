package com.javatopics;
 class example {
	// Define a method that throws an exception
	    // A method that throws an Exception
	    public static void throwError() throws Exception {
	        throw new Exception("This is an example exception");
	    }
	}
	// Example usage
	public class throws1 {
	    public static void main(String[] args) {
	        try {
	            example.throwError(); // This will throw an Exception
	        } catch (Exception e) {
	            // Handle the exception
	            System.out.println("Exception occurred: " + e.getMessage());
	        }
	    }
	}

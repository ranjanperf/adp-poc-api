package com.adp.util;

public class StringUtil {

	public static String stringToCamelCase(String input) 
    { 
        input = input.substring(0, 1).toUpperCase() 
              + input.substring(1); 
  
        StringBuilder builder 
            = new StringBuilder(input); 
  
        for (int i = 0; i < builder.length(); i++) { 
  
            if (builder.charAt(i) == ' ') { 
  
                builder.deleteCharAt(i); 
                builder.replace( 
                    i, i + 1, 
                    String.valueOf( 
                        Character.toUpperCase( 
                            builder.charAt(i)))); 
            } 
        } 
  
        return builder.toString(); 
    }
	
}

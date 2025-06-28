package org.sample;

public class Sample {
	
	
public static void main(String[] args) {
	
	int  a = 10;
	
	System.out.println(a);
	
	String s = "SmartSkillsTech@123gmail.com";
      
	String S1=  s.replaceAll("S", "***");
	  System.out.println(S1);
	  
      if (s.contains("Tech")) {
		
    	  System.out.println("Tech is present on String");
    	  
	} else {

		System.out.println("tech is not present on String");
		
	}
	  
	  
}

}

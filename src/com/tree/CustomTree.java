package com.tree;

import java.util.HashMap;
import java.util.StringTokenizer;

public class CustomTree {

	
	public static  boolean checkCustomTree(String []links){
		boolean custom=true;
		int i=0;
		HashMap checker=new HashMap();
		for(String link:links){
			
			String []elements=link.split(" ");
			
			if(i==0){
				checker.put(elements[0], 1);
				checker.put(elements[1], 1);
			}else{
				
				if(checker.containsKey(elements[0]) || checker.containsKey(elements[1])){
					if(checker.containsKey(elements[0])){
						
						
						if((Integer)checker.get(elements[0])>1){
							return false;
						}else{
					
							int joinvalue=(Integer)checker.get(elements[0]);
							checker.put(elements[0], joinvalue++);
						}
					}
					
                    if(checker.containsKey(elements[1])){
						
						
						if((Integer)checker.get(elements[1])>1){
							return false;
						}else{
					
							int joinvalue=(Integer)checker.get(elements[1]);
							checker.put(elements[1], joinvalue++);
						}
					}
					
					
				}else{
					return false;
				}
				
				
			}
			i++;
			
		}
		
		
		
		return custom;
	}
	
	public static void main(String[] args) {
		 String [] links1 = {"a b", "b c", "b d", "a e"};
		 String [] links2 = {"a b", "a g", "b c", "c d", "d e", "c f",
                 "z y", "y x", "x w"};
		 
		String possible=checkCustomTree(links1)?"yes":"no";
		 
		System.out.println("Custom Tree Possible for links 1 "+ possible);
		 
		 String possible1=checkCustomTree(links2)?"yes":"no";
		 
		 System.out.println("Custom Tree Possible for links 2"+ possible1);
		 
	}
}

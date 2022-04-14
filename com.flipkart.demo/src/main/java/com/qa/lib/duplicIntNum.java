package com.qa.lib;

import java.util.HashMap;
import java.util.Map;

public class duplicIntNum {
	
	
	static void countFre(int arr[], int n) {
		
		Map<Integer,Integer> hmap = new HashMap<Integer,Integer>();
		
		for(int i=0;i<n;i++) {
			
			if(hmap.containsKey(arr[i])) {
				
				hmap.put(arr[i], hmap.get(arr[i])+1);
				
			}
			else {
				hmap.put(arr[i], 1);
			}
		}
		
		for(Map.Entry<Integer, Integer> entry :hmap.entrySet())
		{
			if(entry.getValue()>1) {
			
			System.out.println(entry.getKey() +  entry.getValue());
			
		}
			
		}
		
		
	}
	
	
	

	public static void main(String[] args) {
		
		
	}

}

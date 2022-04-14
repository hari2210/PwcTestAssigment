package com.qa.lib;

import java.util.Arrays;

public class duplicateNumbers {

	public static void main(String[] args) {
		
			
			
			int[] nums = new int[] {1,1,2,3,3,3};
			Arrays.sort(nums);
			for(int i=0;i<nums.length-1;i++) {
						
				if(nums[i]==nums[i+1]) {
					System.out.println("duplicate item");
				}
				
			}

		}

	}
		




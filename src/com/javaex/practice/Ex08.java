package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {
		int[] num = new int [6];
		int random = 0;
		
		for (int i = 0; i < num.length; i++) {
			random = (int)(Math.random()*45)+1;
			
			for (int j =0; j < i; j++) {
				if (num [j] == random) {
					random = (int)(Math.random()*45)+1;
					j = -1;
				}
				
			}
			
			 num[i] = random;
			 System.out.print(num[i]+" ");
		}

	}

}

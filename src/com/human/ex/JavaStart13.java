package com.human.ex;

public class JavaStart13 {

	public static void main(String[] args) {
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		
		int max,min;//초기화
		max=0;min=0;//-5, -3
		max=Integer.MIN_VALUE;//int중에 가장 작은 수
		min=Integer.MAX_VALUE;//int중에 가장 큰 수
		
		for(int i=0;i<5;i++) {
			System.out.print("수 입력");
			int input=Integer.parseInt(sc.nextLine());
			if(max<input) {
				max=input;
			}
			if(min>input) {
				min=input;
			}
		}
		System.out.println("큰수:"+max+"작은수"+min);
		
	}
}
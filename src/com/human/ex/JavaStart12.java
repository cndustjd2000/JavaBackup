package com.human.ex;

public class JavaStart12 {

	public static void main(String[] args) {
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		
		//12페이지 2번 문제
		System.out.println("첫 번째 수를 입력하세요.");
		int c1=Integer.parseInt(sc.nextLine());
		System.out.println("두 번째 수를 입력하세요.");
		int c2=Integer.parseInt(sc.nextLine());
		System.out.println("세 번째 수를 입력하세요.");
		int c3=Integer.parseInt(sc.nextLine());
		System.out.println("네 번째 수를 입력하세요.");
		int c4=Integer.parseInt(sc.nextLine());
		System.out.println("다섯 번째 수를 입력하세요.");
		int c5=Integer.parseInt(sc.nextLine());
		
		int max=0;
		if(max<c1) {
		max=c1;
		}
		if(max<c2) {
		max=c2;
		}
		if(max<c3) {
		max=c3;
		}
		if(max<c4) {
		max=c4;
		}
		if(max<c5) {
		max=c5;
		}

		if(c1<c2) {
		c2=c1;
		}
		if(c2<c3) {
		c3=c2;
		}
		if(c3<c4) {
		c4=c3;
		}
		if(c4<c5) {
		c5=c4;
		}
		int min=c5;
		System.out.println("가장 큰 수는:"+max);
		System.out.println("가장 작은 수는:"+min);
	}
}
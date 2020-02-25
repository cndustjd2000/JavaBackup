package com.human.ex;

public class JavaStart04 {

	public static void main(String[] args) {
	/*	boolean isFlag=false;
		int a=0;
		if(isFlag) {
			a=5;
			System.out.println(isFlag);
			
		}else {
			a=10;
		}
		System.out.println(a);
		
		//선택문 > if, switch
		//반복문 > for, while, do while
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		System.out.println("숫자를 입력하시오.");
		int input = Integer.parseInt(sc.nextLine());
		
		int A=0;
		
		if(input>0) {
			A=1;
		}else {
			A=-1;
		}
		System.out.println(A);
		
		//두 수를 입력 받아서 큰 수를 출력
		
		System.out.println("첫 수를 입력하시오.");
		int b = Integer.parseInt(sc.nextLine());
		System.out.println("마지막 수를 입력하시오.");
		int c = Integer.parseInt(sc.nextLine());
		
		if(b>c){
			System.out.println(b);
		}else {
			System.out.println(c);
		}
		*/
		//a=6 b=20 일때 a에 두 변수가 가지고 있는 값을 교환하여 a=20, b=6으로 만들어 보자.
		
		/*int a=6;
		int b=20;
		int c=a;
		a=b;
		b=c;
		System.out.println("a= "+ a);
		System.out.println("b= "+b);
		*/
		//사용자에게 두 가지 숫자를 입력 받아 큰 수를 a, 작은수를 b에 넣어서 a,b를 출력하시오.
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		System.out.println("처음 수를 입력하시오.");
		int a=Integer.parseInt(sc.nextLine());
		System.out.println("마지막 수를 입력하시오.");
		int b=Integer.parseInt(sc.nextLine());
		
		if(a>b) {
			System.out.println("a: "+a+", b: "+b);
		}else {
			int c=a;
			a=b;
			b=c;
			System.out.println("a: "+a+", b: "+b);
		}
		
		//
		
	}
}
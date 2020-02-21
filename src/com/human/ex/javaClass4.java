package com.human.ex;

public class javaClass4 {
	public static void main(String[] args) {
		//1번 문제
		int a1=10;
		int a2=3;
		int a3=a1/a2;
		int a4=a1%a2;
		System.out.println(a3);
		System.out.println(a4);
		
		//2번 문제
		int b1=3;
		int b2=b1*b1*b1;
		
		//3번 문제
		int x=1;
		int y=2;
		int z=3;
		int xyz=x*y-z;
		System.out.println(xyz);
		
		//4번 문제
		int c1=375;
		int c2=573%10;
		int c3=573/10%10;
		int c4=573/100%10;
		System.out.println(c2+"백"+c3+"십"+c4);
		
		//5번 문제
		double d1=10;
		double d2=d1*d1*d1-20;
		double d3=d1-7;
		System.out.println(d2/d3);
		
		//6번 문제
		int x1=10;
		int y1=20;
		int x2=30;
		int y2=40;
		double abc=((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1));
		System.out.println("거리는"+Math.sqrt(abc));
		
	}

}





package com.human.ex;

public class javaClass2 {
	public static void main(String[] args) {
		//변수
		//자료형 변수명=자료형의 상수
		
		//boolean형의 변수를 생성해서 true를 찍어보자.
		boolean abc=true;
		//변수를 출력하는 방법
		System.out.println(abc);
		
		//변수에 boolean형 false를 넣어서 찍어보자
		//boolean abc=false;//변수명은 식별자이고 식별자는 유일해야 한다.
		boolean abc2=false;
		System.out.println(abc2);
		
		//abc2 변수에 값을 찍어본 다음 abc2값을 true로 변경 후 다시 abc2 변수를 찍어보자.
		System.out.println(abc2);
		abc2=true;
		System.out.println(abc2);
		
		//abc2값을 false로 변경 후 abc2값을 abc1값으로 변경 후 abc2값을 출력하라.
		abc2=false;
		abc2=abc;
		System.out.println(abc2);
		
		
	}

}





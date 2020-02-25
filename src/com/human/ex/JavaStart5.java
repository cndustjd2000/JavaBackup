package com.human.ex;

class Human{
	public String name;
	public int age;
	public double tall;
}

class Cat{
	public String hairColor;
	public int legCount;
	public int age;
}

class Dog{
	public String hairColor;
	public int legCount;
	public int age;
}

public class JavaStart5 {

	public static void main(String[] args) {
		//class
		//사람 정보를 담아서 화면에 출력 해보자.
		//이름, 나이, 키 변수에 넣어보자.
		
		String name="홍길동";
		int age=29;
		double tall=125.4;
		
		System.out.println("name :"+name);
		System.out.println("age : "+age);
		System.out.println("tall :"+tall);
		System.out.println("");
		
		//사람이 3명이면? 강아지 고양이 등 데이터가 섞여 있으면?
		//관련있는 데이터를 묶고새로운 자료형을 만들어 문제 해결 가능
		//파일 하나에는 public class는 무조건 하나만
		
		
		Human h=new Human();
		h.name="홍길동";
		h.age=age;
		h.tall=123.34;
		System.out.println("name:"+h.name);
		System.out.println("age:"+h.age);
		System.out.println("tall:"+h.tall);
		System.out.println("");
		
		Human h1=new Human();
		h1.name="나르샤";
		h1.age=23;
		h1.tall=153.34;
		System.out.println("name:"+h1.name);
		System.out.println("age:"+h1.age);
		System.out.println("tall:"+h1.tall);
		System.out.println("");
		
		//고양이와 강아지 데이터를 저장할 수 있는 클래스를 만들어 2마리씩 출력
		//hairColor, legCount, age
		
		Cat c=new Cat();
		c.hairColor="파란색";
		c.legCount=4;
		c.age=6;
		System.out.println("hairColor:"+c.hairColor);
		System.out.println("legCount:"+c.legCount);
		System.out.println("age:"+c.age);
		System.out.println("");
		
		Cat c1=new Cat();
		c1.hairColor="검은색";
		c1.legCount=4;
		c1.age=4;
		System.out.println("hairColor:"+c1.hairColor);
		System.out.println("legCount:"+c1.legCount);
		System.out.println("age:"+c1.age);
		System.out.println("");
		
		Dog d=new Dog();
		d.hairColor="흰색";
		d.legCount=4;
		d.age=1;
		System.out.println("hairColor:"+d.hairColor);
		System.out.println("legCount:"+d.legCount);
		System.out.println("age:"+d.age);
		System.out.println("");
		
		Dog d1=new Dog();
		d1.hairColor="검은색";
		d1.legCount=4;
		d1.age=7;
		System.out.println("hairColor:"+d1.hairColor);
		System.out.println("legCount:"+d1.legCount);
		System.out.println("age:"+d1.age);
		System.out.println("");
		
	}
}
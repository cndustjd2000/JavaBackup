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
		//��� ������ ��Ƽ� ȭ�鿡 ��� �غ���.
		//�̸�, ����, Ű ������ �־��.
		
		String name="ȫ�浿";
		int age=29;
		double tall=125.4;
		
		System.out.println("name :"+name);
		System.out.println("age : "+age);
		System.out.println("tall :"+tall);
		System.out.println("");
		
		//����� 3���̸�? ������ ����� �� �����Ͱ� ���� ������?
		//�����ִ� �����͸� ������ο� �ڷ����� ����� ���� �ذ� ����
		//���� �ϳ����� public class�� ������ �ϳ���
		
		
		Human h=new Human();
		h.name="ȫ�浿";
		h.age=age;
		h.tall=123.34;
		System.out.println("name:"+h.name);
		System.out.println("age:"+h.age);
		System.out.println("tall:"+h.tall);
		System.out.println("");
		
		Human h1=new Human();
		h1.name="������";
		h1.age=23;
		h1.tall=153.34;
		System.out.println("name:"+h1.name);
		System.out.println("age:"+h1.age);
		System.out.println("tall:"+h1.tall);
		System.out.println("");
		
		//����̿� ������ �����͸� ������ �� �ִ� Ŭ������ ����� 2������ ���
		//hairColor, legCount, age
		
		Cat c=new Cat();
		c.hairColor="�Ķ���";
		c.legCount=4;
		c.age=6;
		System.out.println("hairColor:"+c.hairColor);
		System.out.println("legCount:"+c.legCount);
		System.out.println("age:"+c.age);
		System.out.println("");
		
		Cat c1=new Cat();
		c1.hairColor="������";
		c1.legCount=4;
		c1.age=4;
		System.out.println("hairColor:"+c1.hairColor);
		System.out.println("legCount:"+c1.legCount);
		System.out.println("age:"+c1.age);
		System.out.println("");
		
		Dog d=new Dog();
		d.hairColor="���";
		d.legCount=4;
		d.age=1;
		System.out.println("hairColor:"+d.hairColor);
		System.out.println("legCount:"+d.legCount);
		System.out.println("age:"+d.age);
		System.out.println("");
		
		Dog d1=new Dog();
		d1.hairColor="������";
		d1.legCount=4;
		d1.age=7;
		System.out.println("hairColor:"+d1.hairColor);
		System.out.println("legCount:"+d1.legCount);
		System.out.println("age:"+d1.age);
		System.out.println("");
		
	}
}
package com.human.ex;

public class javaClass3 {
	public static void main(String[] args) {
		//byte, short
		byte b1;
		//�Ҵ���� ���� ������ ����� �� ����.
		b1=10;
		System.out.println(b1);
		
		short s1=11;
		System.out.println(11);
		
		int i1=10;
		System.out.println(i1);
		
		i1=20;
		i1=3*20+10;//������� ���� �� i1�� ����ȴ�.
		i1=10+3*20;//������� ���� ���� ������ �� ����.
		//�켱������ ����ż� ����ȴ�.
		
		
		//1. i1�� ���� 10���� ����
		//2. ���� i1 ���� 10�� �߰��Ͽ� i1�� ����
		//3. i1���� ���
		i1=10;
		i1=10+i1;
		//i1+=10; �� �ΰ��� ���� �ǹ�
		System.out.println(i1);
		
		
		//1. i2 ������ �����Ͽ� 10 ���� �ְ�
		//2. i2�� i1�� ���� ���� ���� ������ i3�� �־�
		//i3�� ����غ���
		int i2=10;
		int i3=i1+i2;
		System.out.println(i3);
		
		long l1=10l;
		System.out.println(l1);
		
		
		//float a=1.4; error
		float a=1.4f;
		System.out.println(a);
		
		double b=3.14;
		System.out.println(b);
		
		String str="helloworld";
		System.out.println(str);
		
		System.out.println(Math.sqrt(9));
		
		//�Էº����� �����͸� �־��.
		//�Է°��� ���α׷� �߰��� ����� ó������ ���ÿ�
		
	}

}





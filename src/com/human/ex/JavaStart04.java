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
		
		//���ù� > if, switch
		//�ݺ��� > for, while, do while
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		System.out.println("���ڸ� �Է��Ͻÿ�.");
		int input = Integer.parseInt(sc.nextLine());
		
		int A=0;
		
		if(input>0) {
			A=1;
		}else {
			A=-1;
		}
		System.out.println(A);
		
		//�� ���� �Է� �޾Ƽ� ū ���� ���
		
		System.out.println("ù ���� �Է��Ͻÿ�.");
		int b = Integer.parseInt(sc.nextLine());
		System.out.println("������ ���� �Է��Ͻÿ�.");
		int c = Integer.parseInt(sc.nextLine());
		
		if(b>c){
			System.out.println(b);
		}else {
			System.out.println(c);
		}
		*/
		//a=6 b=20 �϶� a�� �� ������ ������ �ִ� ���� ��ȯ�Ͽ� a=20, b=6���� ����� ����.
		
		/*int a=6;
		int b=20;
		int c=a;
		a=b;
		b=c;
		System.out.println("a= "+ a);
		System.out.println("b= "+b);
		*/
		//����ڿ��� �� ���� ���ڸ� �Է� �޾� ū ���� a, �������� b�� �־ a,b�� ����Ͻÿ�.
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		System.out.println("ó�� ���� �Է��Ͻÿ�.");
		int a=Integer.parseInt(sc.nextLine());
		System.out.println("������ ���� �Է��Ͻÿ�.");
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
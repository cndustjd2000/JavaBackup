package com.human.ex;

public class JavaStart03 {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		System.out.println("������ ���Ѵ�.");
		String str=sc.nextLine();
		int A=Integer.parseInt(str);
		
		System.out.println("�Ʒ����� ���Ѵ�.");
		String str1=sc.nextLine();
		int B=Integer.parseInt(str1);
		
		System.out.println("���̸� ���Ѵ�.");
		String str3=sc.nextLine();
		int H=Integer.parseInt(str3);
		
		int S=(A+B)*H/2;
		
		System.out.println(S);
		
		
		//
		
		/*System.out.println("���ڸ� �Է��Ͻÿ�.");
		System.out.println("�Է��� ���ڰ� 0���� ū��?");
		String str4=sc.nextLine();
		int a=Integer.parseInt(str4);
		while (true) {
			int a=1;
		}
		int a=-1;
		System.out.println(a);*/
		
	}
}
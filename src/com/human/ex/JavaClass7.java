package com.human.ex;

public class JavaClass7 {

	public static void main(String[] args) {
		//�� ���ڸ� �Է� �޾� ���ϴ� ���α׷�
		//1. ��ĳ�� ����
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		//2. ù��° ���� �Է¹ޱ�.
		System.out.println("���ϰ��� �ϴ� ù�� ° ���ڸ� �Է��ϼ���.");
		String str=sc.nextLine();
		int i1=Integer.parseInt(str);
		//����ڰ� �Է��� ���ڰ� int�� ���� i1�� ���ִ�
		
		//3.�ι� ° ���� �Է¹ޱ�.
		System.out.println("���ϰ��� �ϴ� �ι� ° ���ڸ� �Է��ϼ���.");
		String str1=sc.nextLine();
		int i2=Integer.parseInt(str1);
		
		//4. �� ������ �հ� ���ϱ�.
		System.out.println("�� ������ ���� "+(i1+i2)+" �Դϴ�");
	}

}

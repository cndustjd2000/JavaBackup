package com.human.ex;

public class javaclass6 {

	public static void main(String[] args) {
		//����� �Է��� �޾� ����.
		//����� �Է� = ����ڰ� Ű����� �Է��� �����͸� ���α׷����� �޾Ƽ� ó���ϴ� ��.
		
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		//int = java.util.Scanner
		//a = scanner
		
		System.out.println("���ڿ��� �Է����ּ���.");
		String str=scanner.nextLine();//����� �Է��� �޾� ���ڿ��� �������ִ� �Լ�
		System.out.println(str+"�� �Է��ϼ̽��ϴ�");
		System.out.println("���α׷� ����");
	
		//����� �Է��� ��� ���ڿ��̴�.
		//���ڸ� ����ڷκ��� �������� ���ڿ��� ���ڷ� �����ϴ� �Լ��� ��� �� ������ �ȴ�.
		
		System.out.println("������ �Է��� �ּ���.");
		String str1=scanner.nextLine();
		System.out.println("������ �ѹ� �� �Է��� �ּ���.");
		String str2=scanner.nextLine();
		int i1=Integer.parseInt(str1);
		int i2=Integer.parseInt(str2);
		System.out.println("�Է��� ������ ���� : "+(i1+i2)+" �Դϴ�.");
		System.out.println("���α׷� ����");
		
		
		
	}

}

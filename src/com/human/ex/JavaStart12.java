package com.human.ex;

public class JavaStart12 {

	public static void main(String[] args) {
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		
		//12������ 2�� ����
		System.out.println("ù ��° ���� �Է��ϼ���.");
		int c1=Integer.parseInt(sc.nextLine());
		System.out.println("�� ��° ���� �Է��ϼ���.");
		int c2=Integer.parseInt(sc.nextLine());
		System.out.println("�� ��° ���� �Է��ϼ���.");
		int c3=Integer.parseInt(sc.nextLine());
		System.out.println("�� ��° ���� �Է��ϼ���.");
		int c4=Integer.parseInt(sc.nextLine());
		System.out.println("�ټ� ��° ���� �Է��ϼ���.");
		int c5=Integer.parseInt(sc.nextLine());
		
		int max=0;
		if(max<c1) {
		max=c1;
		}
		if(max<c2) {
		max=c2;
		}
		if(max<c3) {
		max=c3;
		}
		if(max<c4) {
		max=c4;
		}
		if(max<c5) {
		max=c5;
		}

		if(c1<c2) {
		c2=c1;
		}
		if(c2<c3) {
		c3=c2;
		}
		if(c3<c4) {
		c4=c3;
		}
		if(c4<c5) {
		c5=c4;
		}
		int min=c5;
		System.out.println("���� ū ����:"+max);
		System.out.println("���� ���� ����:"+min);
	}
}
package com.human.ex;

public class JavaStart13 {

	public static void main(String[] args) {
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		
		int max,min;//�ʱ�ȭ
		max=0;min=0;//-5, -3
		max=Integer.MIN_VALUE;//int�߿� ���� ���� ��
		min=Integer.MAX_VALUE;//int�߿� ���� ū ��
		
		for(int i=0;i<5;i++) {
			System.out.print("�� �Է�");
			int input=Integer.parseInt(sc.nextLine());
			if(max<input) {
				max=input;
			}
			if(min>input) {
				min=input;
			}
		}
		System.out.println("ū��:"+max+"������"+min);
		
	}
}
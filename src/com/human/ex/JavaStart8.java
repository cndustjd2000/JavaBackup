package com.human.ex;

public class JavaStart8 {

	public static void main(String[] args) {
		/*//�ȳ� 3�� �ݺ��ϱ�  �ݺ��� while, for
		int count=0;	//�ʱⰪ
		while(count<5) {//�� ��
			//while �߰�ȣ �κ��� ���ǽ��� ���� �� ����
			System.out.println("�ȳ�.");
			count++;	//��ȯ ��
		}
		
		for(int i=0;i<5;i++) {
			System.out.println("�ȳ�.");
		}*/
		
		//for(�ʱⰪ;�񱳰�;��ȯ��){
			//�ݺ��� ���� }
		
		//1~100���� ����Ͻÿ�
		
		int a=1;
		while(a<101) {
			System.out.println(a);
			a++;
		}
		System.out.println("");
		
		
		
		for(int b=100;b>0;b--) {
			System.out.println(b);
		}
		System.out.println("");
		
		
		
		int c=5;
		while(c<9) {
			System.out.println(c);
			c++;
		}
		System.out.println("");
		
		
		
		for(int d=13;d<23;d++) {
			System.out.println(d);
		}
		System.out.println("");
		
		int h=0;
		int count=0;
		while(count<10) {
			count++;
			h=h+count;
			System.out.println(h);
		}
		
	}
}
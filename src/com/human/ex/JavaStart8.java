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
		
		
		
		//100~1���� ����Ͻÿ�
		
		for(int b=100;b>0;b--) {
			System.out.println(b);
		}
		System.out.println("");
		
		
		
		//5~8���� ����Ͻÿ�
		
		int c=5;
		while(c<9) {
			System.out.println(c);
			c++;
		}
		System.out.println("");
		
		
		
		//13~22���� ����Ͻÿ�
		
		for(int d=13;d<23;d++) {
			System.out.println(d);
		}
		System.out.println("");
		
		
		
		//1~10���� �հ踦 ����Ͻÿ�
		
		int sum=0;
		for(int i=1; i<11; i++) {
			sum=sum+1;
		}
		System.out.println(sum);
		
		
		//1~100���� ¦�� ���
		
		for(int g=1;g<101;g++) {
			if(g%2==0) {
				System.out.println(g);
			}
		}
	}
}
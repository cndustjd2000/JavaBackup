package com.human.ex;

public class javaClass2 {
	public static void main(String[] args) {
		//����
		//�ڷ��� ������=�ڷ����� ���
		
		//boolean���� ������ �����ؼ� true�� ����.
		boolean abc=true;
		//������ ����ϴ� ���
		System.out.println(abc);
		
		//������ boolean�� false�� �־ ����
		//boolean abc=false;//�������� �ĺ����̰� �ĺ��ڴ� �����ؾ� �Ѵ�.
		boolean abc2=false;
		System.out.println(abc2);
		
		//abc2 ������ ���� �� ���� abc2���� true�� ���� �� �ٽ� abc2 ������ ����.
		System.out.println(abc2);
		abc2=true;
		System.out.println(abc2);
		
		//abc2���� false�� ���� �� abc2���� abc1������ ���� �� abc2���� ����϶�.
		abc2=false;
		abc2=abc;
		System.out.println(abc2);
		
		
	}

}





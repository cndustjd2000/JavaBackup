package com.human.ex;

public class javaClass {
	public static void main(String[] args) {
		//�ƹ��ų� ���� �ȵǰ� �ڹ� ������ ����� �����ϴ�
		//���� ������ ���ο� ��� ������ �ڹ� ������ ���� ����
		//���
		
		//System.out.println(���); ����ϸ� ����� ȭ�鿡 ���
		
		//����� �������̱⿡ �ڷ����� ���� ����ؾ� �Ѵ�.
		//�ڷ������� �ش� ����� �ִ�.
		
		//blooean ���
		System.out.println(true);
		//�ƹ��ų� ����� ���� �ƴ϶� blooean ����� ����ߴ�.
		
		System.out.println(false);
		//system.out.println()
		//���� ��� �� �ϳ��� �Ű������� ����̸� ����� ȭ�鿡 �״�� ����ϰ� ���� �ٲ۴�.
		
		//char ������ ��� �����ڵ� 1��
		//���ڻ���� ���� �� �ڿ� ''�� ����Ͽ� ǥ���Ѵ�.
		//System.out.println(a); error a�� ���ؼ� ��ӵ� �ٰ� ����.
		System.out.println('a');
		//�� ���ڸ� ȭ�鿡 ����Ϸ��� ��� �ؾ��ұ�
		System.out.println('��');
		
		/*�����ڵ�� ����ϰ� ������ \\u ������ �ڵ带 ������ �ȴ�*/
		System.out.println('\u0041');//A
		System.out.println('\u0042');//B
		
		//byte, short, int �ڷ����� int�� ����� ó�� �ش� �ڷ����� ������ �´� ���ڸ� ������ ��� ó�� ��
		//int�� ����� ��� �Ҽ����� ���� ���ڸ� ������ �°� ����ϸ� �ȴ�.
		System.out.println(21232);
		System.out.println(032);//8����
		System.out.println(0x32);//16����
		//System.out.println(082); 8������ ����
		//System.out.println(100000000000);
		//100000000000 �� int�� ����� �̴ѵ��� �ұ��ϰ� ���ó�� ����Ͽ��� ������ �߻�
		
		//long�� �ڷ�
		//�Ҽ����� ���� ���ڿ� long ���ڹ����� ����� �ʴ� ���� ���� �ҹ��� Ȥ�� �빮�� L�� ���̸� �ȴ�.
		System.out.println(100000000000L);
		System.out.println(100000000000l);
		
		System.out.println(100);
		System.out.println(100L);
		
		//float�� ���
		//�Ҽ����� �ִ� �� ���� F,f�� �ٿ��� ǥ���Ѵ�.
		System.out.println(3.14f);
		System.out.println(3.14F);
		System.out.println(3f);
		System.out.println(3.f);
		System.out.println(.14f);
		
		//double�� ���
		//�Ҽ����� �ִ� ���� double ���, ���� ���� D,d�� ������ double ���
		System.out.println(3.14);
		System.out.println(3.D);
		System.out.println(3D);
		System.out.println(.14d);
		System.out.println(3.14D);
		System.out.println(3.14e-4);
		
		//String�� ���  ���ڿ� ���
		//���ڿ� ����� ""�� ��� ǥ���Ѵ�.
		System.out.println("helloworld");
		
		//1(����), '1'(����), "1"(���ڿ�)
		//����� ���⿡�� ���� 1�� ��µ����� 3������ �޸𸮿� �ö� ����� �ٸ���.
		
		//����� ���� + - *  %
		//���ڴ� ���� ������ �ȴ�.
		//���ڿ��� + ���길 �����ϴ�.
		//���� + ���ڿ��� ���ڿ�, ���� + ���ڴ� ����, ���ڿ� + ���ڿ��� ���ڿ�
		System.out.println(5+3);//���� + ���� ==����
		System.out.println(5.1+3.2);//���� + ���� ==����
		System.out.println(5+"�ȳ�");//���ڿ� + ���� ==���ڿ�
		System.out.println("�ȳ�"+"�ȳ�");//���ڿ� + ���ڿ� ==���ڿ�
		System.out.println(5+5+"�ȳ�");//���� + ���� + ���ڿ� == 10�ȳ�
		System.out.println("�ȳ�"+5+5);//���ڿ� + ���� + ���� == �ȳ�55
		
		//
	}

}

package com.human.ex;

public class javaclass5 {

	public static void main(String[] args) {
		//�ڵ� ����ȯ
		byte b1=10;//�ڷ����� �ٸ��� ������ ���� ���� �� ����.
		short s1=10;//�ڵ� ����ȯ�� �Ǿ� ����.
		char c1=10;//������ �ڷ����� int�� ����� �ڵ����� ����ȯ �Ǿ� ����.
		int i1=10;
		long l1=10;
		
		//�ȵǴ� ���
		//int i2=l1; //���� �����͸� ū �����Ϳ� ������ �ڵ� ����ȯ �ȴ�.
					//�ݴ��� ���� �ڵ� ����ȯ ���� �ʴ´�.
		//b1=i1;
		//b1=s1;
		i1=i1+i1;//20
		//b1=b1+b1; > error intũ�⺸�� ���� �ڷ��� ������ int�� �ڵ� ����ȯ�ȴ�.
		
		//byte+byte=int
		//short+short=int
		//i1=l1+10; //long+int=long
		l1=l1+i1;
		c1='A'+1; //char+int = int > char
		c1='a'+'b';
		
		//�Ǽ�
		float f1=10.f;//4byte
		double d1=10.;//8byte
		
		d1=f1;//double=float;
		//f1=d1; > error
		
		f1=i1; d1=i1; f1=l1; d1=l1;
		//i1=f1; i1=d1; > error
		
		String str1="10";
		//i1=str1; str1=10; > error
		str1=str1+10+10;//101010
		str1=10+10+str1;//2010
		
		//int+sring = string
		//string + int=string
		//float + string = string
		
		//���� ����ȯ (ĳ����, casting)
		//����� = (�ڷ���), �Ұ�ȣ �ȿ� �����ϰ��� �ϴ� �ڷ����� �ִ´�.
		
		b1=(byte)(b1+b1);
		i1=(int)l1;//ũ�Ⱑ �޶� �ս��� ���� �� ����.
		f1=3.14f;
		i1=(int)f1; //��°��� 3
		System.out.println(i1);
		f1=i1;
		System.out.println(f1);
		
		f1=(float)d1;//�ս��� ���� �� �ִ�.
		
		//���� �ڷ����� ���ڿ��� ��ȯ
		String str3=f1+"";
		str3="10";
		i1=Integer.parseInt(str3);//i1�� ���� 10�� �ȴ�. ��κ��� ������� ���.
		i1=Integer.valueOf(str3);//parsInt�� ���� �ǹ�
		str3="1.14";
		d1=Double.parseDouble(str3);//d1�� �Ǽ� 1.14�� �ȴ�.
		System.out.println(d1);
		
		str3="1.14hi";//�߸��� ���ڿ��� ����ϸ� ������ �߻��Ѵ�.
		
		
		
		
		
	}

}

package cn.edu.qdu.rentcar;

import java.util.Scanner;

public class Car extends Moto{
	//��ʾ�γ����࣬�۸�
	public void show(){
		System.out.println("�γ����ͣ�                ���            ����          ���������");
		System.out.println("����ѣ�Ԫ/�죩    600   500  300");
	}
	//ѡ��γ�����
	public void chooseKind(){
		String [] kind={"���","����","���������"};
		int [] price={600,500,300};
		Scanner input=new Scanner(System.in);
		int i=input.nextInt();
		setKind(kind[i-1]);
		setPrice(price[i-1]);
	}

}

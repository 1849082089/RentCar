package cn.edu.qdu.rentcar;

import java.util.Scanner;

public class Bus extends Moto{
	//��ʾ�ͳ����࣬�۸�
	public void show(){
		System.out.println("�ͳ����ͣ�                <=16��            >16��        ");
		System.out.println("����ѣ�Ԫ/�죩    800      1500");
	} 
	//ѡ��ͳ�����
	public void chooseKind(){
		String [] kind={"<=16��"," >16��"};
		int [] price={800,1500};
		Scanner input=new Scanner(System.in);
		int i=input.nextInt();
		setKind(kind[i-1]);
		setPrice(price[i-1]);
	}

}

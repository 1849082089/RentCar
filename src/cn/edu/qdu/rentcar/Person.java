package cn.edu.qdu.rentcar;

import java.util.Scanner;
public class Person {
		Car car=new Car();
		Bus bus=new Bus();
		private int days;
		public int getDays() {
			return days;
		}
  		public void setDays(int days) {
			this.days = days;
		}
  		int select;
  		//ѯ��ѡ�񳵵�����ķ���
		public void askKind(){
			System.out.println();
			Scanner input=new Scanner(System.in);
			System.out.println("***��ӭ���������⳵ϵͳ***");
			System.out.println("��ѡ��Ҫ�⳵�����ͣ���1���γ�  2��������");
			select=input.nextInt();
			if(select==1){
				car.show();
				System.out.println("��ѡ��γ����ͣ�  1�� ���         2�� ����        3�����������");
				car.chooseKind();
			}else if(select==2){
				bus.show();
				System.out.println("��ѡ��ͳ����ͣ� 1�� <=16��      2��     >16��");
				bus.chooseKind();
			}else{
				System.out.println("�������");
			}
//			switch (select) {
//			case 1:
//				car.show();
//				System.out.println("��ѡ��γ����ͣ�  1�� ���         2�� ����        3�����������");
//				break;
//			case 2:
//				
//				break;
//
//			default:
//				break;
//			}
		}
		//���������ķ���
		public void totalRent(){
			int totalRent;
			System.out.println("������Ҫ�������");
			Scanner input=new Scanner(System.in);
			days=input.nextInt();
			if(select==1){
				//ѡ��γ���ʱ��
			totalRent=days*car.getPrice();
			System.out.println("�����Ϊ��"+totalRent);
			}else{
				//ѡ��ͳ���ʱ��
				totalRent=days*bus.getPrice();
				System.out.println("�����Ϊ��"+totalRent);
			}
			
		}
	
}

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
  		//询问选择车的种类的方法
		public void askKind(){
			System.out.println();
			Scanner input=new Scanner(System.in);
			System.out.println("***欢迎来到蓝桥租车系统***");
			System.out.println("请选择要租车的类型：（1、轿车  2、卡车）");
			select=input.nextInt();
			if(select==1){
				car.show();
				System.out.println("请选择轿车类型：  1、 别克         2、 宝马        3、别克林荫大道");
				car.chooseKind();
			}else if(select==2){
				bus.show();
				System.out.println("请选择客车类型： 1、 <=16座      2、     >16座");
				bus.chooseKind();
			}else{
				System.out.println("输入错误");
			}
//			switch (select) {
//			case 1:
//				car.show();
//				System.out.println("请选择轿车类型：  1、 别克         2、 宝马        3、别克林荫大道");
//				break;
//			case 2:
//				
//				break;
//
//			default:
//				break;
//			}
		}
		//计算总租金的方法
		public void totalRent(){
			int totalRent;
			System.out.println("请输入要租的天数");
			Scanner input=new Scanner(System.in);
			days=input.nextInt();
			if(select==1){
				//选择轿车的时候
			totalRent=days*car.getPrice();
			System.out.println("总租金为："+totalRent);
			}else{
				//选择客车的时候
				totalRent=days*bus.getPrice();
				System.out.println("总租金为："+totalRent);
			}
			
		}
	
}

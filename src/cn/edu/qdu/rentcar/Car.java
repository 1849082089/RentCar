package cn.edu.qdu.rentcar;

import java.util.Scanner;

public class Car extends Moto{
	//显示轿车种类，价格
	public void show(){
		System.out.println("轿车车型：                别克            宝马          别克林荫大道");
		System.out.println("日租费（元/天）    600   500  300");
	}
	//选择轿车种类
	public void chooseKind(){
		String [] kind={"别克","宝马","别克林荫大道"};
		int [] price={600,500,300};
		Scanner input=new Scanner(System.in);
		int i=input.nextInt();
		setKind(kind[i-1]);
		setPrice(price[i-1]);
	}

}

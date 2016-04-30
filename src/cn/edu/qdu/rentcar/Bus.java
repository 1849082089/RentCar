package cn.edu.qdu.rentcar;

import java.util.Scanner;

public class Bus extends Moto{
	//显示客车种类，价格
	public void show(){
		System.out.println("客车车型：                <=16座            >16座        ");
		System.out.println("日租费（元/天）    800      1500");
	} 
	//选择客车种类
	public void chooseKind(){
		String [] kind={"<=16座"," >16座"};
		int [] price={800,1500};
		Scanner input=new Scanner(System.in);
		int i=input.nextInt();
		setKind(kind[i-1]);
		setPrice(price[i-1]);
	}

}

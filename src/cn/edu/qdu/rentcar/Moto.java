package cn.edu.qdu.rentcar;

public abstract class Moto {
	private String kind;
	private int price;
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	//��ʾ�ķ���
	public  abstract void show();
	//ѡ��ķ���
	public  abstract void chooseKind();

}

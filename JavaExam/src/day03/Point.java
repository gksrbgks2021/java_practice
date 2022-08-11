package day03;

public class Point {
	private int x;
	private int y;
	String numberOfCars;
	Point(){
		
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void show() {
		System.out.println("ÁÂÇ¥[x="+this.getX()+",y="+this.getY()+"]¿¡ Á¡À» ±×·È½À´Ï´Ù.");
		
		System.out.println(numberOfCars);
	}
}

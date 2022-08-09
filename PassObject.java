package com.atguigu.exer;

public class PassObject {

	public static void main(String[] args) {
		PassObject test=new PassObject();
		
		circle c=new circle();
		test.printAreas(c, 5);
				
	}
	
	public void printAreas(circle c,int time) {
		
		System.out.println("Radius\t\t area");
		
		for (int i=1;i<time;i++) {
			c.radius=i;
			System.out.println(c.radius+"\t\t"+c.findArea());
		}
	}
}

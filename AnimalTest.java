package com.atguigu.java;

public class AnimalTest {
	public static void main(String[] args) {
		Animal dog=new Animal();
		dog.name="pali";
		dog.age=4;
		dog.setLegs(3);
		
		dog.show();
						
	}
}

class Animal{
	public static Animal a;
	String name;
	int age;
	private int legs;
	
	public void setLegs(int l){
		if(l>=0&&l%2==0) {
			legs=l;
			
		}else {
			legs=0;
		}
	}
	
	public void eat(){
		System.out.println("动物可以进食");
	}
	
	public void show() {
		System.out.println("name="+name+" age="+age+" legs="+legs);
	}
	
}
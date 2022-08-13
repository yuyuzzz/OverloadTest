package com.atguigu.java2;

public class PersonTest {
	public static void main(String[] args) {
	
		Person P1=new Person();
		P1.setAGe(3);


		System.out.println(P1.getAge());
	}

	
}
	
	class Person{
		private String name;
		private int age;
		
		Person(){
			}
		Person(String name){
			this.name=name;
			
		}
		
		Person(int age){
			this.age=age;
			
		}
		Person(String name,int age){
			this.name=name;
			this.age=age;
		}
		
		
		public int getAge() {
			return age;
		}
		public void setAGe(int age) {
			this.age=age;
	
		}
		
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name=name;
		}
		
		public void eat() {
			System.out.println("人进食");
			study();
		}
		
		public void study() {
			System.out.println("人学习");
		}
	}
	


package com.Model;

public class Car1 {

	private String name;
	private double money;
	
	public Car1(String name, double money) {
		this.name = name;
		this.money = money;
	}

	public void display(){
		System.out.println("汽车出街");
	}

	public String toString() {
		return "Car1 [name=" + name + ", money=" + money + "]";
	}

}

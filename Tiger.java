package com.oneQue;

public class Tiger extends Animal  {

	@Override
	void eat() {
	 System.out.println("Tiger is eating!!");
		
	}
	
	public static void main(String[] args) {
		Tiger tg=new Tiger();
		tg.eat();
		
	}
}

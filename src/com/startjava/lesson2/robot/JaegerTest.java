package com.startjava.lesson2.robot;

public class JaegerTest{
	public static void main(String[] args){
		Jaeger j1 = new Jaeger("Warrior1", "Destroyed", 7.2f, 250, 20, 100);
		Jaeger j2 = new Jaeger("Warrior2", "Destroyed", 7.5f, 220, 30, 120);
		j1.printW();
		j2.printW();
		j1.moveUp(5,j1);
		j2.moveUp(7,j2);
		j1.moveDown(3,j1);
		j2.moveDown(0,j2);
		j1.hit(5,j2);
		j1.printW();
		j2.printW();

	}
}
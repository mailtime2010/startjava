package com.startjava.lesson2_3_4.game;

public class Player{
	private String name;
	private int count =0;
	private int[] allNumbers = new int[10];

	public Player(String playerName){
		name = playerName;
	}
	public String getName(){
		return this.name;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getCount() {
		return count;
	}

	public int[] getAllNumbers() {
		return allNumbers;
	}

	public void setAllNumbers(int[] allNumbers) {
		this.allNumbers = allNumbers;
	}

	@Override
	public String toString() {
		return " enter numbers: "+ allNumbers.toString() ;
	}
}

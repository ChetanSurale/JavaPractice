package com.javapractice.immutableclass;

/*
 * 
 * @Auther : Chetan Surale
 * 
 * */
public class Age implements Cloneable {

	private int day;
	private int month;
	private int year;

	public int getDay() {
		return day;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

}
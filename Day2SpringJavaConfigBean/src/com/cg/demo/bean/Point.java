package com.cg.demo.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Point {

	
	private int x;
	
	private int y;
	
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
	
}

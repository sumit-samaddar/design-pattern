package com.design.patterns.structural.adapter;

/**
 * @author sumit
 *
 */
public class Socket {
	public Volt getVolt(){
		return new Volt(120);
	}
}

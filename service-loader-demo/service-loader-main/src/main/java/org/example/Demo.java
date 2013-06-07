package org.example;

import com.example.codec.CodecLocator;

public class Demo {

	public static void main(String[] args) throws Exception {
		CodecLocator locator = new CodecLocator();
		System.out.println(locator.getCodecSet("US-ASCII").getClass().getName());
    System.out.println(locator.getCodecSet("UTF-8").getClass().getName());
	}
	
}

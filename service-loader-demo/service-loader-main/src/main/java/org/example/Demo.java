package org.example;

import com.example.codec.CodecLocator;
import com.example.codec.CodecSet;

public class Demo {

	public static void main(String[] args) throws Exception {
		CodecLocator locator = new CodecLocator();
		CodecSet codecSet = locator.getCodecSet("UTF-8");
		System.out.println(codecSet.getClass().getName());
	}
	
}

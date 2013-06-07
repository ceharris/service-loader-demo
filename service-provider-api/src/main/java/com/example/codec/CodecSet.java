package com.example.codec;

public interface CodecSet {

	boolean supports(String encodingName);
	
	Encoder getEncoder();
	
	Decoder getDecoder();
	
}

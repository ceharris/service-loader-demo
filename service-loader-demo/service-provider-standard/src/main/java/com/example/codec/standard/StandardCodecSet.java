package com.example.codec.standard;

import com.example.codec.CodecSet;
import com.example.codec.Decoder;
import com.example.codec.Encoder;

public class StandardCodecSet implements CodecSet {

	@Override
	public boolean supports(String encodingName) {
		return true;
	}

	@Override
	public Encoder getEncoder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Decoder getDecoder() {
		// TODO Auto-generated method stub
		return null;
	}


}

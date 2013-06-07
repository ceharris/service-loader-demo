package com.example.codec;

import java.io.UnsupportedEncodingException;
import java.util.ServiceLoader;

public class CodecLocator {

	private final ServiceLoader<CodecSet> loader =
			ServiceLoader.load(CodecSet.class);
	
	public CodecSet getCodecSet(String encodingName) throws UnsupportedEncodingException {
		for (CodecSet codecSet : loader) {
		  /*
		   * Note that while we're just doing a simple name match, the selection
		   * criteria can be as sophisticated as we want it to be.
		   */
			if (codecSet.supports(encodingName)) {
				return codecSet;
			}
		}
		throw new UnsupportedEncodingException(encodingName);
	}
	
}

package com.example.codec.alternate;

import com.example.codec.CodecSet;
import com.example.codec.Decoder;
import com.example.codec.Encoder;

public class AlternateCodecSet implements CodecSet {

  @Override
  public boolean supports(String encodingName) {
    return "UTF-8".equals(encodingName) || "US-ASCII".equals(encodingName);
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

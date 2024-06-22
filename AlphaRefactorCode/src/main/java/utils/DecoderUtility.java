package utils;

import io.cucumber.core.internal.com.fasterxml.jackson.databind.ser.Serializers;

import java.util.Base64;

public class DecoderUtility {

    public static String decode64(String encodeValue){

        Base64.Decoder decoder = Base64.getDecoder();
      return new String(decoder.decode(encodeValue.getBytes()));

    }
}

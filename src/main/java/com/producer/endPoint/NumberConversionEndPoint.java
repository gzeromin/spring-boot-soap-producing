package com.producer.endPoint;

import org.springframework.util.Assert;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.dataaccess.webservicesserver.NumberToDollars;
import com.dataaccess.webservicesserver.NumberToDollarsResponse;
import com.dataaccess.webservicesserver.NumberToWords;
import com.dataaccess.webservicesserver.NumberToWordsResponse;

@Endpoint
public class NumberConversionEndPoint {
  private static final String NAMESPACE_URI = "http://www.dataaccess.com/webservicesserver/";

  @PayloadRoot(namespace = NAMESPACE_URI, localPart = "NumberToWords")
  @ResponsePayload
  public NumberToWordsResponse getWords(@RequestPayload NumberToWords request) {
    NumberToWordsResponse response = new NumberToWordsResponse();
    String ubiNum = request.getUbiNum().toString();
    Assert.notNull(ubiNum, "The ubiNum must not be null");
    response.setNumberToWordsResult(ubiNum + "를 한글로 바꾸고 싶었지만 그건 다음에.");
    return response;
  }

  @PayloadRoot(namespace = NAMESPACE_URI, localPart = "NumberToDollars")
  @ResponsePayload
  public NumberToDollarsResponse getDollars(@RequestPayload NumberToDollars request) {
    NumberToDollarsResponse response = new NumberToDollarsResponse();
    String dNum = request.getDNum().toString();
    Assert.notNull(dNum, "The ubiNum must not be null");
    response.setNumberToDollarsResult("I wanted to convert " + dNum + " to dollar string but maybe next time.");
    return response;
  }

}

# Spring Boot WebService Soap Producer   

  ### this program get soap request and return soap response.
  and also get json reqeust and return json response   
  through <https://github.com/gzeromin/spring-boot-soap-consuming>
  

## this project configured by...
> Maven Project   
> java: 11   
> Spring Boot: 2.7.3   
> Packaging: Jar   
> Dependencies: Spring Web Service, Spring Web   
   
   
   
- end point   
  - /ws/numberConversion   
    - request(post, header: Content-Type = text/xml; charset=utf-8)  
    ```   
    <?xml version="1.0" encoding="utf-8"?>
    <soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
      <soap:Body>
        <NumberToWords xmlns="http://www.dataaccess.com/webservicesserver/">
          <ubiNum>500</ubiNum>
        </NumberToWords>
      </soap:Body>
    </soap:Envelope>
    ```
    - response
    ```   
    <SOAP-ENV:Envelope xmlns:SOAP-ENV="http://schemas.xmlsoap.org/soap/envelope/">
        <SOAP-ENV:Header/>
        <SOAP-ENV:Body>
            <ns2:NumberToWordsResponse xmlns:ns2="http://www.dataaccess.com/webservicesserver/">
                <ns2:NumberToWordsResult>500를 한글로 바꾸고 싶었지만 그건 다음에.</ns2:NumberToWordsResult>
            </ns2:NumberToWordsResponse>
        </SOAP-ENV:Body>
    </SOAP-ENV:Envelope>
    ```

  - /ws/numberConversion   
    - request(post, header: Content-Type = text/xml; charset=utf-8) 
    ```   
    <?xml version="1.0" encoding="utf-8"?>
    <soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
      <soap:Body>
        <NumberToDollars xmlns="http://www.dataaccess.com/webservicesserver/">
          <dNum>3</dNum>
        </NumberToDollars>
      </soap:Body>
    </soap:Envelope>
    ```
    - response
    ```   
    <SOAP-ENV:Envelope xmlns:SOAP-ENV="http://schemas.xmlsoap.org/soap/envelope/">
        <SOAP-ENV:Header/>
        <SOAP-ENV:Body>
            <ns2:NumberToDollarsResponse xmlns:ns2="http://www.dataaccess.com/webservicesserver/">
                <ns2:NumberToDollarsResult>I wanted to convert 3 to english string but maybe next time.</ns2:NumberToDollarsResult>
            </ns2:NumberToDollarsResponse>
        </SOAP-ENV:Body>
    </SOAP-ENV:Envelope>
    ```

#### - refs...   
  - spring-boot docs: <https://spring.io/guides/gs/producing-web-service/>
  - youtube: <https://www.youtube.com/watch?v=ceSqN3CWd14>   
  - api: <https://documenter.getpostman.com/view/8854915/Szf26WHn>   
  - wsdl: <https://www.dataaccess.com/webservicesserver/numberconversion.wso?WSDL>   
   
#### 2022.09.13 created by J.min
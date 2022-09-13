package com.producer.definition;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class NumberConversionDefinition extends WsConfigurerAdapter {
  
  @Bean(name = "numberConversion")
  public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema numberConversionSchema) {
    DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
    wsdl11Definition.setPortTypeName("NumberConversionPort");
    wsdl11Definition.setLocationUri("/ws/numberConversion");
    wsdl11Definition.setTargetNamespace("http://www.dataaccess.com/webservicesserver/");
    wsdl11Definition.setSchema(numberConversionSchema);
    return wsdl11Definition;
  }

  @Bean
  public XsdSchema numberConversionSchema() {
    return new SimpleXsdSchema(new ClassPathResource("xsd/numberConversion.xsd"));
  }

}

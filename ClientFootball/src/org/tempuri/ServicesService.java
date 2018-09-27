package org.tempuri;

import java.io.File;

import java.net.MalformedURLException;
import java.net.URL;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
// !DO NOT EDIT THIS FILE!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (11.1.1.0.0, build 130224.1947.04102)

@WebServiceClient(wsdlLocation="http://localhost:7101/ServerFootball-ServerFootball-context-root/ServicesPort?WSDL",
  targetNamespace="http://tempuri.org/", name="ServicesService")
public class ServicesService
  extends Service
{
  private static URL wsdlLocationURL;

  private static Logger logger;
  static
  {
    try
    {
      logger = Logger.getLogger("org.tempuri.ServicesService");
      URL baseUrl = ServicesService.class.getResource(".");
      if (baseUrl == null)
      {
        wsdlLocationURL =
            ServicesService.class.getResource("http://localhost:7101/ServerFootball-ServerFootball-context-root/ServicesPort?WSDL");
        if (wsdlLocationURL == null)
        {
          baseUrl = new File(".").toURL();
          wsdlLocationURL =
              new URL(baseUrl, "http://localhost:7101/ServerFootball-ServerFootball-context-root/ServicesPort?WSDL");
        }
      }
      else
      {
                if (!baseUrl.getPath().endsWith("/")) {
         baseUrl = new URL(baseUrl, baseUrl.getPath() + "/");
}
                wsdlLocationURL =
            new URL(baseUrl, "http://localhost:7101/ServerFootball-ServerFootball-context-root/ServicesPort?WSDL");
      }
    }
    catch (MalformedURLException e)
    {
      logger.log(Level.ALL,
          "Failed to create wsdlLocationURL using http://localhost:7101/ServerFootball-ServerFootball-context-root/ServicesPort?WSDL",
          e);
    }
  }

  public ServicesService()
  {
    super(wsdlLocationURL,
          new QName("http://tempuri.org/", "ServicesService"));
  }

  public ServicesService(URL wsdlLocation, QName serviceName)
  {
    super(wsdlLocation, serviceName);
  }

  @WebEndpoint(name="ServicesPort")
  public org.tempuri.Services getServicesPort()
  {
    return (org.tempuri.Services) super.getPort(new QName("http://tempuri.org/",
                                                          "ServicesPort"),
                                                org.tempuri.Services.class);
  }

  @WebEndpoint(name="ServicesPort")
  public org.tempuri.Services getServicesPort(WebServiceFeature... features)
  {
    return (org.tempuri.Services) super.getPort(new QName("http://tempuri.org/",
                                                          "ServicesPort"),
                                                org.tempuri.Services.class,
                                                features);
  }
}

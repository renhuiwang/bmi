package com.service.service.controller;


import org.springframework.beans.factory.annotation.Autowired;
import io.servicecomb.provider.pojo.RpcSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CsePojoDemoCodegen", date = "2018-01-24T03:59:21.138Z")

@RpcSchema(schemaId = "service")
public class ServiceImpl implements Service{

    @Autowired
    private ServiceDelegate serviceDelegate;


    public String helloworld(String name) {

        return serviceDelegate.helloworld(name);
    }

}

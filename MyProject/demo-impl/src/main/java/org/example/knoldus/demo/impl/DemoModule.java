package org.example.knoldus.demo.impl;

import com.google.inject.AbstractModule;
import com.lightbend.lagom.javadsl.server.ServiceGuiceSupport;
import org.example.knoldus.demo.api.DemoService;

public class DemoModule extends AbstractModule implements ServiceGuiceSupport {
    @Override
    protected void configure() {bindService(DemoService.class,DemoServiceImpl.class);}
}

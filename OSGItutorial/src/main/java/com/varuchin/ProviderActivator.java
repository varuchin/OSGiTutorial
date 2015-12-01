package com.varuchin;

import com.varuchin.able.HelloWorldService;
import com.varuchin.impl.HelloWorldServiceImpl;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;


public class ProviderActivator implements BundleActivator {

    private ServiceRegistration registration;
    @Override
    public void start(BundleContext bundleContext) throws Exception {

        registration = bundleContext.registerService(HelloWorldService.class.getName(),
                new HelloWorldServiceImpl(), null);
    }

    @Override
    public void stop(BundleContext bundleContext) throws Exception {
        registration.unregister();

    }
}

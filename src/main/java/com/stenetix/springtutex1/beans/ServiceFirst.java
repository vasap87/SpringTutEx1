package com.stenetix.springtutex1.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by alexkotov on 21.02.17.
 */
@Component
public class ServiceFirst implements Service {

    private ServiceSecont serviceSecont;

    public ServiceFirst() {
    }

    @Autowired
    public void setServiceSecont(ServiceSecont serviceSecont) {
        this.serviceSecont = serviceSecont;
    }

    @Override
    public void start() {
        System.out.println(this.getClass().getCanonicalName()+" start.");
        serviceSecont.start();
    }

    @Override
    public void stop() {
        System.out.println(this.getClass().getCanonicalName()+" stop.");
    }
}

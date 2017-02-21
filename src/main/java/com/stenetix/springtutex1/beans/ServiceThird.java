package com.stenetix.springtutex1.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by alexkotov on 21.02.17.
 */
@Component
public class ServiceThird implements Service {

    private ServiceSecont serviceSecont;

    public ServiceThird() {
    }

    @Autowired
    public void setServiceSecont(ServiceSecont serviceSecont) {
        this.serviceSecont = serviceSecont;
    }

    @Override
    public void start() {
        System.out.println(this.getClass().getCanonicalName()+" start.");
    }

    @Override
    public void stop() {
        System.out.println(this.getClass().getCanonicalName()+" stop.");
        serviceSecont.stop();
    }
}

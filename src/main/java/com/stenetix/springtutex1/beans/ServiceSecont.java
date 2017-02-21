package com.stenetix.springtutex1.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by alexkotov on 21.02.17.
 */
@Component
public class ServiceSecont implements Service {

    private ServiceThird serviceThird;
    private ServiceFirst serviceFirst;

    public ServiceSecont() {
    }

    @Autowired
    public void setServiceThird(ServiceThird serviceThird) {
        this.serviceThird = serviceThird;
    }

    @Autowired
    public void setServiceFirst(ServiceFirst serviceFirst) {
        this.serviceFirst = serviceFirst;
    }

    @Override
    public void start() {
        System.out.println(this.getClass().getCanonicalName()+" start.");
        serviceThird.start();
    }

    @Override
    public void stop() {
        System.out.println(this.getClass().getCanonicalName()+" stop.");
        serviceFirst.stop();
    }
}

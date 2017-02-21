package com.stenetix.springtutex1;

import com.stenetix.springtutex1.beans.Service;
import com.stenetix.springtutex1.beans.ServiceFirst;
import com.stenetix.springtutex1.beans.ServiceThird;
import com.stenetix.springtutex1.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * Created by alexkotov on 21.02.17.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        Service s1 = ctx.getBean(ServiceFirst.class);
        Service s3 = ctx.getBean(ServiceThird.class);
        s1.start();
        Thread.sleep(1000);
        s3.stop();
    }
}

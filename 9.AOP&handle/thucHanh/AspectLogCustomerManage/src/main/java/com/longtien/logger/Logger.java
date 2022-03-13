package com.longtien.logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Aspect
@Component
public class Logger {

    public void error() {
        System.out.println("[CMS] ERROR!");
    }

    @AfterThrowing(pointcut = "execution( * com.longtien.controller.CustomerController.showHomeCustomer(..))", throwing = "e")
    public void logError(Exception e) {
        System.out.println("******************************************");
        System.out.println(e);
        System.out.println("Chuong trinh ket thuc va loi luc " + LocalDate.now());
        System.out.println("******************************************");
    }
}

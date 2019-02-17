package com.taqy.learning.didemo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware,
        BeanFactoryAware, ApplicationContextAware{

    public LifeCycleDemoBean() {
        System.out.println(" LifeCycleBean: constructor");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println(" LifeCycleBean: bean factory has been set");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println(" LifeCycleBean: bean name is: " + s);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println(" LifeCycleBean: bean has been destroyed");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(" LifeCycleBean: properties are set");

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println(" LifeCycleBean: application context has been set");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println(" LifeCycleBean: postConstruct annotation method has been called");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println(" LifeCycleBean: preDestroy annotation method has been called");
    }

    public void beforeInit(){
        System.out.println(" LifeCycleBean: beforeInit - Called by been post processor");
    }

    public void afterInit(){
        System.out.println(" LifeCycleBean: afterInit - Called by been post processor");
    }
}

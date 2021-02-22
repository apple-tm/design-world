package com.example.design.web.servicelocator;

/**
 * 服务器定位
 *
 * 1.缓存技术
 * 2.首次请求某个服务时，服务定位器在 JNDI 中查找服务，并缓存该服务对象
 */
public class ServiceLocatorPatternDemo {
    public static void main(String[] args) {
        Service service = ServiceLocator.getService("Service1");
        service.execute();
        service = ServiceLocator.getService("Service2");
        service.execute();
        service = ServiceLocator.getService("Service1");
        service.execute();
        service = ServiceLocator.getService("Service2");
        service.execute();
    }
}

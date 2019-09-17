package com.imsle.maxer.order.utils;

import org.springframework.boot.web.context.WebServerInitializedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;


@Component
public class ServiceInfoUtil implements ApplicationListener<WebServerInitializedEvent> {

    private static int port ;
    @Override
    public void onApplicationEvent(WebServerInitializedEvent event) {
        port = event.getWebServer().getPort();
    }

    /**
     * 获取端口号
     */
    public static int getPort (){
        return port;
    }
}

package com.example.hardwaredemo;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.UnknownHostException;
import java.util.Enumeration;

@SpringBootApplication
public class HardwareDemoApplication {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(HardwareDemoApplication.class);
        //关闭启动logo和启动日志的输出
        springApplication.setBannerMode(Banner.Mode.OFF);
        springApplication.run(args);
        try {
            test();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static void test() throws Exception {
        Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();

        while (interfaces.hasMoreElements()) {
            NetworkInterface networkInterface = interfaces.nextElement();
            // drop inactive
            if (!networkInterface.isUp())
                continue;

            // smth we can explore
            Enumeration<InetAddress> addresses = networkInterface.getInetAddresses();
            while(addresses.hasMoreElements()) {
                InetAddress addr = addresses.nextElement();
                if(networkInterface.getDisplayName().toUpperCase().contains("WIFI")||networkInterface.getDisplayName().toUpperCase().contains("WI-FI"))
                {
                    System.out.println(String.format("Your ip address: ip [%s]",
                             addr.getHostAddress()));
                }

            }
        }
    }

}

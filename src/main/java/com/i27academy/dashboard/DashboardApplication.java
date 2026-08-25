<<<<<<< HEAD
package com.i27academy.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.i27academy.dashboard.config.AppProperties;

@SpringBootApplication
@EnableConfigurationProperties(AppProperties.class)
public class DashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(DashboardApplication.class, args);
    }
}
=======
package com.i27academy.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.i27academy.dashboard.config.AppProperties;

@SpringBootApplication
@EnableConfigurationProperties(AppProperties.class)
public class DashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(DashboardApplication.class, args);
    }
}
>>>>>>> 61dd7a58fe97e44741826fb6f5a74a85d5700ff1

<<<<<<< HEAD
package com.i27academy.dashboard.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "app")
public record AppProperties(
        String name,
        String version,
        String description,
        String environment
) {}
=======
package com.i27academy.dashboard.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "app")
public record AppProperties(
        String name,
        String version,
        String description,
        String environment
) {}
>>>>>>> 61dd7a58fe97e44741826fb6f5a74a85d5700ff1

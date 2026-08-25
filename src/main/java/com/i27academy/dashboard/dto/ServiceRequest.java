<<<<<<< HEAD
package com.i27academy.dashboard.dto;

import jakarta.validation.constraints.NotBlank;

public record ServiceRequest(
        @NotBlank(message = "Service name is required")
        String name,
        String description,
        String repositoryUrl,
        String ownerTeam
) {}
=======
package com.i27academy.dashboard.dto;

import jakarta.validation.constraints.NotBlank;

public record ServiceRequest(
        @NotBlank(message = "Service name is required")
        String name,
        String description,
        String repositoryUrl,
        String ownerTeam
) {}
>>>>>>> 61dd7a58fe97e44741826fb6f5a74a85d5700ff1

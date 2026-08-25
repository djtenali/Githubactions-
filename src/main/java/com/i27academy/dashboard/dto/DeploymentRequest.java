<<<<<<< HEAD
package com.i27academy.dashboard.dto;

import com.i27academy.dashboard.model.enums.Environment;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DeploymentRequest(
        @NotNull(message = "service_id is required")
        Long serviceId,
        @NotBlank(message = "version is required")
        String version,
        @NotNull(message = "environment is required")
        Environment environment,
        @NotBlank(message = "triggered_by is required")
        String triggeredBy,
        String commitSha,
        String notes
) {}
=======
package com.i27academy.dashboard.dto;

import com.i27academy.dashboard.model.enums.Environment;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DeploymentRequest(
        @NotNull(message = "service_id is required")
        Long serviceId,
        @NotBlank(message = "version is required")
        String version,
        @NotNull(message = "environment is required")
        Environment environment,
        @NotBlank(message = "triggered_by is required")
        String triggeredBy,
        String commitSha,
        String notes
) {}
>>>>>>> 61dd7a58fe97e44741826fb6f5a74a85d5700ff1

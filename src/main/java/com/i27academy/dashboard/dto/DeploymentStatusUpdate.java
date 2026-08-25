<<<<<<< HEAD
package com.i27academy.dashboard.dto;

import com.i27academy.dashboard.model.enums.DeploymentStatus;

import jakarta.validation.constraints.NotNull;

public record DeploymentStatusUpdate(
        @NotNull(message = "status is required")
        DeploymentStatus status,
        String notes
) {}
=======
package com.i27academy.dashboard.dto;

import com.i27academy.dashboard.model.enums.DeploymentStatus;

import jakarta.validation.constraints.NotNull;

public record DeploymentStatusUpdate(
        @NotNull(message = "status is required")
        DeploymentStatus status,
        String notes
) {}
>>>>>>> 61dd7a58fe97e44741826fb6f5a74a85d5700ff1

<<<<<<< HEAD
package com.i27academy.dashboard.dto;

import com.i27academy.dashboard.model.enums.PipelineStatus;

import jakarta.validation.constraints.NotNull;

public record PipelineStatusUpdate(
        @NotNull(message = "status is required")
        PipelineStatus status,
        Integer durationSeconds
) {}
=======
package com.i27academy.dashboard.dto;

import com.i27academy.dashboard.model.enums.PipelineStatus;

import jakarta.validation.constraints.NotNull;

public record PipelineStatusUpdate(
        @NotNull(message = "status is required")
        PipelineStatus status,
        Integer durationSeconds
) {}
>>>>>>> 61dd7a58fe97e44741826fb6f5a74a85d5700ff1

<<<<<<< HEAD
package com.i27academy.dashboard.dto;

import java.util.List;
import java.util.Map;

public record DashboardSummary(
        long totalServices,
        long totalDeployments,
        long totalPipelineRuns,
        Map<String, Long> deploymentStatusCounts,
        Map<String, Long> pipelineStatusCounts,
        List<DeploymentResponse> recentDeployments,
        List<PipelineRunResponse> recentPipelineRuns
) {}
=======
package com.i27academy.dashboard.dto;

import java.util.List;
import java.util.Map;

public record DashboardSummary(
        long totalServices,
        long totalDeployments,
        long totalPipelineRuns,
        Map<String, Long> deploymentStatusCounts,
        Map<String, Long> pipelineStatusCounts,
        List<DeploymentResponse> recentDeployments,
        List<PipelineRunResponse> recentPipelineRuns
) {}
>>>>>>> 61dd7a58fe97e44741826fb6f5a74a85d5700ff1

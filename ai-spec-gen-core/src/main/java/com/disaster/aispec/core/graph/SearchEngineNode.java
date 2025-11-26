package com.disaster.aispec.core.graph;

import com.alibaba.cloud.ai.graph.OverAllState;
import com.alibaba.cloud.ai.graph.RunnableConfig;
import com.alibaba.cloud.ai.graph.action.AsyncNodeActionWithConfig;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class SearchEngineNode implements AsyncNodeActionWithConfig {
    @Override
    public CompletableFuture<Map<String, Object>> apply(OverAllState state, RunnableConfig config) {
        return null;
    }
}

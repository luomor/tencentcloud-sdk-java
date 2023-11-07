/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DisableFlowLogsRequest extends AbstractModel {

    /**
    * 流日志Id。
    */
    @SerializedName("FlowLogIds")
    @Expose
    private String [] FlowLogIds;

    /**
     * Get 流日志Id。 
     * @return FlowLogIds 流日志Id。
     */
    public String [] getFlowLogIds() {
        return this.FlowLogIds;
    }

    /**
     * Set 流日志Id。
     * @param FlowLogIds 流日志Id。
     */
    public void setFlowLogIds(String [] FlowLogIds) {
        this.FlowLogIds = FlowLogIds;
    }

    public DisableFlowLogsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DisableFlowLogsRequest(DisableFlowLogsRequest source) {
        if (source.FlowLogIds != null) {
            this.FlowLogIds = new String[source.FlowLogIds.length];
            for (int i = 0; i < source.FlowLogIds.length; i++) {
                this.FlowLogIds[i] = new String(source.FlowLogIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "FlowLogIds.", this.FlowLogIds);

    }
}


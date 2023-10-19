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
package com.tencentcloudapi.cdc.v20201214.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDedicatedClusterOrdersResponse extends AbstractModel {

    /**
    * 专用集群订单列表
    */
    @SerializedName("DedicatedClusterOrderSet")
    @Expose
    private DedicatedClusterOrder [] DedicatedClusterOrderSet;

    /**
    * 符合条件的专用集群订单总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 专用集群订单列表 
     * @return DedicatedClusterOrderSet 专用集群订单列表
     */
    public DedicatedClusterOrder [] getDedicatedClusterOrderSet() {
        return this.DedicatedClusterOrderSet;
    }

    /**
     * Set 专用集群订单列表
     * @param DedicatedClusterOrderSet 专用集群订单列表
     */
    public void setDedicatedClusterOrderSet(DedicatedClusterOrder [] DedicatedClusterOrderSet) {
        this.DedicatedClusterOrderSet = DedicatedClusterOrderSet;
    }

    /**
     * Get 符合条件的专用集群订单总数 
     * @return TotalCount 符合条件的专用集群订单总数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 符合条件的专用集群订单总数
     * @param TotalCount 符合条件的专用集群订单总数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeDedicatedClusterOrdersResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDedicatedClusterOrdersResponse(DescribeDedicatedClusterOrdersResponse source) {
        if (source.DedicatedClusterOrderSet != null) {
            this.DedicatedClusterOrderSet = new DedicatedClusterOrder[source.DedicatedClusterOrderSet.length];
            for (int i = 0; i < source.DedicatedClusterOrderSet.length; i++) {
                this.DedicatedClusterOrderSet[i] = new DedicatedClusterOrder(source.DedicatedClusterOrderSet[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "DedicatedClusterOrderSet.", this.DedicatedClusterOrderSet);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


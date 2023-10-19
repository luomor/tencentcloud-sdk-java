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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeClassicalLBByInstanceIdResponse extends AbstractModel {

    /**
    * 负载均衡相关信息列表。
    */
    @SerializedName("LoadBalancerInfoList")
    @Expose
    private ClassicalLoadBalancerInfo [] LoadBalancerInfoList;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 负载均衡相关信息列表。 
     * @return LoadBalancerInfoList 负载均衡相关信息列表。
     */
    public ClassicalLoadBalancerInfo [] getLoadBalancerInfoList() {
        return this.LoadBalancerInfoList;
    }

    /**
     * Set 负载均衡相关信息列表。
     * @param LoadBalancerInfoList 负载均衡相关信息列表。
     */
    public void setLoadBalancerInfoList(ClassicalLoadBalancerInfo [] LoadBalancerInfoList) {
        this.LoadBalancerInfoList = LoadBalancerInfoList;
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

    public DescribeClassicalLBByInstanceIdResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClassicalLBByInstanceIdResponse(DescribeClassicalLBByInstanceIdResponse source) {
        if (source.LoadBalancerInfoList != null) {
            this.LoadBalancerInfoList = new ClassicalLoadBalancerInfo[source.LoadBalancerInfoList.length];
            for (int i = 0; i < source.LoadBalancerInfoList.length; i++) {
                this.LoadBalancerInfoList[i] = new ClassicalLoadBalancerInfo(source.LoadBalancerInfoList[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "LoadBalancerInfoList.", this.LoadBalancerInfoList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


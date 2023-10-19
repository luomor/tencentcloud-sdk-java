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

public class InquiryPriceModifyLoadBalancerRequest extends AbstractModel {

    /**
    * 负载均衡实例ID
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * 修改后的网络带宽信息
    */
    @SerializedName("InternetAccessible")
    @Expose
    private InternetAccessible InternetAccessible;

    /**
     * Get 负载均衡实例ID 
     * @return LoadBalancerId 负载均衡实例ID
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set 负载均衡实例ID
     * @param LoadBalancerId 负载均衡实例ID
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get 修改后的网络带宽信息 
     * @return InternetAccessible 修改后的网络带宽信息
     */
    public InternetAccessible getInternetAccessible() {
        return this.InternetAccessible;
    }

    /**
     * Set 修改后的网络带宽信息
     * @param InternetAccessible 修改后的网络带宽信息
     */
    public void setInternetAccessible(InternetAccessible InternetAccessible) {
        this.InternetAccessible = InternetAccessible;
    }

    public InquiryPriceModifyLoadBalancerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InquiryPriceModifyLoadBalancerRequest(InquiryPriceModifyLoadBalancerRequest source) {
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.InternetAccessible != null) {
            this.InternetAccessible = new InternetAccessible(source.InternetAccessible);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamObj(map, prefix + "InternetAccessible.", this.InternetAccessible);

    }
}


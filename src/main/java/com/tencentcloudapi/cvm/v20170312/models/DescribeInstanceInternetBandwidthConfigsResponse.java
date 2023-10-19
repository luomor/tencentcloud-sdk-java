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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceInternetBandwidthConfigsResponse extends AbstractModel {

    /**
    * 带宽配置信息列表。
    */
    @SerializedName("InternetBandwidthConfigSet")
    @Expose
    private InternetBandwidthConfig [] InternetBandwidthConfigSet;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 带宽配置信息列表。 
     * @return InternetBandwidthConfigSet 带宽配置信息列表。
     */
    public InternetBandwidthConfig [] getInternetBandwidthConfigSet() {
        return this.InternetBandwidthConfigSet;
    }

    /**
     * Set 带宽配置信息列表。
     * @param InternetBandwidthConfigSet 带宽配置信息列表。
     */
    public void setInternetBandwidthConfigSet(InternetBandwidthConfig [] InternetBandwidthConfigSet) {
        this.InternetBandwidthConfigSet = InternetBandwidthConfigSet;
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

    public DescribeInstanceInternetBandwidthConfigsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceInternetBandwidthConfigsResponse(DescribeInstanceInternetBandwidthConfigsResponse source) {
        if (source.InternetBandwidthConfigSet != null) {
            this.InternetBandwidthConfigSet = new InternetBandwidthConfig[source.InternetBandwidthConfigSet.length];
            for (int i = 0; i < source.InternetBandwidthConfigSet.length; i++) {
                this.InternetBandwidthConfigSet[i] = new InternetBandwidthConfig(source.InternetBandwidthConfigSet[i]);
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
        this.setParamArrayObj(map, prefix + "InternetBandwidthConfigSet.", this.InternetBandwidthConfigSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


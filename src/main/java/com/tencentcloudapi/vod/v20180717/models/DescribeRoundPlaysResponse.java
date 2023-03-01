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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRoundPlaysResponse extends AbstractModel{

    /**
    * 符合过滤条件的轮播播单总数。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 轮播播单详情列表。
    */
    @SerializedName("RoundPlaySet")
    @Expose
    private RoundPlayInfo [] RoundPlaySet;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 符合过滤条件的轮播播单总数。 
     * @return TotalCount 符合过滤条件的轮播播单总数。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 符合过滤条件的轮播播单总数。
     * @param TotalCount 符合过滤条件的轮播播单总数。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 轮播播单详情列表。 
     * @return RoundPlaySet 轮播播单详情列表。
     */
    public RoundPlayInfo [] getRoundPlaySet() {
        return this.RoundPlaySet;
    }

    /**
     * Set 轮播播单详情列表。
     * @param RoundPlaySet 轮播播单详情列表。
     */
    public void setRoundPlaySet(RoundPlayInfo [] RoundPlaySet) {
        this.RoundPlaySet = RoundPlaySet;
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

    public DescribeRoundPlaysResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRoundPlaysResponse(DescribeRoundPlaysResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.RoundPlaySet != null) {
            this.RoundPlaySet = new RoundPlayInfo[source.RoundPlaySet.length];
            for (int i = 0; i < source.RoundPlaySet.length; i++) {
                this.RoundPlaySet[i] = new RoundPlayInfo(source.RoundPlaySet[i]);
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
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "RoundPlaySet.", this.RoundPlaySet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

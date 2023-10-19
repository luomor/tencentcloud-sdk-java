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
package com.tencentcloudapi.trro.v20220325.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDeviceSessionListResponse extends AbstractModel {

    /**
    * 总个数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 会话列表
    */
    @SerializedName("DeviceSessionList")
    @Expose
    private SessionInfo [] DeviceSessionList;

    /**
    * 本页数量
    */
    @SerializedName("Num")
    @Expose
    private Long Num;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 总个数 
     * @return Total 总个数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 总个数
     * @param Total 总个数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 会话列表 
     * @return DeviceSessionList 会话列表
     */
    public SessionInfo [] getDeviceSessionList() {
        return this.DeviceSessionList;
    }

    /**
     * Set 会话列表
     * @param DeviceSessionList 会话列表
     */
    public void setDeviceSessionList(SessionInfo [] DeviceSessionList) {
        this.DeviceSessionList = DeviceSessionList;
    }

    /**
     * Get 本页数量 
     * @return Num 本页数量
     */
    public Long getNum() {
        return this.Num;
    }

    /**
     * Set 本页数量
     * @param Num 本页数量
     */
    public void setNum(Long Num) {
        this.Num = Num;
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

    public DescribeDeviceSessionListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDeviceSessionListResponse(DescribeDeviceSessionListResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.DeviceSessionList != null) {
            this.DeviceSessionList = new SessionInfo[source.DeviceSessionList.length];
            for (int i = 0; i < source.DeviceSessionList.length; i++) {
                this.DeviceSessionList[i] = new SessionInfo(source.DeviceSessionList[i]);
            }
        }
        if (source.Num != null) {
            this.Num = new Long(source.Num);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArrayObj(map, prefix + "DeviceSessionList.", this.DeviceSessionList);
        this.setParamSimple(map, prefix + "Num", this.Num);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


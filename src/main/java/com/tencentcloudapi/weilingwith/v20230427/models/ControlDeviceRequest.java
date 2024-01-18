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
package com.tencentcloudapi.weilingwith.v20230427.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ControlDeviceRequest extends AbstractModel {

    /**
    * 工作空间id
    */
    @SerializedName("WorkspaceId")
    @Expose
    private Long WorkspaceId;

    /**
    * 设备wid，最大100个
    */
    @SerializedName("WIDSet")
    @Expose
    private String [] WIDSet;

    /**
    * 控制内容
    */
    @SerializedName("ControlData")
    @Expose
    private String ControlData;

    /**
    * 应用token
    */
    @SerializedName("ApplicationToken")
    @Expose
    private String ApplicationToken;

    /**
    * 是否同步返回设备下控ack结果
    */
    @SerializedName("IsSynchronized")
    @Expose
    private Boolean IsSynchronized;

    /**
     * Get 工作空间id 
     * @return WorkspaceId 工作空间id
     */
    public Long getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set 工作空间id
     * @param WorkspaceId 工作空间id
     */
    public void setWorkspaceId(Long WorkspaceId) {
        this.WorkspaceId = WorkspaceId;
    }

    /**
     * Get 设备wid，最大100个 
     * @return WIDSet 设备wid，最大100个
     */
    public String [] getWIDSet() {
        return this.WIDSet;
    }

    /**
     * Set 设备wid，最大100个
     * @param WIDSet 设备wid，最大100个
     */
    public void setWIDSet(String [] WIDSet) {
        this.WIDSet = WIDSet;
    }

    /**
     * Get 控制内容 
     * @return ControlData 控制内容
     */
    public String getControlData() {
        return this.ControlData;
    }

    /**
     * Set 控制内容
     * @param ControlData 控制内容
     */
    public void setControlData(String ControlData) {
        this.ControlData = ControlData;
    }

    /**
     * Get 应用token 
     * @return ApplicationToken 应用token
     */
    public String getApplicationToken() {
        return this.ApplicationToken;
    }

    /**
     * Set 应用token
     * @param ApplicationToken 应用token
     */
    public void setApplicationToken(String ApplicationToken) {
        this.ApplicationToken = ApplicationToken;
    }

    /**
     * Get 是否同步返回设备下控ack结果 
     * @return IsSynchronized 是否同步返回设备下控ack结果
     */
    public Boolean getIsSynchronized() {
        return this.IsSynchronized;
    }

    /**
     * Set 是否同步返回设备下控ack结果
     * @param IsSynchronized 是否同步返回设备下控ack结果
     */
    public void setIsSynchronized(Boolean IsSynchronized) {
        this.IsSynchronized = IsSynchronized;
    }

    public ControlDeviceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ControlDeviceRequest(ControlDeviceRequest source) {
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new Long(source.WorkspaceId);
        }
        if (source.WIDSet != null) {
            this.WIDSet = new String[source.WIDSet.length];
            for (int i = 0; i < source.WIDSet.length; i++) {
                this.WIDSet[i] = new String(source.WIDSet[i]);
            }
        }
        if (source.ControlData != null) {
            this.ControlData = new String(source.ControlData);
        }
        if (source.ApplicationToken != null) {
            this.ApplicationToken = new String(source.ApplicationToken);
        }
        if (source.IsSynchronized != null) {
            this.IsSynchronized = new Boolean(source.IsSynchronized);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamArraySimple(map, prefix + "WIDSet.", this.WIDSet);
        this.setParamSimple(map, prefix + "ControlData", this.ControlData);
        this.setParamSimple(map, prefix + "ApplicationToken", this.ApplicationToken);
        this.setParamSimple(map, prefix + "IsSynchronized", this.IsSynchronized);

    }
}


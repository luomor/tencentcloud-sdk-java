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
package com.tencentcloudapi.iot.v20180123.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IssueDeviceControlRequest extends AbstractModel {

    /**
    * 产品Id
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 设备名称
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * 控制数据（json）
    */
    @SerializedName("ControlData")
    @Expose
    private String ControlData;

    /**
    * 是否发送metadata字段
    */
    @SerializedName("Metadata")
    @Expose
    private Boolean Metadata;

    /**
     * Get 产品Id 
     * @return ProductId 产品Id
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 产品Id
     * @param ProductId 产品Id
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 设备名称 
     * @return DeviceName 设备名称
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set 设备名称
     * @param DeviceName 设备名称
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get 控制数据（json） 
     * @return ControlData 控制数据（json）
     */
    public String getControlData() {
        return this.ControlData;
    }

    /**
     * Set 控制数据（json）
     * @param ControlData 控制数据（json）
     */
    public void setControlData(String ControlData) {
        this.ControlData = ControlData;
    }

    /**
     * Get 是否发送metadata字段 
     * @return Metadata 是否发送metadata字段
     */
    public Boolean getMetadata() {
        return this.Metadata;
    }

    /**
     * Set 是否发送metadata字段
     * @param Metadata 是否发送metadata字段
     */
    public void setMetadata(Boolean Metadata) {
        this.Metadata = Metadata;
    }

    public IssueDeviceControlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IssueDeviceControlRequest(IssueDeviceControlRequest source) {
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.ControlData != null) {
            this.ControlData = new String(source.ControlData);
        }
        if (source.Metadata != null) {
            this.Metadata = new Boolean(source.Metadata);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "ControlData", this.ControlData);
        this.setParamSimple(map, prefix + "Metadata", this.Metadata);

    }
}


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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BatchTarget extends AbstractModel{

    /**
    * 监听器ID
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * 绑定端口
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 子机ID。表示绑定主网卡主IP
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 弹性网卡ip或其他内网IP。如果是双栈IPV6子机，必须传该参数。
    */
    @SerializedName("EniIp")
    @Expose
    private String EniIp;

    /**
    * 子机权重，范围[0, 100]。绑定时如果不存在，则默认为10
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * 七层规则ID
    */
    @SerializedName("LocationId")
    @Expose
    private String LocationId;

    /**
     * Get 监听器ID 
     * @return ListenerId 监听器ID
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set 监听器ID
     * @param ListenerId 监听器ID
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get 绑定端口 
     * @return Port 绑定端口
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 绑定端口
     * @param Port 绑定端口
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 子机ID。表示绑定主网卡主IP 
     * @return InstanceId 子机ID。表示绑定主网卡主IP
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 子机ID。表示绑定主网卡主IP
     * @param InstanceId 子机ID。表示绑定主网卡主IP
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 弹性网卡ip或其他内网IP。如果是双栈IPV6子机，必须传该参数。 
     * @return EniIp 弹性网卡ip或其他内网IP。如果是双栈IPV6子机，必须传该参数。
     */
    public String getEniIp() {
        return this.EniIp;
    }

    /**
     * Set 弹性网卡ip或其他内网IP。如果是双栈IPV6子机，必须传该参数。
     * @param EniIp 弹性网卡ip或其他内网IP。如果是双栈IPV6子机，必须传该参数。
     */
    public void setEniIp(String EniIp) {
        this.EniIp = EniIp;
    }

    /**
     * Get 子机权重，范围[0, 100]。绑定时如果不存在，则默认为10 
     * @return Weight 子机权重，范围[0, 100]。绑定时如果不存在，则默认为10
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set 子机权重，范围[0, 100]。绑定时如果不存在，则默认为10
     * @param Weight 子机权重，范围[0, 100]。绑定时如果不存在，则默认为10
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get 七层规则ID 
     * @return LocationId 七层规则ID
     */
    public String getLocationId() {
        return this.LocationId;
    }

    /**
     * Set 七层规则ID
     * @param LocationId 七层规则ID
     */
    public void setLocationId(String LocationId) {
        this.LocationId = LocationId;
    }

    public BatchTarget() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchTarget(BatchTarget source) {
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.EniIp != null) {
            this.EniIp = new String(source.EniIp);
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
        if (source.LocationId != null) {
            this.LocationId = new String(source.LocationId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "EniIp", this.EniIp);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "LocationId", this.LocationId);

    }
}


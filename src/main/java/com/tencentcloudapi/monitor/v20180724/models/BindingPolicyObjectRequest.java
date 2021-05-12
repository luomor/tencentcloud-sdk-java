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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BindingPolicyObjectRequest extends AbstractModel{

    /**
    * 策略组id，如传入 PolicyId 则该字段会被忽略可传入任意值如 0
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * 必填。固定值"monitor"
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * 实例分组ID
    */
    @SerializedName("InstanceGroupId")
    @Expose
    private Long InstanceGroupId;

    /**
    * 需要绑定的对象维度信息
    */
    @SerializedName("Dimensions")
    @Expose
    private BindingPolicyObjectDimension [] Dimensions;

    /**
    * 告警策略ID，使用此字段时 GroupId 会被忽略
    */
    @SerializedName("PolicyId")
    @Expose
    private String PolicyId;

    /**
     * Get 策略组id，如传入 PolicyId 则该字段会被忽略可传入任意值如 0 
     * @return GroupId 策略组id，如传入 PolicyId 则该字段会被忽略可传入任意值如 0
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 策略组id，如传入 PolicyId 则该字段会被忽略可传入任意值如 0
     * @param GroupId 策略组id，如传入 PolicyId 则该字段会被忽略可传入任意值如 0
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 必填。固定值"monitor" 
     * @return Module 必填。固定值"monitor"
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set 必填。固定值"monitor"
     * @param Module 必填。固定值"monitor"
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get 实例分组ID 
     * @return InstanceGroupId 实例分组ID
     */
    public Long getInstanceGroupId() {
        return this.InstanceGroupId;
    }

    /**
     * Set 实例分组ID
     * @param InstanceGroupId 实例分组ID
     */
    public void setInstanceGroupId(Long InstanceGroupId) {
        this.InstanceGroupId = InstanceGroupId;
    }

    /**
     * Get 需要绑定的对象维度信息 
     * @return Dimensions 需要绑定的对象维度信息
     */
    public BindingPolicyObjectDimension [] getDimensions() {
        return this.Dimensions;
    }

    /**
     * Set 需要绑定的对象维度信息
     * @param Dimensions 需要绑定的对象维度信息
     */
    public void setDimensions(BindingPolicyObjectDimension [] Dimensions) {
        this.Dimensions = Dimensions;
    }

    /**
     * Get 告警策略ID，使用此字段时 GroupId 会被忽略 
     * @return PolicyId 告警策略ID，使用此字段时 GroupId 会被忽略
     */
    public String getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set 告警策略ID，使用此字段时 GroupId 会被忽略
     * @param PolicyId 告警策略ID，使用此字段时 GroupId 会被忽略
     */
    public void setPolicyId(String PolicyId) {
        this.PolicyId = PolicyId;
    }

    public BindingPolicyObjectRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BindingPolicyObjectRequest(BindingPolicyObjectRequest source) {
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
        if (source.Module != null) {
            this.Module = new String(source.Module);
        }
        if (source.InstanceGroupId != null) {
            this.InstanceGroupId = new Long(source.InstanceGroupId);
        }
        if (source.Dimensions != null) {
            this.Dimensions = new BindingPolicyObjectDimension[source.Dimensions.length];
            for (int i = 0; i < source.Dimensions.length; i++) {
                this.Dimensions[i] = new BindingPolicyObjectDimension(source.Dimensions[i]);
            }
        }
        if (source.PolicyId != null) {
            this.PolicyId = new String(source.PolicyId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "InstanceGroupId", this.InstanceGroupId);
        this.setParamArrayObj(map, prefix + "Dimensions.", this.Dimensions);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);

    }
}


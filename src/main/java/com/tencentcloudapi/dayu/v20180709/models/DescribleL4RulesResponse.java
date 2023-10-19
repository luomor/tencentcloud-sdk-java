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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribleL4RulesResponse extends AbstractModel {

    /**
    * 转发规则列表
    */
    @SerializedName("Rules")
    @Expose
    private L4RuleEntry [] Rules;

    /**
    * 总规则数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 健康检查配置列表
    */
    @SerializedName("Healths")
    @Expose
    private L4RuleHealth [] Healths;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 转发规则列表 
     * @return Rules 转发规则列表
     */
    public L4RuleEntry [] getRules() {
        return this.Rules;
    }

    /**
     * Set 转发规则列表
     * @param Rules 转发规则列表
     */
    public void setRules(L4RuleEntry [] Rules) {
        this.Rules = Rules;
    }

    /**
     * Get 总规则数 
     * @return Total 总规则数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 总规则数
     * @param Total 总规则数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 健康检查配置列表 
     * @return Healths 健康检查配置列表
     */
    public L4RuleHealth [] getHealths() {
        return this.Healths;
    }

    /**
     * Set 健康检查配置列表
     * @param Healths 健康检查配置列表
     */
    public void setHealths(L4RuleHealth [] Healths) {
        this.Healths = Healths;
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

    public DescribleL4RulesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribleL4RulesResponse(DescribleL4RulesResponse source) {
        if (source.Rules != null) {
            this.Rules = new L4RuleEntry[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new L4RuleEntry(source.Rules[i]);
            }
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Healths != null) {
            this.Healths = new L4RuleHealth[source.Healths.length];
            for (int i = 0; i < source.Healths.length; i++) {
                this.Healths[i] = new L4RuleHealth(source.Healths[i]);
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
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArrayObj(map, prefix + "Healths.", this.Healths);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateDiagnoseSettingsRequest extends AbstractModel {

    /**
    * ES实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 0：开启智能运维；-1：关闭智能运维
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 智能运维每天定时巡检时间，时间格式为HH:00:00，例如15:00:00
    */
    @SerializedName("CronTime")
    @Expose
    private String CronTime;

    /**
     * Get ES实例ID 
     * @return InstanceId ES实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set ES实例ID
     * @param InstanceId ES实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 0：开启智能运维；-1：关闭智能运维 
     * @return Status 0：开启智能运维；-1：关闭智能运维
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 0：开启智能运维；-1：关闭智能运维
     * @param Status 0：开启智能运维；-1：关闭智能运维
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 智能运维每天定时巡检时间，时间格式为HH:00:00，例如15:00:00 
     * @return CronTime 智能运维每天定时巡检时间，时间格式为HH:00:00，例如15:00:00
     */
    public String getCronTime() {
        return this.CronTime;
    }

    /**
     * Set 智能运维每天定时巡检时间，时间格式为HH:00:00，例如15:00:00
     * @param CronTime 智能运维每天定时巡检时间，时间格式为HH:00:00，例如15:00:00
     */
    public void setCronTime(String CronTime) {
        this.CronTime = CronTime;
    }

    public UpdateDiagnoseSettingsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateDiagnoseSettingsRequest(UpdateDiagnoseSettingsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CronTime != null) {
            this.CronTime = new String(source.CronTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CronTime", this.CronTime);

    }
}


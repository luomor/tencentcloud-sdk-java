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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KongActiveHealthCheck extends AbstractModel {

    /**
    * 主动健康检查健康探测间隔，单位：秒，0表示不开启
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HealthyInterval")
    @Expose
    private Long HealthyInterval;

    /**
    * 主动健康检查异常探测间隔，单位：秒，0表示不开启
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UnHealthyInterval")
    @Expose
    private Long UnHealthyInterval;

    /**
    * 在 GET HTTP 请求中使用的路径，以作为主动运行状况检查的探测器运行。默认： ”/”。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HttpPath")
    @Expose
    private String HttpPath;

    /**
     * Get 主动健康检查健康探测间隔，单位：秒，0表示不开启
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HealthyInterval 主动健康检查健康探测间隔，单位：秒，0表示不开启
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getHealthyInterval() {
        return this.HealthyInterval;
    }

    /**
     * Set 主动健康检查健康探测间隔，单位：秒，0表示不开启
注意：此字段可能返回 null，表示取不到有效值。
     * @param HealthyInterval 主动健康检查健康探测间隔，单位：秒，0表示不开启
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHealthyInterval(Long HealthyInterval) {
        this.HealthyInterval = HealthyInterval;
    }

    /**
     * Get 主动健康检查异常探测间隔，单位：秒，0表示不开启
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UnHealthyInterval 主动健康检查异常探测间隔，单位：秒，0表示不开启
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUnHealthyInterval() {
        return this.UnHealthyInterval;
    }

    /**
     * Set 主动健康检查异常探测间隔，单位：秒，0表示不开启
注意：此字段可能返回 null，表示取不到有效值。
     * @param UnHealthyInterval 主动健康检查异常探测间隔，单位：秒，0表示不开启
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUnHealthyInterval(Long UnHealthyInterval) {
        this.UnHealthyInterval = UnHealthyInterval;
    }

    /**
     * Get 在 GET HTTP 请求中使用的路径，以作为主动运行状况检查的探测器运行。默认： ”/”。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HttpPath 在 GET HTTP 请求中使用的路径，以作为主动运行状况检查的探测器运行。默认： ”/”。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHttpPath() {
        return this.HttpPath;
    }

    /**
     * Set 在 GET HTTP 请求中使用的路径，以作为主动运行状况检查的探测器运行。默认： ”/”。
注意：此字段可能返回 null，表示取不到有效值。
     * @param HttpPath 在 GET HTTP 请求中使用的路径，以作为主动运行状况检查的探测器运行。默认： ”/”。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHttpPath(String HttpPath) {
        this.HttpPath = HttpPath;
    }

    public KongActiveHealthCheck() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KongActiveHealthCheck(KongActiveHealthCheck source) {
        if (source.HealthyInterval != null) {
            this.HealthyInterval = new Long(source.HealthyInterval);
        }
        if (source.UnHealthyInterval != null) {
            this.UnHealthyInterval = new Long(source.UnHealthyInterval);
        }
        if (source.HttpPath != null) {
            this.HttpPath = new String(source.HttpPath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HealthyInterval", this.HealthyInterval);
        this.setParamSimple(map, prefix + "UnHealthyInterval", this.UnHealthyInterval);
        this.setParamSimple(map, prefix + "HttpPath", this.HttpPath);

    }
}


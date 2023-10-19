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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RollbackInstanceRefreshRequest extends AbstractModel {

    /**
    * 伸缩组ID。
    */
    @SerializedName("AutoScalingGroupId")
    @Expose
    private String AutoScalingGroupId;

    /**
    * 刷新设置。
    */
    @SerializedName("RefreshSettings")
    @Expose
    private RefreshSettings RefreshSettings;

    /**
    * 原始刷新活动 ID。
    */
    @SerializedName("OriginRefreshActivityId")
    @Expose
    private String OriginRefreshActivityId;

    /**
    * 刷新模式，目前仅支持滚动更新，默认值为 ROLLING_UPDATE_RESET。
    */
    @SerializedName("RefreshMode")
    @Expose
    private String RefreshMode;

    /**
     * Get 伸缩组ID。 
     * @return AutoScalingGroupId 伸缩组ID。
     */
    public String getAutoScalingGroupId() {
        return this.AutoScalingGroupId;
    }

    /**
     * Set 伸缩组ID。
     * @param AutoScalingGroupId 伸缩组ID。
     */
    public void setAutoScalingGroupId(String AutoScalingGroupId) {
        this.AutoScalingGroupId = AutoScalingGroupId;
    }

    /**
     * Get 刷新设置。 
     * @return RefreshSettings 刷新设置。
     */
    public RefreshSettings getRefreshSettings() {
        return this.RefreshSettings;
    }

    /**
     * Set 刷新设置。
     * @param RefreshSettings 刷新设置。
     */
    public void setRefreshSettings(RefreshSettings RefreshSettings) {
        this.RefreshSettings = RefreshSettings;
    }

    /**
     * Get 原始刷新活动 ID。 
     * @return OriginRefreshActivityId 原始刷新活动 ID。
     */
    public String getOriginRefreshActivityId() {
        return this.OriginRefreshActivityId;
    }

    /**
     * Set 原始刷新活动 ID。
     * @param OriginRefreshActivityId 原始刷新活动 ID。
     */
    public void setOriginRefreshActivityId(String OriginRefreshActivityId) {
        this.OriginRefreshActivityId = OriginRefreshActivityId;
    }

    /**
     * Get 刷新模式，目前仅支持滚动更新，默认值为 ROLLING_UPDATE_RESET。 
     * @return RefreshMode 刷新模式，目前仅支持滚动更新，默认值为 ROLLING_UPDATE_RESET。
     */
    public String getRefreshMode() {
        return this.RefreshMode;
    }

    /**
     * Set 刷新模式，目前仅支持滚动更新，默认值为 ROLLING_UPDATE_RESET。
     * @param RefreshMode 刷新模式，目前仅支持滚动更新，默认值为 ROLLING_UPDATE_RESET。
     */
    public void setRefreshMode(String RefreshMode) {
        this.RefreshMode = RefreshMode;
    }

    public RollbackInstanceRefreshRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RollbackInstanceRefreshRequest(RollbackInstanceRefreshRequest source) {
        if (source.AutoScalingGroupId != null) {
            this.AutoScalingGroupId = new String(source.AutoScalingGroupId);
        }
        if (source.RefreshSettings != null) {
            this.RefreshSettings = new RefreshSettings(source.RefreshSettings);
        }
        if (source.OriginRefreshActivityId != null) {
            this.OriginRefreshActivityId = new String(source.OriginRefreshActivityId);
        }
        if (source.RefreshMode != null) {
            this.RefreshMode = new String(source.RefreshMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoScalingGroupId", this.AutoScalingGroupId);
        this.setParamObj(map, prefix + "RefreshSettings.", this.RefreshSettings);
        this.setParamSimple(map, prefix + "OriginRefreshActivityId", this.OriginRefreshActivityId);
        this.setParamSimple(map, prefix + "RefreshMode", this.RefreshMode);

    }
}


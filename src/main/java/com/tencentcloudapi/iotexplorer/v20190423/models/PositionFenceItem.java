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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PositionFenceItem extends AbstractModel {

    /**
    * 围栏Id
    */
    @SerializedName("FenceId")
    @Expose
    private Long FenceId;

    /**
    * 位置空间Id
    */
    @SerializedName("SpaceId")
    @Expose
    private String SpaceId;

    /**
    * 围栏名称
    */
    @SerializedName("FenceName")
    @Expose
    private String FenceName;

    /**
    * 围栏描述
    */
    @SerializedName("FenceDesc")
    @Expose
    private String FenceDesc;

    /**
    * 围栏区域信息，采用 GeoJSON 格式
    */
    @SerializedName("FenceArea")
    @Expose
    private String FenceArea;

    /**
     * Get 围栏Id 
     * @return FenceId 围栏Id
     */
    public Long getFenceId() {
        return this.FenceId;
    }

    /**
     * Set 围栏Id
     * @param FenceId 围栏Id
     */
    public void setFenceId(Long FenceId) {
        this.FenceId = FenceId;
    }

    /**
     * Get 位置空间Id 
     * @return SpaceId 位置空间Id
     */
    public String getSpaceId() {
        return this.SpaceId;
    }

    /**
     * Set 位置空间Id
     * @param SpaceId 位置空间Id
     */
    public void setSpaceId(String SpaceId) {
        this.SpaceId = SpaceId;
    }

    /**
     * Get 围栏名称 
     * @return FenceName 围栏名称
     */
    public String getFenceName() {
        return this.FenceName;
    }

    /**
     * Set 围栏名称
     * @param FenceName 围栏名称
     */
    public void setFenceName(String FenceName) {
        this.FenceName = FenceName;
    }

    /**
     * Get 围栏描述 
     * @return FenceDesc 围栏描述
     */
    public String getFenceDesc() {
        return this.FenceDesc;
    }

    /**
     * Set 围栏描述
     * @param FenceDesc 围栏描述
     */
    public void setFenceDesc(String FenceDesc) {
        this.FenceDesc = FenceDesc;
    }

    /**
     * Get 围栏区域信息，采用 GeoJSON 格式 
     * @return FenceArea 围栏区域信息，采用 GeoJSON 格式
     */
    public String getFenceArea() {
        return this.FenceArea;
    }

    /**
     * Set 围栏区域信息，采用 GeoJSON 格式
     * @param FenceArea 围栏区域信息，采用 GeoJSON 格式
     */
    public void setFenceArea(String FenceArea) {
        this.FenceArea = FenceArea;
    }

    public PositionFenceItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PositionFenceItem(PositionFenceItem source) {
        if (source.FenceId != null) {
            this.FenceId = new Long(source.FenceId);
        }
        if (source.SpaceId != null) {
            this.SpaceId = new String(source.SpaceId);
        }
        if (source.FenceName != null) {
            this.FenceName = new String(source.FenceName);
        }
        if (source.FenceDesc != null) {
            this.FenceDesc = new String(source.FenceDesc);
        }
        if (source.FenceArea != null) {
            this.FenceArea = new String(source.FenceArea);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FenceId", this.FenceId);
        this.setParamSimple(map, prefix + "SpaceId", this.SpaceId);
        this.setParamSimple(map, prefix + "FenceName", this.FenceName);
        this.setParamSimple(map, prefix + "FenceDesc", this.FenceDesc);
        this.setParamSimple(map, prefix + "FenceArea", this.FenceArea);

    }
}


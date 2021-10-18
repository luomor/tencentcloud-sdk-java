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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RegionDetail extends AbstractModel{

    /**
    * 区域ID
    */
    @SerializedName("RegionId")
    @Expose
    private String RegionId;

    /**
    * 区域英文名或中文名
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * 机房所属大区
    */
    @SerializedName("RegionArea")
    @Expose
    private String RegionArea;

    /**
    * 机房所属大区名
    */
    @SerializedName("RegionAreaName")
    @Expose
    private String RegionAreaName;

    /**
    * 机房类型, dc表示DataCenter数据中心, ec表示EdgeComputing边缘节点
    */
    @SerializedName("IDCType")
    @Expose
    private String IDCType;

    /**
     * Get 区域ID 
     * @return RegionId 区域ID
     */
    public String getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 区域ID
     * @param RegionId 区域ID
     */
    public void setRegionId(String RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get 区域英文名或中文名 
     * @return RegionName 区域英文名或中文名
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set 区域英文名或中文名
     * @param RegionName 区域英文名或中文名
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * Get 机房所属大区 
     * @return RegionArea 机房所属大区
     */
    public String getRegionArea() {
        return this.RegionArea;
    }

    /**
     * Set 机房所属大区
     * @param RegionArea 机房所属大区
     */
    public void setRegionArea(String RegionArea) {
        this.RegionArea = RegionArea;
    }

    /**
     * Get 机房所属大区名 
     * @return RegionAreaName 机房所属大区名
     */
    public String getRegionAreaName() {
        return this.RegionAreaName;
    }

    /**
     * Set 机房所属大区名
     * @param RegionAreaName 机房所属大区名
     */
    public void setRegionAreaName(String RegionAreaName) {
        this.RegionAreaName = RegionAreaName;
    }

    /**
     * Get 机房类型, dc表示DataCenter数据中心, ec表示EdgeComputing边缘节点 
     * @return IDCType 机房类型, dc表示DataCenter数据中心, ec表示EdgeComputing边缘节点
     */
    public String getIDCType() {
        return this.IDCType;
    }

    /**
     * Set 机房类型, dc表示DataCenter数据中心, ec表示EdgeComputing边缘节点
     * @param IDCType 机房类型, dc表示DataCenter数据中心, ec表示EdgeComputing边缘节点
     */
    public void setIDCType(String IDCType) {
        this.IDCType = IDCType;
    }

    public RegionDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RegionDetail(RegionDetail source) {
        if (source.RegionId != null) {
            this.RegionId = new String(source.RegionId);
        }
        if (source.RegionName != null) {
            this.RegionName = new String(source.RegionName);
        }
        if (source.RegionArea != null) {
            this.RegionArea = new String(source.RegionArea);
        }
        if (source.RegionAreaName != null) {
            this.RegionAreaName = new String(source.RegionAreaName);
        }
        if (source.IDCType != null) {
            this.IDCType = new String(source.IDCType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);
        this.setParamSimple(map, prefix + "RegionArea", this.RegionArea);
        this.setParamSimple(map, prefix + "RegionAreaName", this.RegionAreaName);
        this.setParamSimple(map, prefix + "IDCType", this.IDCType);

    }
}


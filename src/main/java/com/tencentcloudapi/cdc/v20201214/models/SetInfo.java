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
package com.tencentcloudapi.cdc.v20201214.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SetInfo extends AbstractModel {

    /**
    * 云硬盘仓库id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SetId")
    @Expose
    private String SetId;

    /**
    * 云硬盘仓库名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SetName")
    @Expose
    private String SetName;

    /**
    * 云硬盘仓库类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SetType")
    @Expose
    private String SetType;

    /**
    * 云硬盘仓库容量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SetSize")
    @Expose
    private Float SetSize;

    /**
    * 云硬盘仓库状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SetStatus")
    @Expose
    private String SetStatus;

    /**
    * 云硬盘仓库创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 读流量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReadTraffic")
    @Expose
    private DetailData ReadTraffic;

    /**
    * 写流量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WriteTraffic")
    @Expose
    private DetailData WriteTraffic;

    /**
    * 读IO
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReadIO")
    @Expose
    private DetailData ReadIO;

    /**
    * 写IO
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WriteIO")
    @Expose
    private DetailData WriteIO;

    /**
    * 平均等待时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Await")
    @Expose
    private DetailData Await;

    /**
    * 利用率
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Util")
    @Expose
    private DetailData Util;

    /**
     * Get 云硬盘仓库id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SetId 云硬盘仓库id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSetId() {
        return this.SetId;
    }

    /**
     * Set 云硬盘仓库id
注意：此字段可能返回 null，表示取不到有效值。
     * @param SetId 云硬盘仓库id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSetId(String SetId) {
        this.SetId = SetId;
    }

    /**
     * Get 云硬盘仓库名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SetName 云硬盘仓库名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSetName() {
        return this.SetName;
    }

    /**
     * Set 云硬盘仓库名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param SetName 云硬盘仓库名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSetName(String SetName) {
        this.SetName = SetName;
    }

    /**
     * Get 云硬盘仓库类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SetType 云硬盘仓库类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSetType() {
        return this.SetType;
    }

    /**
     * Set 云硬盘仓库类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param SetType 云硬盘仓库类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSetType(String SetType) {
        this.SetType = SetType;
    }

    /**
     * Get 云硬盘仓库容量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SetSize 云硬盘仓库容量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getSetSize() {
        return this.SetSize;
    }

    /**
     * Set 云硬盘仓库容量
注意：此字段可能返回 null，表示取不到有效值。
     * @param SetSize 云硬盘仓库容量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSetSize(Float SetSize) {
        this.SetSize = SetSize;
    }

    /**
     * Get 云硬盘仓库状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SetStatus 云硬盘仓库状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSetStatus() {
        return this.SetStatus;
    }

    /**
     * Set 云硬盘仓库状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param SetStatus 云硬盘仓库状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSetStatus(String SetStatus) {
        this.SetStatus = SetStatus;
    }

    /**
     * Get 云硬盘仓库创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 云硬盘仓库创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 云硬盘仓库创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 云硬盘仓库创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 读流量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReadTraffic 读流量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DetailData getReadTraffic() {
        return this.ReadTraffic;
    }

    /**
     * Set 读流量
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReadTraffic 读流量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReadTraffic(DetailData ReadTraffic) {
        this.ReadTraffic = ReadTraffic;
    }

    /**
     * Get 写流量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WriteTraffic 写流量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DetailData getWriteTraffic() {
        return this.WriteTraffic;
    }

    /**
     * Set 写流量
注意：此字段可能返回 null，表示取不到有效值。
     * @param WriteTraffic 写流量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWriteTraffic(DetailData WriteTraffic) {
        this.WriteTraffic = WriteTraffic;
    }

    /**
     * Get 读IO
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReadIO 读IO
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DetailData getReadIO() {
        return this.ReadIO;
    }

    /**
     * Set 读IO
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReadIO 读IO
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReadIO(DetailData ReadIO) {
        this.ReadIO = ReadIO;
    }

    /**
     * Get 写IO
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WriteIO 写IO
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DetailData getWriteIO() {
        return this.WriteIO;
    }

    /**
     * Set 写IO
注意：此字段可能返回 null，表示取不到有效值。
     * @param WriteIO 写IO
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWriteIO(DetailData WriteIO) {
        this.WriteIO = WriteIO;
    }

    /**
     * Get 平均等待时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Await 平均等待时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DetailData getAwait() {
        return this.Await;
    }

    /**
     * Set 平均等待时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param Await 平均等待时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAwait(DetailData Await) {
        this.Await = Await;
    }

    /**
     * Get 利用率
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Util 利用率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DetailData getUtil() {
        return this.Util;
    }

    /**
     * Set 利用率
注意：此字段可能返回 null，表示取不到有效值。
     * @param Util 利用率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUtil(DetailData Util) {
        this.Util = Util;
    }

    public SetInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SetInfo(SetInfo source) {
        if (source.SetId != null) {
            this.SetId = new String(source.SetId);
        }
        if (source.SetName != null) {
            this.SetName = new String(source.SetName);
        }
        if (source.SetType != null) {
            this.SetType = new String(source.SetType);
        }
        if (source.SetSize != null) {
            this.SetSize = new Float(source.SetSize);
        }
        if (source.SetStatus != null) {
            this.SetStatus = new String(source.SetStatus);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ReadTraffic != null) {
            this.ReadTraffic = new DetailData(source.ReadTraffic);
        }
        if (source.WriteTraffic != null) {
            this.WriteTraffic = new DetailData(source.WriteTraffic);
        }
        if (source.ReadIO != null) {
            this.ReadIO = new DetailData(source.ReadIO);
        }
        if (source.WriteIO != null) {
            this.WriteIO = new DetailData(source.WriteIO);
        }
        if (source.Await != null) {
            this.Await = new DetailData(source.Await);
        }
        if (source.Util != null) {
            this.Util = new DetailData(source.Util);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SetId", this.SetId);
        this.setParamSimple(map, prefix + "SetName", this.SetName);
        this.setParamSimple(map, prefix + "SetType", this.SetType);
        this.setParamSimple(map, prefix + "SetSize", this.SetSize);
        this.setParamSimple(map, prefix + "SetStatus", this.SetStatus);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamObj(map, prefix + "ReadTraffic.", this.ReadTraffic);
        this.setParamObj(map, prefix + "WriteTraffic.", this.WriteTraffic);
        this.setParamObj(map, prefix + "ReadIO.", this.ReadIO);
        this.setParamObj(map, prefix + "WriteIO.", this.WriteIO);
        this.setParamObj(map, prefix + "Await.", this.Await);
        this.setParamObj(map, prefix + "Util.", this.Util);

    }
}


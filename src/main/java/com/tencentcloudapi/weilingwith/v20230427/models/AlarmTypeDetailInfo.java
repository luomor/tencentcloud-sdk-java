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
package com.tencentcloudapi.weilingwith.v20230427.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AlarmTypeDetailInfo extends AbstractModel {

    /**
    * 告警类型id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 父节点id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParentId")
    @Expose
    private Long ParentId;

    /**
    * 0-标准告警类型，1-自定义告警类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 告警名称类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 告警类型英文名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnglishName")
    @Expose
    private String EnglishName;

    /**
     * Get 告警类型id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id 告警类型id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 告警类型id
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id 告警类型id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 父节点id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParentId 父节点id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getParentId() {
        return this.ParentId;
    }

    /**
     * Set 父节点id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParentId 父节点id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParentId(Long ParentId) {
        this.ParentId = ParentId;
    }

    /**
     * Get 0-标准告警类型，1-自定义告警类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 0-标准告警类型，1-自定义告警类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 0-标准告警类型，1-自定义告警类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 0-标准告警类型，1-自定义告警类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 告警名称类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 告警名称类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 告警名称类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 告警名称类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 告警类型英文名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnglishName 告警类型英文名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEnglishName() {
        return this.EnglishName;
    }

    /**
     * Set 告警类型英文名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnglishName 告警类型英文名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnglishName(String EnglishName) {
        this.EnglishName = EnglishName;
    }

    public AlarmTypeDetailInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlarmTypeDetailInfo(AlarmTypeDetailInfo source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.ParentId != null) {
            this.ParentId = new Long(source.ParentId);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.EnglishName != null) {
            this.EnglishName = new String(source.EnglishName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "ParentId", this.ParentId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "EnglishName", this.EnglishName);

    }
}


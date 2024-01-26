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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubCloneObjectDTO extends AbstractModel {

    /**
    * OBJECT_SUB_TASK，CONDITION_SUB_FUNCTION，CONDITION_SUB_EVENT，CONDITION_SUB_PARAMETER，CONDITION_SUB_WORKFLOW
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 子对象Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 子对象值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * 子对象扩展信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExtInfo")
    @Expose
    private String [] ExtInfo;

    /**
     * Get OBJECT_SUB_TASK，CONDITION_SUB_FUNCTION，CONDITION_SUB_EVENT，CONDITION_SUB_PARAMETER，CONDITION_SUB_WORKFLOW
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type OBJECT_SUB_TASK，CONDITION_SUB_FUNCTION，CONDITION_SUB_EVENT，CONDITION_SUB_PARAMETER，CONDITION_SUB_WORKFLOW
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set OBJECT_SUB_TASK，CONDITION_SUB_FUNCTION，CONDITION_SUB_EVENT，CONDITION_SUB_PARAMETER，CONDITION_SUB_WORKFLOW
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type OBJECT_SUB_TASK，CONDITION_SUB_FUNCTION，CONDITION_SUB_EVENT，CONDITION_SUB_PARAMETER，CONDITION_SUB_WORKFLOW
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 子对象Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Key 子对象Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 子对象Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param Key 子对象Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 子对象值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Value 子对象值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 子对象值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Value 子对象值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get 子对象扩展信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExtInfo 子对象扩展信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getExtInfo() {
        return this.ExtInfo;
    }

    /**
     * Set 子对象扩展信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExtInfo 子对象扩展信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtInfo(String [] ExtInfo) {
        this.ExtInfo = ExtInfo;
    }

    public SubCloneObjectDTO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubCloneObjectDTO(SubCloneObjectDTO source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.ExtInfo != null) {
            this.ExtInfo = new String[source.ExtInfo.length];
            for (int i = 0; i < source.ExtInfo.length; i++) {
                this.ExtInfo[i] = new String(source.ExtInfo[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamArraySimple(map, prefix + "ExtInfo.", this.ExtInfo);

    }
}


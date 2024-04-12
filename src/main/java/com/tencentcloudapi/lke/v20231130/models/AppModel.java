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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AppModel extends AbstractModel {

    /**
    * 模型名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 模型描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * 上下文指代轮次
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContextLimit")
    @Expose
    private Long ContextLimit;

    /**
    * 模型别名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AliasName")
    @Expose
    private String AliasName;

    /**
     * Get 模型名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 模型名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 模型名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 模型名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 模型描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Desc 模型描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set 模型描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Desc 模型描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get 上下文指代轮次
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContextLimit 上下文指代轮次
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getContextLimit() {
        return this.ContextLimit;
    }

    /**
     * Set 上下文指代轮次
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContextLimit 上下文指代轮次
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContextLimit(Long ContextLimit) {
        this.ContextLimit = ContextLimit;
    }

    /**
     * Get 模型别名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AliasName 模型别名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAliasName() {
        return this.AliasName;
    }

    /**
     * Set 模型别名
注意：此字段可能返回 null，表示取不到有效值。
     * @param AliasName 模型别名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAliasName(String AliasName) {
        this.AliasName = AliasName;
    }

    public AppModel() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AppModel(AppModel source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.ContextLimit != null) {
            this.ContextLimit = new Long(source.ContextLimit);
        }
        if (source.AliasName != null) {
            this.AliasName = new String(source.AliasName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "ContextLimit", this.ContextLimit);
        this.setParamSimple(map, prefix + "AliasName", this.AliasName);

    }
}


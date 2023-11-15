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

public class BuildingModel extends AbstractModel {

    /**
    * 构件ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ElementId")
    @Expose
    private String ElementId;

    /**
    * 构件名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ElementName")
    @Expose
    private String ElementName;

    /**
    * 模型类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelType")
    @Expose
    private String ModelType;

    /**
    * 模型URL
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelUrl")
    @Expose
    private String ModelUrl;

    /**
     * Get 构件ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ElementId 构件ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getElementId() {
        return this.ElementId;
    }

    /**
     * Set 构件ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ElementId 构件ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setElementId(String ElementId) {
        this.ElementId = ElementId;
    }

    /**
     * Get 构件名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ElementName 构件名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getElementName() {
        return this.ElementName;
    }

    /**
     * Set 构件名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ElementName 构件名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setElementName(String ElementName) {
        this.ElementName = ElementName;
    }

    /**
     * Get 模型类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelType 模型类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModelType() {
        return this.ModelType;
    }

    /**
     * Set 模型类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelType 模型类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModelType(String ModelType) {
        this.ModelType = ModelType;
    }

    /**
     * Get 模型URL
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelUrl 模型URL
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModelUrl() {
        return this.ModelUrl;
    }

    /**
     * Set 模型URL
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelUrl 模型URL
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModelUrl(String ModelUrl) {
        this.ModelUrl = ModelUrl;
    }

    public BuildingModel() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BuildingModel(BuildingModel source) {
        if (source.ElementId != null) {
            this.ElementId = new String(source.ElementId);
        }
        if (source.ElementName != null) {
            this.ElementName = new String(source.ElementName);
        }
        if (source.ModelType != null) {
            this.ModelType = new String(source.ModelType);
        }
        if (source.ModelUrl != null) {
            this.ModelUrl = new String(source.ModelUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ElementId", this.ElementId);
        this.setParamSimple(map, prefix + "ElementName", this.ElementName);
        this.setParamSimple(map, prefix + "ModelType", this.ModelType);
        this.setParamSimple(map, prefix + "ModelUrl", this.ModelUrl);

    }
}


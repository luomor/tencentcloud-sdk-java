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

public class ElementProfile extends AbstractModel {

    /**
    * 建筑id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BuildingId")
    @Expose
    private String BuildingId;

    /**
    * 构件id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ElementId")
    @Expose
    private String ElementId;

    /**
    * 构件类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EntityType")
    @Expose
    private String EntityType;

    /**
    * 构件名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ElementName")
    @Expose
    private String ElementName;

    /**
    * 构件空间级别
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * 底部标高（单位mm）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BottomHeight")
    @Expose
    private Long BottomHeight;

    /**
    * 排序
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Sort")
    @Expose
    private Long Sort;

    /**
    * 空间编码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SpaceCode")
    @Expose
    private String SpaceCode;

    /**
    * 空间分类编码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SpaceTypeCode")
    @Expose
    private String SpaceTypeCode;

    /**
    * 空间分类名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SpaceTypeName")
    @Expose
    private String SpaceTypeName;

    /**
    * 父级构件id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParentElementId")
    @Expose
    private String ParentElementId;

    /**
    * 空间层级类型编码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SpacePoiId")
    @Expose
    private String SpacePoiId;

    /**
    * 构件描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ElementDesc")
    @Expose
    private String ElementDesc;

    /**
    * 删除标记
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsDelete")
    @Expose
    private Long IsDelete;

    /**
     * Get 建筑id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BuildingId 建筑id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBuildingId() {
        return this.BuildingId;
    }

    /**
     * Set 建筑id
注意：此字段可能返回 null，表示取不到有效值。
     * @param BuildingId 建筑id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBuildingId(String BuildingId) {
        this.BuildingId = BuildingId;
    }

    /**
     * Get 构件id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ElementId 构件id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getElementId() {
        return this.ElementId;
    }

    /**
     * Set 构件id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ElementId 构件id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setElementId(String ElementId) {
        this.ElementId = ElementId;
    }

    /**
     * Get 构件类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EntityType 构件类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEntityType() {
        return this.EntityType;
    }

    /**
     * Set 构件类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param EntityType 构件类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEntityType(String EntityType) {
        this.EntityType = EntityType;
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
     * Get 构件空间级别
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Level 构件空间级别
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set 构件空间级别
注意：此字段可能返回 null，表示取不到有效值。
     * @param Level 构件空间级别
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get 底部标高（单位mm）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BottomHeight 底部标高（单位mm）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBottomHeight() {
        return this.BottomHeight;
    }

    /**
     * Set 底部标高（单位mm）
注意：此字段可能返回 null，表示取不到有效值。
     * @param BottomHeight 底部标高（单位mm）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBottomHeight(Long BottomHeight) {
        this.BottomHeight = BottomHeight;
    }

    /**
     * Get 排序
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Sort 排序
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSort() {
        return this.Sort;
    }

    /**
     * Set 排序
注意：此字段可能返回 null，表示取不到有效值。
     * @param Sort 排序
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSort(Long Sort) {
        this.Sort = Sort;
    }

    /**
     * Get 空间编码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SpaceCode 空间编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSpaceCode() {
        return this.SpaceCode;
    }

    /**
     * Set 空间编码
注意：此字段可能返回 null，表示取不到有效值。
     * @param SpaceCode 空间编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSpaceCode(String SpaceCode) {
        this.SpaceCode = SpaceCode;
    }

    /**
     * Get 空间分类编码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SpaceTypeCode 空间分类编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSpaceTypeCode() {
        return this.SpaceTypeCode;
    }

    /**
     * Set 空间分类编码
注意：此字段可能返回 null，表示取不到有效值。
     * @param SpaceTypeCode 空间分类编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSpaceTypeCode(String SpaceTypeCode) {
        this.SpaceTypeCode = SpaceTypeCode;
    }

    /**
     * Get 空间分类名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SpaceTypeName 空间分类名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSpaceTypeName() {
        return this.SpaceTypeName;
    }

    /**
     * Set 空间分类名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param SpaceTypeName 空间分类名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSpaceTypeName(String SpaceTypeName) {
        this.SpaceTypeName = SpaceTypeName;
    }

    /**
     * Get 父级构件id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParentElementId 父级构件id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParentElementId() {
        return this.ParentElementId;
    }

    /**
     * Set 父级构件id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParentElementId 父级构件id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParentElementId(String ParentElementId) {
        this.ParentElementId = ParentElementId;
    }

    /**
     * Get 空间层级类型编码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SpacePoiId 空间层级类型编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSpacePoiId() {
        return this.SpacePoiId;
    }

    /**
     * Set 空间层级类型编码
注意：此字段可能返回 null，表示取不到有效值。
     * @param SpacePoiId 空间层级类型编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSpacePoiId(String SpacePoiId) {
        this.SpacePoiId = SpacePoiId;
    }

    /**
     * Get 构件描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ElementDesc 构件描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getElementDesc() {
        return this.ElementDesc;
    }

    /**
     * Set 构件描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param ElementDesc 构件描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setElementDesc(String ElementDesc) {
        this.ElementDesc = ElementDesc;
    }

    /**
     * Get 删除标记
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsDelete 删除标记
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsDelete() {
        return this.IsDelete;
    }

    /**
     * Set 删除标记
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsDelete 删除标记
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsDelete(Long IsDelete) {
        this.IsDelete = IsDelete;
    }

    public ElementProfile() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ElementProfile(ElementProfile source) {
        if (source.BuildingId != null) {
            this.BuildingId = new String(source.BuildingId);
        }
        if (source.ElementId != null) {
            this.ElementId = new String(source.ElementId);
        }
        if (source.EntityType != null) {
            this.EntityType = new String(source.EntityType);
        }
        if (source.ElementName != null) {
            this.ElementName = new String(source.ElementName);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.BottomHeight != null) {
            this.BottomHeight = new Long(source.BottomHeight);
        }
        if (source.Sort != null) {
            this.Sort = new Long(source.Sort);
        }
        if (source.SpaceCode != null) {
            this.SpaceCode = new String(source.SpaceCode);
        }
        if (source.SpaceTypeCode != null) {
            this.SpaceTypeCode = new String(source.SpaceTypeCode);
        }
        if (source.SpaceTypeName != null) {
            this.SpaceTypeName = new String(source.SpaceTypeName);
        }
        if (source.ParentElementId != null) {
            this.ParentElementId = new String(source.ParentElementId);
        }
        if (source.SpacePoiId != null) {
            this.SpacePoiId = new String(source.SpacePoiId);
        }
        if (source.ElementDesc != null) {
            this.ElementDesc = new String(source.ElementDesc);
        }
        if (source.IsDelete != null) {
            this.IsDelete = new Long(source.IsDelete);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BuildingId", this.BuildingId);
        this.setParamSimple(map, prefix + "ElementId", this.ElementId);
        this.setParamSimple(map, prefix + "EntityType", this.EntityType);
        this.setParamSimple(map, prefix + "ElementName", this.ElementName);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "BottomHeight", this.BottomHeight);
        this.setParamSimple(map, prefix + "Sort", this.Sort);
        this.setParamSimple(map, prefix + "SpaceCode", this.SpaceCode);
        this.setParamSimple(map, prefix + "SpaceTypeCode", this.SpaceTypeCode);
        this.setParamSimple(map, prefix + "SpaceTypeName", this.SpaceTypeName);
        this.setParamSimple(map, prefix + "ParentElementId", this.ParentElementId);
        this.setParamSimple(map, prefix + "SpacePoiId", this.SpacePoiId);
        this.setParamSimple(map, prefix + "ElementDesc", this.ElementDesc);
        this.setParamSimple(map, prefix + "IsDelete", this.IsDelete);

    }
}


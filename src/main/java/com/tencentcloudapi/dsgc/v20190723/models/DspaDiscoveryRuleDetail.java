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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DspaDiscoveryRuleDetail extends AbstractModel {

    /**
    * 规则ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * 规则名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 规则描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 规则来源，取值：0 内置, 1 自定义
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Source")
    @Expose
    private Long Source;

    /**
    * RDB规则详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RDBRules")
    @Expose
    private DspaDiscoveryRDBRules RDBRules;

    /**
    * COS规则详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("COSRules")
    @Expose
    private DspaDiscoveryCOSRules COSRules;

    /**
     * Get 规则ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleId 规则ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleId 规则ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 规则名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 规则名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 规则名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 规则名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 规则描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 规则描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 规则描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 规则描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 规则来源，取值：0 内置, 1 自定义
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Source 规则来源，取值：0 内置, 1 自定义
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSource() {
        return this.Source;
    }

    /**
     * Set 规则来源，取值：0 内置, 1 自定义
注意：此字段可能返回 null，表示取不到有效值。
     * @param Source 规则来源，取值：0 内置, 1 自定义
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSource(Long Source) {
        this.Source = Source;
    }

    /**
     * Get RDB规则详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RDBRules RDB规则详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DspaDiscoveryRDBRules getRDBRules() {
        return this.RDBRules;
    }

    /**
     * Set RDB规则详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param RDBRules RDB规则详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRDBRules(DspaDiscoveryRDBRules RDBRules) {
        this.RDBRules = RDBRules;
    }

    /**
     * Get COS规则详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return COSRules COS规则详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DspaDiscoveryCOSRules getCOSRules() {
        return this.COSRules;
    }

    /**
     * Set COS规则详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param COSRules COS规则详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCOSRules(DspaDiscoveryCOSRules COSRules) {
        this.COSRules = COSRules;
    }

    public DspaDiscoveryRuleDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspaDiscoveryRuleDetail(DspaDiscoveryRuleDetail source) {
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Source != null) {
            this.Source = new Long(source.Source);
        }
        if (source.RDBRules != null) {
            this.RDBRules = new DspaDiscoveryRDBRules(source.RDBRules);
        }
        if (source.COSRules != null) {
            this.COSRules = new DspaDiscoveryCOSRules(source.COSRules);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamObj(map, prefix + "RDBRules.", this.RDBRules);
        this.setParamObj(map, prefix + "COSRules.", this.COSRules);

    }
}


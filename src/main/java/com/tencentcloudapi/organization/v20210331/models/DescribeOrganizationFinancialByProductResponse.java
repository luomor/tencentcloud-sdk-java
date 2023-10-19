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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeOrganizationFinancialByProductResponse extends AbstractModel {

    /**
    * 当月总消耗。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalCost")
    @Expose
    private Float TotalCost;

    /**
    * 产品消耗详情。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Items")
    @Expose
    private OrgProductFinancial [] Items;

    /**
    * 总数目。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 当月总消耗。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalCost 当月总消耗。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getTotalCost() {
        return this.TotalCost;
    }

    /**
     * Set 当月总消耗。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalCost 当月总消耗。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalCost(Float TotalCost) {
        this.TotalCost = TotalCost;
    }

    /**
     * Get 产品消耗详情。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Items 产品消耗详情。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OrgProductFinancial [] getItems() {
        return this.Items;
    }

    /**
     * Set 产品消耗详情。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Items 产品消耗详情。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setItems(OrgProductFinancial [] Items) {
        this.Items = Items;
    }

    /**
     * Get 总数目。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Total 总数目。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 总数目。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Total 总数目。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeOrganizationFinancialByProductResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOrganizationFinancialByProductResponse(DescribeOrganizationFinancialByProductResponse source) {
        if (source.TotalCost != null) {
            this.TotalCost = new Float(source.TotalCost);
        }
        if (source.Items != null) {
            this.Items = new OrgProductFinancial[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new OrgProductFinancial(source.Items[i]);
            }
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCost", this.TotalCost);
        this.setParamArrayObj(map, prefix + "Items.", this.Items);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


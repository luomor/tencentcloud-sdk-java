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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScanComplianceAssetsByPolicyItemRequest extends AbstractModel {

    /**
    * 指定的检测项的ID
    */
    @SerializedName("CustomerPolicyItemId")
    @Expose
    private Long CustomerPolicyItemId;

    /**
    * 要重新扫描的客户资产项ID的列表。
    */
    @SerializedName("CustomerAssetIdSet")
    @Expose
    private Long [] CustomerAssetIdSet;

    /**
     * Get 指定的检测项的ID 
     * @return CustomerPolicyItemId 指定的检测项的ID
     */
    public Long getCustomerPolicyItemId() {
        return this.CustomerPolicyItemId;
    }

    /**
     * Set 指定的检测项的ID
     * @param CustomerPolicyItemId 指定的检测项的ID
     */
    public void setCustomerPolicyItemId(Long CustomerPolicyItemId) {
        this.CustomerPolicyItemId = CustomerPolicyItemId;
    }

    /**
     * Get 要重新扫描的客户资产项ID的列表。 
     * @return CustomerAssetIdSet 要重新扫描的客户资产项ID的列表。
     */
    public Long [] getCustomerAssetIdSet() {
        return this.CustomerAssetIdSet;
    }

    /**
     * Set 要重新扫描的客户资产项ID的列表。
     * @param CustomerAssetIdSet 要重新扫描的客户资产项ID的列表。
     */
    public void setCustomerAssetIdSet(Long [] CustomerAssetIdSet) {
        this.CustomerAssetIdSet = CustomerAssetIdSet;
    }

    public ScanComplianceAssetsByPolicyItemRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScanComplianceAssetsByPolicyItemRequest(ScanComplianceAssetsByPolicyItemRequest source) {
        if (source.CustomerPolicyItemId != null) {
            this.CustomerPolicyItemId = new Long(source.CustomerPolicyItemId);
        }
        if (source.CustomerAssetIdSet != null) {
            this.CustomerAssetIdSet = new Long[source.CustomerAssetIdSet.length];
            for (int i = 0; i < source.CustomerAssetIdSet.length; i++) {
                this.CustomerAssetIdSet[i] = new Long(source.CustomerAssetIdSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CustomerPolicyItemId", this.CustomerPolicyItemId);
        this.setParamArraySimple(map, prefix + "CustomerAssetIdSet.", this.CustomerAssetIdSet);

    }
}


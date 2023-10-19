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

public class DescribeOrganizationFinancialByMonthRequest extends AbstractModel {

    /**
    * 查询月数。取值范围：1~6，默认值：6
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 查询结束月份。格式：yyyy-mm，例如：2021-01
    */
    @SerializedName("EndMonth")
    @Expose
    private String EndMonth;

    /**
    * 查询成员列表。 最大100个
    */
    @SerializedName("MemberUins")
    @Expose
    private Long [] MemberUins;

    /**
    * 查询产品列表。 最大100个
    */
    @SerializedName("ProductCodes")
    @Expose
    private String [] ProductCodes;

    /**
     * Get 查询月数。取值范围：1~6，默认值：6 
     * @return Limit 查询月数。取值范围：1~6，默认值：6
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 查询月数。取值范围：1~6，默认值：6
     * @param Limit 查询月数。取值范围：1~6，默认值：6
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 查询结束月份。格式：yyyy-mm，例如：2021-01 
     * @return EndMonth 查询结束月份。格式：yyyy-mm，例如：2021-01
     */
    public String getEndMonth() {
        return this.EndMonth;
    }

    /**
     * Set 查询结束月份。格式：yyyy-mm，例如：2021-01
     * @param EndMonth 查询结束月份。格式：yyyy-mm，例如：2021-01
     */
    public void setEndMonth(String EndMonth) {
        this.EndMonth = EndMonth;
    }

    /**
     * Get 查询成员列表。 最大100个 
     * @return MemberUins 查询成员列表。 最大100个
     */
    public Long [] getMemberUins() {
        return this.MemberUins;
    }

    /**
     * Set 查询成员列表。 最大100个
     * @param MemberUins 查询成员列表。 最大100个
     */
    public void setMemberUins(Long [] MemberUins) {
        this.MemberUins = MemberUins;
    }

    /**
     * Get 查询产品列表。 最大100个 
     * @return ProductCodes 查询产品列表。 最大100个
     */
    public String [] getProductCodes() {
        return this.ProductCodes;
    }

    /**
     * Set 查询产品列表。 最大100个
     * @param ProductCodes 查询产品列表。 最大100个
     */
    public void setProductCodes(String [] ProductCodes) {
        this.ProductCodes = ProductCodes;
    }

    public DescribeOrganizationFinancialByMonthRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOrganizationFinancialByMonthRequest(DescribeOrganizationFinancialByMonthRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.EndMonth != null) {
            this.EndMonth = new String(source.EndMonth);
        }
        if (source.MemberUins != null) {
            this.MemberUins = new Long[source.MemberUins.length];
            for (int i = 0; i < source.MemberUins.length; i++) {
                this.MemberUins[i] = new Long(source.MemberUins[i]);
            }
        }
        if (source.ProductCodes != null) {
            this.ProductCodes = new String[source.ProductCodes.length];
            for (int i = 0; i < source.ProductCodes.length; i++) {
                this.ProductCodes[i] = new String(source.ProductCodes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "EndMonth", this.EndMonth);
        this.setParamArraySimple(map, prefix + "MemberUins.", this.MemberUins);
        this.setParamArraySimple(map, prefix + "ProductCodes.", this.ProductCodes);

    }
}


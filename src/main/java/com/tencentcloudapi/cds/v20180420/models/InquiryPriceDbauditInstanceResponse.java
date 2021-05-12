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
package com.tencentcloudapi.cds.v20180420.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InquiryPriceDbauditInstanceResponse extends AbstractModel{

    /**
    * 总价，单位：元
    */
    @SerializedName("TotalPrice")
    @Expose
    private Float TotalPrice;

    /**
    * 真实价钱，预支费用的折扣价，单位：元
    */
    @SerializedName("RealTotalCost")
    @Expose
    private Float RealTotalCost;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 总价，单位：元 
     * @return TotalPrice 总价，单位：元
     */
    public Float getTotalPrice() {
        return this.TotalPrice;
    }

    /**
     * Set 总价，单位：元
     * @param TotalPrice 总价，单位：元
     */
    public void setTotalPrice(Float TotalPrice) {
        this.TotalPrice = TotalPrice;
    }

    /**
     * Get 真实价钱，预支费用的折扣价，单位：元 
     * @return RealTotalCost 真实价钱，预支费用的折扣价，单位：元
     */
    public Float getRealTotalCost() {
        return this.RealTotalCost;
    }

    /**
     * Set 真实价钱，预支费用的折扣价，单位：元
     * @param RealTotalCost 真实价钱，预支费用的折扣价，单位：元
     */
    public void setRealTotalCost(Float RealTotalCost) {
        this.RealTotalCost = RealTotalCost;
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

    public InquiryPriceDbauditInstanceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InquiryPriceDbauditInstanceResponse(InquiryPriceDbauditInstanceResponse source) {
        if (source.TotalPrice != null) {
            this.TotalPrice = new Float(source.TotalPrice);
        }
        if (source.RealTotalCost != null) {
            this.RealTotalCost = new Float(source.RealTotalCost);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalPrice", this.TotalPrice);
        this.setParamSimple(map, prefix + "RealTotalCost", this.RealTotalCost);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


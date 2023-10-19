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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCostSummaryByProductResponse extends AbstractModel {

    /**
    * 数据是否准备好，0未准备好，1准备好
    */
    @SerializedName("Ready")
    @Expose
    private Long Ready;

    /**
    * 消耗详情
    */
    @SerializedName("Total")
    @Expose
    private ConsumptionSummaryTotal Total;

    /**
    * 消耗按产品汇总详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Data")
    @Expose
    private ConsumptionBusinessSummaryDataItem [] Data;

    /**
    * 记录数量，NeedRecordNum为0是返回null
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RecordNum")
    @Expose
    private Long RecordNum;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 数据是否准备好，0未准备好，1准备好 
     * @return Ready 数据是否准备好，0未准备好，1准备好
     */
    public Long getReady() {
        return this.Ready;
    }

    /**
     * Set 数据是否准备好，0未准备好，1准备好
     * @param Ready 数据是否准备好，0未准备好，1准备好
     */
    public void setReady(Long Ready) {
        this.Ready = Ready;
    }

    /**
     * Get 消耗详情 
     * @return Total 消耗详情
     */
    public ConsumptionSummaryTotal getTotal() {
        return this.Total;
    }

    /**
     * Set 消耗详情
     * @param Total 消耗详情
     */
    public void setTotal(ConsumptionSummaryTotal Total) {
        this.Total = Total;
    }

    /**
     * Get 消耗按产品汇总详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Data 消耗按产品汇总详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ConsumptionBusinessSummaryDataItem [] getData() {
        return this.Data;
    }

    /**
     * Set 消耗按产品汇总详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param Data 消耗按产品汇总详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setData(ConsumptionBusinessSummaryDataItem [] Data) {
        this.Data = Data;
    }

    /**
     * Get 记录数量，NeedRecordNum为0是返回null
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RecordNum 记录数量，NeedRecordNum为0是返回null
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRecordNum() {
        return this.RecordNum;
    }

    /**
     * Set 记录数量，NeedRecordNum为0是返回null
注意：此字段可能返回 null，表示取不到有效值。
     * @param RecordNum 记录数量，NeedRecordNum为0是返回null
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRecordNum(Long RecordNum) {
        this.RecordNum = RecordNum;
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

    public DescribeCostSummaryByProductResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCostSummaryByProductResponse(DescribeCostSummaryByProductResponse source) {
        if (source.Ready != null) {
            this.Ready = new Long(source.Ready);
        }
        if (source.Total != null) {
            this.Total = new ConsumptionSummaryTotal(source.Total);
        }
        if (source.Data != null) {
            this.Data = new ConsumptionBusinessSummaryDataItem[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new ConsumptionBusinessSummaryDataItem(source.Data[i]);
            }
        }
        if (source.RecordNum != null) {
            this.RecordNum = new Long(source.RecordNum);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Ready", this.Ready);
        this.setParamObj(map, prefix + "Total.", this.Total);
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "RecordNum", this.RecordNum);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


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
package com.tencentcloudapi.dcdb.v20180411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDCDBShardsResponse extends AbstractModel {

    /**
    * 符合条件的分片数量
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 分片信息列表
    */
    @SerializedName("Shards")
    @Expose
    private DCDBShardInfo [] Shards;

    /**
    * 灾备标志，0-无，1-主实例，2-灾备实例
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DcnFlag")
    @Expose
    private Long DcnFlag;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 符合条件的分片数量 
     * @return TotalCount 符合条件的分片数量
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 符合条件的分片数量
     * @param TotalCount 符合条件的分片数量
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 分片信息列表 
     * @return Shards 分片信息列表
     */
    public DCDBShardInfo [] getShards() {
        return this.Shards;
    }

    /**
     * Set 分片信息列表
     * @param Shards 分片信息列表
     */
    public void setShards(DCDBShardInfo [] Shards) {
        this.Shards = Shards;
    }

    /**
     * Get 灾备标志，0-无，1-主实例，2-灾备实例
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DcnFlag 灾备标志，0-无，1-主实例，2-灾备实例
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDcnFlag() {
        return this.DcnFlag;
    }

    /**
     * Set 灾备标志，0-无，1-主实例，2-灾备实例
注意：此字段可能返回 null，表示取不到有效值。
     * @param DcnFlag 灾备标志，0-无，1-主实例，2-灾备实例
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDcnFlag(Long DcnFlag) {
        this.DcnFlag = DcnFlag;
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

    public DescribeDCDBShardsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDCDBShardsResponse(DescribeDCDBShardsResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.Shards != null) {
            this.Shards = new DCDBShardInfo[source.Shards.length];
            for (int i = 0; i < source.Shards.length; i++) {
                this.Shards[i] = new DCDBShardInfo(source.Shards[i]);
            }
        }
        if (source.DcnFlag != null) {
            this.DcnFlag = new Long(source.DcnFlag);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "Shards.", this.Shards);
        this.setParamSimple(map, prefix + "DcnFlag", this.DcnFlag);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


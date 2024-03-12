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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeNatFwInstancesInfoResponse extends AbstractModel {

    /**
    * 实例卡片信息数组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NatinsLst")
    @Expose
    private NatInstanceInfo [] NatinsLst;

    /**
    * nat 防火墙个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 实例卡片信息数组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NatinsLst 实例卡片信息数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NatInstanceInfo [] getNatinsLst() {
        return this.NatinsLst;
    }

    /**
     * Set 实例卡片信息数组
注意：此字段可能返回 null，表示取不到有效值。
     * @param NatinsLst 实例卡片信息数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNatinsLst(NatInstanceInfo [] NatinsLst) {
        this.NatinsLst = NatinsLst;
    }

    /**
     * Get nat 防火墙个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Total nat 防火墙个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set nat 防火墙个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Total nat 防火墙个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeNatFwInstancesInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNatFwInstancesInfoResponse(DescribeNatFwInstancesInfoResponse source) {
        if (source.NatinsLst != null) {
            this.NatinsLst = new NatInstanceInfo[source.NatinsLst.length];
            for (int i = 0; i < source.NatinsLst.length; i++) {
                this.NatinsLst[i] = new NatInstanceInfo(source.NatinsLst[i]);
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
        this.setParamArrayObj(map, prefix + "NatinsLst.", this.NatinsLst);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


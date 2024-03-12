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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProxyCustomConfResponse extends AbstractModel {

    /**
    * 代理配置数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 代理配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CustomConf")
    @Expose
    private CustomConfig CustomConf;

    /**
    * 权重限制
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WeightRule")
    @Expose
    private Rule WeightRule;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 代理配置数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Count 代理配置数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 代理配置数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Count 代理配置数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 代理配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CustomConf 代理配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CustomConfig getCustomConf() {
        return this.CustomConf;
    }

    /**
     * Set 代理配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param CustomConf 代理配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCustomConf(CustomConfig CustomConf) {
        this.CustomConf = CustomConf;
    }

    /**
     * Get 权重限制
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WeightRule 权重限制
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Rule getWeightRule() {
        return this.WeightRule;
    }

    /**
     * Set 权重限制
注意：此字段可能返回 null，表示取不到有效值。
     * @param WeightRule 权重限制
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWeightRule(Rule WeightRule) {
        this.WeightRule = WeightRule;
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

    public DescribeProxyCustomConfResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeProxyCustomConfResponse(DescribeProxyCustomConfResponse source) {
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.CustomConf != null) {
            this.CustomConf = new CustomConfig(source.CustomConf);
        }
        if (source.WeightRule != null) {
            this.WeightRule = new Rule(source.WeightRule);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamObj(map, prefix + "CustomConf.", this.CustomConf);
        this.setParamObj(map, prefix + "WeightRule.", this.WeightRule);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


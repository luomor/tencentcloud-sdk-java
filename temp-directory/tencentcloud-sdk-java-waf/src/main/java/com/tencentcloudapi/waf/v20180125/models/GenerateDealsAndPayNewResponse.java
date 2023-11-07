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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GenerateDealsAndPayNewResponse extends AbstractModel {

    /**
    * 计费下单响应结构体
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Data")
    @Expose
    private DealData Data;

    /**
    * 1:成功，0:失败
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 返回message
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReturnMessage")
    @Expose
    private String ReturnMessage;

    /**
    * 购买的实例ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 计费下单响应结构体
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Data 计费下单响应结构体
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DealData getData() {
        return this.Data;
    }

    /**
     * Set 计费下单响应结构体
注意：此字段可能返回 null，表示取不到有效值。
     * @param Data 计费下单响应结构体
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setData(DealData Data) {
        this.Data = Data;
    }

    /**
     * Get 1:成功，0:失败 
     * @return Status 1:成功，0:失败
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 1:成功，0:失败
     * @param Status 1:成功，0:失败
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 返回message
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReturnMessage 返回message
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReturnMessage() {
        return this.ReturnMessage;
    }

    /**
     * Set 返回message
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReturnMessage 返回message
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReturnMessage(String ReturnMessage) {
        this.ReturnMessage = ReturnMessage;
    }

    /**
     * Get 购买的实例ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId 购买的实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 购买的实例ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId 购买的实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
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

    public GenerateDealsAndPayNewResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GenerateDealsAndPayNewResponse(GenerateDealsAndPayNewResponse source) {
        if (source.Data != null) {
            this.Data = new DealData(source.Data);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ReturnMessage != null) {
            this.ReturnMessage = new String(source.ReturnMessage);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ReturnMessage", this.ReturnMessage);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


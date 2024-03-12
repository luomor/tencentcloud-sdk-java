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
package com.tencentcloudapi.acp.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeScanTaskListResponse extends AbstractModel {

    /**
    * 返回值, 0:成功, 其他值请查看“返回值”定义
    */
    @SerializedName("Result")
    @Expose
    private Long Result;

    /**
    * 任务总数量
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 诊断任务数据列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Data")
    @Expose
    private AppTaskData [] Data;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 返回值, 0:成功, 其他值请查看“返回值”定义 
     * @return Result 返回值, 0:成功, 其他值请查看“返回值”定义
     */
    public Long getResult() {
        return this.Result;
    }

    /**
     * Set 返回值, 0:成功, 其他值请查看“返回值”定义
     * @param Result 返回值, 0:成功, 其他值请查看“返回值”定义
     */
    public void setResult(Long Result) {
        this.Result = Result;
    }

    /**
     * Get 任务总数量 
     * @return Total 任务总数量
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 任务总数量
     * @param Total 任务总数量
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 诊断任务数据列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Data 诊断任务数据列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AppTaskData [] getData() {
        return this.Data;
    }

    /**
     * Set 诊断任务数据列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Data 诊断任务数据列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setData(AppTaskData [] Data) {
        this.Data = Data;
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

    public DescribeScanTaskListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeScanTaskListResponse(DescribeScanTaskListResponse source) {
        if (source.Result != null) {
            this.Result = new Long(source.Result);
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Data != null) {
            this.Data = new AppTaskData[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new AppTaskData(source.Data[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


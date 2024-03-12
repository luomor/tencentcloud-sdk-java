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
package com.tencentcloudapi.mmps.v20200710.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBasicDiagnosisResourceUsageInfoResponse extends AbstractModel {

    /**
    * 返回值, 0:成功, 其他值请查看“返回值”定义
    */
    @SerializedName("Ret")
    @Expose
    private Long Ret;

    /**
    * 资源类型
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
    * 资源总数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 资源未使用次数
    */
    @SerializedName("UnusedCount")
    @Expose
    private Long UnusedCount;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 返回值, 0:成功, 其他值请查看“返回值”定义 
     * @return Ret 返回值, 0:成功, 其他值请查看“返回值”定义
     */
    public Long getRet() {
        return this.Ret;
    }

    /**
     * Set 返回值, 0:成功, 其他值请查看“返回值”定义
     * @param Ret 返回值, 0:成功, 其他值请查看“返回值”定义
     */
    public void setRet(Long Ret) {
        this.Ret = Ret;
    }

    /**
     * Get 资源类型 
     * @return ResourceName 资源类型
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * Set 资源类型
     * @param ResourceName 资源类型
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    /**
     * Get 资源总数 
     * @return Total 资源总数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 资源总数
     * @param Total 资源总数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 资源未使用次数 
     * @return UnusedCount 资源未使用次数
     */
    public Long getUnusedCount() {
        return this.UnusedCount;
    }

    /**
     * Set 资源未使用次数
     * @param UnusedCount 资源未使用次数
     */
    public void setUnusedCount(Long UnusedCount) {
        this.UnusedCount = UnusedCount;
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

    public DescribeBasicDiagnosisResourceUsageInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBasicDiagnosisResourceUsageInfoResponse(DescribeBasicDiagnosisResourceUsageInfoResponse source) {
        if (source.Ret != null) {
            this.Ret = new Long(source.Ret);
        }
        if (source.ResourceName != null) {
            this.ResourceName = new String(source.ResourceName);
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.UnusedCount != null) {
            this.UnusedCount = new Long(source.UnusedCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Ret", this.Ret);
        this.setParamSimple(map, prefix + "ResourceName", this.ResourceName);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "UnusedCount", this.UnusedCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


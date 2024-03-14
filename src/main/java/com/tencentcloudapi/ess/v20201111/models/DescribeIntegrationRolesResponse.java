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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeIntegrationRolesResponse extends AbstractModel {

    /**
    * OFFSET 用于指定查询结果的偏移量，如果不传默认偏移为0, 最大为2000
分页参数, 需要limit, offset 配合使用
例如:
您希望得到第三页的数据, 且每页限制最多10条
您可以使用 LIMIT 10 OFFSET 20
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 指定分页每页返回的数据条数，单页最大支持 200。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 符合查询条件的总角色数。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 企业角色信息列表。
    */
    @SerializedName("IntegrateRoles")
    @Expose
    private IntegrateRole [] IntegrateRoles;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get OFFSET 用于指定查询结果的偏移量，如果不传默认偏移为0, 最大为2000
分页参数, 需要limit, offset 配合使用
例如:
您希望得到第三页的数据, 且每页限制最多10条
您可以使用 LIMIT 10 OFFSET 20 
     * @return Offset OFFSET 用于指定查询结果的偏移量，如果不传默认偏移为0, 最大为2000
分页参数, 需要limit, offset 配合使用
例如:
您希望得到第三页的数据, 且每页限制最多10条
您可以使用 LIMIT 10 OFFSET 20
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set OFFSET 用于指定查询结果的偏移量，如果不传默认偏移为0, 最大为2000
分页参数, 需要limit, offset 配合使用
例如:
您希望得到第三页的数据, 且每页限制最多10条
您可以使用 LIMIT 10 OFFSET 20
     * @param Offset OFFSET 用于指定查询结果的偏移量，如果不传默认偏移为0, 最大为2000
分页参数, 需要limit, offset 配合使用
例如:
您希望得到第三页的数据, 且每页限制最多10条
您可以使用 LIMIT 10 OFFSET 20
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 指定分页每页返回的数据条数，单页最大支持 200。 
     * @return Limit 指定分页每页返回的数据条数，单页最大支持 200。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 指定分页每页返回的数据条数，单页最大支持 200。
     * @param Limit 指定分页每页返回的数据条数，单页最大支持 200。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 符合查询条件的总角色数。 
     * @return TotalCount 符合查询条件的总角色数。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 符合查询条件的总角色数。
     * @param TotalCount 符合查询条件的总角色数。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 企业角色信息列表。 
     * @return IntegrateRoles 企业角色信息列表。
     */
    public IntegrateRole [] getIntegrateRoles() {
        return this.IntegrateRoles;
    }

    /**
     * Set 企业角色信息列表。
     * @param IntegrateRoles 企业角色信息列表。
     */
    public void setIntegrateRoles(IntegrateRole [] IntegrateRoles) {
        this.IntegrateRoles = IntegrateRoles;
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

    public DescribeIntegrationRolesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeIntegrationRolesResponse(DescribeIntegrationRolesResponse source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.IntegrateRoles != null) {
            this.IntegrateRoles = new IntegrateRole[source.IntegrateRoles.length];
            for (int i = 0; i < source.IntegrateRoles.length; i++) {
                this.IntegrateRoles[i] = new IntegrateRole(source.IntegrateRoles[i]);
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
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "IntegrateRoles.", this.IntegrateRoles);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


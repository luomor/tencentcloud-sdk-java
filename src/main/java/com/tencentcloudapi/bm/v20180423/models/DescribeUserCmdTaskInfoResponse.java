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
package com.tencentcloudapi.bm.v20180423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUserCmdTaskInfoResponse extends AbstractModel {

    /**
    * 返回数量
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 自定义脚本任务详细信息列表
    */
    @SerializedName("UserCmdTaskInfoSet")
    @Expose
    private UserCmdTaskInfo [] UserCmdTaskInfoSet;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 返回数量 
     * @return TotalCount 返回数量
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 返回数量
     * @param TotalCount 返回数量
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 自定义脚本任务详细信息列表 
     * @return UserCmdTaskInfoSet 自定义脚本任务详细信息列表
     */
    public UserCmdTaskInfo [] getUserCmdTaskInfoSet() {
        return this.UserCmdTaskInfoSet;
    }

    /**
     * Set 自定义脚本任务详细信息列表
     * @param UserCmdTaskInfoSet 自定义脚本任务详细信息列表
     */
    public void setUserCmdTaskInfoSet(UserCmdTaskInfo [] UserCmdTaskInfoSet) {
        this.UserCmdTaskInfoSet = UserCmdTaskInfoSet;
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

    public DescribeUserCmdTaskInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUserCmdTaskInfoResponse(DescribeUserCmdTaskInfoResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.UserCmdTaskInfoSet != null) {
            this.UserCmdTaskInfoSet = new UserCmdTaskInfo[source.UserCmdTaskInfoSet.length];
            for (int i = 0; i < source.UserCmdTaskInfoSet.length; i++) {
                this.UserCmdTaskInfoSet[i] = new UserCmdTaskInfo(source.UserCmdTaskInfoSet[i]);
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
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "UserCmdTaskInfoSet.", this.UserCmdTaskInfoSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


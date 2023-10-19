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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryRangeMetricResponse extends AbstractModel {

    /**
    * 指标查询结果类型
    */
    @SerializedName("ResultType")
    @Expose
    private String ResultType;

    /**
    * 指标查询结果
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 指标查询结果类型 
     * @return ResultType 指标查询结果类型
     */
    public String getResultType() {
        return this.ResultType;
    }

    /**
     * Set 指标查询结果类型
     * @param ResultType 指标查询结果类型
     */
    public void setResultType(String ResultType) {
        this.ResultType = ResultType;
    }

    /**
     * Get 指标查询结果 
     * @return Result 指标查询结果
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set 指标查询结果
     * @param Result 指标查询结果
     */
    public void setResult(String Result) {
        this.Result = Result;
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

    public QueryRangeMetricResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryRangeMetricResponse(QueryRangeMetricResponse source) {
        if (source.ResultType != null) {
            this.ResultType = new String(source.ResultType);
        }
        if (source.Result != null) {
            this.Result = new String(source.Result);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResultType", this.ResultType);
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


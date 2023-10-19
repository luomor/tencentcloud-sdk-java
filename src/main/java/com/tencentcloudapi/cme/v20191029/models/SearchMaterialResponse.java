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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchMaterialResponse extends AbstractModel {

    /**
    * 符合记录总条数。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 媒体信息，仅返回基础信息。
    */
    @SerializedName("MaterialInfoSet")
    @Expose
    private MaterialInfo [] MaterialInfoSet;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 符合记录总条数。 
     * @return TotalCount 符合记录总条数。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 符合记录总条数。
     * @param TotalCount 符合记录总条数。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 媒体信息，仅返回基础信息。 
     * @return MaterialInfoSet 媒体信息，仅返回基础信息。
     */
    public MaterialInfo [] getMaterialInfoSet() {
        return this.MaterialInfoSet;
    }

    /**
     * Set 媒体信息，仅返回基础信息。
     * @param MaterialInfoSet 媒体信息，仅返回基础信息。
     */
    public void setMaterialInfoSet(MaterialInfo [] MaterialInfoSet) {
        this.MaterialInfoSet = MaterialInfoSet;
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

    public SearchMaterialResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchMaterialResponse(SearchMaterialResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.MaterialInfoSet != null) {
            this.MaterialInfoSet = new MaterialInfo[source.MaterialInfoSet.length];
            for (int i = 0; i < source.MaterialInfoSet.length; i++) {
                this.MaterialInfoSet[i] = new MaterialInfo(source.MaterialInfoSet[i]);
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
        this.setParamArrayObj(map, prefix + "MaterialInfoSet.", this.MaterialInfoSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RollbackCustomFunctionVersionRequest extends AbstractModel {

    /**
    * 函数唯一标识
    */
    @SerializedName("FunctionId")
    @Expose
    private String FunctionId;

    /**
    * 函数要回滚到的版本
    */
    @SerializedName("Tag")
    @Expose
    private String Tag;

    /**
    * 集群实例 ID
    */
    @SerializedName("ClusterIdentifier")
    @Expose
    private String ClusterIdentifier;

    /**
     * Get 函数唯一标识 
     * @return FunctionId 函数唯一标识
     */
    public String getFunctionId() {
        return this.FunctionId;
    }

    /**
     * Set 函数唯一标识
     * @param FunctionId 函数唯一标识
     */
    public void setFunctionId(String FunctionId) {
        this.FunctionId = FunctionId;
    }

    /**
     * Get 函数要回滚到的版本 
     * @return Tag 函数要回滚到的版本
     */
    public String getTag() {
        return this.Tag;
    }

    /**
     * Set 函数要回滚到的版本
     * @param Tag 函数要回滚到的版本
     */
    public void setTag(String Tag) {
        this.Tag = Tag;
    }

    /**
     * Get 集群实例 ID 
     * @return ClusterIdentifier 集群实例 ID
     */
    public String getClusterIdentifier() {
        return this.ClusterIdentifier;
    }

    /**
     * Set 集群实例 ID
     * @param ClusterIdentifier 集群实例 ID
     */
    public void setClusterIdentifier(String ClusterIdentifier) {
        this.ClusterIdentifier = ClusterIdentifier;
    }

    public RollbackCustomFunctionVersionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RollbackCustomFunctionVersionRequest(RollbackCustomFunctionVersionRequest source) {
        if (source.FunctionId != null) {
            this.FunctionId = new String(source.FunctionId);
        }
        if (source.Tag != null) {
            this.Tag = new String(source.Tag);
        }
        if (source.ClusterIdentifier != null) {
            this.ClusterIdentifier = new String(source.ClusterIdentifier);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FunctionId", this.FunctionId);
        this.setParamSimple(map, prefix + "Tag", this.Tag);
        this.setParamSimple(map, prefix + "ClusterIdentifier", this.ClusterIdentifier);

    }
}


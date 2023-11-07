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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyResourcePoolsRequest extends AbstractModel {

    /**
    * emr集群id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 取值范围：
<li>fair:代表公平调度标识</li>
<li>capacity:代表容量调度标识</li>
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
     * Get emr集群id 
     * @return InstanceId emr集群id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set emr集群id
     * @param InstanceId emr集群id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 取值范围：
<li>fair:代表公平调度标识</li>
<li>capacity:代表容量调度标识</li> 
     * @return Key 取值范围：
<li>fair:代表公平调度标识</li>
<li>capacity:代表容量调度标识</li>
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 取值范围：
<li>fair:代表公平调度标识</li>
<li>capacity:代表容量调度标识</li>
     * @param Key 取值范围：
<li>fair:代表公平调度标识</li>
<li>capacity:代表容量调度标识</li>
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    public ModifyResourcePoolsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyResourcePoolsRequest(ModifyResourcePoolsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Key", this.Key);

    }
}


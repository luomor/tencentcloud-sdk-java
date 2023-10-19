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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyNatInstanceResponse extends AbstractModel {

    /**
    * 0 正常
-1 异常
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * nat实例唯一ID
    */
    @SerializedName("NatInstanceId")
    @Expose
    private String NatInstanceId;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 0 正常
-1 异常 
     * @return Status 0 正常
-1 异常
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 0 正常
-1 异常
     * @param Status 0 正常
-1 异常
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get nat实例唯一ID 
     * @return NatInstanceId nat实例唯一ID
     */
    public String getNatInstanceId() {
        return this.NatInstanceId;
    }

    /**
     * Set nat实例唯一ID
     * @param NatInstanceId nat实例唯一ID
     */
    public void setNatInstanceId(String NatInstanceId) {
        this.NatInstanceId = NatInstanceId;
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

    public ModifyNatInstanceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyNatInstanceResponse(ModifyNatInstanceResponse source) {
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.NatInstanceId != null) {
            this.NatInstanceId = new String(source.NatInstanceId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "NatInstanceId", this.NatInstanceId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


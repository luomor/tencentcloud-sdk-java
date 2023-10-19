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
package com.tencentcloudapi.anicloud.v20220923.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckAppidExistResponse extends AbstractModel {

    /**
    * appid是否存在
    */
    @SerializedName("Exist")
    @Expose
    private Boolean Exist;

    /**
    * 请求是否成功
    */
    @SerializedName("HasError")
    @Expose
    private Boolean HasError;

    /**
    * 出错消息
    */
    @SerializedName("Msg")
    @Expose
    private String Msg;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get appid是否存在 
     * @return Exist appid是否存在
     */
    public Boolean getExist() {
        return this.Exist;
    }

    /**
     * Set appid是否存在
     * @param Exist appid是否存在
     */
    public void setExist(Boolean Exist) {
        this.Exist = Exist;
    }

    /**
     * Get 请求是否成功 
     * @return HasError 请求是否成功
     */
    public Boolean getHasError() {
        return this.HasError;
    }

    /**
     * Set 请求是否成功
     * @param HasError 请求是否成功
     */
    public void setHasError(Boolean HasError) {
        this.HasError = HasError;
    }

    /**
     * Get 出错消息 
     * @return Msg 出错消息
     */
    public String getMsg() {
        return this.Msg;
    }

    /**
     * Set 出错消息
     * @param Msg 出错消息
     */
    public void setMsg(String Msg) {
        this.Msg = Msg;
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

    public CheckAppidExistResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckAppidExistResponse(CheckAppidExistResponse source) {
        if (source.Exist != null) {
            this.Exist = new Boolean(source.Exist);
        }
        if (source.HasError != null) {
            this.HasError = new Boolean(source.HasError);
        }
        if (source.Msg != null) {
            this.Msg = new String(source.Msg);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Exist", this.Exist);
        this.setParamSimple(map, prefix + "HasError", this.HasError);
        this.setParamSimple(map, prefix + "Msg", this.Msg);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


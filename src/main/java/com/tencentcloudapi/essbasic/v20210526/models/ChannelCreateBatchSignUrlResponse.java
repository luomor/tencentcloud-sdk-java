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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChannelCreateBatchSignUrlResponse extends AbstractModel {

    /**
    * 批量签署链接，以短链形式返回，短链的有效期参考回参中的 ExpiredTime。

注: `非小程序和APP集成使用`
    */
    @SerializedName("SignUrl")
    @Expose
    private String SignUrl;

    /**
    * 链接过期时间以 Unix 时间戳格式表示，从生成链接时间起，往后7天有效期。过期后短链将失效，无法打开。
    */
    @SerializedName("ExpiredTime")
    @Expose
    private Long ExpiredTime;

    /**
    * 从客户小程序或者客户APP跳转至腾讯电子签小程序进行批量签署的跳转路径

注: `小程序和APP集成使用`
    */
    @SerializedName("MiniAppPath")
    @Expose
    private String MiniAppPath;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 批量签署链接，以短链形式返回，短链的有效期参考回参中的 ExpiredTime。

注: `非小程序和APP集成使用` 
     * @return SignUrl 批量签署链接，以短链形式返回，短链的有效期参考回参中的 ExpiredTime。

注: `非小程序和APP集成使用`
     */
    public String getSignUrl() {
        return this.SignUrl;
    }

    /**
     * Set 批量签署链接，以短链形式返回，短链的有效期参考回参中的 ExpiredTime。

注: `非小程序和APP集成使用`
     * @param SignUrl 批量签署链接，以短链形式返回，短链的有效期参考回参中的 ExpiredTime。

注: `非小程序和APP集成使用`
     */
    public void setSignUrl(String SignUrl) {
        this.SignUrl = SignUrl;
    }

    /**
     * Get 链接过期时间以 Unix 时间戳格式表示，从生成链接时间起，往后7天有效期。过期后短链将失效，无法打开。 
     * @return ExpiredTime 链接过期时间以 Unix 时间戳格式表示，从生成链接时间起，往后7天有效期。过期后短链将失效，无法打开。
     */
    public Long getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set 链接过期时间以 Unix 时间戳格式表示，从生成链接时间起，往后7天有效期。过期后短链将失效，无法打开。
     * @param ExpiredTime 链接过期时间以 Unix 时间戳格式表示，从生成链接时间起，往后7天有效期。过期后短链将失效，无法打开。
     */
    public void setExpiredTime(Long ExpiredTime) {
        this.ExpiredTime = ExpiredTime;
    }

    /**
     * Get 从客户小程序或者客户APP跳转至腾讯电子签小程序进行批量签署的跳转路径

注: `小程序和APP集成使用` 
     * @return MiniAppPath 从客户小程序或者客户APP跳转至腾讯电子签小程序进行批量签署的跳转路径

注: `小程序和APP集成使用`
     */
    public String getMiniAppPath() {
        return this.MiniAppPath;
    }

    /**
     * Set 从客户小程序或者客户APP跳转至腾讯电子签小程序进行批量签署的跳转路径

注: `小程序和APP集成使用`
     * @param MiniAppPath 从客户小程序或者客户APP跳转至腾讯电子签小程序进行批量签署的跳转路径

注: `小程序和APP集成使用`
     */
    public void setMiniAppPath(String MiniAppPath) {
        this.MiniAppPath = MiniAppPath;
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

    public ChannelCreateBatchSignUrlResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChannelCreateBatchSignUrlResponse(ChannelCreateBatchSignUrlResponse source) {
        if (source.SignUrl != null) {
            this.SignUrl = new String(source.SignUrl);
        }
        if (source.ExpiredTime != null) {
            this.ExpiredTime = new Long(source.ExpiredTime);
        }
        if (source.MiniAppPath != null) {
            this.MiniAppPath = new String(source.MiniAppPath);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SignUrl", this.SignUrl);
        this.setParamSimple(map, prefix + "ExpiredTime", this.ExpiredTime);
        this.setParamSimple(map, prefix + "MiniAppPath", this.MiniAppPath);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


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
package com.tencentcloudapi.aai.v20180522.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SimultaneousInterpretingResponse extends AbstractModel{

    /**
    * 语音识别的结果
    */
    @SerializedName("AsrText")
    @Expose
    private String AsrText;

    /**
    * 机器翻译的结果
    */
    @SerializedName("NmtText")
    @Expose
    private String NmtText;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 语音识别的结果 
     * @return AsrText 语音识别的结果
     */
    public String getAsrText() {
        return this.AsrText;
    }

    /**
     * Set 语音识别的结果
     * @param AsrText 语音识别的结果
     */
    public void setAsrText(String AsrText) {
        this.AsrText = AsrText;
    }

    /**
     * Get 机器翻译的结果 
     * @return NmtText 机器翻译的结果
     */
    public String getNmtText() {
        return this.NmtText;
    }

    /**
     * Set 机器翻译的结果
     * @param NmtText 机器翻译的结果
     */
    public void setNmtText(String NmtText) {
        this.NmtText = NmtText;
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

    public SimultaneousInterpretingResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SimultaneousInterpretingResponse(SimultaneousInterpretingResponse source) {
        if (source.AsrText != null) {
            this.AsrText = new String(source.AsrText);
        }
        if (source.NmtText != null) {
            this.NmtText = new String(source.NmtText);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AsrText", this.AsrText);
        this.setParamSimple(map, prefix + "NmtText", this.NmtText);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


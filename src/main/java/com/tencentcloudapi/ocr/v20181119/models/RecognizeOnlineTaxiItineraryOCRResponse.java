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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RecognizeOnlineTaxiItineraryOCRResponse extends AbstractModel {

    /**
    * 网约车行程单识别结果，具体内容请点击左侧链接。
    */
    @SerializedName("OnlineTaxiItineraryInfos")
    @Expose
    private OnlineTaxiItineraryInfo [] OnlineTaxiItineraryInfos;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 网约车行程单识别结果，具体内容请点击左侧链接。 
     * @return OnlineTaxiItineraryInfos 网约车行程单识别结果，具体内容请点击左侧链接。
     */
    public OnlineTaxiItineraryInfo [] getOnlineTaxiItineraryInfos() {
        return this.OnlineTaxiItineraryInfos;
    }

    /**
     * Set 网约车行程单识别结果，具体内容请点击左侧链接。
     * @param OnlineTaxiItineraryInfos 网约车行程单识别结果，具体内容请点击左侧链接。
     */
    public void setOnlineTaxiItineraryInfos(OnlineTaxiItineraryInfo [] OnlineTaxiItineraryInfos) {
        this.OnlineTaxiItineraryInfos = OnlineTaxiItineraryInfos;
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

    public RecognizeOnlineTaxiItineraryOCRResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecognizeOnlineTaxiItineraryOCRResponse(RecognizeOnlineTaxiItineraryOCRResponse source) {
        if (source.OnlineTaxiItineraryInfos != null) {
            this.OnlineTaxiItineraryInfos = new OnlineTaxiItineraryInfo[source.OnlineTaxiItineraryInfos.length];
            for (int i = 0; i < source.OnlineTaxiItineraryInfos.length; i++) {
                this.OnlineTaxiItineraryInfos[i] = new OnlineTaxiItineraryInfo(source.OnlineTaxiItineraryInfos[i]);
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
        this.setParamArrayObj(map, prefix + "OnlineTaxiItineraryInfos.", this.OnlineTaxiItineraryInfos);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


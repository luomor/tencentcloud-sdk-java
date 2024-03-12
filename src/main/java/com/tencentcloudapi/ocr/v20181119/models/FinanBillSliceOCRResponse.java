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

public class FinanBillSliceOCRResponse extends AbstractModel {

    /**
    * 金融票据切片识别结果，具体内容请点击左侧链接。
    */
    @SerializedName("FinanBillSliceInfos")
    @Expose
    private FinanBillSliceInfo [] FinanBillSliceInfos;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 金融票据切片识别结果，具体内容请点击左侧链接。 
     * @return FinanBillSliceInfos 金融票据切片识别结果，具体内容请点击左侧链接。
     */
    public FinanBillSliceInfo [] getFinanBillSliceInfos() {
        return this.FinanBillSliceInfos;
    }

    /**
     * Set 金融票据切片识别结果，具体内容请点击左侧链接。
     * @param FinanBillSliceInfos 金融票据切片识别结果，具体内容请点击左侧链接。
     */
    public void setFinanBillSliceInfos(FinanBillSliceInfo [] FinanBillSliceInfos) {
        this.FinanBillSliceInfos = FinanBillSliceInfos;
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

    public FinanBillSliceOCRResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FinanBillSliceOCRResponse(FinanBillSliceOCRResponse source) {
        if (source.FinanBillSliceInfos != null) {
            this.FinanBillSliceInfos = new FinanBillSliceInfo[source.FinanBillSliceInfos.length];
            for (int i = 0; i < source.FinanBillSliceInfos.length; i++) {
                this.FinanBillSliceInfos[i] = new FinanBillSliceInfo(source.FinanBillSliceInfos[i]);
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
        this.setParamArrayObj(map, prefix + "FinanBillSliceInfos.", this.FinanBillSliceInfos);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


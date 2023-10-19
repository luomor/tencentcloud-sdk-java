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
package com.tencentcloudapi.trp.v20210515.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCodesByPackResponse extends AbstractModel {

    /**
    * 码列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Codes")
    @Expose
    private CodeItem [] Codes;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 码列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Codes 码列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CodeItem [] getCodes() {
        return this.Codes;
    }

    /**
     * Set 码列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Codes 码列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCodes(CodeItem [] Codes) {
        this.Codes = Codes;
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

    public DescribeCodesByPackResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCodesByPackResponse(DescribeCodesByPackResponse source) {
        if (source.Codes != null) {
            this.Codes = new CodeItem[source.Codes.length];
            for (int i = 0; i < source.Codes.length; i++) {
                this.Codes[i] = new CodeItem(source.Codes[i]);
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
        this.setParamArrayObj(map, prefix + "Codes.", this.Codes);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


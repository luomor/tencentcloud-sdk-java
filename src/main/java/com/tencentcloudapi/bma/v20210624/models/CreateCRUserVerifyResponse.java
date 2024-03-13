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
package com.tencentcloudapi.bma.v20210624.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCRUserVerifyResponse extends AbstractModel {

    /**
    * 认证状态：0-认证成功 1-认证失败
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 认证状态说明，包括认证失败原因等
    */
    @SerializedName("Note")
    @Expose
    private String Note;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 认证状态：0-认证成功 1-认证失败 
     * @return Status 认证状态：0-认证成功 1-认证失败
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 认证状态：0-认证成功 1-认证失败
     * @param Status 认证状态：0-认证成功 1-认证失败
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 认证状态说明，包括认证失败原因等 
     * @return Note 认证状态说明，包括认证失败原因等
     */
    public String getNote() {
        return this.Note;
    }

    /**
     * Set 认证状态说明，包括认证失败原因等
     * @param Note 认证状态说明，包括认证失败原因等
     */
    public void setNote(String Note) {
        this.Note = Note;
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

    public CreateCRUserVerifyResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCRUserVerifyResponse(CreateCRUserVerifyResponse source) {
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Note != null) {
            this.Note = new String(source.Note);
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
        this.setParamSimple(map, prefix + "Note", this.Note);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


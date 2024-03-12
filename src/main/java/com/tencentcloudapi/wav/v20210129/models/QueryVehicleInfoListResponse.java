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
package com.tencentcloudapi.wav.v20210129.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryVehicleInfoListResponse extends AbstractModel {

    /**
    * 车系车型信息列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PageData")
    @Expose
    private VehicleInfo [] PageData;

    /**
    * 分页游标，下次调用带上该值，则从当前的位置继续往后拉取新增的数据，以实现增量拉取。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NextCursor")
    @Expose
    private String NextCursor;

    /**
    * 是否还有更多数据。0-否；1-是。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HasMore")
    @Expose
    private Long HasMore;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 车系车型信息列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PageData 车系车型信息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VehicleInfo [] getPageData() {
        return this.PageData;
    }

    /**
     * Set 车系车型信息列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param PageData 车系车型信息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPageData(VehicleInfo [] PageData) {
        this.PageData = PageData;
    }

    /**
     * Get 分页游标，下次调用带上该值，则从当前的位置继续往后拉取新增的数据，以实现增量拉取。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NextCursor 分页游标，下次调用带上该值，则从当前的位置继续往后拉取新增的数据，以实现增量拉取。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNextCursor() {
        return this.NextCursor;
    }

    /**
     * Set 分页游标，下次调用带上该值，则从当前的位置继续往后拉取新增的数据，以实现增量拉取。
注意：此字段可能返回 null，表示取不到有效值。
     * @param NextCursor 分页游标，下次调用带上该值，则从当前的位置继续往后拉取新增的数据，以实现增量拉取。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNextCursor(String NextCursor) {
        this.NextCursor = NextCursor;
    }

    /**
     * Get 是否还有更多数据。0-否；1-是。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HasMore 是否还有更多数据。0-否；1-是。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getHasMore() {
        return this.HasMore;
    }

    /**
     * Set 是否还有更多数据。0-否；1-是。
注意：此字段可能返回 null，表示取不到有效值。
     * @param HasMore 是否还有更多数据。0-否；1-是。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHasMore(Long HasMore) {
        this.HasMore = HasMore;
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

    public QueryVehicleInfoListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryVehicleInfoListResponse(QueryVehicleInfoListResponse source) {
        if (source.PageData != null) {
            this.PageData = new VehicleInfo[source.PageData.length];
            for (int i = 0; i < source.PageData.length; i++) {
                this.PageData[i] = new VehicleInfo(source.PageData[i]);
            }
        }
        if (source.NextCursor != null) {
            this.NextCursor = new String(source.NextCursor);
        }
        if (source.HasMore != null) {
            this.HasMore = new Long(source.HasMore);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "PageData.", this.PageData);
        this.setParamSimple(map, prefix + "NextCursor", this.NextCursor);
        this.setParamSimple(map, prefix + "HasMore", this.HasMore);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


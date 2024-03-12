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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDatabasesResponse extends AbstractModel {

    /**
    * 符合查询条件的实例总数。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 返回的实例信息。
    */
    @SerializedName("Items")
    @Expose
    private String [] Items;

    /**
    * 数据库名以及字符集
    */
    @SerializedName("DatabaseList")
    @Expose
    private DatabasesWithCharacterLists [] DatabaseList;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 符合查询条件的实例总数。 
     * @return TotalCount 符合查询条件的实例总数。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 符合查询条件的实例总数。
     * @param TotalCount 符合查询条件的实例总数。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 返回的实例信息。 
     * @return Items 返回的实例信息。
     */
    public String [] getItems() {
        return this.Items;
    }

    /**
     * Set 返回的实例信息。
     * @param Items 返回的实例信息。
     */
    public void setItems(String [] Items) {
        this.Items = Items;
    }

    /**
     * Get 数据库名以及字符集 
     * @return DatabaseList 数据库名以及字符集
     */
    public DatabasesWithCharacterLists [] getDatabaseList() {
        return this.DatabaseList;
    }

    /**
     * Set 数据库名以及字符集
     * @param DatabaseList 数据库名以及字符集
     */
    public void setDatabaseList(DatabasesWithCharacterLists [] DatabaseList) {
        this.DatabaseList = DatabaseList;
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

    public DescribeDatabasesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDatabasesResponse(DescribeDatabasesResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.Items != null) {
            this.Items = new String[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new String(source.Items[i]);
            }
        }
        if (source.DatabaseList != null) {
            this.DatabaseList = new DatabasesWithCharacterLists[source.DatabaseList.length];
            for (int i = 0; i < source.DatabaseList.length; i++) {
                this.DatabaseList[i] = new DatabasesWithCharacterLists(source.DatabaseList[i]);
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
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArraySimple(map, prefix + "Items.", this.Items);
        this.setParamArrayObj(map, prefix + "DatabaseList.", this.DatabaseList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


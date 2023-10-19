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
package com.tencentcloudapi.ame.v20190916.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeKTVPlaylistsResponse extends AbstractModel {

    /**
    * 推荐歌单列表
    */
    @SerializedName("PlaylistBaseInfoSet")
    @Expose
    private KTVPlaylistBaseInfo [] PlaylistBaseInfoSet;

    /**
    * 推荐歌单列表总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 推荐歌单列表 
     * @return PlaylistBaseInfoSet 推荐歌单列表
     */
    public KTVPlaylistBaseInfo [] getPlaylistBaseInfoSet() {
        return this.PlaylistBaseInfoSet;
    }

    /**
     * Set 推荐歌单列表
     * @param PlaylistBaseInfoSet 推荐歌单列表
     */
    public void setPlaylistBaseInfoSet(KTVPlaylistBaseInfo [] PlaylistBaseInfoSet) {
        this.PlaylistBaseInfoSet = PlaylistBaseInfoSet;
    }

    /**
     * Get 推荐歌单列表总数 
     * @return TotalCount 推荐歌单列表总数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 推荐歌单列表总数
     * @param TotalCount 推荐歌单列表总数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
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

    public DescribeKTVPlaylistsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeKTVPlaylistsResponse(DescribeKTVPlaylistsResponse source) {
        if (source.PlaylistBaseInfoSet != null) {
            this.PlaylistBaseInfoSet = new KTVPlaylistBaseInfo[source.PlaylistBaseInfoSet.length];
            for (int i = 0; i < source.PlaylistBaseInfoSet.length; i++) {
                this.PlaylistBaseInfoSet[i] = new KTVPlaylistBaseInfo(source.PlaylistBaseInfoSet[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "PlaylistBaseInfoSet.", this.PlaylistBaseInfoSet);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


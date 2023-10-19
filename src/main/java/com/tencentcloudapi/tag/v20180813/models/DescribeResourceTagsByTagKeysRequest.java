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
package com.tencentcloudapi.tag.v20180813.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeResourceTagsByTagKeysRequest extends AbstractModel {

    /**
    * 业务类型
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
    * 资源前缀
    */
    @SerializedName("ResourcePrefix")
    @Expose
    private String ResourcePrefix;

    /**
    * 资源地域
    */
    @SerializedName("ResourceRegion")
    @Expose
    private String ResourceRegion;

    /**
    * 资源唯一标识ID的列表，列表容量不超过20
    */
    @SerializedName("ResourceIds")
    @Expose
    private String [] ResourceIds;

    /**
    * 资源标签键列表，列表容量不超过20
    */
    @SerializedName("TagKeys")
    @Expose
    private String [] TagKeys;

    /**
    * 每页大小，默认为 400
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 数据偏移量，默认为 0, 必须为Limit参数的整数倍
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get 业务类型 
     * @return ServiceType 业务类型
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set 业务类型
     * @param ServiceType 业务类型
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * Get 资源前缀 
     * @return ResourcePrefix 资源前缀
     */
    public String getResourcePrefix() {
        return this.ResourcePrefix;
    }

    /**
     * Set 资源前缀
     * @param ResourcePrefix 资源前缀
     */
    public void setResourcePrefix(String ResourcePrefix) {
        this.ResourcePrefix = ResourcePrefix;
    }

    /**
     * Get 资源地域 
     * @return ResourceRegion 资源地域
     */
    public String getResourceRegion() {
        return this.ResourceRegion;
    }

    /**
     * Set 资源地域
     * @param ResourceRegion 资源地域
     */
    public void setResourceRegion(String ResourceRegion) {
        this.ResourceRegion = ResourceRegion;
    }

    /**
     * Get 资源唯一标识ID的列表，列表容量不超过20 
     * @return ResourceIds 资源唯一标识ID的列表，列表容量不超过20
     */
    public String [] getResourceIds() {
        return this.ResourceIds;
    }

    /**
     * Set 资源唯一标识ID的列表，列表容量不超过20
     * @param ResourceIds 资源唯一标识ID的列表，列表容量不超过20
     */
    public void setResourceIds(String [] ResourceIds) {
        this.ResourceIds = ResourceIds;
    }

    /**
     * Get 资源标签键列表，列表容量不超过20 
     * @return TagKeys 资源标签键列表，列表容量不超过20
     */
    public String [] getTagKeys() {
        return this.TagKeys;
    }

    /**
     * Set 资源标签键列表，列表容量不超过20
     * @param TagKeys 资源标签键列表，列表容量不超过20
     */
    public void setTagKeys(String [] TagKeys) {
        this.TagKeys = TagKeys;
    }

    /**
     * Get 每页大小，默认为 400 
     * @return Limit 每页大小，默认为 400
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页大小，默认为 400
     * @param Limit 每页大小，默认为 400
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 数据偏移量，默认为 0, 必须为Limit参数的整数倍 
     * @return Offset 数据偏移量，默认为 0, 必须为Limit参数的整数倍
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 数据偏移量，默认为 0, 必须为Limit参数的整数倍
     * @param Offset 数据偏移量，默认为 0, 必须为Limit参数的整数倍
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeResourceTagsByTagKeysRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeResourceTagsByTagKeysRequest(DescribeResourceTagsByTagKeysRequest source) {
        if (source.ServiceType != null) {
            this.ServiceType = new String(source.ServiceType);
        }
        if (source.ResourcePrefix != null) {
            this.ResourcePrefix = new String(source.ResourcePrefix);
        }
        if (source.ResourceRegion != null) {
            this.ResourceRegion = new String(source.ResourceRegion);
        }
        if (source.ResourceIds != null) {
            this.ResourceIds = new String[source.ResourceIds.length];
            for (int i = 0; i < source.ResourceIds.length; i++) {
                this.ResourceIds[i] = new String(source.ResourceIds[i]);
            }
        }
        if (source.TagKeys != null) {
            this.TagKeys = new String[source.TagKeys.length];
            for (int i = 0; i < source.TagKeys.length; i++) {
                this.TagKeys[i] = new String(source.TagKeys[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamSimple(map, prefix + "ResourcePrefix", this.ResourcePrefix);
        this.setParamSimple(map, prefix + "ResourceRegion", this.ResourceRegion);
        this.setParamArraySimple(map, prefix + "ResourceIds.", this.ResourceIds);
        this.setParamArraySimple(map, prefix + "TagKeys.", this.TagKeys);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}


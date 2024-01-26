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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBatchTasksRequest extends AbstractModel {

    /**
    * 过滤器

Name支持的取值范围：
BatchTaskId, BatchTaskName, Status, ModelVersionId

其中Status 的有效取值范围:
INIT, STARTING, RUNNING, FAILED, STOPPING, STOPPED, SUCCEED
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 标签过滤器
    */
    @SerializedName("TagFilters")
    @Expose
    private TagFilter [] TagFilters;

    /**
    * 偏移量，默认为0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 限制数目，默认为20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 输出列表的排列顺序。取值范围：ASC（升序排列）/ DESC（降序排列），默认为DESC
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * 排序字段。当前仅支持 "CreateTime"。
不传此字段则按照DB默认排序结果返回
    */
    @SerializedName("OrderField")
    @Expose
    private String OrderField;

    /**
     * Get 过滤器

Name支持的取值范围：
BatchTaskId, BatchTaskName, Status, ModelVersionId

其中Status 的有效取值范围:
INIT, STARTING, RUNNING, FAILED, STOPPING, STOPPED, SUCCEED 
     * @return Filters 过滤器

Name支持的取值范围：
BatchTaskId, BatchTaskName, Status, ModelVersionId

其中Status 的有效取值范围:
INIT, STARTING, RUNNING, FAILED, STOPPING, STOPPED, SUCCEED
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤器

Name支持的取值范围：
BatchTaskId, BatchTaskName, Status, ModelVersionId

其中Status 的有效取值范围:
INIT, STARTING, RUNNING, FAILED, STOPPING, STOPPED, SUCCEED
     * @param Filters 过滤器

Name支持的取值范围：
BatchTaskId, BatchTaskName, Status, ModelVersionId

其中Status 的有效取值范围:
INIT, STARTING, RUNNING, FAILED, STOPPING, STOPPED, SUCCEED
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 标签过滤器 
     * @return TagFilters 标签过滤器
     */
    public TagFilter [] getTagFilters() {
        return this.TagFilters;
    }

    /**
     * Set 标签过滤器
     * @param TagFilters 标签过滤器
     */
    public void setTagFilters(TagFilter [] TagFilters) {
        this.TagFilters = TagFilters;
    }

    /**
     * Get 偏移量，默认为0 
     * @return Offset 偏移量，默认为0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0
     * @param Offset 偏移量，默认为0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 限制数目，默认为20 
     * @return Limit 限制数目，默认为20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 限制数目，默认为20
     * @param Limit 限制数目，默认为20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 输出列表的排列顺序。取值范围：ASC（升序排列）/ DESC（降序排列），默认为DESC 
     * @return Order 输出列表的排列顺序。取值范围：ASC（升序排列）/ DESC（降序排列），默认为DESC
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 输出列表的排列顺序。取值范围：ASC（升序排列）/ DESC（降序排列），默认为DESC
     * @param Order 输出列表的排列顺序。取值范围：ASC（升序排列）/ DESC（降序排列），默认为DESC
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get 排序字段。当前仅支持 "CreateTime"。
不传此字段则按照DB默认排序结果返回 
     * @return OrderField 排序字段。当前仅支持 "CreateTime"。
不传此字段则按照DB默认排序结果返回
     */
    public String getOrderField() {
        return this.OrderField;
    }

    /**
     * Set 排序字段。当前仅支持 "CreateTime"。
不传此字段则按照DB默认排序结果返回
     * @param OrderField 排序字段。当前仅支持 "CreateTime"。
不传此字段则按照DB默认排序结果返回
     */
    public void setOrderField(String OrderField) {
        this.OrderField = OrderField;
    }

    public DescribeBatchTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBatchTasksRequest(DescribeBatchTasksRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.TagFilters != null) {
            this.TagFilters = new TagFilter[source.TagFilters.length];
            for (int i = 0; i < source.TagFilters.length; i++) {
                this.TagFilters[i] = new TagFilter(source.TagFilters[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.OrderField != null) {
            this.OrderField = new String(source.OrderField);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArrayObj(map, prefix + "TagFilters.", this.TagFilters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "OrderField", this.OrderField);

    }
}


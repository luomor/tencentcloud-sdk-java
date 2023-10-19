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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExportRansomDefenseStrategyListRequest extends AbstractModel {

    /**
    * 过滤条件。
<li>Ips - String - 是否必填：否 - 通过ip查询 </li>
<li>MachineNames - String - 是否必填：否 - 通过实例名查询 </li>
<li>Names - String - 是否必填：否 - 通过实例名查询 </li>
<li>Dirs - String - 是否必填：否 - 诱饵目录 </li>
<li>Status - String - 是否必填：否 - 策略状态：0关闭，1开启 </li>
<li>BackupType - String - 是否必填：否 - 备份模式：0-按周;1-按天 </li>
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
    * 排序方法 ASC DESC
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * 排序字段支持CreateTime、MachineCount
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
     * Get 过滤条件。
<li>Ips - String - 是否必填：否 - 通过ip查询 </li>
<li>MachineNames - String - 是否必填：否 - 通过实例名查询 </li>
<li>Names - String - 是否必填：否 - 通过实例名查询 </li>
<li>Dirs - String - 是否必填：否 - 诱饵目录 </li>
<li>Status - String - 是否必填：否 - 策略状态：0关闭，1开启 </li>
<li>BackupType - String - 是否必填：否 - 备份模式：0-按周;1-按天 </li> 
     * @return Filters 过滤条件。
<li>Ips - String - 是否必填：否 - 通过ip查询 </li>
<li>MachineNames - String - 是否必填：否 - 通过实例名查询 </li>
<li>Names - String - 是否必填：否 - 通过实例名查询 </li>
<li>Dirs - String - 是否必填：否 - 诱饵目录 </li>
<li>Status - String - 是否必填：否 - 策略状态：0关闭，1开启 </li>
<li>BackupType - String - 是否必填：否 - 备份模式：0-按周;1-按天 </li>
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件。
<li>Ips - String - 是否必填：否 - 通过ip查询 </li>
<li>MachineNames - String - 是否必填：否 - 通过实例名查询 </li>
<li>Names - String - 是否必填：否 - 通过实例名查询 </li>
<li>Dirs - String - 是否必填：否 - 诱饵目录 </li>
<li>Status - String - 是否必填：否 - 策略状态：0关闭，1开启 </li>
<li>BackupType - String - 是否必填：否 - 备份模式：0-按周;1-按天 </li>
     * @param Filters 过滤条件。
<li>Ips - String - 是否必填：否 - 通过ip查询 </li>
<li>MachineNames - String - 是否必填：否 - 通过实例名查询 </li>
<li>Names - String - 是否必填：否 - 通过实例名查询 </li>
<li>Dirs - String - 是否必填：否 - 诱饵目录 </li>
<li>Status - String - 是否必填：否 - 策略状态：0关闭，1开启 </li>
<li>BackupType - String - 是否必填：否 - 备份模式：0-按周;1-按天 </li>
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 排序方法 ASC DESC 
     * @return Order 排序方法 ASC DESC
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 排序方法 ASC DESC
     * @param Order 排序方法 ASC DESC
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get 排序字段支持CreateTime、MachineCount 
     * @return By 排序字段支持CreateTime、MachineCount
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set 排序字段支持CreateTime、MachineCount
     * @param By 排序字段支持CreateTime、MachineCount
     */
    public void setBy(String By) {
        this.By = By;
    }

    public ExportRansomDefenseStrategyListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExportRansomDefenseStrategyListRequest(ExportRansomDefenseStrategyListRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filters(source.Filters[i]);
            }
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.By != null) {
            this.By = new String(source.By);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);

    }
}


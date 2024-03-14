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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeHiveQueriesRequest extends AbstractModel {

    /**
    * 集群ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 起始时间秒
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 结束时间秒，EndTime-StartTime不得超过1天秒数86400
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 分页起始偏移，从0开始
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页大小，合法范围[1,100]
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 执行状态,ERROR等
    */
    @SerializedName("State")
    @Expose
    private String [] State;

    /**
    * 结束时间大于的时间点
    */
    @SerializedName("EndTimeGte")
    @Expose
    private Long EndTimeGte;

    /**
    * 结束时间小于时间点
    */
    @SerializedName("EndTimeLte")
    @Expose
    private Long EndTimeLte;

    /**
     * Get 集群ID 
     * @return InstanceId 集群ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 集群ID
     * @param InstanceId 集群ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 起始时间秒 
     * @return StartTime 起始时间秒
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 起始时间秒
     * @param StartTime 起始时间秒
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间秒，EndTime-StartTime不得超过1天秒数86400 
     * @return EndTime 结束时间秒，EndTime-StartTime不得超过1天秒数86400
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间秒，EndTime-StartTime不得超过1天秒数86400
     * @param EndTime 结束时间秒，EndTime-StartTime不得超过1天秒数86400
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 分页起始偏移，从0开始 
     * @return Offset 分页起始偏移，从0开始
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页起始偏移，从0开始
     * @param Offset 分页起始偏移，从0开始
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页大小，合法范围[1,100] 
     * @return Limit 分页大小，合法范围[1,100]
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页大小，合法范围[1,100]
     * @param Limit 分页大小，合法范围[1,100]
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 执行状态,ERROR等 
     * @return State 执行状态,ERROR等
     */
    public String [] getState() {
        return this.State;
    }

    /**
     * Set 执行状态,ERROR等
     * @param State 执行状态,ERROR等
     */
    public void setState(String [] State) {
        this.State = State;
    }

    /**
     * Get 结束时间大于的时间点 
     * @return EndTimeGte 结束时间大于的时间点
     */
    public Long getEndTimeGte() {
        return this.EndTimeGte;
    }

    /**
     * Set 结束时间大于的时间点
     * @param EndTimeGte 结束时间大于的时间点
     */
    public void setEndTimeGte(Long EndTimeGte) {
        this.EndTimeGte = EndTimeGte;
    }

    /**
     * Get 结束时间小于时间点 
     * @return EndTimeLte 结束时间小于时间点
     */
    public Long getEndTimeLte() {
        return this.EndTimeLte;
    }

    /**
     * Set 结束时间小于时间点
     * @param EndTimeLte 结束时间小于时间点
     */
    public void setEndTimeLte(Long EndTimeLte) {
        this.EndTimeLte = EndTimeLte;
    }

    public DescribeHiveQueriesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeHiveQueriesRequest(DescribeHiveQueriesRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.State != null) {
            this.State = new String[source.State.length];
            for (int i = 0; i < source.State.length; i++) {
                this.State[i] = new String(source.State[i]);
            }
        }
        if (source.EndTimeGte != null) {
            this.EndTimeGte = new Long(source.EndTimeGte);
        }
        if (source.EndTimeLte != null) {
            this.EndTimeLte = new Long(source.EndTimeLte);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "State.", this.State);
        this.setParamSimple(map, prefix + "EndTimeGte", this.EndTimeGte);
        this.setParamSimple(map, prefix + "EndTimeLte", this.EndTimeLte);

    }
}


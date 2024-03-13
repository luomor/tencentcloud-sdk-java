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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceLifeDetailDto extends AbstractModel {

    /**
    * 实例状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 该状态开始时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 实例生命周期阶段状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DetailState")
    @Expose
    private String DetailState;

    /**
    * 该状态结束时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get 实例状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return State 实例状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set 实例状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param State 实例状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get 该状态开始时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime 该状态开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 该状态开始时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime 该状态开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 实例生命周期阶段状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DetailState 实例生命周期阶段状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDetailState() {
        return this.DetailState;
    }

    /**
     * Set 实例生命周期阶段状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param DetailState 实例生命周期阶段状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDetailState(String DetailState) {
        this.DetailState = DetailState;
    }

    /**
     * Get 该状态结束时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime 该状态结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 该状态结束时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime 该状态结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public InstanceLifeDetailDto() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceLifeDetailDto(InstanceLifeDetailDto source) {
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.DetailState != null) {
            this.DetailState = new String(source.DetailState);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "DetailState", this.DetailState);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}


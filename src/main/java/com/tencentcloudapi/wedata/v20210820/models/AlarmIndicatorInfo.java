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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AlarmIndicatorInfo extends AbstractModel{

    /**
    * 指标id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 告警指标,0表示任务失败，1表示任务运行超时，2表示任务停止，3表示任务暂停
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlarmIndicator")
    @Expose
    private Long AlarmIndicator;

    /**
    * 告警指标描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlarmIndicatorDesc")
    @Expose
    private String AlarmIndicatorDesc;

    /**
    * 指标阈值，1表示离线任务第一次运行失败，2表示离线任务所有重试完成后失败
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TriggerType")
    @Expose
    private Long TriggerType;

    /**
    * 预计的超时时间，分钟级别
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EstimatedTime")
    @Expose
    private Long EstimatedTime;

    /**
    * 实时任务告警需要的参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Operator")
    @Expose
    private Long Operator;

    /**
     * Get 指标id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id 指标id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 指标id
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id 指标id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 告警指标,0表示任务失败，1表示任务运行超时，2表示任务停止，3表示任务暂停
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlarmIndicator 告警指标,0表示任务失败，1表示任务运行超时，2表示任务停止，3表示任务暂停
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAlarmIndicator() {
        return this.AlarmIndicator;
    }

    /**
     * Set 告警指标,0表示任务失败，1表示任务运行超时，2表示任务停止，3表示任务暂停
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlarmIndicator 告警指标,0表示任务失败，1表示任务运行超时，2表示任务停止，3表示任务暂停
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlarmIndicator(Long AlarmIndicator) {
        this.AlarmIndicator = AlarmIndicator;
    }

    /**
     * Get 告警指标描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlarmIndicatorDesc 告警指标描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAlarmIndicatorDesc() {
        return this.AlarmIndicatorDesc;
    }

    /**
     * Set 告警指标描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlarmIndicatorDesc 告警指标描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlarmIndicatorDesc(String AlarmIndicatorDesc) {
        this.AlarmIndicatorDesc = AlarmIndicatorDesc;
    }

    /**
     * Get 指标阈值，1表示离线任务第一次运行失败，2表示离线任务所有重试完成后失败
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TriggerType 指标阈值，1表示离线任务第一次运行失败，2表示离线任务所有重试完成后失败
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTriggerType() {
        return this.TriggerType;
    }

    /**
     * Set 指标阈值，1表示离线任务第一次运行失败，2表示离线任务所有重试完成后失败
注意：此字段可能返回 null，表示取不到有效值。
     * @param TriggerType 指标阈值，1表示离线任务第一次运行失败，2表示离线任务所有重试完成后失败
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTriggerType(Long TriggerType) {
        this.TriggerType = TriggerType;
    }

    /**
     * Get 预计的超时时间，分钟级别
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EstimatedTime 预计的超时时间，分钟级别
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEstimatedTime() {
        return this.EstimatedTime;
    }

    /**
     * Set 预计的超时时间，分钟级别
注意：此字段可能返回 null，表示取不到有效值。
     * @param EstimatedTime 预计的超时时间，分钟级别
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEstimatedTime(Long EstimatedTime) {
        this.EstimatedTime = EstimatedTime;
    }

    /**
     * Get 实时任务告警需要的参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Operator 实时任务告警需要的参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOperator() {
        return this.Operator;
    }

    /**
     * Set 实时任务告警需要的参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Operator 实时任务告警需要的参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperator(Long Operator) {
        this.Operator = Operator;
    }

    public AlarmIndicatorInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlarmIndicatorInfo(AlarmIndicatorInfo source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.AlarmIndicator != null) {
            this.AlarmIndicator = new Long(source.AlarmIndicator);
        }
        if (source.AlarmIndicatorDesc != null) {
            this.AlarmIndicatorDesc = new String(source.AlarmIndicatorDesc);
        }
        if (source.TriggerType != null) {
            this.TriggerType = new Long(source.TriggerType);
        }
        if (source.EstimatedTime != null) {
            this.EstimatedTime = new Long(source.EstimatedTime);
        }
        if (source.Operator != null) {
            this.Operator = new Long(source.Operator);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "AlarmIndicator", this.AlarmIndicator);
        this.setParamSimple(map, prefix + "AlarmIndicatorDesc", this.AlarmIndicatorDesc);
        this.setParamSimple(map, prefix + "TriggerType", this.TriggerType);
        this.setParamSimple(map, prefix + "EstimatedTime", this.EstimatedTime);
        this.setParamSimple(map, prefix + "Operator", this.Operator);

    }
}

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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BotPkg extends AbstractModel {

    /**
    * 资源id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceIds")
    @Expose
    private String ResourceIds;

    /**
    * 状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 地域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private Long Region;

    /**
    * 开始时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * 结束时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 申请数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InquireNum")
    @Expose
    private Long InquireNum;

    /**
    * 使用数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UsedNum")
    @Expose
    private Long UsedNum;

    /**
    * 子产品code
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 续费标志	
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
    * 购买页bot6折
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BotCPWaf")
    @Expose
    private Long BotCPWaf;

    /**
    * 控制台买bot5折
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BotNPWaf")
    @Expose
    private Long BotNPWaf;

    /**
    * 7天bot试用标识 1 试用 0 没有试用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsBotTrial")
    @Expose
    private Long IsBotTrial;

    /**
     * Get 资源id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceIds 资源id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceIds() {
        return this.ResourceIds;
    }

    /**
     * Set 资源id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceIds 资源id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceIds(String ResourceIds) {
        this.ResourceIds = ResourceIds;
    }

    /**
     * Get 状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 地域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region 地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRegion() {
        return this.Region;
    }

    /**
     * Set 地域
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region 地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(Long Region) {
        this.Region = Region;
    }

    /**
     * Get 开始时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BeginTime 开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set 开始时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param BeginTime 开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get 结束时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime 结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime 结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 申请数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InquireNum 申请数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getInquireNum() {
        return this.InquireNum;
    }

    /**
     * Set 申请数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param InquireNum 申请数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInquireNum(Long InquireNum) {
        this.InquireNum = InquireNum;
    }

    /**
     * Get 使用数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UsedNum 使用数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUsedNum() {
        return this.UsedNum;
    }

    /**
     * Set 使用数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param UsedNum 使用数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUsedNum(Long UsedNum) {
        this.UsedNum = UsedNum;
    }

    /**
     * Get 子产品code
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 子产品code
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 子产品code
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 子产品code
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 续费标志	
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RenewFlag 续费标志	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set 续费标志	
注意：此字段可能返回 null，表示取不到有效值。
     * @param RenewFlag 续费标志	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get 购买页bot6折
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BotCPWaf 购买页bot6折
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBotCPWaf() {
        return this.BotCPWaf;
    }

    /**
     * Set 购买页bot6折
注意：此字段可能返回 null，表示取不到有效值。
     * @param BotCPWaf 购买页bot6折
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBotCPWaf(Long BotCPWaf) {
        this.BotCPWaf = BotCPWaf;
    }

    /**
     * Get 控制台买bot5折
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BotNPWaf 控制台买bot5折
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBotNPWaf() {
        return this.BotNPWaf;
    }

    /**
     * Set 控制台买bot5折
注意：此字段可能返回 null，表示取不到有效值。
     * @param BotNPWaf 控制台买bot5折
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBotNPWaf(Long BotNPWaf) {
        this.BotNPWaf = BotNPWaf;
    }

    /**
     * Get 7天bot试用标识 1 试用 0 没有试用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsBotTrial 7天bot试用标识 1 试用 0 没有试用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsBotTrial() {
        return this.IsBotTrial;
    }

    /**
     * Set 7天bot试用标识 1 试用 0 没有试用
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsBotTrial 7天bot试用标识 1 试用 0 没有试用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsBotTrial(Long IsBotTrial) {
        this.IsBotTrial = IsBotTrial;
    }

    public BotPkg() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BotPkg(BotPkg source) {
        if (source.ResourceIds != null) {
            this.ResourceIds = new String(source.ResourceIds);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Region != null) {
            this.Region = new Long(source.Region);
        }
        if (source.BeginTime != null) {
            this.BeginTime = new String(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.InquireNum != null) {
            this.InquireNum = new Long(source.InquireNum);
        }
        if (source.UsedNum != null) {
            this.UsedNum = new Long(source.UsedNum);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new Long(source.RenewFlag);
        }
        if (source.BotCPWaf != null) {
            this.BotCPWaf = new Long(source.BotCPWaf);
        }
        if (source.BotNPWaf != null) {
            this.BotNPWaf = new Long(source.BotNPWaf);
        }
        if (source.IsBotTrial != null) {
            this.IsBotTrial = new Long(source.IsBotTrial);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceIds", this.ResourceIds);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "InquireNum", this.InquireNum);
        this.setParamSimple(map, prefix + "UsedNum", this.UsedNum);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "BotCPWaf", this.BotCPWaf);
        this.setParamSimple(map, prefix + "BotNPWaf", this.BotNPWaf);
        this.setParamSimple(map, prefix + "IsBotTrial", this.IsBotTrial);

    }
}


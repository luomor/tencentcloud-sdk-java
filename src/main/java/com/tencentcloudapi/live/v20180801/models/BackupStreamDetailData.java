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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BackupStreamDetailData extends AbstractModel {

    /**
    * 推流域名。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * 推流路径。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    *  UTC 格式，例如：2018-06-29T19:00:00Z。
注意：和北京时间相差8小时。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PublishTime")
    @Expose
    private String PublishTime;

    /**
    * 推流唯一标识。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpstreamSequence")
    @Expose
    private String UpstreamSequence;

    /**
    * 推流来源。示例：
直推流；
拉流转推(1234)；
注意：拉流转推来源括号中为拉流转推的任务 
 ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceFrom")
    @Expose
    private String SourceFrom;

    /**
    * 主备标识。
当前流为主流：1，
当前流为备流: 0。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MasterFlag")
    @Expose
    private Long MasterFlag;

    /**
     * Get 推流域名。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DomainName 推流域名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set 推流域名。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DomainName 推流域名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get 推流路径。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppName 推流路径。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set 推流路径。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppName 推流路径。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get  UTC 格式，例如：2018-06-29T19:00:00Z。
注意：和北京时间相差8小时。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PublishTime  UTC 格式，例如：2018-06-29T19:00:00Z。
注意：和北京时间相差8小时。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPublishTime() {
        return this.PublishTime;
    }

    /**
     * Set  UTC 格式，例如：2018-06-29T19:00:00Z。
注意：和北京时间相差8小时。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PublishTime  UTC 格式，例如：2018-06-29T19:00:00Z。
注意：和北京时间相差8小时。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPublishTime(String PublishTime) {
        this.PublishTime = PublishTime;
    }

    /**
     * Get 推流唯一标识。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpstreamSequence 推流唯一标识。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpstreamSequence() {
        return this.UpstreamSequence;
    }

    /**
     * Set 推流唯一标识。
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpstreamSequence 推流唯一标识。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpstreamSequence(String UpstreamSequence) {
        this.UpstreamSequence = UpstreamSequence;
    }

    /**
     * Get 推流来源。示例：
直推流；
拉流转推(1234)；
注意：拉流转推来源括号中为拉流转推的任务 
 ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceFrom 推流来源。示例：
直推流；
拉流转推(1234)；
注意：拉流转推来源括号中为拉流转推的任务 
 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSourceFrom() {
        return this.SourceFrom;
    }

    /**
     * Set 推流来源。示例：
直推流；
拉流转推(1234)；
注意：拉流转推来源括号中为拉流转推的任务 
 ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceFrom 推流来源。示例：
直推流；
拉流转推(1234)；
注意：拉流转推来源括号中为拉流转推的任务 
 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceFrom(String SourceFrom) {
        this.SourceFrom = SourceFrom;
    }

    /**
     * Get 主备标识。
当前流为主流：1，
当前流为备流: 0。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MasterFlag 主备标识。
当前流为主流：1，
当前流为备流: 0。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMasterFlag() {
        return this.MasterFlag;
    }

    /**
     * Set 主备标识。
当前流为主流：1，
当前流为备流: 0。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MasterFlag 主备标识。
当前流为主流：1，
当前流为备流: 0。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMasterFlag(Long MasterFlag) {
        this.MasterFlag = MasterFlag;
    }

    public BackupStreamDetailData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackupStreamDetailData(BackupStreamDetailData source) {
        if (source.DomainName != null) {
            this.DomainName = new String(source.DomainName);
        }
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.PublishTime != null) {
            this.PublishTime = new String(source.PublishTime);
        }
        if (source.UpstreamSequence != null) {
            this.UpstreamSequence = new String(source.UpstreamSequence);
        }
        if (source.SourceFrom != null) {
            this.SourceFrom = new String(source.SourceFrom);
        }
        if (source.MasterFlag != null) {
            this.MasterFlag = new Long(source.MasterFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "PublishTime", this.PublishTime);
        this.setParamSimple(map, prefix + "UpstreamSequence", this.UpstreamSequence);
        this.setParamSimple(map, prefix + "SourceFrom", this.SourceFrom);
        this.setParamSimple(map, prefix + "MasterFlag", this.MasterFlag);

    }
}


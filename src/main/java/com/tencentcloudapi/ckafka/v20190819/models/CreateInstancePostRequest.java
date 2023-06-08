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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateInstancePostRequest extends AbstractModel{

    /**
    * 实例名称，是一个不超过 64 个字符的字符串，必须以字母为首字符，剩余部分可以包含字母、数字和横划线(-)
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 实例内网峰值带宽。单位 MB/s。标准版需传入当前实例规格所对应的峰值带宽。注意如果创建的实例为专业版实例，峰值带宽，分区数等参数配置需要满足专业版的计费规格。
    */
    @SerializedName("BandWidth")
    @Expose
    private Long BandWidth;

    /**
    * 创建的实例默认接入点所在的 vpc 对应 vpcId。目前不支持创建基础网络实例，因此该参数必填
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网id。创建实例默认接入点所在的子网对应的子网 id
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 实例规格。当创建标准版实例时必填，创建专业版实例时不需要填写。1：入门型；2：标准型；3：进阶型；4：容量型；5：高阶型1；6：高阶性2；7：高阶型3；8：高阶型4；9 ：独占型
    */
    @SerializedName("InstanceType")
    @Expose
    private Long InstanceType;

    /**
    * 实例日志的默认最长保留时间，单位分钟。不传入该参数时默认为 1440 分钟（1天），最大30天。当 topic 显式设置消息保留时间时，以 topic 保留时间为准
    */
    @SerializedName("MsgRetentionTime")
    @Expose
    private Long MsgRetentionTime;

    /**
    * 创建实例时可以选择集群Id, 该入参表示集群Id。不指定实例所在集群则不传入该参数
    */
    @SerializedName("ClusterId")
    @Expose
    private Long ClusterId;

    /**
    * 实例版本。目前支持 "0.10.2","1.1.1","2.4.2","2.8.1"
    */
    @SerializedName("KafkaVersion")
    @Expose
    private String KafkaVersion;

    /**
    * 实例类型。"standard"：标准版，"profession"：专业版
    */
    @SerializedName("SpecificationsType")
    @Expose
    private String SpecificationsType;

    /**
    * 实例硬盘类型，"CLOUD_BASIC"：云硬盘，"CLOUD_SSD"：高速云硬盘。不传默认为 "CLOUD_BASIC"
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * 实例硬盘大小，需要满足当前实例的计费规格
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * 实例最大分区数量，需要满足当前实例的计费规格
    */
    @SerializedName("Partition")
    @Expose
    private Long Partition;

    /**
    * 实例最大 topic 数量，需要满足当前实例的计费规格
    */
    @SerializedName("TopicNum")
    @Expose
    private Long TopicNum;

    /**
    * 实例所在的可用区。当创建多可用区实例时，该参数为创建的默认接入点所在的子网
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * 当前实例是否为多可用区实例。
    */
    @SerializedName("MultiZoneFlag")
    @Expose
    private Boolean MultiZoneFlag;

    /**
    * 当实例为多可用区实例时，多可用区 id 列表。注意参数 ZoneId 对应的多可用区需要包含在该参数数组中
    */
    @SerializedName("ZoneIds")
    @Expose
    private Long [] ZoneIds;

    /**
    * 购买实例数量。非必填，默认值为 1。当传入该参数时，会创建多个 instanceName 加后缀区分的实例
    */
    @SerializedName("InstanceNum")
    @Expose
    private Long InstanceNum;

    /**
    * 公网带宽大小，单位 Mbps。默认是没有加上免费 3Mbps 带宽。例如总共需要 3Mbps 公网带宽，此处传 0；总共需要 4Mbps 公网带宽，此处传 1
    */
    @SerializedName("PublicNetworkMonthly")
    @Expose
    private Long PublicNetworkMonthly;

    /**
     * Get 实例名称，是一个不超过 64 个字符的字符串，必须以字母为首字符，剩余部分可以包含字母、数字和横划线(-) 
     * @return InstanceName 实例名称，是一个不超过 64 个字符的字符串，必须以字母为首字符，剩余部分可以包含字母、数字和横划线(-)
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称，是一个不超过 64 个字符的字符串，必须以字母为首字符，剩余部分可以包含字母、数字和横划线(-)
     * @param InstanceName 实例名称，是一个不超过 64 个字符的字符串，必须以字母为首字符，剩余部分可以包含字母、数字和横划线(-)
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 实例内网峰值带宽。单位 MB/s。标准版需传入当前实例规格所对应的峰值带宽。注意如果创建的实例为专业版实例，峰值带宽，分区数等参数配置需要满足专业版的计费规格。 
     * @return BandWidth 实例内网峰值带宽。单位 MB/s。标准版需传入当前实例规格所对应的峰值带宽。注意如果创建的实例为专业版实例，峰值带宽，分区数等参数配置需要满足专业版的计费规格。
     */
    public Long getBandWidth() {
        return this.BandWidth;
    }

    /**
     * Set 实例内网峰值带宽。单位 MB/s。标准版需传入当前实例规格所对应的峰值带宽。注意如果创建的实例为专业版实例，峰值带宽，分区数等参数配置需要满足专业版的计费规格。
     * @param BandWidth 实例内网峰值带宽。单位 MB/s。标准版需传入当前实例规格所对应的峰值带宽。注意如果创建的实例为专业版实例，峰值带宽，分区数等参数配置需要满足专业版的计费规格。
     */
    public void setBandWidth(Long BandWidth) {
        this.BandWidth = BandWidth;
    }

    /**
     * Get 创建的实例默认接入点所在的 vpc 对应 vpcId。目前不支持创建基础网络实例，因此该参数必填 
     * @return VpcId 创建的实例默认接入点所在的 vpc 对应 vpcId。目前不支持创建基础网络实例，因此该参数必填
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 创建的实例默认接入点所在的 vpc 对应 vpcId。目前不支持创建基础网络实例，因此该参数必填
     * @param VpcId 创建的实例默认接入点所在的 vpc 对应 vpcId。目前不支持创建基础网络实例，因此该参数必填
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网id。创建实例默认接入点所在的子网对应的子网 id 
     * @return SubnetId 子网id。创建实例默认接入点所在的子网对应的子网 id
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网id。创建实例默认接入点所在的子网对应的子网 id
     * @param SubnetId 子网id。创建实例默认接入点所在的子网对应的子网 id
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 实例规格。当创建标准版实例时必填，创建专业版实例时不需要填写。1：入门型；2：标准型；3：进阶型；4：容量型；5：高阶型1；6：高阶性2；7：高阶型3；8：高阶型4；9 ：独占型 
     * @return InstanceType 实例规格。当创建标准版实例时必填，创建专业版实例时不需要填写。1：入门型；2：标准型；3：进阶型；4：容量型；5：高阶型1；6：高阶性2；7：高阶型3；8：高阶型4；9 ：独占型
     */
    public Long getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 实例规格。当创建标准版实例时必填，创建专业版实例时不需要填写。1：入门型；2：标准型；3：进阶型；4：容量型；5：高阶型1；6：高阶性2；7：高阶型3；8：高阶型4；9 ：独占型
     * @param InstanceType 实例规格。当创建标准版实例时必填，创建专业版实例时不需要填写。1：入门型；2：标准型；3：进阶型；4：容量型；5：高阶型1；6：高阶性2；7：高阶型3；8：高阶型4；9 ：独占型
     */
    public void setInstanceType(Long InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 实例日志的默认最长保留时间，单位分钟。不传入该参数时默认为 1440 分钟（1天），最大30天。当 topic 显式设置消息保留时间时，以 topic 保留时间为准 
     * @return MsgRetentionTime 实例日志的默认最长保留时间，单位分钟。不传入该参数时默认为 1440 分钟（1天），最大30天。当 topic 显式设置消息保留时间时，以 topic 保留时间为准
     */
    public Long getMsgRetentionTime() {
        return this.MsgRetentionTime;
    }

    /**
     * Set 实例日志的默认最长保留时间，单位分钟。不传入该参数时默认为 1440 分钟（1天），最大30天。当 topic 显式设置消息保留时间时，以 topic 保留时间为准
     * @param MsgRetentionTime 实例日志的默认最长保留时间，单位分钟。不传入该参数时默认为 1440 分钟（1天），最大30天。当 topic 显式设置消息保留时间时，以 topic 保留时间为准
     */
    public void setMsgRetentionTime(Long MsgRetentionTime) {
        this.MsgRetentionTime = MsgRetentionTime;
    }

    /**
     * Get 创建实例时可以选择集群Id, 该入参表示集群Id。不指定实例所在集群则不传入该参数 
     * @return ClusterId 创建实例时可以选择集群Id, 该入参表示集群Id。不指定实例所在集群则不传入该参数
     */
    public Long getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 创建实例时可以选择集群Id, 该入参表示集群Id。不指定实例所在集群则不传入该参数
     * @param ClusterId 创建实例时可以选择集群Id, 该入参表示集群Id。不指定实例所在集群则不传入该参数
     */
    public void setClusterId(Long ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 实例版本。目前支持 "0.10.2","1.1.1","2.4.2","2.8.1" 
     * @return KafkaVersion 实例版本。目前支持 "0.10.2","1.1.1","2.4.2","2.8.1"
     */
    public String getKafkaVersion() {
        return this.KafkaVersion;
    }

    /**
     * Set 实例版本。目前支持 "0.10.2","1.1.1","2.4.2","2.8.1"
     * @param KafkaVersion 实例版本。目前支持 "0.10.2","1.1.1","2.4.2","2.8.1"
     */
    public void setKafkaVersion(String KafkaVersion) {
        this.KafkaVersion = KafkaVersion;
    }

    /**
     * Get 实例类型。"standard"：标准版，"profession"：专业版 
     * @return SpecificationsType 实例类型。"standard"：标准版，"profession"：专业版
     */
    public String getSpecificationsType() {
        return this.SpecificationsType;
    }

    /**
     * Set 实例类型。"standard"：标准版，"profession"：专业版
     * @param SpecificationsType 实例类型。"standard"：标准版，"profession"：专业版
     */
    public void setSpecificationsType(String SpecificationsType) {
        this.SpecificationsType = SpecificationsType;
    }

    /**
     * Get 实例硬盘类型，"CLOUD_BASIC"：云硬盘，"CLOUD_SSD"：高速云硬盘。不传默认为 "CLOUD_BASIC" 
     * @return DiskType 实例硬盘类型，"CLOUD_BASIC"：云硬盘，"CLOUD_SSD"：高速云硬盘。不传默认为 "CLOUD_BASIC"
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set 实例硬盘类型，"CLOUD_BASIC"：云硬盘，"CLOUD_SSD"：高速云硬盘。不传默认为 "CLOUD_BASIC"
     * @param DiskType 实例硬盘类型，"CLOUD_BASIC"：云硬盘，"CLOUD_SSD"：高速云硬盘。不传默认为 "CLOUD_BASIC"
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get 实例硬盘大小，需要满足当前实例的计费规格 
     * @return DiskSize 实例硬盘大小，需要满足当前实例的计费规格
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set 实例硬盘大小，需要满足当前实例的计费规格
     * @param DiskSize 实例硬盘大小，需要满足当前实例的计费规格
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get 实例最大分区数量，需要满足当前实例的计费规格 
     * @return Partition 实例最大分区数量，需要满足当前实例的计费规格
     */
    public Long getPartition() {
        return this.Partition;
    }

    /**
     * Set 实例最大分区数量，需要满足当前实例的计费规格
     * @param Partition 实例最大分区数量，需要满足当前实例的计费规格
     */
    public void setPartition(Long Partition) {
        this.Partition = Partition;
    }

    /**
     * Get 实例最大 topic 数量，需要满足当前实例的计费规格 
     * @return TopicNum 实例最大 topic 数量，需要满足当前实例的计费规格
     */
    public Long getTopicNum() {
        return this.TopicNum;
    }

    /**
     * Set 实例最大 topic 数量，需要满足当前实例的计费规格
     * @param TopicNum 实例最大 topic 数量，需要满足当前实例的计费规格
     */
    public void setTopicNum(Long TopicNum) {
        this.TopicNum = TopicNum;
    }

    /**
     * Get 实例所在的可用区。当创建多可用区实例时，该参数为创建的默认接入点所在的子网 
     * @return ZoneId 实例所在的可用区。当创建多可用区实例时，该参数为创建的默认接入点所在的子网
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 实例所在的可用区。当创建多可用区实例时，该参数为创建的默认接入点所在的子网
     * @param ZoneId 实例所在的可用区。当创建多可用区实例时，该参数为创建的默认接入点所在的子网
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 当前实例是否为多可用区实例。 
     * @return MultiZoneFlag 当前实例是否为多可用区实例。
     */
    public Boolean getMultiZoneFlag() {
        return this.MultiZoneFlag;
    }

    /**
     * Set 当前实例是否为多可用区实例。
     * @param MultiZoneFlag 当前实例是否为多可用区实例。
     */
    public void setMultiZoneFlag(Boolean MultiZoneFlag) {
        this.MultiZoneFlag = MultiZoneFlag;
    }

    /**
     * Get 当实例为多可用区实例时，多可用区 id 列表。注意参数 ZoneId 对应的多可用区需要包含在该参数数组中 
     * @return ZoneIds 当实例为多可用区实例时，多可用区 id 列表。注意参数 ZoneId 对应的多可用区需要包含在该参数数组中
     */
    public Long [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set 当实例为多可用区实例时，多可用区 id 列表。注意参数 ZoneId 对应的多可用区需要包含在该参数数组中
     * @param ZoneIds 当实例为多可用区实例时，多可用区 id 列表。注意参数 ZoneId 对应的多可用区需要包含在该参数数组中
     */
    public void setZoneIds(Long [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get 购买实例数量。非必填，默认值为 1。当传入该参数时，会创建多个 instanceName 加后缀区分的实例 
     * @return InstanceNum 购买实例数量。非必填，默认值为 1。当传入该参数时，会创建多个 instanceName 加后缀区分的实例
     */
    public Long getInstanceNum() {
        return this.InstanceNum;
    }

    /**
     * Set 购买实例数量。非必填，默认值为 1。当传入该参数时，会创建多个 instanceName 加后缀区分的实例
     * @param InstanceNum 购买实例数量。非必填，默认值为 1。当传入该参数时，会创建多个 instanceName 加后缀区分的实例
     */
    public void setInstanceNum(Long InstanceNum) {
        this.InstanceNum = InstanceNum;
    }

    /**
     * Get 公网带宽大小，单位 Mbps。默认是没有加上免费 3Mbps 带宽。例如总共需要 3Mbps 公网带宽，此处传 0；总共需要 4Mbps 公网带宽，此处传 1 
     * @return PublicNetworkMonthly 公网带宽大小，单位 Mbps。默认是没有加上免费 3Mbps 带宽。例如总共需要 3Mbps 公网带宽，此处传 0；总共需要 4Mbps 公网带宽，此处传 1
     */
    public Long getPublicNetworkMonthly() {
        return this.PublicNetworkMonthly;
    }

    /**
     * Set 公网带宽大小，单位 Mbps。默认是没有加上免费 3Mbps 带宽。例如总共需要 3Mbps 公网带宽，此处传 0；总共需要 4Mbps 公网带宽，此处传 1
     * @param PublicNetworkMonthly 公网带宽大小，单位 Mbps。默认是没有加上免费 3Mbps 带宽。例如总共需要 3Mbps 公网带宽，此处传 0；总共需要 4Mbps 公网带宽，此处传 1
     */
    public void setPublicNetworkMonthly(Long PublicNetworkMonthly) {
        this.PublicNetworkMonthly = PublicNetworkMonthly;
    }

    public CreateInstancePostRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateInstancePostRequest(CreateInstancePostRequest source) {
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.BandWidth != null) {
            this.BandWidth = new Long(source.BandWidth);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new Long(source.InstanceType);
        }
        if (source.MsgRetentionTime != null) {
            this.MsgRetentionTime = new Long(source.MsgRetentionTime);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new Long(source.ClusterId);
        }
        if (source.KafkaVersion != null) {
            this.KafkaVersion = new String(source.KafkaVersion);
        }
        if (source.SpecificationsType != null) {
            this.SpecificationsType = new String(source.SpecificationsType);
        }
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.Partition != null) {
            this.Partition = new Long(source.Partition);
        }
        if (source.TopicNum != null) {
            this.TopicNum = new Long(source.TopicNum);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.MultiZoneFlag != null) {
            this.MultiZoneFlag = new Boolean(source.MultiZoneFlag);
        }
        if (source.ZoneIds != null) {
            this.ZoneIds = new Long[source.ZoneIds.length];
            for (int i = 0; i < source.ZoneIds.length; i++) {
                this.ZoneIds[i] = new Long(source.ZoneIds[i]);
            }
        }
        if (source.InstanceNum != null) {
            this.InstanceNum = new Long(source.InstanceNum);
        }
        if (source.PublicNetworkMonthly != null) {
            this.PublicNetworkMonthly = new Long(source.PublicNetworkMonthly);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "BandWidth", this.BandWidth);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "MsgRetentionTime", this.MsgRetentionTime);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "KafkaVersion", this.KafkaVersion);
        this.setParamSimple(map, prefix + "SpecificationsType", this.SpecificationsType);
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "Partition", this.Partition);
        this.setParamSimple(map, prefix + "TopicNum", this.TopicNum);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "MultiZoneFlag", this.MultiZoneFlag);
        this.setParamArraySimple(map, prefix + "ZoneIds.", this.ZoneIds);
        this.setParamSimple(map, prefix + "InstanceNum", this.InstanceNum);
        this.setParamSimple(map, prefix + "PublicNetworkMonthly", this.PublicNetworkMonthly);

    }
}


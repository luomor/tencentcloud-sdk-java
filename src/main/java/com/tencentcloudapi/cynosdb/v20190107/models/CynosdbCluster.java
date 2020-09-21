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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CynosdbCluster extends AbstractModel{

    /**
    * 集群状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 集群名称
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 数据库版本
    */
    @SerializedName("DbVersion")
    @Expose
    private String DbVersion;

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 实例数
    */
    @SerializedName("InstanceNum")
    @Expose
    private Long InstanceNum;

    /**
    * 用户uin
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 引擎类型
    */
    @SerializedName("DbType")
    @Expose
    private String DbType;

    /**
    * 用户appid
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 集群状态描述
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * 集群创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 付费模式。0-按量计费，1-包年包月
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * 截止时间
    */
    @SerializedName("PeriodEndTime")
    @Expose
    private String PeriodEndTime;

    /**
    * 集群读写vip
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * 集群读写vport
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * 项目id
    */
    @SerializedName("ProjectID")
    @Expose
    private Long ProjectID;

    /**
    * 私有网络ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网ID
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * cynos内核版本
    */
    @SerializedName("CynosVersion")
    @Expose
    private String CynosVersion;

    /**
    * 存储容量
    */
    @SerializedName("StorageLimit")
    @Expose
    private Long StorageLimit;

    /**
    * 续费标志
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
    * 正在处理的任务
    */
    @SerializedName("ProcessingTask")
    @Expose
    private String ProcessingTask;

    /**
    * 集群的任务数组
    */
    @SerializedName("Tasks")
    @Expose
    private ObjectTask [] Tasks;

    /**
     * Get 集群状态 
     * @return Status 集群状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 集群状态
     * @param Status 集群状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 更新时间 
     * @return UpdateTime 更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 可用区 
     * @return Zone 可用区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区
     * @param Zone 可用区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 集群名称 
     * @return ClusterName 集群名称
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 集群名称
     * @param ClusterName 集群名称
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get 地域 
     * @return Region 地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域
     * @param Region 地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 数据库版本 
     * @return DbVersion 数据库版本
     */
    public String getDbVersion() {
        return this.DbVersion;
    }

    /**
     * Set 数据库版本
     * @param DbVersion 数据库版本
     */
    public void setDbVersion(String DbVersion) {
        this.DbVersion = DbVersion;
    }

    /**
     * Get 集群ID 
     * @return ClusterId 集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID
     * @param ClusterId 集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 实例数 
     * @return InstanceNum 实例数
     */
    public Long getInstanceNum() {
        return this.InstanceNum;
    }

    /**
     * Set 实例数
     * @param InstanceNum 实例数
     */
    public void setInstanceNum(Long InstanceNum) {
        this.InstanceNum = InstanceNum;
    }

    /**
     * Get 用户uin 
     * @return Uin 用户uin
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 用户uin
     * @param Uin 用户uin
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 引擎类型 
     * @return DbType 引擎类型
     */
    public String getDbType() {
        return this.DbType;
    }

    /**
     * Set 引擎类型
     * @param DbType 引擎类型
     */
    public void setDbType(String DbType) {
        this.DbType = DbType;
    }

    /**
     * Get 用户appid 
     * @return AppId 用户appid
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 用户appid
     * @param AppId 用户appid
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 集群状态描述 
     * @return StatusDesc 集群状态描述
     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * Set 集群状态描述
     * @param StatusDesc 集群状态描述
     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
    }

    /**
     * Get 集群创建时间 
     * @return CreateTime 集群创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 集群创建时间
     * @param CreateTime 集群创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 付费模式。0-按量计费，1-包年包月 
     * @return PayMode 付费模式。0-按量计费，1-包年包月
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 付费模式。0-按量计费，1-包年包月
     * @param PayMode 付费模式。0-按量计费，1-包年包月
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 截止时间 
     * @return PeriodEndTime 截止时间
     */
    public String getPeriodEndTime() {
        return this.PeriodEndTime;
    }

    /**
     * Set 截止时间
     * @param PeriodEndTime 截止时间
     */
    public void setPeriodEndTime(String PeriodEndTime) {
        this.PeriodEndTime = PeriodEndTime;
    }

    /**
     * Get 集群读写vip 
     * @return Vip 集群读写vip
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set 集群读写vip
     * @param Vip 集群读写vip
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get 集群读写vport 
     * @return Vport 集群读写vport
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set 集群读写vport
     * @param Vport 集群读写vport
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get 项目id 
     * @return ProjectID 项目id
     */
    public Long getProjectID() {
        return this.ProjectID;
    }

    /**
     * Set 项目id
     * @param ProjectID 项目id
     */
    public void setProjectID(Long ProjectID) {
        this.ProjectID = ProjectID;
    }

    /**
     * Get 私有网络ID 
     * @return VpcId 私有网络ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私有网络ID
     * @param VpcId 私有网络ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网ID 
     * @return SubnetId 子网ID
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网ID
     * @param SubnetId 子网ID
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get cynos内核版本 
     * @return CynosVersion cynos内核版本
     */
    public String getCynosVersion() {
        return this.CynosVersion;
    }

    /**
     * Set cynos内核版本
     * @param CynosVersion cynos内核版本
     */
    public void setCynosVersion(String CynosVersion) {
        this.CynosVersion = CynosVersion;
    }

    /**
     * Get 存储容量 
     * @return StorageLimit 存储容量
     */
    public Long getStorageLimit() {
        return this.StorageLimit;
    }

    /**
     * Set 存储容量
     * @param StorageLimit 存储容量
     */
    public void setStorageLimit(Long StorageLimit) {
        this.StorageLimit = StorageLimit;
    }

    /**
     * Get 续费标志 
     * @return RenewFlag 续费标志
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set 续费标志
     * @param RenewFlag 续费标志
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get 正在处理的任务 
     * @return ProcessingTask 正在处理的任务
     */
    public String getProcessingTask() {
        return this.ProcessingTask;
    }

    /**
     * Set 正在处理的任务
     * @param ProcessingTask 正在处理的任务
     */
    public void setProcessingTask(String ProcessingTask) {
        this.ProcessingTask = ProcessingTask;
    }

    /**
     * Get 集群的任务数组 
     * @return Tasks 集群的任务数组
     */
    public ObjectTask [] getTasks() {
        return this.Tasks;
    }

    /**
     * Set 集群的任务数组
     * @param Tasks 集群的任务数组
     */
    public void setTasks(ObjectTask [] Tasks) {
        this.Tasks = Tasks;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "DbVersion", this.DbVersion);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "InstanceNum", this.InstanceNum);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "DbType", this.DbType);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "StatusDesc", this.StatusDesc);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "PeriodEndTime", this.PeriodEndTime);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "ProjectID", this.ProjectID);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "CynosVersion", this.CynosVersion);
        this.setParamSimple(map, prefix + "StorageLimit", this.StorageLimit);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "ProcessingTask", this.ProcessingTask);
        this.setParamArrayObj(map, prefix + "Tasks.", this.Tasks);

    }
}

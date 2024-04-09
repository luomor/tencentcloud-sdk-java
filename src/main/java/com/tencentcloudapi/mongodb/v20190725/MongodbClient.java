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
package com.tencentcloudapi.mongodb.v20190725;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.mongodb.v20190725.models.*;

public class MongodbClient extends AbstractClient{
    private static String endpoint = "mongodb.tencentcloudapi.com";
    private static String service = "mongodb";
    private static String version = "2019-07-25";
    
    public MongodbClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public MongodbClient(Credential credential, String region, ClientProfile profile) {
        super(MongodbClient.endpoint, MongodbClient.version, credential, region, profile);
    }

    /**
     *本接口(AssignProject)用于指定云数据库实例的所属项目。

     * @param req AssignProjectRequest
     * @return AssignProjectResponse
     * @throws TencentCloudSDKException
     */
    public AssignProjectResponse AssignProject(AssignProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AssignProject", AssignProjectResponse.class);
    }

    /**
     *本接口（CreateAccountUser）用于自定义实例访问账号。
     * @param req CreateAccountUserRequest
     * @return CreateAccountUserResponse
     * @throws TencentCloudSDKException
     */
    public CreateAccountUserResponse CreateAccountUser(CreateAccountUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAccountUser", CreateAccountUserResponse.class);
    }

    /**
     *本接口（CreateBackupDBInstance）用于备份实例。
     * @param req CreateBackupDBInstanceRequest
     * @return CreateBackupDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateBackupDBInstanceResponse CreateBackupDBInstance(CreateBackupDBInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateBackupDBInstance", CreateBackupDBInstanceResponse.class);
    }

    /**
     *本接口用来创建某个备份文件的下载任务
     * @param req CreateBackupDownloadTaskRequest
     * @return CreateBackupDownloadTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateBackupDownloadTaskResponse CreateBackupDownloadTask(CreateBackupDownloadTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateBackupDownloadTask", CreateBackupDownloadTaskResponse.class);
    }

    /**
     *本接口(CreateDBInstance)用于创建包年包月的MongoDB云数据库实例。接口支持的售卖规格，可从查询云数据库的售卖规格（DescribeSpecInfo）获取。
     * @param req CreateDBInstanceRequest
     * @return CreateDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateDBInstanceResponse CreateDBInstance(CreateDBInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDBInstance", CreateDBInstanceResponse.class);
    }

    /**
     *本接口（CreateDBInstanceHour）用于创建按量计费的MongoDB云数据库实例。
     * @param req CreateDBInstanceHourRequest
     * @return CreateDBInstanceHourResponse
     * @throws TencentCloudSDKException
     */
    public CreateDBInstanceHourResponse CreateDBInstanceHour(CreateDBInstanceHourRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDBInstanceHour", CreateDBInstanceHourResponse.class);
    }

    /**
     *本接口（DeleteAccountUser）用于删除实例的自定义账号。
     * @param req DeleteAccountUserRequest
     * @return DeleteAccountUserResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAccountUserResponse DeleteAccountUser(DeleteAccountUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAccountUser", DeleteAccountUserResponse.class);
    }

    /**
     *本接口（DescribeAccountUsers）用于获取当前实例的全部账号。
     * @param req DescribeAccountUsersRequest
     * @return DescribeAccountUsersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccountUsersResponse DescribeAccountUsers(DescribeAccountUsersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccountUsers", DescribeAccountUsersResponse.class);
    }

    /**
     *查询异步任务状态接口
     * @param req DescribeAsyncRequestInfoRequest
     * @return DescribeAsyncRequestInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAsyncRequestInfoResponse DescribeAsyncRequestInfo(DescribeAsyncRequestInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAsyncRequestInfo", DescribeAsyncRequestInfoResponse.class);
    }

    /**
     *查询备份下载任务信息
     * @param req DescribeBackupDownloadTaskRequest
     * @return DescribeBackupDownloadTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupDownloadTaskResponse DescribeBackupDownloadTask(DescribeBackupDownloadTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBackupDownloadTask", DescribeBackupDownloadTaskResponse.class);
    }

    /**
     *本接口（DescribeClientConnections）用于查询实例客户端连接信息，包括连接 IP 和连接数量。
     * @param req DescribeClientConnectionsRequest
     * @return DescribeClientConnectionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClientConnectionsResponse DescribeClientConnections(DescribeClientConnectionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClientConnections", DescribeClientConnectionsResponse.class);
    }

    /**
     *本接口(DescribeCurrentOp)用于查询MongoDB云数据库实例的当前正在执行的操作。
     * @param req DescribeCurrentOpRequest
     * @return DescribeCurrentOpResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCurrentOpResponse DescribeCurrentOp(DescribeCurrentOpRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCurrentOp", DescribeCurrentOpResponse.class);
    }

    /**
     *本接口（DescribeDBBackups）用于查询实例备份列表，目前只支持查询7天内的备份记录。
     * @param req DescribeDBBackupsRequest
     * @return DescribeDBBackupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBBackupsResponse DescribeDBBackups(DescribeDBBackupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBBackups", DescribeDBBackupsResponse.class);
    }

    /**
     *本接口（DescribeDBInstanceDeal）用于获取MongoDB购买、续费及变配订单详细。
     * @param req DescribeDBInstanceDealRequest
     * @return DescribeDBInstanceDealResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBInstanceDealResponse DescribeDBInstanceDeal(DescribeDBInstanceDealRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBInstanceDeal", DescribeDBInstanceDealResponse.class);
    }

    /**
     *本接口用于查询节点的属性，包括节点所在可用区、节点名称、地址、角色、状态、主从延迟、优先级、投票权、标签等属性。
     * @param req DescribeDBInstanceNodePropertyRequest
     * @return DescribeDBInstanceNodePropertyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBInstanceNodePropertyResponse DescribeDBInstanceNodeProperty(DescribeDBInstanceNodePropertyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBInstanceNodeProperty", DescribeDBInstanceNodePropertyResponse.class);
    }

    /**
     *本接口（DescribeDBInstances）用于查询云数据库实例列表，支持通过项目ID、实例ID、实例状态等过滤条件来筛选主实例、灾备实例和只读实例信息列表。
     * @param req DescribeDBInstancesRequest
     * @return DescribeDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBInstancesResponse DescribeDBInstances(DescribeDBInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDBInstances", DescribeDBInstancesResponse.class);
    }

    /**
     *本接口（DescribeInstanceParams）用于查询当前实例可修改的参数列表。
     * @param req DescribeInstanceParamsRequest
     * @return DescribeInstanceParamsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceParamsResponse DescribeInstanceParams(DescribeInstanceParamsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInstanceParams", DescribeInstanceParamsResponse.class);
    }

    /**
     *本接口（DescribeSecurityGroup）用于查询实例绑定的安全组。
     * @param req DescribeSecurityGroupRequest
     * @return DescribeSecurityGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityGroupResponse DescribeSecurityGroup(DescribeSecurityGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecurityGroup", DescribeSecurityGroupResponse.class);
    }

    /**
     *本接口（DescribeSlowLogPatterns）用于获取数据库实例慢日志的统计信息。
     * @param req DescribeSlowLogPatternsRequest
     * @return DescribeSlowLogPatternsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSlowLogPatternsResponse DescribeSlowLogPatterns(DescribeSlowLogPatternsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSlowLogPatterns", DescribeSlowLogPatternsResponse.class);
    }

    /**
     *本接口（DescribeSlowLogs）用于获取云数据库慢日志信息。接口只支持查询最近7天内慢日志。
     * @param req DescribeSlowLogsRequest
     * @return DescribeSlowLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSlowLogsResponse DescribeSlowLogs(DescribeSlowLogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSlowLogs", DescribeSlowLogsResponse.class);
    }

    /**
     *本接口(DescribeSpecInfo)用于查询实例的售卖规格。
     * @param req DescribeSpecInfoRequest
     * @return DescribeSpecInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSpecInfoResponse DescribeSpecInfo(DescribeSpecInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSpecInfo", DescribeSpecInfoResponse.class);
    }

    /**
     *该接口用于发起按 Key 闪回任务，依据数据的闪回 Key（默认为 id）对数据进行极速回档，快速恢复业务。
**说明：按 Key 闪回于2023年09月11日正式进行公测，在此期间，该接口仅对公测用户开放。**
     * @param req FlashBackDBInstanceRequest
     * @return FlashBackDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public FlashBackDBInstanceResponse FlashBackDBInstance(FlashBackDBInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "FlashBackDBInstance", FlashBackDBInstanceResponse.class);
    }

    /**
     *在所有mongos上执行FlushRouterConfig命令
     * @param req FlushInstanceRouterConfigRequest
     * @return FlushInstanceRouterConfigResponse
     * @throws TencentCloudSDKException
     */
    public FlushInstanceRouterConfigResponse FlushInstanceRouterConfig(FlushInstanceRouterConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "FlushInstanceRouterConfig", FlushInstanceRouterConfigResponse.class);
    }

    /**
     *本接口（InquirePriceCreateDBInstances）用于创建数据库实例询价。本接口参数中必须传入region参数，否则无法通过校验。本接口仅允许针对购买限制范围内的实例配置进行询价。
     * @param req InquirePriceCreateDBInstancesRequest
     * @return InquirePriceCreateDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public InquirePriceCreateDBInstancesResponse InquirePriceCreateDBInstances(InquirePriceCreateDBInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InquirePriceCreateDBInstances", InquirePriceCreateDBInstancesResponse.class);
    }

    /**
     *本接口 (InquirePriceModifyDBInstanceSpec) 用于查询实例配置变更后的价格。
     * @param req InquirePriceModifyDBInstanceSpecRequest
     * @return InquirePriceModifyDBInstanceSpecResponse
     * @throws TencentCloudSDKException
     */
    public InquirePriceModifyDBInstanceSpecResponse InquirePriceModifyDBInstanceSpec(InquirePriceModifyDBInstanceSpecRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InquirePriceModifyDBInstanceSpec", InquirePriceModifyDBInstanceSpecResponse.class);
    }

    /**
     *本接口 (InquiryPriceRenewDBInstances) 用于续费包年包月实例询价。
     * @param req InquirePriceRenewDBInstancesRequest
     * @return InquirePriceRenewDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public InquirePriceRenewDBInstancesResponse InquirePriceRenewDBInstances(InquirePriceRenewDBInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InquirePriceRenewDBInstances", InquirePriceRenewDBInstancesResponse.class);
    }

    /**
     *本接口(IsolateDBInstance)用于隔离MongoDB云数据库按量计费实例。隔离后实例保留在回收站中，不能再写入数据。隔离一定时间后，实例会彻底删除，回收站保存时间请参考按量计费的服务条款。在隔离中的按量计费实例无法恢复，请谨慎操作。
     * @param req IsolateDBInstanceRequest
     * @return IsolateDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public IsolateDBInstanceResponse IsolateDBInstance(IsolateDBInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "IsolateDBInstance", IsolateDBInstanceResponse.class);
    }

    /**
     *本接口(KillOps)用于终止MongoDB云数据库实例上执行的特定操作。
     * @param req KillOpsRequest
     * @return KillOpsResponse
     * @throws TencentCloudSDKException
     */
    public KillOpsResponse KillOps(KillOpsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "KillOps", KillOpsResponse.class);
    }

    /**
     *本接口（ModifyDBInstanceNetworkAddress）用于修改云数据库实例的网络信息，支持基础网络切换为私有网络、私有网络切换私有网络。
     * @param req ModifyDBInstanceNetworkAddressRequest
     * @return ModifyDBInstanceNetworkAddressResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBInstanceNetworkAddressResponse ModifyDBInstanceNetworkAddress(ModifyDBInstanceNetworkAddressRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDBInstanceNetworkAddress", ModifyDBInstanceNetworkAddressResponse.class);
    }

    /**
     *本接口（ModifyDBInstanceSecurityGroup）用于修改实例绑定的安全组
     * @param req ModifyDBInstanceSecurityGroupRequest
     * @return ModifyDBInstanceSecurityGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBInstanceSecurityGroupResponse ModifyDBInstanceSecurityGroup(ModifyDBInstanceSecurityGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDBInstanceSecurityGroup", ModifyDBInstanceSecurityGroupResponse.class);
    }

    /**
     *本接口（ModifyDBInstanceSpec）用于调整MongoDB云数据库实例配置。接口支持的售卖规格，可从查询云数据库的售卖规格（DescribeSpecInfo）获取。
     * @param req ModifyDBInstanceSpecRequest
     * @return ModifyDBInstanceSpecResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBInstanceSpecResponse ModifyDBInstanceSpec(ModifyDBInstanceSpecRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDBInstanceSpec", ModifyDBInstanceSpecResponse.class);
    }

    /**
     *本接口(OfflineIsolatedDBInstance)用于立即下线隔离状态的云数据库实例。进行操作的实例状态必须为隔离状态。
     * @param req OfflineIsolatedDBInstanceRequest
     * @return OfflineIsolatedDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public OfflineIsolatedDBInstanceResponse OfflineIsolatedDBInstance(OfflineIsolatedDBInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "OfflineIsolatedDBInstance", OfflineIsolatedDBInstanceResponse.class);
    }

    /**
     *本接口(RenameInstance)用于修改云数据库实例的名称。
     * @param req RenameInstanceRequest
     * @return RenameInstanceResponse
     * @throws TencentCloudSDKException
     */
    public RenameInstanceResponse RenameInstance(RenameInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RenameInstance", RenameInstanceResponse.class);
    }

    /**
     *本接口(RenewDBInstance)用于续费云数据库实例，仅支持付费模式为包年包月的实例。按量计费实例不需要续费。
     * @param req RenewDBInstancesRequest
     * @return RenewDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public RenewDBInstancesResponse RenewDBInstances(RenewDBInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RenewDBInstances", RenewDBInstancesResponse.class);
    }

    /**
     *修改实例用户的密码
     * @param req ResetDBInstancePasswordRequest
     * @return ResetDBInstancePasswordResponse
     * @throws TencentCloudSDKException
     */
    public ResetDBInstancePasswordResponse ResetDBInstancePassword(ResetDBInstancePasswordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResetDBInstancePassword", ResetDBInstancePasswordResponse.class);
    }

    /**
     *本接口（SetAccountUserPrivilege）用于设置实例的账号权限。
     * @param req SetAccountUserPrivilegeRequest
     * @return SetAccountUserPrivilegeResponse
     * @throws TencentCloudSDKException
     */
    public SetAccountUserPrivilegeResponse SetAccountUserPrivilege(SetAccountUserPrivilegeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetAccountUserPrivilege", SetAccountUserPrivilegeResponse.class);
    }

    /**
     *本接口（SetInstanceMaintenance ） 用于设置实例维护时间窗。
     * @param req SetInstanceMaintenanceRequest
     * @return SetInstanceMaintenanceResponse
     * @throws TencentCloudSDKException
     */
    public SetInstanceMaintenanceResponse SetInstanceMaintenance(SetInstanceMaintenanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetInstanceMaintenance", SetInstanceMaintenanceResponse.class);
    }

    /**
     *本接口（TerminateDBInstances）可将包年包月实例退还隔离。
     * @param req TerminateDBInstancesRequest
     * @return TerminateDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public TerminateDBInstancesResponse TerminateDBInstances(TerminateDBInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TerminateDBInstances", TerminateDBInstancesResponse.class);
    }

}

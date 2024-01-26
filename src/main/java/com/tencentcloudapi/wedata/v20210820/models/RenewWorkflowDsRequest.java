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

public class RenewWorkflowDsRequest extends AbstractModel {

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 工作流ID
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * 工作流名称
    */
    @SerializedName("WorkflowName")
    @Expose
    private String WorkflowName;

    /**
    * 工作流描述
    */
    @SerializedName("WorkflowDesc")
    @Expose
    private String WorkflowDesc;

    /**
    * 文件夹ID
    */
    @SerializedName("FolderId")
    @Expose
    private String FolderId;

    /**
    * 责任ID，多个使用;分割
    */
    @SerializedName("OwnerId")
    @Expose
    private String OwnerId;

    /**
    * 责任人名称，多个使用;分割
    */
    @SerializedName("Owner")
    @Expose
    private String Owner;

    /**
    * SparkSql参数
    */
    @SerializedName("SparkSqlParams")
    @Expose
    private String SparkSqlParams;

    /**
     * Get 项目ID 
     * @return ProjectId 项目ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
     * @param ProjectId 项目ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 工作流ID 
     * @return WorkflowId 工作流ID
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set 工作流ID
     * @param WorkflowId 工作流ID
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get 工作流名称 
     * @return WorkflowName 工作流名称
     */
    public String getWorkflowName() {
        return this.WorkflowName;
    }

    /**
     * Set 工作流名称
     * @param WorkflowName 工作流名称
     */
    public void setWorkflowName(String WorkflowName) {
        this.WorkflowName = WorkflowName;
    }

    /**
     * Get 工作流描述 
     * @return WorkflowDesc 工作流描述
     */
    public String getWorkflowDesc() {
        return this.WorkflowDesc;
    }

    /**
     * Set 工作流描述
     * @param WorkflowDesc 工作流描述
     */
    public void setWorkflowDesc(String WorkflowDesc) {
        this.WorkflowDesc = WorkflowDesc;
    }

    /**
     * Get 文件夹ID 
     * @return FolderId 文件夹ID
     */
    public String getFolderId() {
        return this.FolderId;
    }

    /**
     * Set 文件夹ID
     * @param FolderId 文件夹ID
     */
    public void setFolderId(String FolderId) {
        this.FolderId = FolderId;
    }

    /**
     * Get 责任ID，多个使用;分割 
     * @return OwnerId 责任ID，多个使用;分割
     */
    public String getOwnerId() {
        return this.OwnerId;
    }

    /**
     * Set 责任ID，多个使用;分割
     * @param OwnerId 责任ID，多个使用;分割
     */
    public void setOwnerId(String OwnerId) {
        this.OwnerId = OwnerId;
    }

    /**
     * Get 责任人名称，多个使用;分割 
     * @return Owner 责任人名称，多个使用;分割
     */
    public String getOwner() {
        return this.Owner;
    }

    /**
     * Set 责任人名称，多个使用;分割
     * @param Owner 责任人名称，多个使用;分割
     */
    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    /**
     * Get SparkSql参数 
     * @return SparkSqlParams SparkSql参数
     */
    public String getSparkSqlParams() {
        return this.SparkSqlParams;
    }

    /**
     * Set SparkSql参数
     * @param SparkSqlParams SparkSql参数
     */
    public void setSparkSqlParams(String SparkSqlParams) {
        this.SparkSqlParams = SparkSqlParams;
    }

    public RenewWorkflowDsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RenewWorkflowDsRequest(RenewWorkflowDsRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.WorkflowName != null) {
            this.WorkflowName = new String(source.WorkflowName);
        }
        if (source.WorkflowDesc != null) {
            this.WorkflowDesc = new String(source.WorkflowDesc);
        }
        if (source.FolderId != null) {
            this.FolderId = new String(source.FolderId);
        }
        if (source.OwnerId != null) {
            this.OwnerId = new String(source.OwnerId);
        }
        if (source.Owner != null) {
            this.Owner = new String(source.Owner);
        }
        if (source.SparkSqlParams != null) {
            this.SparkSqlParams = new String(source.SparkSqlParams);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "WorkflowName", this.WorkflowName);
        this.setParamSimple(map, prefix + "WorkflowDesc", this.WorkflowDesc);
        this.setParamSimple(map, prefix + "FolderId", this.FolderId);
        this.setParamSimple(map, prefix + "OwnerId", this.OwnerId);
        this.setParamSimple(map, prefix + "Owner", this.Owner);
        this.setParamSimple(map, prefix + "SparkSqlParams", this.SparkSqlParams);

    }
}


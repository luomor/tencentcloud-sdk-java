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

public class CreateIntegrationTaskRequest extends AbstractModel {

    /**
    * 任务信息
    */
    @SerializedName("TaskInfo")
    @Expose
    private IntegrationTaskInfo TaskInfo;

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
     * Get 任务信息 
     * @return TaskInfo 任务信息
     */
    public IntegrationTaskInfo getTaskInfo() {
        return this.TaskInfo;
    }

    /**
     * Set 任务信息
     * @param TaskInfo 任务信息
     */
    public void setTaskInfo(IntegrationTaskInfo TaskInfo) {
        this.TaskInfo = TaskInfo;
    }

    /**
     * Get 项目id 
     * @return ProjectId 项目id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目id
     * @param ProjectId 项目id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    public CreateIntegrationTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateIntegrationTaskRequest(CreateIntegrationTaskRequest source) {
        if (source.TaskInfo != null) {
            this.TaskInfo = new IntegrationTaskInfo(source.TaskInfo);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "TaskInfo.", this.TaskInfo);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);

    }
}


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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OutputMappingOption extends AbstractModel {

    /**
    * 容器场景下,输出选项从实例映射到容器内的实例侧的工作空间。
BATCH_WORKSPACE: 工作空间为BATCH在实例内定义的工作空间，BATCH侧保证作业之间的隔离。（默认）
GLOBAL_WORKSPACE: 工作空间为实例操作系统空间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Workspace")
    @Expose
    private String Workspace;

    /**
     * Get 容器场景下,输出选项从实例映射到容器内的实例侧的工作空间。
BATCH_WORKSPACE: 工作空间为BATCH在实例内定义的工作空间，BATCH侧保证作业之间的隔离。（默认）
GLOBAL_WORKSPACE: 工作空间为实例操作系统空间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Workspace 容器场景下,输出选项从实例映射到容器内的实例侧的工作空间。
BATCH_WORKSPACE: 工作空间为BATCH在实例内定义的工作空间，BATCH侧保证作业之间的隔离。（默认）
GLOBAL_WORKSPACE: 工作空间为实例操作系统空间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkspace() {
        return this.Workspace;
    }

    /**
     * Set 容器场景下,输出选项从实例映射到容器内的实例侧的工作空间。
BATCH_WORKSPACE: 工作空间为BATCH在实例内定义的工作空间，BATCH侧保证作业之间的隔离。（默认）
GLOBAL_WORKSPACE: 工作空间为实例操作系统空间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Workspace 容器场景下,输出选项从实例映射到容器内的实例侧的工作空间。
BATCH_WORKSPACE: 工作空间为BATCH在实例内定义的工作空间，BATCH侧保证作业之间的隔离。（默认）
GLOBAL_WORKSPACE: 工作空间为实例操作系统空间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkspace(String Workspace) {
        this.Workspace = Workspace;
    }

    public OutputMappingOption() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OutputMappingOption(OutputMappingOption source) {
        if (source.Workspace != null) {
            this.Workspace = new String(source.Workspace);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Workspace", this.Workspace);

    }
}


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

public class DescribeDataTypesRequest extends AbstractModel{

    /**
    * 数据源类型，MYSQL|KAFKA等
    */
    @SerializedName("DatasourceType")
    @Expose
    private String DatasourceType;

    /**
    * 项目ID。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
     * Get 数据源类型，MYSQL|KAFKA等 
     * @return DatasourceType 数据源类型，MYSQL|KAFKA等
     */
    public String getDatasourceType() {
        return this.DatasourceType;
    }

    /**
     * Set 数据源类型，MYSQL|KAFKA等
     * @param DatasourceType 数据源类型，MYSQL|KAFKA等
     */
    public void setDatasourceType(String DatasourceType) {
        this.DatasourceType = DatasourceType;
    }

    /**
     * Get 项目ID。 
     * @return ProjectId 项目ID。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID。
     * @param ProjectId 项目ID。
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    public DescribeDataTypesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDataTypesRequest(DescribeDataTypesRequest source) {
        if (source.DatasourceType != null) {
            this.DatasourceType = new String(source.DatasourceType);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DatasourceType", this.DatasourceType);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);

    }
}

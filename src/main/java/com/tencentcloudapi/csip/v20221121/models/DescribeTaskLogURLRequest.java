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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTaskLogURLRequest extends AbstractModel {

    /**
    * 任务报告Id 列表
    */
    @SerializedName("ReportItemKeyList")
    @Expose
    private ReportItemKey [] ReportItemKeyList;

    /**
    * 0: 预览， 1: 下载
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
     * Get 任务报告Id 列表 
     * @return ReportItemKeyList 任务报告Id 列表
     */
    public ReportItemKey [] getReportItemKeyList() {
        return this.ReportItemKeyList;
    }

    /**
     * Set 任务报告Id 列表
     * @param ReportItemKeyList 任务报告Id 列表
     */
    public void setReportItemKeyList(ReportItemKey [] ReportItemKeyList) {
        this.ReportItemKeyList = ReportItemKeyList;
    }

    /**
     * Get 0: 预览， 1: 下载 
     * @return Type 0: 预览， 1: 下载
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 0: 预览， 1: 下载
     * @param Type 0: 预览， 1: 下载
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    public DescribeTaskLogURLRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTaskLogURLRequest(DescribeTaskLogURLRequest source) {
        if (source.ReportItemKeyList != null) {
            this.ReportItemKeyList = new ReportItemKey[source.ReportItemKeyList.length];
            for (int i = 0; i < source.ReportItemKeyList.length; i++) {
                this.ReportItemKeyList[i] = new ReportItemKey(source.ReportItemKeyList[i]);
            }
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ReportItemKeyList.", this.ReportItemKeyList);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}


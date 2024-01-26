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

public class DeleteRecordListRequest extends AbstractModel {

    /**
    * 任务提交记录Id列表
    */
    @SerializedName("RecordIds")
    @Expose
    private Long [] RecordIds;

    /**
     * Get 任务提交记录Id列表 
     * @return RecordIds 任务提交记录Id列表
     */
    public Long [] getRecordIds() {
        return this.RecordIds;
    }

    /**
     * Set 任务提交记录Id列表
     * @param RecordIds 任务提交记录Id列表
     */
    public void setRecordIds(Long [] RecordIds) {
        this.RecordIds = RecordIds;
    }

    public DeleteRecordListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteRecordListRequest(DeleteRecordListRequest source) {
        if (source.RecordIds != null) {
            this.RecordIds = new Long[source.RecordIds.length];
            for (int i = 0; i < source.RecordIds.length; i++) {
                this.RecordIds[i] = new Long(source.RecordIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "RecordIds.", this.RecordIds);

    }
}


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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteConsumerRequest extends AbstractModel {

    /**
    * 投递任务绑定的日志主题 ID
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
     * Get 投递任务绑定的日志主题 ID 
     * @return TopicId 投递任务绑定的日志主题 ID
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 投递任务绑定的日志主题 ID
     * @param TopicId 投递任务绑定的日志主题 ID
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    public DeleteConsumerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteConsumerRequest(DeleteConsumerRequest source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);

    }
}


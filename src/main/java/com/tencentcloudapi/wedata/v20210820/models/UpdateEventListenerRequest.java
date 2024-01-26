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

public class UpdateEventListenerRequest extends AbstractModel {

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 任务id
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * REST_API、KAFKA
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 事件名称
    */
    @SerializedName("EventName")
    @Expose
    private String EventName;

    /**
    * 属性信息
    */
    @SerializedName("Properties")
    @Expose
    private ParamInfoDs [] Properties;

    /**
    * 事件所属项目id
    */
    @SerializedName("EventProjectId")
    @Expose
    private String EventProjectId;

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

    /**
     * Get 任务id 
     * @return Key 任务id
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 任务id
     * @param Key 任务id
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get REST_API、KAFKA 
     * @return Type REST_API、KAFKA
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set REST_API、KAFKA
     * @param Type REST_API、KAFKA
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 事件名称 
     * @return EventName 事件名称
     */
    public String getEventName() {
        return this.EventName;
    }

    /**
     * Set 事件名称
     * @param EventName 事件名称
     */
    public void setEventName(String EventName) {
        this.EventName = EventName;
    }

    /**
     * Get 属性信息 
     * @return Properties 属性信息
     */
    public ParamInfoDs [] getProperties() {
        return this.Properties;
    }

    /**
     * Set 属性信息
     * @param Properties 属性信息
     */
    public void setProperties(ParamInfoDs [] Properties) {
        this.Properties = Properties;
    }

    /**
     * Get 事件所属项目id 
     * @return EventProjectId 事件所属项目id
     */
    public String getEventProjectId() {
        return this.EventProjectId;
    }

    /**
     * Set 事件所属项目id
     * @param EventProjectId 事件所属项目id
     */
    public void setEventProjectId(String EventProjectId) {
        this.EventProjectId = EventProjectId;
    }

    public UpdateEventListenerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateEventListenerRequest(UpdateEventListenerRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.EventName != null) {
            this.EventName = new String(source.EventName);
        }
        if (source.Properties != null) {
            this.Properties = new ParamInfoDs[source.Properties.length];
            for (int i = 0; i < source.Properties.length; i++) {
                this.Properties[i] = new ParamInfoDs(source.Properties[i]);
            }
        }
        if (source.EventProjectId != null) {
            this.EventProjectId = new String(source.EventProjectId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "EventName", this.EventName);
        this.setParamArrayObj(map, prefix + "Properties.", this.Properties);
        this.setParamSimple(map, prefix + "EventProjectId", this.EventProjectId);

    }
}


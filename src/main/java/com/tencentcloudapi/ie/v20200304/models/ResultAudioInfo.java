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
package com.tencentcloudapi.ie.v20200304.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResultAudioInfo extends AbstractModel {

    /**
    * 流在媒体文件中的流ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StreamId")
    @Expose
    private Long StreamId;

    /**
    * 流的时长，单位：毫秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
     * Get 流在媒体文件中的流ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StreamId 流在媒体文件中的流ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStreamId() {
        return this.StreamId;
    }

    /**
     * Set 流在媒体文件中的流ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param StreamId 流在媒体文件中的流ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStreamId(Long StreamId) {
        this.StreamId = StreamId;
    }

    /**
     * Get 流的时长，单位：毫秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Duration 流的时长，单位：毫秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set 流的时长，单位：毫秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param Duration 流的时长，单位：毫秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    public ResultAudioInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResultAudioInfo(ResultAudioInfo source) {
        if (source.StreamId != null) {
            this.StreamId = new Long(source.StreamId);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StreamId", this.StreamId);
        this.setParamSimple(map, prefix + "Duration", this.Duration);

    }
}


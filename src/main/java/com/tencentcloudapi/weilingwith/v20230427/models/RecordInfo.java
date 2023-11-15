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
package com.tencentcloudapi.weilingwith.v20230427.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RecordInfo extends AbstractModel {

    /**
    * 本录像片段开始时间（s）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 本录像片段结束时间（s）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 录像片段文件url
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VideoURL")
    @Expose
    private String VideoURL;

    /**
     * Get 本录像片段开始时间（s）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime 本录像片段开始时间（s）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 本录像片段开始时间（s）
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime 本录像片段开始时间（s）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 本录像片段结束时间（s）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime 本录像片段结束时间（s）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 本录像片段结束时间（s）
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime 本录像片段结束时间（s）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 录像片段文件url
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VideoURL 录像片段文件url
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVideoURL() {
        return this.VideoURL;
    }

    /**
     * Set 录像片段文件url
注意：此字段可能返回 null，表示取不到有效值。
     * @param VideoURL 录像片段文件url
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVideoURL(String VideoURL) {
        this.VideoURL = VideoURL;
    }

    public RecordInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecordInfo(RecordInfo source) {
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.VideoURL != null) {
            this.VideoURL = new String(source.VideoURL);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "VideoURL", this.VideoURL);

    }
}


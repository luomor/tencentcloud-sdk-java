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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChannelDescribeSignFaceVideoResponse extends AbstractModel {

    /**
    * 核身视频结果。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VideoData")
    @Expose
    private DetectInfoVideoData VideoData;

    /**
    * 意愿核身问答模式结果。若未使用该意愿核身功能，该字段返回值可以不处理。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IntentionQuestionResult")
    @Expose
    private IntentionQuestionResult IntentionQuestionResult;

    /**
    * 意愿核身点头确认模式的结果信息，若未使用该意愿核身功能，该字段返回值可以不处理。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IntentionActionResult")
    @Expose
    private IntentionActionResult IntentionActionResult;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 核身视频结果。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VideoData 核身视频结果。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DetectInfoVideoData getVideoData() {
        return this.VideoData;
    }

    /**
     * Set 核身视频结果。
注意：此字段可能返回 null，表示取不到有效值。
     * @param VideoData 核身视频结果。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVideoData(DetectInfoVideoData VideoData) {
        this.VideoData = VideoData;
    }

    /**
     * Get 意愿核身问答模式结果。若未使用该意愿核身功能，该字段返回值可以不处理。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IntentionQuestionResult 意愿核身问答模式结果。若未使用该意愿核身功能，该字段返回值可以不处理。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IntentionQuestionResult getIntentionQuestionResult() {
        return this.IntentionQuestionResult;
    }

    /**
     * Set 意愿核身问答模式结果。若未使用该意愿核身功能，该字段返回值可以不处理。
注意：此字段可能返回 null，表示取不到有效值。
     * @param IntentionQuestionResult 意愿核身问答模式结果。若未使用该意愿核身功能，该字段返回值可以不处理。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIntentionQuestionResult(IntentionQuestionResult IntentionQuestionResult) {
        this.IntentionQuestionResult = IntentionQuestionResult;
    }

    /**
     * Get 意愿核身点头确认模式的结果信息，若未使用该意愿核身功能，该字段返回值可以不处理。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IntentionActionResult 意愿核身点头确认模式的结果信息，若未使用该意愿核身功能，该字段返回值可以不处理。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IntentionActionResult getIntentionActionResult() {
        return this.IntentionActionResult;
    }

    /**
     * Set 意愿核身点头确认模式的结果信息，若未使用该意愿核身功能，该字段返回值可以不处理。
注意：此字段可能返回 null，表示取不到有效值。
     * @param IntentionActionResult 意愿核身点头确认模式的结果信息，若未使用该意愿核身功能，该字段返回值可以不处理。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIntentionActionResult(IntentionActionResult IntentionActionResult) {
        this.IntentionActionResult = IntentionActionResult;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public ChannelDescribeSignFaceVideoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChannelDescribeSignFaceVideoResponse(ChannelDescribeSignFaceVideoResponse source) {
        if (source.VideoData != null) {
            this.VideoData = new DetectInfoVideoData(source.VideoData);
        }
        if (source.IntentionQuestionResult != null) {
            this.IntentionQuestionResult = new IntentionQuestionResult(source.IntentionQuestionResult);
        }
        if (source.IntentionActionResult != null) {
            this.IntentionActionResult = new IntentionActionResult(source.IntentionActionResult);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "VideoData.", this.VideoData);
        this.setParamObj(map, prefix + "IntentionQuestionResult.", this.IntentionQuestionResult);
        this.setParamObj(map, prefix + "IntentionActionResult.", this.IntentionActionResult);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAdaptiveDynamicStreamingTemplateRequest extends AbstractModel {

    /**
    * 自适应转码格式，取值范围：
<li>HLS，</li>
<li>MPEG-DASH。</li>
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * 转自适应码流输出子流参数信息，最多输出10路子流。
注意：各个子流的帧率必须保持一致；如果不一致，采用第一个子流的帧率作为输出帧率。
    */
    @SerializedName("StreamInfos")
    @Expose
    private AdaptiveStreamTemplate [] StreamInfos;

    /**
    * 模板名称，长度限制：64 个字符。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 是否禁止视频低码率转高码率，取值范围：
<li>0：否，</li>
<li>1：是。</li>
默认为否。
    */
    @SerializedName("DisableHigherVideoBitrate")
    @Expose
    private Long DisableHigherVideoBitrate;

    /**
    * 是否禁止视频分辨率转高分辨率，取值范围：
<li>0：否，</li>
<li>1：是。</li>
默认为否。
    */
    @SerializedName("DisableHigherVideoResolution")
    @Expose
    private Long DisableHigherVideoResolution;

    /**
    * 模板描述信息，长度限制：256 个字符。
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 是否为纯音频，0表示视频模版，1表示纯音频模版
当值为1：
1. StreamInfos.N.RemoveVideo=1
2. StreamInfos.N.RemoveAudio=0
3. StreamInfos.N.Video.Codec=copy

当值为0：

1. StreamInfos.N.Video.Codec不能为copy
2. StreamInfos.N.Video.Fps不能为null
    */
    @SerializedName("PureAudio")
    @Expose
    private Long PureAudio;

    /**
     * Get 自适应转码格式，取值范围：
<li>HLS，</li>
<li>MPEG-DASH。</li> 
     * @return Format 自适应转码格式，取值范围：
<li>HLS，</li>
<li>MPEG-DASH。</li>
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set 自适应转码格式，取值范围：
<li>HLS，</li>
<li>MPEG-DASH。</li>
     * @param Format 自适应转码格式，取值范围：
<li>HLS，</li>
<li>MPEG-DASH。</li>
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    /**
     * Get 转自适应码流输出子流参数信息，最多输出10路子流。
注意：各个子流的帧率必须保持一致；如果不一致，采用第一个子流的帧率作为输出帧率。 
     * @return StreamInfos 转自适应码流输出子流参数信息，最多输出10路子流。
注意：各个子流的帧率必须保持一致；如果不一致，采用第一个子流的帧率作为输出帧率。
     */
    public AdaptiveStreamTemplate [] getStreamInfos() {
        return this.StreamInfos;
    }

    /**
     * Set 转自适应码流输出子流参数信息，最多输出10路子流。
注意：各个子流的帧率必须保持一致；如果不一致，采用第一个子流的帧率作为输出帧率。
     * @param StreamInfos 转自适应码流输出子流参数信息，最多输出10路子流。
注意：各个子流的帧率必须保持一致；如果不一致，采用第一个子流的帧率作为输出帧率。
     */
    public void setStreamInfos(AdaptiveStreamTemplate [] StreamInfos) {
        this.StreamInfos = StreamInfos;
    }

    /**
     * Get 模板名称，长度限制：64 个字符。 
     * @return Name 模板名称，长度限制：64 个字符。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 模板名称，长度限制：64 个字符。
     * @param Name 模板名称，长度限制：64 个字符。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 是否禁止视频低码率转高码率，取值范围：
<li>0：否，</li>
<li>1：是。</li>
默认为否。 
     * @return DisableHigherVideoBitrate 是否禁止视频低码率转高码率，取值范围：
<li>0：否，</li>
<li>1：是。</li>
默认为否。
     */
    public Long getDisableHigherVideoBitrate() {
        return this.DisableHigherVideoBitrate;
    }

    /**
     * Set 是否禁止视频低码率转高码率，取值范围：
<li>0：否，</li>
<li>1：是。</li>
默认为否。
     * @param DisableHigherVideoBitrate 是否禁止视频低码率转高码率，取值范围：
<li>0：否，</li>
<li>1：是。</li>
默认为否。
     */
    public void setDisableHigherVideoBitrate(Long DisableHigherVideoBitrate) {
        this.DisableHigherVideoBitrate = DisableHigherVideoBitrate;
    }

    /**
     * Get 是否禁止视频分辨率转高分辨率，取值范围：
<li>0：否，</li>
<li>1：是。</li>
默认为否。 
     * @return DisableHigherVideoResolution 是否禁止视频分辨率转高分辨率，取值范围：
<li>0：否，</li>
<li>1：是。</li>
默认为否。
     */
    public Long getDisableHigherVideoResolution() {
        return this.DisableHigherVideoResolution;
    }

    /**
     * Set 是否禁止视频分辨率转高分辨率，取值范围：
<li>0：否，</li>
<li>1：是。</li>
默认为否。
     * @param DisableHigherVideoResolution 是否禁止视频分辨率转高分辨率，取值范围：
<li>0：否，</li>
<li>1：是。</li>
默认为否。
     */
    public void setDisableHigherVideoResolution(Long DisableHigherVideoResolution) {
        this.DisableHigherVideoResolution = DisableHigherVideoResolution;
    }

    /**
     * Get 模板描述信息，长度限制：256 个字符。 
     * @return Comment 模板描述信息，长度限制：256 个字符。
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 模板描述信息，长度限制：256 个字符。
     * @param Comment 模板描述信息，长度限制：256 个字符。
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get 是否为纯音频，0表示视频模版，1表示纯音频模版
当值为1：
1. StreamInfos.N.RemoveVideo=1
2. StreamInfos.N.RemoveAudio=0
3. StreamInfos.N.Video.Codec=copy

当值为0：

1. StreamInfos.N.Video.Codec不能为copy
2. StreamInfos.N.Video.Fps不能为null 
     * @return PureAudio 是否为纯音频，0表示视频模版，1表示纯音频模版
当值为1：
1. StreamInfos.N.RemoveVideo=1
2. StreamInfos.N.RemoveAudio=0
3. StreamInfos.N.Video.Codec=copy

当值为0：

1. StreamInfos.N.Video.Codec不能为copy
2. StreamInfos.N.Video.Fps不能为null
     */
    public Long getPureAudio() {
        return this.PureAudio;
    }

    /**
     * Set 是否为纯音频，0表示视频模版，1表示纯音频模版
当值为1：
1. StreamInfos.N.RemoveVideo=1
2. StreamInfos.N.RemoveAudio=0
3. StreamInfos.N.Video.Codec=copy

当值为0：

1. StreamInfos.N.Video.Codec不能为copy
2. StreamInfos.N.Video.Fps不能为null
     * @param PureAudio 是否为纯音频，0表示视频模版，1表示纯音频模版
当值为1：
1. StreamInfos.N.RemoveVideo=1
2. StreamInfos.N.RemoveAudio=0
3. StreamInfos.N.Video.Codec=copy

当值为0：

1. StreamInfos.N.Video.Codec不能为copy
2. StreamInfos.N.Video.Fps不能为null
     */
    public void setPureAudio(Long PureAudio) {
        this.PureAudio = PureAudio;
    }

    public CreateAdaptiveDynamicStreamingTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAdaptiveDynamicStreamingTemplateRequest(CreateAdaptiveDynamicStreamingTemplateRequest source) {
        if (source.Format != null) {
            this.Format = new String(source.Format);
        }
        if (source.StreamInfos != null) {
            this.StreamInfos = new AdaptiveStreamTemplate[source.StreamInfos.length];
            for (int i = 0; i < source.StreamInfos.length; i++) {
                this.StreamInfos[i] = new AdaptiveStreamTemplate(source.StreamInfos[i]);
            }
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.DisableHigherVideoBitrate != null) {
            this.DisableHigherVideoBitrate = new Long(source.DisableHigherVideoBitrate);
        }
        if (source.DisableHigherVideoResolution != null) {
            this.DisableHigherVideoResolution = new Long(source.DisableHigherVideoResolution);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.PureAudio != null) {
            this.PureAudio = new Long(source.PureAudio);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Format", this.Format);
        this.setParamArrayObj(map, prefix + "StreamInfos.", this.StreamInfos);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "DisableHigherVideoBitrate", this.DisableHigherVideoBitrate);
        this.setParamSimple(map, prefix + "DisableHigherVideoResolution", this.DisableHigherVideoResolution);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "PureAudio", this.PureAudio);

    }
}


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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OutputAudioStream extends AbstractModel {

    /**
    * 音频流的编码格式，可选值：
<li>libfdk_aac：适合 mp4 文件。</li>
默认值：libfdk_aac。
    */
    @SerializedName("Codec")
    @Expose
    private String Codec;

    /**
    * 音频流的采样率，可选值：
<li>16000</li>
<li>32000</li>
<li>44100</li>
<li>48000</li>
单位：Hz。
默认值：16000。
    */
    @SerializedName("SampleRate")
    @Expose
    private Long SampleRate;

    /**
    * 音频声道数，可选值：
<li>1：单声道 。</li>
<li>2：双声道</li>
默认值：2。
    */
    @SerializedName("AudioChannel")
    @Expose
    private Long AudioChannel;

    /**
    * 音频流的码率，取值范围：0 和 [26, 256]，单位：kbps。
当取值为 0，将自动设置音频码率。
    */
    @SerializedName("Bitrate")
    @Expose
    private Long Bitrate;

    /**
     * Get 音频流的编码格式，可选值：
<li>libfdk_aac：适合 mp4 文件。</li>
默认值：libfdk_aac。 
     * @return Codec 音频流的编码格式，可选值：
<li>libfdk_aac：适合 mp4 文件。</li>
默认值：libfdk_aac。
     */
    public String getCodec() {
        return this.Codec;
    }

    /**
     * Set 音频流的编码格式，可选值：
<li>libfdk_aac：适合 mp4 文件。</li>
默认值：libfdk_aac。
     * @param Codec 音频流的编码格式，可选值：
<li>libfdk_aac：适合 mp4 文件。</li>
默认值：libfdk_aac。
     */
    public void setCodec(String Codec) {
        this.Codec = Codec;
    }

    /**
     * Get 音频流的采样率，可选值：
<li>16000</li>
<li>32000</li>
<li>44100</li>
<li>48000</li>
单位：Hz。
默认值：16000。 
     * @return SampleRate 音频流的采样率，可选值：
<li>16000</li>
<li>32000</li>
<li>44100</li>
<li>48000</li>
单位：Hz。
默认值：16000。
     */
    public Long getSampleRate() {
        return this.SampleRate;
    }

    /**
     * Set 音频流的采样率，可选值：
<li>16000</li>
<li>32000</li>
<li>44100</li>
<li>48000</li>
单位：Hz。
默认值：16000。
     * @param SampleRate 音频流的采样率，可选值：
<li>16000</li>
<li>32000</li>
<li>44100</li>
<li>48000</li>
单位：Hz。
默认值：16000。
     */
    public void setSampleRate(Long SampleRate) {
        this.SampleRate = SampleRate;
    }

    /**
     * Get 音频声道数，可选值：
<li>1：单声道 。</li>
<li>2：双声道</li>
默认值：2。 
     * @return AudioChannel 音频声道数，可选值：
<li>1：单声道 。</li>
<li>2：双声道</li>
默认值：2。
     */
    public Long getAudioChannel() {
        return this.AudioChannel;
    }

    /**
     * Set 音频声道数，可选值：
<li>1：单声道 。</li>
<li>2：双声道</li>
默认值：2。
     * @param AudioChannel 音频声道数，可选值：
<li>1：单声道 。</li>
<li>2：双声道</li>
默认值：2。
     */
    public void setAudioChannel(Long AudioChannel) {
        this.AudioChannel = AudioChannel;
    }

    /**
     * Get 音频流的码率，取值范围：0 和 [26, 256]，单位：kbps。
当取值为 0，将自动设置音频码率。 
     * @return Bitrate 音频流的码率，取值范围：0 和 [26, 256]，单位：kbps。
当取值为 0，将自动设置音频码率。
     */
    public Long getBitrate() {
        return this.Bitrate;
    }

    /**
     * Set 音频流的码率，取值范围：0 和 [26, 256]，单位：kbps。
当取值为 0，将自动设置音频码率。
     * @param Bitrate 音频流的码率，取值范围：0 和 [26, 256]，单位：kbps。
当取值为 0，将自动设置音频码率。
     */
    public void setBitrate(Long Bitrate) {
        this.Bitrate = Bitrate;
    }

    public OutputAudioStream() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OutputAudioStream(OutputAudioStream source) {
        if (source.Codec != null) {
            this.Codec = new String(source.Codec);
        }
        if (source.SampleRate != null) {
            this.SampleRate = new Long(source.SampleRate);
        }
        if (source.AudioChannel != null) {
            this.AudioChannel = new Long(source.AudioChannel);
        }
        if (source.Bitrate != null) {
            this.Bitrate = new Long(source.Bitrate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Codec", this.Codec);
        this.setParamSimple(map, prefix + "SampleRate", this.SampleRate);
        this.setParamSimple(map, prefix + "AudioChannel", this.AudioChannel);
        this.setParamSimple(map, prefix + "Bitrate", this.Bitrate);

    }
}


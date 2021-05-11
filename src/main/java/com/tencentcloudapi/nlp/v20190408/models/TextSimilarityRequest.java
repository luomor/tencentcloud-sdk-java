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
package com.tencentcloudapi.nlp.v20190408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TextSimilarityRequest extends AbstractModel{

    /**
    * 需要与目标句子计算相似度的源句子（仅支持UTF-8格式，不超过500字符）
    */
    @SerializedName("SrcText")
    @Expose
    private String SrcText;

    /**
    * 目标句子
    */
    @SerializedName("TargetText")
    @Expose
    private String [] TargetText;

    /**
     * Get 需要与目标句子计算相似度的源句子（仅支持UTF-8格式，不超过500字符） 
     * @return SrcText 需要与目标句子计算相似度的源句子（仅支持UTF-8格式，不超过500字符）
     */
    public String getSrcText() {
        return this.SrcText;
    }

    /**
     * Set 需要与目标句子计算相似度的源句子（仅支持UTF-8格式，不超过500字符）
     * @param SrcText 需要与目标句子计算相似度的源句子（仅支持UTF-8格式，不超过500字符）
     */
    public void setSrcText(String SrcText) {
        this.SrcText = SrcText;
    }

    /**
     * Get 目标句子 
     * @return TargetText 目标句子
     */
    public String [] getTargetText() {
        return this.TargetText;
    }

    /**
     * Set 目标句子
     * @param TargetText 目标句子
     */
    public void setTargetText(String [] TargetText) {
        this.TargetText = TargetText;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SrcText", this.SrcText);
        this.setParamArraySimple(map, prefix + "TargetText.", this.TargetText);

    }
}


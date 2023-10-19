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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WordItem extends AbstractModel {

    /**
    * 文本块内容
    */
    @SerializedName("DetectedText")
    @Expose
    private String DetectedText;

    /**
    * 四点坐标
    */
    @SerializedName("Coord")
    @Expose
    private Polygon Coord;

    /**
     * Get 文本块内容 
     * @return DetectedText 文本块内容
     */
    public String getDetectedText() {
        return this.DetectedText;
    }

    /**
     * Set 文本块内容
     * @param DetectedText 文本块内容
     */
    public void setDetectedText(String DetectedText) {
        this.DetectedText = DetectedText;
    }

    /**
     * Get 四点坐标 
     * @return Coord 四点坐标
     */
    public Polygon getCoord() {
        return this.Coord;
    }

    /**
     * Set 四点坐标
     * @param Coord 四点坐标
     */
    public void setCoord(Polygon Coord) {
        this.Coord = Coord;
    }

    public WordItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WordItem(WordItem source) {
        if (source.DetectedText != null) {
            this.DetectedText = new String(source.DetectedText);
        }
        if (source.Coord != null) {
            this.Coord = new Polygon(source.Coord);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DetectedText", this.DetectedText);
        this.setParamObj(map, prefix + "Coord.", this.Coord);

    }
}


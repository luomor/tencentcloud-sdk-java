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
package com.tencentcloudapi.zj.v20190121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSmsSignListRequest extends AbstractModel{

    /**
    * 商户证书
    */
    @SerializedName("License")
    @Expose
    private String License;

    /**
    * 签名ID数组
    */
    @SerializedName("SignIdSet")
    @Expose
    private Long [] SignIdSet;

    /**
    * 是否国际/港澳台短信：
0：表示国内短信。
1：表示国际/港澳台短信。
    */
    @SerializedName("International")
    @Expose
    private Long International;

    /**
     * Get 商户证书 
     * @return License 商户证书
     */
    public String getLicense() {
        return this.License;
    }

    /**
     * Set 商户证书
     * @param License 商户证书
     */
    public void setLicense(String License) {
        this.License = License;
    }

    /**
     * Get 签名ID数组 
     * @return SignIdSet 签名ID数组
     */
    public Long [] getSignIdSet() {
        return this.SignIdSet;
    }

    /**
     * Set 签名ID数组
     * @param SignIdSet 签名ID数组
     */
    public void setSignIdSet(Long [] SignIdSet) {
        this.SignIdSet = SignIdSet;
    }

    /**
     * Get 是否国际/港澳台短信：
0：表示国内短信。
1：表示国际/港澳台短信。 
     * @return International 是否国际/港澳台短信：
0：表示国内短信。
1：表示国际/港澳台短信。
     */
    public Long getInternational() {
        return this.International;
    }

    /**
     * Set 是否国际/港澳台短信：
0：表示国内短信。
1：表示国际/港澳台短信。
     * @param International 是否国际/港澳台短信：
0：表示国内短信。
1：表示国际/港澳台短信。
     */
    public void setInternational(Long International) {
        this.International = International;
    }

    public DescribeSmsSignListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSmsSignListRequest(DescribeSmsSignListRequest source) {
        if (source.License != null) {
            this.License = new String(source.License);
        }
        if (source.SignIdSet != null) {
            this.SignIdSet = new Long[source.SignIdSet.length];
            for (int i = 0; i < source.SignIdSet.length; i++) {
                this.SignIdSet[i] = new Long(source.SignIdSet[i]);
            }
        }
        if (source.International != null) {
            this.International = new Long(source.International);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "License", this.License);
        this.setParamArraySimple(map, prefix + "SignIdSet.", this.SignIdSet);
        this.setParamSimple(map, prefix + "International", this.International);

    }
}


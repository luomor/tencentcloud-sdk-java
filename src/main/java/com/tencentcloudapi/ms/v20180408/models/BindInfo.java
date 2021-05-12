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
package com.tencentcloudapi.ms.v20180408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BindInfo extends AbstractModel{

    /**
    * app的icon的url
    */
    @SerializedName("AppIconUrl")
    @Expose
    private String AppIconUrl;

    /**
    * app的名称
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * app的包名
    */
    @SerializedName("AppPkgName")
    @Expose
    private String AppPkgName;

    /**
     * Get app的icon的url 
     * @return AppIconUrl app的icon的url
     */
    public String getAppIconUrl() {
        return this.AppIconUrl;
    }

    /**
     * Set app的icon的url
     * @param AppIconUrl app的icon的url
     */
    public void setAppIconUrl(String AppIconUrl) {
        this.AppIconUrl = AppIconUrl;
    }

    /**
     * Get app的名称 
     * @return AppName app的名称
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set app的名称
     * @param AppName app的名称
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get app的包名 
     * @return AppPkgName app的包名
     */
    public String getAppPkgName() {
        return this.AppPkgName;
    }

    /**
     * Set app的包名
     * @param AppPkgName app的包名
     */
    public void setAppPkgName(String AppPkgName) {
        this.AppPkgName = AppPkgName;
    }

    public BindInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BindInfo(BindInfo source) {
        if (source.AppIconUrl != null) {
            this.AppIconUrl = new String(source.AppIconUrl);
        }
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.AppPkgName != null) {
            this.AppPkgName = new String(source.AppPkgName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppIconUrl", this.AppIconUrl);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "AppPkgName", this.AppPkgName);

    }
}


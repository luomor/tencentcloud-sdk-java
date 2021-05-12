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
package com.tencentcloudapi.iotvideo.v20191126.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteDeviceRequest extends AbstractModel{

    /**
    * 设备TID列表
    */
    @SerializedName("Tids")
    @Expose
    private String [] Tids;

    /**
     * Get 设备TID列表 
     * @return Tids 设备TID列表
     */
    public String [] getTids() {
        return this.Tids;
    }

    /**
     * Set 设备TID列表
     * @param Tids 设备TID列表
     */
    public void setTids(String [] Tids) {
        this.Tids = Tids;
    }

    public DeleteDeviceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteDeviceRequest(DeleteDeviceRequest source) {
        if (source.Tids != null) {
            this.Tids = new String[source.Tids.length];
            for (int i = 0; i < source.Tids.length; i++) {
                this.Tids[i] = new String(source.Tids[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Tids.", this.Tids);

    }
}


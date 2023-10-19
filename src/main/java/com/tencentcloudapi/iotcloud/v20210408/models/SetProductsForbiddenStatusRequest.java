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
package com.tencentcloudapi.iotcloud.v20210408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SetProductsForbiddenStatusRequest extends AbstractModel {

    /**
    * 要设置禁用状态的产品列表
    */
    @SerializedName("ProductId")
    @Expose
    private String [] ProductId;

    /**
    * 0启用，1禁用
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get 要设置禁用状态的产品列表 
     * @return ProductId 要设置禁用状态的产品列表
     */
    public String [] getProductId() {
        return this.ProductId;
    }

    /**
     * Set 要设置禁用状态的产品列表
     * @param ProductId 要设置禁用状态的产品列表
     */
    public void setProductId(String [] ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 0启用，1禁用 
     * @return Status 0启用，1禁用
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 0启用，1禁用
     * @param Status 0启用，1禁用
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public SetProductsForbiddenStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SetProductsForbiddenStatusRequest(SetProductsForbiddenStatusRequest source) {
        if (source.ProductId != null) {
            this.ProductId = new String[source.ProductId.length];
            for (int i = 0; i < source.ProductId.length; i++) {
                this.ProductId[i] = new String(source.ProductId[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ProductId.", this.ProductId);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}


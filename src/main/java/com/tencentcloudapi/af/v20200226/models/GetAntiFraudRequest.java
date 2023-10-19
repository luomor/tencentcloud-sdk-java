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
package com.tencentcloudapi.af.v20200226.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetAntiFraudRequest extends AbstractModel {

    /**
    * 默认不传，约定用原始业务
入参(二选一BusinessSecurityData 或
BusinessCryptoData)。
    */
    @SerializedName("BusinessSecurityData")
    @Expose
    private AntiFraudFilter BusinessSecurityData;

    /**
    * 默认不传，约定用密文业务
入参(二选一
BusinessSecurityData 或
BusinessCryptoData)。
    */
    @SerializedName("BusinessCryptoData")
    @Expose
    private AntiFraudCryptoFilter BusinessCryptoData;

    /**
     * Get 默认不传，约定用原始业务
入参(二选一BusinessSecurityData 或
BusinessCryptoData)。 
     * @return BusinessSecurityData 默认不传，约定用原始业务
入参(二选一BusinessSecurityData 或
BusinessCryptoData)。
     */
    public AntiFraudFilter getBusinessSecurityData() {
        return this.BusinessSecurityData;
    }

    /**
     * Set 默认不传，约定用原始业务
入参(二选一BusinessSecurityData 或
BusinessCryptoData)。
     * @param BusinessSecurityData 默认不传，约定用原始业务
入参(二选一BusinessSecurityData 或
BusinessCryptoData)。
     */
    public void setBusinessSecurityData(AntiFraudFilter BusinessSecurityData) {
        this.BusinessSecurityData = BusinessSecurityData;
    }

    /**
     * Get 默认不传，约定用密文业务
入参(二选一
BusinessSecurityData 或
BusinessCryptoData)。 
     * @return BusinessCryptoData 默认不传，约定用密文业务
入参(二选一
BusinessSecurityData 或
BusinessCryptoData)。
     */
    public AntiFraudCryptoFilter getBusinessCryptoData() {
        return this.BusinessCryptoData;
    }

    /**
     * Set 默认不传，约定用密文业务
入参(二选一
BusinessSecurityData 或
BusinessCryptoData)。
     * @param BusinessCryptoData 默认不传，约定用密文业务
入参(二选一
BusinessSecurityData 或
BusinessCryptoData)。
     */
    public void setBusinessCryptoData(AntiFraudCryptoFilter BusinessCryptoData) {
        this.BusinessCryptoData = BusinessCryptoData;
    }

    public GetAntiFraudRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetAntiFraudRequest(GetAntiFraudRequest source) {
        if (source.BusinessSecurityData != null) {
            this.BusinessSecurityData = new AntiFraudFilter(source.BusinessSecurityData);
        }
        if (source.BusinessCryptoData != null) {
            this.BusinessCryptoData = new AntiFraudCryptoFilter(source.BusinessCryptoData);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "BusinessSecurityData.", this.BusinessSecurityData);
        this.setParamObj(map, prefix + "BusinessCryptoData.", this.BusinessCryptoData);

    }
}


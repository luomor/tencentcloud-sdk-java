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
package com.tencentcloudapi.bma.v20210624.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyBPOfflineAttachmentRequest extends AbstractModel {

    /**
    * 营业执照
    */
    @SerializedName("LicenseName")
    @Expose
    private String LicenseName;

    /**
    * 授权书
    */
    @SerializedName("AuthorizationName")
    @Expose
    private String AuthorizationName;

    /**
    * 商标名称
    */
    @SerializedName("BrandName")
    @Expose
    private String BrandName;

    /**
    * 商标证明
    */
    @SerializedName("BrandCertificateName")
    @Expose
    private String BrandCertificateName;

    /**
    * 商标转让证明
    */
    @SerializedName("TransferName")
    @Expose
    private String TransferName;

    /**
     * Get 营业执照 
     * @return LicenseName 营业执照
     */
    public String getLicenseName() {
        return this.LicenseName;
    }

    /**
     * Set 营业执照
     * @param LicenseName 营业执照
     */
    public void setLicenseName(String LicenseName) {
        this.LicenseName = LicenseName;
    }

    /**
     * Get 授权书 
     * @return AuthorizationName 授权书
     */
    public String getAuthorizationName() {
        return this.AuthorizationName;
    }

    /**
     * Set 授权书
     * @param AuthorizationName 授权书
     */
    public void setAuthorizationName(String AuthorizationName) {
        this.AuthorizationName = AuthorizationName;
    }

    /**
     * Get 商标名称 
     * @return BrandName 商标名称
     */
    public String getBrandName() {
        return this.BrandName;
    }

    /**
     * Set 商标名称
     * @param BrandName 商标名称
     */
    public void setBrandName(String BrandName) {
        this.BrandName = BrandName;
    }

    /**
     * Get 商标证明 
     * @return BrandCertificateName 商标证明
     */
    public String getBrandCertificateName() {
        return this.BrandCertificateName;
    }

    /**
     * Set 商标证明
     * @param BrandCertificateName 商标证明
     */
    public void setBrandCertificateName(String BrandCertificateName) {
        this.BrandCertificateName = BrandCertificateName;
    }

    /**
     * Get 商标转让证明 
     * @return TransferName 商标转让证明
     */
    public String getTransferName() {
        return this.TransferName;
    }

    /**
     * Set 商标转让证明
     * @param TransferName 商标转让证明
     */
    public void setTransferName(String TransferName) {
        this.TransferName = TransferName;
    }

    public ModifyBPOfflineAttachmentRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyBPOfflineAttachmentRequest(ModifyBPOfflineAttachmentRequest source) {
        if (source.LicenseName != null) {
            this.LicenseName = new String(source.LicenseName);
        }
        if (source.AuthorizationName != null) {
            this.AuthorizationName = new String(source.AuthorizationName);
        }
        if (source.BrandName != null) {
            this.BrandName = new String(source.BrandName);
        }
        if (source.BrandCertificateName != null) {
            this.BrandCertificateName = new String(source.BrandCertificateName);
        }
        if (source.TransferName != null) {
            this.TransferName = new String(source.TransferName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LicenseName", this.LicenseName);
        this.setParamSimple(map, prefix + "AuthorizationName", this.AuthorizationName);
        this.setParamSimple(map, prefix + "BrandName", this.BrandName);
        this.setParamSimple(map, prefix + "BrandCertificateName", this.BrandCertificateName);
        this.setParamSimple(map, prefix + "TransferName", this.TransferName);

    }
}


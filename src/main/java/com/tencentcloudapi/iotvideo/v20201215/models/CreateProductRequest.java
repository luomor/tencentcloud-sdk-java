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
package com.tencentcloudapi.iotvideo.v20201215.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateProductRequest extends AbstractModel{

    /**
    * 产品名称
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * 产品设备类型
    */
    @SerializedName("DeviceType")
    @Expose
    private Long DeviceType;

    /**
    * 产品有效期
    */
    @SerializedName("ProductVaildYears")
    @Expose
    private Long ProductVaildYears;

    /**
    * 设备功能码
    */
    @SerializedName("Features")
    @Expose
    private String [] Features;

    /**
    * 设备操作系统
    */
    @SerializedName("ChipOs")
    @Expose
    private String ChipOs;

    /**
    * 芯片厂商id
    */
    @SerializedName("ChipManufactureId")
    @Expose
    private String ChipManufactureId;

    /**
    * 芯片id
    */
    @SerializedName("ChipId")
    @Expose
    private String ChipId;

    /**
    * 产品描述信息
    */
    @SerializedName("ProductDescription")
    @Expose
    private String ProductDescription;

    /**
    * 认证方式。2 PSK
    */
    @SerializedName("EncryptionType")
    @Expose
    private Long EncryptionType;

    /**
     * Get 产品名称 
     * @return ProductName 产品名称
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set 产品名称
     * @param ProductName 产品名称
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get 产品设备类型 
     * @return DeviceType 产品设备类型
     */
    public Long getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set 产品设备类型
     * @param DeviceType 产品设备类型
     */
    public void setDeviceType(Long DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get 产品有效期 
     * @return ProductVaildYears 产品有效期
     */
    public Long getProductVaildYears() {
        return this.ProductVaildYears;
    }

    /**
     * Set 产品有效期
     * @param ProductVaildYears 产品有效期
     */
    public void setProductVaildYears(Long ProductVaildYears) {
        this.ProductVaildYears = ProductVaildYears;
    }

    /**
     * Get 设备功能码 
     * @return Features 设备功能码
     */
    public String [] getFeatures() {
        return this.Features;
    }

    /**
     * Set 设备功能码
     * @param Features 设备功能码
     */
    public void setFeatures(String [] Features) {
        this.Features = Features;
    }

    /**
     * Get 设备操作系统 
     * @return ChipOs 设备操作系统
     */
    public String getChipOs() {
        return this.ChipOs;
    }

    /**
     * Set 设备操作系统
     * @param ChipOs 设备操作系统
     */
    public void setChipOs(String ChipOs) {
        this.ChipOs = ChipOs;
    }

    /**
     * Get 芯片厂商id 
     * @return ChipManufactureId 芯片厂商id
     */
    public String getChipManufactureId() {
        return this.ChipManufactureId;
    }

    /**
     * Set 芯片厂商id
     * @param ChipManufactureId 芯片厂商id
     */
    public void setChipManufactureId(String ChipManufactureId) {
        this.ChipManufactureId = ChipManufactureId;
    }

    /**
     * Get 芯片id 
     * @return ChipId 芯片id
     */
    public String getChipId() {
        return this.ChipId;
    }

    /**
     * Set 芯片id
     * @param ChipId 芯片id
     */
    public void setChipId(String ChipId) {
        this.ChipId = ChipId;
    }

    /**
     * Get 产品描述信息 
     * @return ProductDescription 产品描述信息
     */
    public String getProductDescription() {
        return this.ProductDescription;
    }

    /**
     * Set 产品描述信息
     * @param ProductDescription 产品描述信息
     */
    public void setProductDescription(String ProductDescription) {
        this.ProductDescription = ProductDescription;
    }

    /**
     * Get 认证方式。2 PSK 
     * @return EncryptionType 认证方式。2 PSK
     */
    public Long getEncryptionType() {
        return this.EncryptionType;
    }

    /**
     * Set 认证方式。2 PSK
     * @param EncryptionType 认证方式。2 PSK
     */
    public void setEncryptionType(Long EncryptionType) {
        this.EncryptionType = EncryptionType;
    }

    public CreateProductRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateProductRequest(CreateProductRequest source) {
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
        if (source.DeviceType != null) {
            this.DeviceType = new Long(source.DeviceType);
        }
        if (source.ProductVaildYears != null) {
            this.ProductVaildYears = new Long(source.ProductVaildYears);
        }
        if (source.Features != null) {
            this.Features = new String[source.Features.length];
            for (int i = 0; i < source.Features.length; i++) {
                this.Features[i] = new String(source.Features[i]);
            }
        }
        if (source.ChipOs != null) {
            this.ChipOs = new String(source.ChipOs);
        }
        if (source.ChipManufactureId != null) {
            this.ChipManufactureId = new String(source.ChipManufactureId);
        }
        if (source.ChipId != null) {
            this.ChipId = new String(source.ChipId);
        }
        if (source.ProductDescription != null) {
            this.ProductDescription = new String(source.ProductDescription);
        }
        if (source.EncryptionType != null) {
            this.EncryptionType = new Long(source.EncryptionType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamSimple(map, prefix + "ProductVaildYears", this.ProductVaildYears);
        this.setParamArraySimple(map, prefix + "Features.", this.Features);
        this.setParamSimple(map, prefix + "ChipOs", this.ChipOs);
        this.setParamSimple(map, prefix + "ChipManufactureId", this.ChipManufactureId);
        this.setParamSimple(map, prefix + "ChipId", this.ChipId);
        this.setParamSimple(map, prefix + "ProductDescription", this.ProductDescription);
        this.setParamSimple(map, prefix + "EncryptionType", this.EncryptionType);

    }
}


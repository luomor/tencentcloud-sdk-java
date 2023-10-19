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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VulIgnoreRegistryImage extends AbstractModel {

    /**
    * 记录ID
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * 仓库名称
    */
    @SerializedName("RegistryName")
    @Expose
    private String RegistryName;

    /**
    * 镜像版本
    */
    @SerializedName("ImageVersion")
    @Expose
    private String ImageVersion;

    /**
    * 仓库地址
    */
    @SerializedName("RegistryPath")
    @Expose
    private String RegistryPath;

    /**
    * 镜像ID
    */
    @SerializedName("ImageID")
    @Expose
    private String ImageID;

    /**
    * 漏洞PocID
    */
    @SerializedName("PocID")
    @Expose
    private String PocID;

    /**
     * Get 记录ID 
     * @return ID 记录ID
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set 记录ID
     * @param ID 记录ID
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get 仓库名称 
     * @return RegistryName 仓库名称
     */
    public String getRegistryName() {
        return this.RegistryName;
    }

    /**
     * Set 仓库名称
     * @param RegistryName 仓库名称
     */
    public void setRegistryName(String RegistryName) {
        this.RegistryName = RegistryName;
    }

    /**
     * Get 镜像版本 
     * @return ImageVersion 镜像版本
     */
    public String getImageVersion() {
        return this.ImageVersion;
    }

    /**
     * Set 镜像版本
     * @param ImageVersion 镜像版本
     */
    public void setImageVersion(String ImageVersion) {
        this.ImageVersion = ImageVersion;
    }

    /**
     * Get 仓库地址 
     * @return RegistryPath 仓库地址
     */
    public String getRegistryPath() {
        return this.RegistryPath;
    }

    /**
     * Set 仓库地址
     * @param RegistryPath 仓库地址
     */
    public void setRegistryPath(String RegistryPath) {
        this.RegistryPath = RegistryPath;
    }

    /**
     * Get 镜像ID 
     * @return ImageID 镜像ID
     */
    public String getImageID() {
        return this.ImageID;
    }

    /**
     * Set 镜像ID
     * @param ImageID 镜像ID
     */
    public void setImageID(String ImageID) {
        this.ImageID = ImageID;
    }

    /**
     * Get 漏洞PocID 
     * @return PocID 漏洞PocID
     */
    public String getPocID() {
        return this.PocID;
    }

    /**
     * Set 漏洞PocID
     * @param PocID 漏洞PocID
     */
    public void setPocID(String PocID) {
        this.PocID = PocID;
    }

    public VulIgnoreRegistryImage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulIgnoreRegistryImage(VulIgnoreRegistryImage source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.RegistryName != null) {
            this.RegistryName = new String(source.RegistryName);
        }
        if (source.ImageVersion != null) {
            this.ImageVersion = new String(source.ImageVersion);
        }
        if (source.RegistryPath != null) {
            this.RegistryPath = new String(source.RegistryPath);
        }
        if (source.ImageID != null) {
            this.ImageID = new String(source.ImageID);
        }
        if (source.PocID != null) {
            this.PocID = new String(source.PocID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "RegistryName", this.RegistryName);
        this.setParamSimple(map, prefix + "ImageVersion", this.ImageVersion);
        this.setParamSimple(map, prefix + "RegistryPath", this.RegistryPath);
        this.setParamSimple(map, prefix + "ImageID", this.ImageID);
        this.setParamSimple(map, prefix + "PocID", this.PocID);

    }
}


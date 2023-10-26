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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyOriginGroupRequest extends AbstractModel {

    /**
    * 站点ID。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 源站组ID，此参数必填。
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 源站组名称，不填保持原有配置，可输入1-200个字符，允许的字符为 a-z, A-Z, 0-9, _, - 。	
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 源站组类型，取值有：
<li>GENERAL：通用型源站组，仅支持添加 IP/域名 源站，可以被域名服务、规则引擎、四层代理、通用型负载均衡引用；</li>
<li>HTTP： HTTP专用型源站组，支持添加 IP/域名、对象存储源站，无法被四层代理引用。</li>不填保持原有配置。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 源站记录信息，不填保持原有配置。
    */
    @SerializedName("Records")
    @Expose
    private OriginRecord [] Records;

    /**
     * Get 站点ID。 
     * @return ZoneId 站点ID。
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 站点ID。
     * @param ZoneId 站点ID。
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 源站组ID，此参数必填。 
     * @return GroupId 源站组ID，此参数必填。
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 源站组ID，此参数必填。
     * @param GroupId 源站组ID，此参数必填。
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 源站组名称，不填保持原有配置，可输入1-200个字符，允许的字符为 a-z, A-Z, 0-9, _, - 。	 
     * @return Name 源站组名称，不填保持原有配置，可输入1-200个字符，允许的字符为 a-z, A-Z, 0-9, _, - 。	
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 源站组名称，不填保持原有配置，可输入1-200个字符，允许的字符为 a-z, A-Z, 0-9, _, - 。	
     * @param Name 源站组名称，不填保持原有配置，可输入1-200个字符，允许的字符为 a-z, A-Z, 0-9, _, - 。	
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 源站组类型，取值有：
<li>GENERAL：通用型源站组，仅支持添加 IP/域名 源站，可以被域名服务、规则引擎、四层代理、通用型负载均衡引用；</li>
<li>HTTP： HTTP专用型源站组，支持添加 IP/域名、对象存储源站，无法被四层代理引用。</li>不填保持原有配置。 
     * @return Type 源站组类型，取值有：
<li>GENERAL：通用型源站组，仅支持添加 IP/域名 源站，可以被域名服务、规则引擎、四层代理、通用型负载均衡引用；</li>
<li>HTTP： HTTP专用型源站组，支持添加 IP/域名、对象存储源站，无法被四层代理引用。</li>不填保持原有配置。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 源站组类型，取值有：
<li>GENERAL：通用型源站组，仅支持添加 IP/域名 源站，可以被域名服务、规则引擎、四层代理、通用型负载均衡引用；</li>
<li>HTTP： HTTP专用型源站组，支持添加 IP/域名、对象存储源站，无法被四层代理引用。</li>不填保持原有配置。
     * @param Type 源站组类型，取值有：
<li>GENERAL：通用型源站组，仅支持添加 IP/域名 源站，可以被域名服务、规则引擎、四层代理、通用型负载均衡引用；</li>
<li>HTTP： HTTP专用型源站组，支持添加 IP/域名、对象存储源站，无法被四层代理引用。</li>不填保持原有配置。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 源站记录信息，不填保持原有配置。 
     * @return Records 源站记录信息，不填保持原有配置。
     */
    public OriginRecord [] getRecords() {
        return this.Records;
    }

    /**
     * Set 源站记录信息，不填保持原有配置。
     * @param Records 源站记录信息，不填保持原有配置。
     */
    public void setRecords(OriginRecord [] Records) {
        this.Records = Records;
    }

    public ModifyOriginGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyOriginGroupRequest(ModifyOriginGroupRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Records != null) {
            this.Records = new OriginRecord[source.Records.length];
            for (int i = 0; i < source.Records.length; i++) {
                this.Records[i] = new OriginRecord(source.Records[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "Records.", this.Records);

    }
}


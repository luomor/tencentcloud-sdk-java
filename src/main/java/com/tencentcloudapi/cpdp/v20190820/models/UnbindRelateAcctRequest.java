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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UnbindRelateAcctRequest extends AbstractModel {

    /**
    * String(22)，商户号（签约客户号）
    */
    @SerializedName("MrchCode")
    @Expose
    private String MrchCode;

    /**
    * STRING(2)，功能标志（1: 解绑）
    */
    @SerializedName("FunctionFlag")
    @Expose
    private String FunctionFlag;

    /**
    * STRING(32)，交易网会员代码（若需要把一个待绑定账户关联到两个会员名下，此字段可上送两个会员的交易网代码，并且须用“|::|”(右侧)进行分隔）
    */
    @SerializedName("TranNetMemberCode")
    @Expose
    private String TranNetMemberCode;

    /**
    * STRING(50)，待解绑的提现账户的账号（提现账号）
    */
    @SerializedName("MemberAcctNo")
    @Expose
    private String MemberAcctNo;

    /**
    * STRING(1027)，保留域
    */
    @SerializedName("ReservedMsg")
    @Expose
    private String ReservedMsg;

    /**
    * STRING(12)，接入环境，默认接入沙箱环境。接入正式环境填"prod"
    */
    @SerializedName("Profile")
    @Expose
    private String Profile;

    /**
     * Get String(22)，商户号（签约客户号） 
     * @return MrchCode String(22)，商户号（签约客户号）
     */
    public String getMrchCode() {
        return this.MrchCode;
    }

    /**
     * Set String(22)，商户号（签约客户号）
     * @param MrchCode String(22)，商户号（签约客户号）
     */
    public void setMrchCode(String MrchCode) {
        this.MrchCode = MrchCode;
    }

    /**
     * Get STRING(2)，功能标志（1: 解绑） 
     * @return FunctionFlag STRING(2)，功能标志（1: 解绑）
     */
    public String getFunctionFlag() {
        return this.FunctionFlag;
    }

    /**
     * Set STRING(2)，功能标志（1: 解绑）
     * @param FunctionFlag STRING(2)，功能标志（1: 解绑）
     */
    public void setFunctionFlag(String FunctionFlag) {
        this.FunctionFlag = FunctionFlag;
    }

    /**
     * Get STRING(32)，交易网会员代码（若需要把一个待绑定账户关联到两个会员名下，此字段可上送两个会员的交易网代码，并且须用“|::|”(右侧)进行分隔） 
     * @return TranNetMemberCode STRING(32)，交易网会员代码（若需要把一个待绑定账户关联到两个会员名下，此字段可上送两个会员的交易网代码，并且须用“|::|”(右侧)进行分隔）
     */
    public String getTranNetMemberCode() {
        return this.TranNetMemberCode;
    }

    /**
     * Set STRING(32)，交易网会员代码（若需要把一个待绑定账户关联到两个会员名下，此字段可上送两个会员的交易网代码，并且须用“|::|”(右侧)进行分隔）
     * @param TranNetMemberCode STRING(32)，交易网会员代码（若需要把一个待绑定账户关联到两个会员名下，此字段可上送两个会员的交易网代码，并且须用“|::|”(右侧)进行分隔）
     */
    public void setTranNetMemberCode(String TranNetMemberCode) {
        this.TranNetMemberCode = TranNetMemberCode;
    }

    /**
     * Get STRING(50)，待解绑的提现账户的账号（提现账号） 
     * @return MemberAcctNo STRING(50)，待解绑的提现账户的账号（提现账号）
     */
    public String getMemberAcctNo() {
        return this.MemberAcctNo;
    }

    /**
     * Set STRING(50)，待解绑的提现账户的账号（提现账号）
     * @param MemberAcctNo STRING(50)，待解绑的提现账户的账号（提现账号）
     */
    public void setMemberAcctNo(String MemberAcctNo) {
        this.MemberAcctNo = MemberAcctNo;
    }

    /**
     * Get STRING(1027)，保留域 
     * @return ReservedMsg STRING(1027)，保留域
     */
    public String getReservedMsg() {
        return this.ReservedMsg;
    }

    /**
     * Set STRING(1027)，保留域
     * @param ReservedMsg STRING(1027)，保留域
     */
    public void setReservedMsg(String ReservedMsg) {
        this.ReservedMsg = ReservedMsg;
    }

    /**
     * Get STRING(12)，接入环境，默认接入沙箱环境。接入正式环境填"prod" 
     * @return Profile STRING(12)，接入环境，默认接入沙箱环境。接入正式环境填"prod"
     */
    public String getProfile() {
        return this.Profile;
    }

    /**
     * Set STRING(12)，接入环境，默认接入沙箱环境。接入正式环境填"prod"
     * @param Profile STRING(12)，接入环境，默认接入沙箱环境。接入正式环境填"prod"
     */
    public void setProfile(String Profile) {
        this.Profile = Profile;
    }

    public UnbindRelateAcctRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UnbindRelateAcctRequest(UnbindRelateAcctRequest source) {
        if (source.MrchCode != null) {
            this.MrchCode = new String(source.MrchCode);
        }
        if (source.FunctionFlag != null) {
            this.FunctionFlag = new String(source.FunctionFlag);
        }
        if (source.TranNetMemberCode != null) {
            this.TranNetMemberCode = new String(source.TranNetMemberCode);
        }
        if (source.MemberAcctNo != null) {
            this.MemberAcctNo = new String(source.MemberAcctNo);
        }
        if (source.ReservedMsg != null) {
            this.ReservedMsg = new String(source.ReservedMsg);
        }
        if (source.Profile != null) {
            this.Profile = new String(source.Profile);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MrchCode", this.MrchCode);
        this.setParamSimple(map, prefix + "FunctionFlag", this.FunctionFlag);
        this.setParamSimple(map, prefix + "TranNetMemberCode", this.TranNetMemberCode);
        this.setParamSimple(map, prefix + "MemberAcctNo", this.MemberAcctNo);
        this.setParamSimple(map, prefix + "ReservedMsg", this.ReservedMsg);
        this.setParamSimple(map, prefix + "Profile", this.Profile);

    }
}


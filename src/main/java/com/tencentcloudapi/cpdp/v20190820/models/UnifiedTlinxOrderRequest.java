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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UnifiedTlinxOrderRequest extends AbstractModel{

    /**
    * 收单系统分配的开放ID
    */
    @SerializedName("OpenId")
    @Expose
    private String OpenId;

    /**
    * 收单系统分配的密钥
    */
    @SerializedName("OpenKey")
    @Expose
    private String OpenKey;

    /**
    * 开发者流水号
    */
    @SerializedName("DeveloperNo")
    @Expose
    private String DeveloperNo;

    /**
    * 支付标签
    */
    @SerializedName("PayTag")
    @Expose
    private String PayTag;

    /**
    * 实际交易金额（以分为单位，没有小数点）
    */
    @SerializedName("TradeAmount")
    @Expose
    private String TradeAmount;

    /**
    * 订单标记，订单附加数据
    */
    @SerializedName("Tag")
    @Expose
    private String Tag;

    /**
    * 交易结果异步通知url地址
    */
    @SerializedName("NotifyUrl")
    @Expose
    private String NotifyUrl;

    /**
    * 付款方式名称(当PayTag为Diy时，PayName不能为空)
    */
    @SerializedName("PayName")
    @Expose
    private String PayName;

    /**
    * 订单名称（描述）
    */
    @SerializedName("OrderName")
    @Expose
    private String OrderName;

    /**
    * 原始交易金额（以分为单位，没有小数点）
    */
    @SerializedName("OriginalAmount")
    @Expose
    private String OriginalAmount;

    /**
    * 折扣金额（以分为单位，没有小数点）
    */
    @SerializedName("DiscountAmount")
    @Expose
    private String DiscountAmount;

    /**
    * 抹零金额（以分为单位，没有小数点）
    */
    @SerializedName("IgnoreAmount")
    @Expose
    private String IgnoreAmount;

    /**
    * 交易帐号（银行卡号）
    */
    @SerializedName("TradeAccount")
    @Expose
    private String TradeAccount;

    /**
    * 交易号（收单机构交易号）
    */
    @SerializedName("TradeNo")
    @Expose
    private String TradeNo;

    /**
    * 收单机构原始交易报文，请转换为json
    */
    @SerializedName("TradeResult")
    @Expose
    private String TradeResult;

    /**
    * 订单备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 条码支付的授权码（条码抢扫手机扫到的一串数字）
    */
    @SerializedName("AuthCode")
    @Expose
    private String AuthCode;

    /**
    * 公众号支付时，支付成功后跳转url地址
    */
    @SerializedName("JumpUrl")
    @Expose
    private String JumpUrl;

    /**
    * 沙箱环境填sandbox，正式环境不填
    */
    @SerializedName("Profile")
    @Expose
    private String Profile;

    /**
     * Get 收单系统分配的开放ID 
     * @return OpenId 收单系统分配的开放ID
     */
    public String getOpenId() {
        return this.OpenId;
    }

    /**
     * Set 收单系统分配的开放ID
     * @param OpenId 收单系统分配的开放ID
     */
    public void setOpenId(String OpenId) {
        this.OpenId = OpenId;
    }

    /**
     * Get 收单系统分配的密钥 
     * @return OpenKey 收单系统分配的密钥
     */
    public String getOpenKey() {
        return this.OpenKey;
    }

    /**
     * Set 收单系统分配的密钥
     * @param OpenKey 收单系统分配的密钥
     */
    public void setOpenKey(String OpenKey) {
        this.OpenKey = OpenKey;
    }

    /**
     * Get 开发者流水号 
     * @return DeveloperNo 开发者流水号
     */
    public String getDeveloperNo() {
        return this.DeveloperNo;
    }

    /**
     * Set 开发者流水号
     * @param DeveloperNo 开发者流水号
     */
    public void setDeveloperNo(String DeveloperNo) {
        this.DeveloperNo = DeveloperNo;
    }

    /**
     * Get 支付标签 
     * @return PayTag 支付标签
     */
    public String getPayTag() {
        return this.PayTag;
    }

    /**
     * Set 支付标签
     * @param PayTag 支付标签
     */
    public void setPayTag(String PayTag) {
        this.PayTag = PayTag;
    }

    /**
     * Get 实际交易金额（以分为单位，没有小数点） 
     * @return TradeAmount 实际交易金额（以分为单位，没有小数点）
     */
    public String getTradeAmount() {
        return this.TradeAmount;
    }

    /**
     * Set 实际交易金额（以分为单位，没有小数点）
     * @param TradeAmount 实际交易金额（以分为单位，没有小数点）
     */
    public void setTradeAmount(String TradeAmount) {
        this.TradeAmount = TradeAmount;
    }

    /**
     * Get 订单标记，订单附加数据 
     * @return Tag 订单标记，订单附加数据
     */
    public String getTag() {
        return this.Tag;
    }

    /**
     * Set 订单标记，订单附加数据
     * @param Tag 订单标记，订单附加数据
     */
    public void setTag(String Tag) {
        this.Tag = Tag;
    }

    /**
     * Get 交易结果异步通知url地址 
     * @return NotifyUrl 交易结果异步通知url地址
     */
    public String getNotifyUrl() {
        return this.NotifyUrl;
    }

    /**
     * Set 交易结果异步通知url地址
     * @param NotifyUrl 交易结果异步通知url地址
     */
    public void setNotifyUrl(String NotifyUrl) {
        this.NotifyUrl = NotifyUrl;
    }

    /**
     * Get 付款方式名称(当PayTag为Diy时，PayName不能为空) 
     * @return PayName 付款方式名称(当PayTag为Diy时，PayName不能为空)
     */
    public String getPayName() {
        return this.PayName;
    }

    /**
     * Set 付款方式名称(当PayTag为Diy时，PayName不能为空)
     * @param PayName 付款方式名称(当PayTag为Diy时，PayName不能为空)
     */
    public void setPayName(String PayName) {
        this.PayName = PayName;
    }

    /**
     * Get 订单名称（描述） 
     * @return OrderName 订单名称（描述）
     */
    public String getOrderName() {
        return this.OrderName;
    }

    /**
     * Set 订单名称（描述）
     * @param OrderName 订单名称（描述）
     */
    public void setOrderName(String OrderName) {
        this.OrderName = OrderName;
    }

    /**
     * Get 原始交易金额（以分为单位，没有小数点） 
     * @return OriginalAmount 原始交易金额（以分为单位，没有小数点）
     */
    public String getOriginalAmount() {
        return this.OriginalAmount;
    }

    /**
     * Set 原始交易金额（以分为单位，没有小数点）
     * @param OriginalAmount 原始交易金额（以分为单位，没有小数点）
     */
    public void setOriginalAmount(String OriginalAmount) {
        this.OriginalAmount = OriginalAmount;
    }

    /**
     * Get 折扣金额（以分为单位，没有小数点） 
     * @return DiscountAmount 折扣金额（以分为单位，没有小数点）
     */
    public String getDiscountAmount() {
        return this.DiscountAmount;
    }

    /**
     * Set 折扣金额（以分为单位，没有小数点）
     * @param DiscountAmount 折扣金额（以分为单位，没有小数点）
     */
    public void setDiscountAmount(String DiscountAmount) {
        this.DiscountAmount = DiscountAmount;
    }

    /**
     * Get 抹零金额（以分为单位，没有小数点） 
     * @return IgnoreAmount 抹零金额（以分为单位，没有小数点）
     */
    public String getIgnoreAmount() {
        return this.IgnoreAmount;
    }

    /**
     * Set 抹零金额（以分为单位，没有小数点）
     * @param IgnoreAmount 抹零金额（以分为单位，没有小数点）
     */
    public void setIgnoreAmount(String IgnoreAmount) {
        this.IgnoreAmount = IgnoreAmount;
    }

    /**
     * Get 交易帐号（银行卡号） 
     * @return TradeAccount 交易帐号（银行卡号）
     */
    public String getTradeAccount() {
        return this.TradeAccount;
    }

    /**
     * Set 交易帐号（银行卡号）
     * @param TradeAccount 交易帐号（银行卡号）
     */
    public void setTradeAccount(String TradeAccount) {
        this.TradeAccount = TradeAccount;
    }

    /**
     * Get 交易号（收单机构交易号） 
     * @return TradeNo 交易号（收单机构交易号）
     */
    public String getTradeNo() {
        return this.TradeNo;
    }

    /**
     * Set 交易号（收单机构交易号）
     * @param TradeNo 交易号（收单机构交易号）
     */
    public void setTradeNo(String TradeNo) {
        this.TradeNo = TradeNo;
    }

    /**
     * Get 收单机构原始交易报文，请转换为json 
     * @return TradeResult 收单机构原始交易报文，请转换为json
     */
    public String getTradeResult() {
        return this.TradeResult;
    }

    /**
     * Set 收单机构原始交易报文，请转换为json
     * @param TradeResult 收单机构原始交易报文，请转换为json
     */
    public void setTradeResult(String TradeResult) {
        this.TradeResult = TradeResult;
    }

    /**
     * Get 订单备注 
     * @return Remark 订单备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 订单备注
     * @param Remark 订单备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 条码支付的授权码（条码抢扫手机扫到的一串数字） 
     * @return AuthCode 条码支付的授权码（条码抢扫手机扫到的一串数字）
     */
    public String getAuthCode() {
        return this.AuthCode;
    }

    /**
     * Set 条码支付的授权码（条码抢扫手机扫到的一串数字）
     * @param AuthCode 条码支付的授权码（条码抢扫手机扫到的一串数字）
     */
    public void setAuthCode(String AuthCode) {
        this.AuthCode = AuthCode;
    }

    /**
     * Get 公众号支付时，支付成功后跳转url地址 
     * @return JumpUrl 公众号支付时，支付成功后跳转url地址
     */
    public String getJumpUrl() {
        return this.JumpUrl;
    }

    /**
     * Set 公众号支付时，支付成功后跳转url地址
     * @param JumpUrl 公众号支付时，支付成功后跳转url地址
     */
    public void setJumpUrl(String JumpUrl) {
        this.JumpUrl = JumpUrl;
    }

    /**
     * Get 沙箱环境填sandbox，正式环境不填 
     * @return Profile 沙箱环境填sandbox，正式环境不填
     */
    public String getProfile() {
        return this.Profile;
    }

    /**
     * Set 沙箱环境填sandbox，正式环境不填
     * @param Profile 沙箱环境填sandbox，正式环境不填
     */
    public void setProfile(String Profile) {
        this.Profile = Profile;
    }

    public UnifiedTlinxOrderRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UnifiedTlinxOrderRequest(UnifiedTlinxOrderRequest source) {
        if (source.OpenId != null) {
            this.OpenId = new String(source.OpenId);
        }
        if (source.OpenKey != null) {
            this.OpenKey = new String(source.OpenKey);
        }
        if (source.DeveloperNo != null) {
            this.DeveloperNo = new String(source.DeveloperNo);
        }
        if (source.PayTag != null) {
            this.PayTag = new String(source.PayTag);
        }
        if (source.TradeAmount != null) {
            this.TradeAmount = new String(source.TradeAmount);
        }
        if (source.Tag != null) {
            this.Tag = new String(source.Tag);
        }
        if (source.NotifyUrl != null) {
            this.NotifyUrl = new String(source.NotifyUrl);
        }
        if (source.PayName != null) {
            this.PayName = new String(source.PayName);
        }
        if (source.OrderName != null) {
            this.OrderName = new String(source.OrderName);
        }
        if (source.OriginalAmount != null) {
            this.OriginalAmount = new String(source.OriginalAmount);
        }
        if (source.DiscountAmount != null) {
            this.DiscountAmount = new String(source.DiscountAmount);
        }
        if (source.IgnoreAmount != null) {
            this.IgnoreAmount = new String(source.IgnoreAmount);
        }
        if (source.TradeAccount != null) {
            this.TradeAccount = new String(source.TradeAccount);
        }
        if (source.TradeNo != null) {
            this.TradeNo = new String(source.TradeNo);
        }
        if (source.TradeResult != null) {
            this.TradeResult = new String(source.TradeResult);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.AuthCode != null) {
            this.AuthCode = new String(source.AuthCode);
        }
        if (source.JumpUrl != null) {
            this.JumpUrl = new String(source.JumpUrl);
        }
        if (source.Profile != null) {
            this.Profile = new String(source.Profile);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OpenId", this.OpenId);
        this.setParamSimple(map, prefix + "OpenKey", this.OpenKey);
        this.setParamSimple(map, prefix + "DeveloperNo", this.DeveloperNo);
        this.setParamSimple(map, prefix + "PayTag", this.PayTag);
        this.setParamSimple(map, prefix + "TradeAmount", this.TradeAmount);
        this.setParamSimple(map, prefix + "Tag", this.Tag);
        this.setParamSimple(map, prefix + "NotifyUrl", this.NotifyUrl);
        this.setParamSimple(map, prefix + "PayName", this.PayName);
        this.setParamSimple(map, prefix + "OrderName", this.OrderName);
        this.setParamSimple(map, prefix + "OriginalAmount", this.OriginalAmount);
        this.setParamSimple(map, prefix + "DiscountAmount", this.DiscountAmount);
        this.setParamSimple(map, prefix + "IgnoreAmount", this.IgnoreAmount);
        this.setParamSimple(map, prefix + "TradeAccount", this.TradeAccount);
        this.setParamSimple(map, prefix + "TradeNo", this.TradeNo);
        this.setParamSimple(map, prefix + "TradeResult", this.TradeResult);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "AuthCode", this.AuthCode);
        this.setParamSimple(map, prefix + "JumpUrl", this.JumpUrl);
        this.setParamSimple(map, prefix + "Profile", this.Profile);

    }
}


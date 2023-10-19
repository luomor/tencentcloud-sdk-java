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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateFlowSignReviewRequest extends AbstractModel {

    /**
    * 执行本接口操作的员工信息。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * 合同流程ID，为32位字符串。
建议开发者妥善保存此流程ID，以便于顺利进行后续操作。
可登录腾讯电子签控制台，在 "合同"->"合同中心" 中查看某个合同的FlowId(在页面中展示为合同ID)。
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
    * 企业审核结果
<ul><li>PASS: 通过</li> 
<li>REJECT: 拒绝</li></ul>
    */
    @SerializedName("ReviewType")
    @Expose
    private String ReviewType;

    /**
    * 审核结果原因，
字符串长度不超过200
当ReviewType 是拒绝（REJECT） 时此字段必填。

    */
    @SerializedName("ReviewMessage")
    @Expose
    private String ReviewMessage;

    /**
    * 代理相关应用信息，如集团主企业代子企业操作的场景中ProxyOrganizationId必填
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * 审核签署节点人标识，
用来标识审核的签署方。
如果签署审核节点是个人， 此参数必填。
    */
    @SerializedName("RecipientId")
    @Expose
    private String RecipientId;

    /**
    * 操作类型：（接口通过该字段区分不同的操作类型）

<ul><li>SignReview: 签署审核（默认）</li>
<li>CreateReview: 创建审核</li></ul>

如果审核节点是个人，则操作类型只能为SignReview。
    */
    @SerializedName("OperateType")
    @Expose
    private String OperateType;

    /**
     * Get 执行本接口操作的员工信息。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。` 
     * @return Operator 执行本接口操作的员工信息。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 执行本接口操作的员工信息。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
     * @param Operator 执行本接口操作的员工信息。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 合同流程ID，为32位字符串。
建议开发者妥善保存此流程ID，以便于顺利进行后续操作。
可登录腾讯电子签控制台，在 "合同"->"合同中心" 中查看某个合同的FlowId(在页面中展示为合同ID)。 
     * @return FlowId 合同流程ID，为32位字符串。
建议开发者妥善保存此流程ID，以便于顺利进行后续操作。
可登录腾讯电子签控制台，在 "合同"->"合同中心" 中查看某个合同的FlowId(在页面中展示为合同ID)。
     */
    public String getFlowId() {
        return this.FlowId;
    }

    /**
     * Set 合同流程ID，为32位字符串。
建议开发者妥善保存此流程ID，以便于顺利进行后续操作。
可登录腾讯电子签控制台，在 "合同"->"合同中心" 中查看某个合同的FlowId(在页面中展示为合同ID)。
     * @param FlowId 合同流程ID，为32位字符串。
建议开发者妥善保存此流程ID，以便于顺利进行后续操作。
可登录腾讯电子签控制台，在 "合同"->"合同中心" 中查看某个合同的FlowId(在页面中展示为合同ID)。
     */
    public void setFlowId(String FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get 企业审核结果
<ul><li>PASS: 通过</li> 
<li>REJECT: 拒绝</li></ul> 
     * @return ReviewType 企业审核结果
<ul><li>PASS: 通过</li> 
<li>REJECT: 拒绝</li></ul>
     */
    public String getReviewType() {
        return this.ReviewType;
    }

    /**
     * Set 企业审核结果
<ul><li>PASS: 通过</li> 
<li>REJECT: 拒绝</li></ul>
     * @param ReviewType 企业审核结果
<ul><li>PASS: 通过</li> 
<li>REJECT: 拒绝</li></ul>
     */
    public void setReviewType(String ReviewType) {
        this.ReviewType = ReviewType;
    }

    /**
     * Get 审核结果原因，
字符串长度不超过200
当ReviewType 是拒绝（REJECT） 时此字段必填。
 
     * @return ReviewMessage 审核结果原因，
字符串长度不超过200
当ReviewType 是拒绝（REJECT） 时此字段必填。

     */
    public String getReviewMessage() {
        return this.ReviewMessage;
    }

    /**
     * Set 审核结果原因，
字符串长度不超过200
当ReviewType 是拒绝（REJECT） 时此字段必填。

     * @param ReviewMessage 审核结果原因，
字符串长度不超过200
当ReviewType 是拒绝（REJECT） 时此字段必填。

     */
    public void setReviewMessage(String ReviewMessage) {
        this.ReviewMessage = ReviewMessage;
    }

    /**
     * Get 代理相关应用信息，如集团主企业代子企业操作的场景中ProxyOrganizationId必填 
     * @return Agent 代理相关应用信息，如集团主企业代子企业操作的场景中ProxyOrganizationId必填
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set 代理相关应用信息，如集团主企业代子企业操作的场景中ProxyOrganizationId必填
     * @param Agent 代理相关应用信息，如集团主企业代子企业操作的场景中ProxyOrganizationId必填
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get 审核签署节点人标识，
用来标识审核的签署方。
如果签署审核节点是个人， 此参数必填。 
     * @return RecipientId 审核签署节点人标识，
用来标识审核的签署方。
如果签署审核节点是个人， 此参数必填。
     */
    public String getRecipientId() {
        return this.RecipientId;
    }

    /**
     * Set 审核签署节点人标识，
用来标识审核的签署方。
如果签署审核节点是个人， 此参数必填。
     * @param RecipientId 审核签署节点人标识，
用来标识审核的签署方。
如果签署审核节点是个人， 此参数必填。
     */
    public void setRecipientId(String RecipientId) {
        this.RecipientId = RecipientId;
    }

    /**
     * Get 操作类型：（接口通过该字段区分不同的操作类型）

<ul><li>SignReview: 签署审核（默认）</li>
<li>CreateReview: 创建审核</li></ul>

如果审核节点是个人，则操作类型只能为SignReview。 
     * @return OperateType 操作类型：（接口通过该字段区分不同的操作类型）

<ul><li>SignReview: 签署审核（默认）</li>
<li>CreateReview: 创建审核</li></ul>

如果审核节点是个人，则操作类型只能为SignReview。
     */
    public String getOperateType() {
        return this.OperateType;
    }

    /**
     * Set 操作类型：（接口通过该字段区分不同的操作类型）

<ul><li>SignReview: 签署审核（默认）</li>
<li>CreateReview: 创建审核</li></ul>

如果审核节点是个人，则操作类型只能为SignReview。
     * @param OperateType 操作类型：（接口通过该字段区分不同的操作类型）

<ul><li>SignReview: 签署审核（默认）</li>
<li>CreateReview: 创建审核</li></ul>

如果审核节点是个人，则操作类型只能为SignReview。
     */
    public void setOperateType(String OperateType) {
        this.OperateType = OperateType;
    }

    public CreateFlowSignReviewRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateFlowSignReviewRequest(CreateFlowSignReviewRequest source) {
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.FlowId != null) {
            this.FlowId = new String(source.FlowId);
        }
        if (source.ReviewType != null) {
            this.ReviewType = new String(source.ReviewType);
        }
        if (source.ReviewMessage != null) {
            this.ReviewMessage = new String(source.ReviewMessage);
        }
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.RecipientId != null) {
            this.RecipientId = new String(source.RecipientId);
        }
        if (source.OperateType != null) {
            this.OperateType = new String(source.OperateType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamSimple(map, prefix + "ReviewType", this.ReviewType);
        this.setParamSimple(map, prefix + "ReviewMessage", this.ReviewMessage);
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamSimple(map, prefix + "RecipientId", this.RecipientId);
        this.setParamSimple(map, prefix + "OperateType", this.OperateType);

    }
}


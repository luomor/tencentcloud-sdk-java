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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChannelBatchCancelFlowsRequest extends AbstractModel {

    /**
    * 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。

此接口下面信息必填。
<ul>
<li>渠道应用标识:  Agent.AppId</li>
<li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li>
<li>第三方平台子客企业中的员工标识: Agent. ProxyOperator.OpenId</li>
</ul>
第三方平台子客企业和员工必须已经经过实名认证
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * 要撤销的合同流程ID列表，最多100个，超过100不处理
    */
    @SerializedName("FlowIds")
    @Expose
    private String [] FlowIds;

    /**
    * 撤回原因，长度不能超过200，只能由中文、字母、数字和下划线组成。

备注:`如果不传递撤回原因，那么默认撤回原因是 "自动撤销（通过接口实现）"`
    */
    @SerializedName("CancelMessage")
    @Expose
    private String CancelMessage;

    /**
    * 撤销理由自定义格式,  会展示在合同预览的界面中,  可以选择下面的组合方式：

**0** : 默认格式,  合同封面页面会展示为: 发起方-企业名称-撤销的经办人名字以**CancelMessage**的理由撤销当前合同
**1** :  合同封面页面会展示为:  发起方以**CancelMessage**的理由撤销当前合同
**2** : 保留企业名称,  合同封面页面会展示为:  发起方-企业名称以**CancelMessage**的理由撤销当前合同
**3** : 保留企业名称+经办人名字,  合同封面页面会展示为: 发起方-企业名称-撤销的经办人名字以**CancelMessage**的理由撤销当前合同

注: `CancelMessage为撤销当前合同的理由`

![image](https://qcloudimg.tencent-cloud.cn/raw/f16cf37dbb3a09d6569877f093b92204/channel_ChannelCancelFlow.png)


    */
    @SerializedName("CancelMessageFormat")
    @Expose
    private Long CancelMessageFormat;

    /**
    * 暂未开放
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
     * Get 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。

此接口下面信息必填。
<ul>
<li>渠道应用标识:  Agent.AppId</li>
<li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li>
<li>第三方平台子客企业中的员工标识: Agent. ProxyOperator.OpenId</li>
</ul>
第三方平台子客企业和员工必须已经经过实名认证 
     * @return Agent 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。

此接口下面信息必填。
<ul>
<li>渠道应用标识:  Agent.AppId</li>
<li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li>
<li>第三方平台子客企业中的员工标识: Agent. ProxyOperator.OpenId</li>
</ul>
第三方平台子客企业和员工必须已经经过实名认证
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。

此接口下面信息必填。
<ul>
<li>渠道应用标识:  Agent.AppId</li>
<li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li>
<li>第三方平台子客企业中的员工标识: Agent. ProxyOperator.OpenId</li>
</ul>
第三方平台子客企业和员工必须已经经过实名认证
     * @param Agent 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。

此接口下面信息必填。
<ul>
<li>渠道应用标识:  Agent.AppId</li>
<li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li>
<li>第三方平台子客企业中的员工标识: Agent. ProxyOperator.OpenId</li>
</ul>
第三方平台子客企业和员工必须已经经过实名认证
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get 要撤销的合同流程ID列表，最多100个，超过100不处理 
     * @return FlowIds 要撤销的合同流程ID列表，最多100个，超过100不处理
     */
    public String [] getFlowIds() {
        return this.FlowIds;
    }

    /**
     * Set 要撤销的合同流程ID列表，最多100个，超过100不处理
     * @param FlowIds 要撤销的合同流程ID列表，最多100个，超过100不处理
     */
    public void setFlowIds(String [] FlowIds) {
        this.FlowIds = FlowIds;
    }

    /**
     * Get 撤回原因，长度不能超过200，只能由中文、字母、数字和下划线组成。

备注:`如果不传递撤回原因，那么默认撤回原因是 "自动撤销（通过接口实现）"` 
     * @return CancelMessage 撤回原因，长度不能超过200，只能由中文、字母、数字和下划线组成。

备注:`如果不传递撤回原因，那么默认撤回原因是 "自动撤销（通过接口实现）"`
     */
    public String getCancelMessage() {
        return this.CancelMessage;
    }

    /**
     * Set 撤回原因，长度不能超过200，只能由中文、字母、数字和下划线组成。

备注:`如果不传递撤回原因，那么默认撤回原因是 "自动撤销（通过接口实现）"`
     * @param CancelMessage 撤回原因，长度不能超过200，只能由中文、字母、数字和下划线组成。

备注:`如果不传递撤回原因，那么默认撤回原因是 "自动撤销（通过接口实现）"`
     */
    public void setCancelMessage(String CancelMessage) {
        this.CancelMessage = CancelMessage;
    }

    /**
     * Get 撤销理由自定义格式,  会展示在合同预览的界面中,  可以选择下面的组合方式：

**0** : 默认格式,  合同封面页面会展示为: 发起方-企业名称-撤销的经办人名字以**CancelMessage**的理由撤销当前合同
**1** :  合同封面页面会展示为:  发起方以**CancelMessage**的理由撤销当前合同
**2** : 保留企业名称,  合同封面页面会展示为:  发起方-企业名称以**CancelMessage**的理由撤销当前合同
**3** : 保留企业名称+经办人名字,  合同封面页面会展示为: 发起方-企业名称-撤销的经办人名字以**CancelMessage**的理由撤销当前合同

注: `CancelMessage为撤销当前合同的理由`

![image](https://qcloudimg.tencent-cloud.cn/raw/f16cf37dbb3a09d6569877f093b92204/channel_ChannelCancelFlow.png)

 
     * @return CancelMessageFormat 撤销理由自定义格式,  会展示在合同预览的界面中,  可以选择下面的组合方式：

**0** : 默认格式,  合同封面页面会展示为: 发起方-企业名称-撤销的经办人名字以**CancelMessage**的理由撤销当前合同
**1** :  合同封面页面会展示为:  发起方以**CancelMessage**的理由撤销当前合同
**2** : 保留企业名称,  合同封面页面会展示为:  发起方-企业名称以**CancelMessage**的理由撤销当前合同
**3** : 保留企业名称+经办人名字,  合同封面页面会展示为: 发起方-企业名称-撤销的经办人名字以**CancelMessage**的理由撤销当前合同

注: `CancelMessage为撤销当前合同的理由`

![image](https://qcloudimg.tencent-cloud.cn/raw/f16cf37dbb3a09d6569877f093b92204/channel_ChannelCancelFlow.png)


     */
    public Long getCancelMessageFormat() {
        return this.CancelMessageFormat;
    }

    /**
     * Set 撤销理由自定义格式,  会展示在合同预览的界面中,  可以选择下面的组合方式：

**0** : 默认格式,  合同封面页面会展示为: 发起方-企业名称-撤销的经办人名字以**CancelMessage**的理由撤销当前合同
**1** :  合同封面页面会展示为:  发起方以**CancelMessage**的理由撤销当前合同
**2** : 保留企业名称,  合同封面页面会展示为:  发起方-企业名称以**CancelMessage**的理由撤销当前合同
**3** : 保留企业名称+经办人名字,  合同封面页面会展示为: 发起方-企业名称-撤销的经办人名字以**CancelMessage**的理由撤销当前合同

注: `CancelMessage为撤销当前合同的理由`

![image](https://qcloudimg.tencent-cloud.cn/raw/f16cf37dbb3a09d6569877f093b92204/channel_ChannelCancelFlow.png)


     * @param CancelMessageFormat 撤销理由自定义格式,  会展示在合同预览的界面中,  可以选择下面的组合方式：

**0** : 默认格式,  合同封面页面会展示为: 发起方-企业名称-撤销的经办人名字以**CancelMessage**的理由撤销当前合同
**1** :  合同封面页面会展示为:  发起方以**CancelMessage**的理由撤销当前合同
**2** : 保留企业名称,  合同封面页面会展示为:  发起方-企业名称以**CancelMessage**的理由撤销当前合同
**3** : 保留企业名称+经办人名字,  合同封面页面会展示为: 发起方-企业名称-撤销的经办人名字以**CancelMessage**的理由撤销当前合同

注: `CancelMessage为撤销当前合同的理由`

![image](https://qcloudimg.tencent-cloud.cn/raw/f16cf37dbb3a09d6569877f093b92204/channel_ChannelCancelFlow.png)


     */
    public void setCancelMessageFormat(Long CancelMessageFormat) {
        this.CancelMessageFormat = CancelMessageFormat;
    }

    /**
     * Get 暂未开放 
     * @return Operator 暂未开放
     * @deprecated
     */
    @Deprecated
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 暂未开放
     * @param Operator 暂未开放
     * @deprecated
     */
    @Deprecated
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    public ChannelBatchCancelFlowsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChannelBatchCancelFlowsRequest(ChannelBatchCancelFlowsRequest source) {
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.FlowIds != null) {
            this.FlowIds = new String[source.FlowIds.length];
            for (int i = 0; i < source.FlowIds.length; i++) {
                this.FlowIds[i] = new String(source.FlowIds[i]);
            }
        }
        if (source.CancelMessage != null) {
            this.CancelMessage = new String(source.CancelMessage);
        }
        if (source.CancelMessageFormat != null) {
            this.CancelMessageFormat = new Long(source.CancelMessageFormat);
        }
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamArraySimple(map, prefix + "FlowIds.", this.FlowIds);
        this.setParamSimple(map, prefix + "CancelMessage", this.CancelMessage);
        this.setParamSimple(map, prefix + "CancelMessageFormat", this.CancelMessageFormat);
        this.setParamObj(map, prefix + "Operator.", this.Operator);

    }
}


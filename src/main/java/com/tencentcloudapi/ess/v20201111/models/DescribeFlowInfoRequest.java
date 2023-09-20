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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeFlowInfoRequest extends AbstractModel{

    /**
    * 执行本接口操作的员工信息。 注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`	
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * 需要查询的流程ID列表，限制最大100个

如果查询合同组的信息,不要传此参数
    */
    @SerializedName("FlowIds")
    @Expose
    private String [] FlowIds;

    /**
    * 代理企业和员工的信息。 在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。	
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * 合同组ID, 如果传此参数会忽略FlowIds入参
 所以如传此参数不要传FlowIds参数

    */
    @SerializedName("FlowGroupId")
    @Expose
    private String FlowGroupId;

    /**
     * Get 执行本接口操作的员工信息。 注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`	 
     * @return Operator 执行本接口操作的员工信息。 注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`	
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 执行本接口操作的员工信息。 注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`	
     * @param Operator 执行本接口操作的员工信息。 注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`	
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 需要查询的流程ID列表，限制最大100个

如果查询合同组的信息,不要传此参数 
     * @return FlowIds 需要查询的流程ID列表，限制最大100个

如果查询合同组的信息,不要传此参数
     */
    public String [] getFlowIds() {
        return this.FlowIds;
    }

    /**
     * Set 需要查询的流程ID列表，限制最大100个

如果查询合同组的信息,不要传此参数
     * @param FlowIds 需要查询的流程ID列表，限制最大100个

如果查询合同组的信息,不要传此参数
     */
    public void setFlowIds(String [] FlowIds) {
        this.FlowIds = FlowIds;
    }

    /**
     * Get 代理企业和员工的信息。 在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。	 
     * @return Agent 代理企业和员工的信息。 在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。	
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set 代理企业和员工的信息。 在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。	
     * @param Agent 代理企业和员工的信息。 在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。	
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get 合同组ID, 如果传此参数会忽略FlowIds入参
 所以如传此参数不要传FlowIds参数
 
     * @return FlowGroupId 合同组ID, 如果传此参数会忽略FlowIds入参
 所以如传此参数不要传FlowIds参数

     */
    public String getFlowGroupId() {
        return this.FlowGroupId;
    }

    /**
     * Set 合同组ID, 如果传此参数会忽略FlowIds入参
 所以如传此参数不要传FlowIds参数

     * @param FlowGroupId 合同组ID, 如果传此参数会忽略FlowIds入参
 所以如传此参数不要传FlowIds参数

     */
    public void setFlowGroupId(String FlowGroupId) {
        this.FlowGroupId = FlowGroupId;
    }

    public DescribeFlowInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFlowInfoRequest(DescribeFlowInfoRequest source) {
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.FlowIds != null) {
            this.FlowIds = new String[source.FlowIds.length];
            for (int i = 0; i < source.FlowIds.length; i++) {
                this.FlowIds[i] = new String(source.FlowIds[i]);
            }
        }
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.FlowGroupId != null) {
            this.FlowGroupId = new String(source.FlowGroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamArraySimple(map, prefix + "FlowIds.", this.FlowIds);
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamSimple(map, prefix + "FlowGroupId", this.FlowGroupId);

    }
}


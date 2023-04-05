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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChannelCreateUserRolesRequest extends AbstractModel{

    /**
    * 应用相关信息。 此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 和 Agent.ProxyAppId 必填。
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * 绑定角色的员工id列表
    */
    @SerializedName("UserIds")
    @Expose
    private String [] UserIds;

    /**
    * 绑定角色的角色id列表
    */
    @SerializedName("RoleIds")
    @Expose
    private String [] RoleIds;

    /**
    * 操作者信息
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
     * Get 应用相关信息。 此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 和 Agent.ProxyAppId 必填。 
     * @return Agent 应用相关信息。 此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 和 Agent.ProxyAppId 必填。
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set 应用相关信息。 此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 和 Agent.ProxyAppId 必填。
     * @param Agent 应用相关信息。 此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 和 Agent.ProxyAppId 必填。
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get 绑定角色的员工id列表 
     * @return UserIds 绑定角色的员工id列表
     */
    public String [] getUserIds() {
        return this.UserIds;
    }

    /**
     * Set 绑定角色的员工id列表
     * @param UserIds 绑定角色的员工id列表
     */
    public void setUserIds(String [] UserIds) {
        this.UserIds = UserIds;
    }

    /**
     * Get 绑定角色的角色id列表 
     * @return RoleIds 绑定角色的角色id列表
     */
    public String [] getRoleIds() {
        return this.RoleIds;
    }

    /**
     * Set 绑定角色的角色id列表
     * @param RoleIds 绑定角色的角色id列表
     */
    public void setRoleIds(String [] RoleIds) {
        this.RoleIds = RoleIds;
    }

    /**
     * Get 操作者信息 
     * @return Operator 操作者信息
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作者信息
     * @param Operator 操作者信息
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    public ChannelCreateUserRolesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChannelCreateUserRolesRequest(ChannelCreateUserRolesRequest source) {
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.UserIds != null) {
            this.UserIds = new String[source.UserIds.length];
            for (int i = 0; i < source.UserIds.length; i++) {
                this.UserIds[i] = new String(source.UserIds[i]);
            }
        }
        if (source.RoleIds != null) {
            this.RoleIds = new String[source.RoleIds.length];
            for (int i = 0; i < source.RoleIds.length; i++) {
                this.RoleIds[i] = new String(source.RoleIds[i]);
            }
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
        this.setParamArraySimple(map, prefix + "UserIds.", this.UserIds);
        this.setParamArraySimple(map, prefix + "RoleIds.", this.RoleIds);
        this.setParamObj(map, prefix + "Operator.", this.Operator);

    }
}

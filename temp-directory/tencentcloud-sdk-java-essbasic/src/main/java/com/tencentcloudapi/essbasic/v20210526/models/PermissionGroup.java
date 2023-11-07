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

public class PermissionGroup extends AbstractModel {

    /**
    * 权限组名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 权限组key
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupKey")
    @Expose
    private String GroupKey;

    /**
    * 是否隐藏分组，0否1是
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Hide")
    @Expose
    private Long Hide;

    /**
    * 权限集合
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Permissions")
    @Expose
    private Permission [] Permissions;

    /**
     * Get 权限组名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupName 权限组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 权限组名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupName 权限组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 权限组key
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupKey 权限组key
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroupKey() {
        return this.GroupKey;
    }

    /**
     * Set 权限组key
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupKey 权限组key
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupKey(String GroupKey) {
        this.GroupKey = GroupKey;
    }

    /**
     * Get 是否隐藏分组，0否1是
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Hide 是否隐藏分组，0否1是
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getHide() {
        return this.Hide;
    }

    /**
     * Set 是否隐藏分组，0否1是
注意：此字段可能返回 null，表示取不到有效值。
     * @param Hide 是否隐藏分组，0否1是
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHide(Long Hide) {
        this.Hide = Hide;
    }

    /**
     * Get 权限集合
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Permissions 权限集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Permission [] getPermissions() {
        return this.Permissions;
    }

    /**
     * Set 权限集合
注意：此字段可能返回 null，表示取不到有效值。
     * @param Permissions 权限集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPermissions(Permission [] Permissions) {
        this.Permissions = Permissions;
    }

    public PermissionGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PermissionGroup(PermissionGroup source) {
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.GroupKey != null) {
            this.GroupKey = new String(source.GroupKey);
        }
        if (source.Hide != null) {
            this.Hide = new Long(source.Hide);
        }
        if (source.Permissions != null) {
            this.Permissions = new Permission[source.Permissions.length];
            for (int i = 0; i < source.Permissions.length; i++) {
                this.Permissions[i] = new Permission(source.Permissions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "GroupKey", this.GroupKey);
        this.setParamSimple(map, prefix + "Hide", this.Hide);
        this.setParamArrayObj(map, prefix + "Permissions.", this.Permissions);

    }
}


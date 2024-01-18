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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddShareUnitMembersRequest extends AbstractModel {

    /**
    * 共享单元ID。
    */
    @SerializedName("UnitId")
    @Expose
    private String UnitId;

    /**
    * 共享单元地域。
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * 共享成员列表。最大10个。
    */
    @SerializedName("Members")
    @Expose
    private ShareMember [] Members;

    /**
     * Get 共享单元ID。 
     * @return UnitId 共享单元ID。
     */
    public String getUnitId() {
        return this.UnitId;
    }

    /**
     * Set 共享单元ID。
     * @param UnitId 共享单元ID。
     */
    public void setUnitId(String UnitId) {
        this.UnitId = UnitId;
    }

    /**
     * Get 共享单元地域。 
     * @return Area 共享单元地域。
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set 共享单元地域。
     * @param Area 共享单元地域。
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get 共享成员列表。最大10个。 
     * @return Members 共享成员列表。最大10个。
     */
    public ShareMember [] getMembers() {
        return this.Members;
    }

    /**
     * Set 共享成员列表。最大10个。
     * @param Members 共享成员列表。最大10个。
     */
    public void setMembers(ShareMember [] Members) {
        this.Members = Members;
    }

    public AddShareUnitMembersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddShareUnitMembersRequest(AddShareUnitMembersRequest source) {
        if (source.UnitId != null) {
            this.UnitId = new String(source.UnitId);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.Members != null) {
            this.Members = new ShareMember[source.Members.length];
            for (int i = 0; i < source.Members.length; i++) {
                this.Members[i] = new ShareMember(source.Members[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UnitId", this.UnitId);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamArrayObj(map, prefix + "Members.", this.Members);

    }
}


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
package com.tencentcloudapi.yinsuda.v20220527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RechargeVipRequest extends AbstractModel {

    /**
    * 应用名称。
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * 用户标识。
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 房间Id。
    */
    @SerializedName("RoomId")
    @Expose
    private String RoomId;

    /**
    * 充值会员天数。(取值有：31、93、186、372)
    */
    @SerializedName("VipDays")
    @Expose
    private Long VipDays;

    /**
    * 主播id。
    */
    @SerializedName("AnchorId")
    @Expose
    private String AnchorId;

    /**
     * Get 应用名称。 
     * @return AppName 应用名称。
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set 应用名称。
     * @param AppName 应用名称。
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get 用户标识。 
     * @return UserId 用户标识。
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户标识。
     * @param UserId 用户标识。
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 房间Id。 
     * @return RoomId 房间Id。
     */
    public String getRoomId() {
        return this.RoomId;
    }

    /**
     * Set 房间Id。
     * @param RoomId 房间Id。
     */
    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get 充值会员天数。(取值有：31、93、186、372) 
     * @return VipDays 充值会员天数。(取值有：31、93、186、372)
     */
    public Long getVipDays() {
        return this.VipDays;
    }

    /**
     * Set 充值会员天数。(取值有：31、93、186、372)
     * @param VipDays 充值会员天数。(取值有：31、93、186、372)
     */
    public void setVipDays(Long VipDays) {
        this.VipDays = VipDays;
    }

    /**
     * Get 主播id。 
     * @return AnchorId 主播id。
     */
    public String getAnchorId() {
        return this.AnchorId;
    }

    /**
     * Set 主播id。
     * @param AnchorId 主播id。
     */
    public void setAnchorId(String AnchorId) {
        this.AnchorId = AnchorId;
    }

    public RechargeVipRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RechargeVipRequest(RechargeVipRequest source) {
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.RoomId != null) {
            this.RoomId = new String(source.RoomId);
        }
        if (source.VipDays != null) {
            this.VipDays = new Long(source.VipDays);
        }
        if (source.AnchorId != null) {
            this.AnchorId = new String(source.AnchorId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "VipDays", this.VipDays);
        this.setParamSimple(map, prefix + "AnchorId", this.AnchorId);

    }
}


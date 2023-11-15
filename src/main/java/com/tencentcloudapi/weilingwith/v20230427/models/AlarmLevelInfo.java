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
package com.tencentcloudapi.weilingwith.v20230427.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AlarmLevelInfo extends AbstractModel {

    /**
    * 级别id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LevelId")
    @Expose
    private Long LevelId;

    /**
    * 级别名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LevelName")
    @Expose
    private String LevelName;

    /**
     * Get 级别id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LevelId 级别id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLevelId() {
        return this.LevelId;
    }

    /**
     * Set 级别id
注意：此字段可能返回 null，表示取不到有效值。
     * @param LevelId 级别id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLevelId(Long LevelId) {
        this.LevelId = LevelId;
    }

    /**
     * Get 级别名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LevelName 级别名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLevelName() {
        return this.LevelName;
    }

    /**
     * Set 级别名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param LevelName 级别名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLevelName(String LevelName) {
        this.LevelName = LevelName;
    }

    public AlarmLevelInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlarmLevelInfo(AlarmLevelInfo source) {
        if (source.LevelId != null) {
            this.LevelId = new Long(source.LevelId);
        }
        if (source.LevelName != null) {
            this.LevelName = new String(source.LevelName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LevelId", this.LevelId);
        this.setParamSimple(map, prefix + "LevelName", this.LevelName);

    }
}


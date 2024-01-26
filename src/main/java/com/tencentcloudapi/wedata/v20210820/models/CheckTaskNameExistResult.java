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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckTaskNameExistResult extends AbstractModel {

    /**
    * 是否已存在重名的任务
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IfExist")
    @Expose
    private Boolean IfExist;

    /**
    * ifExist为true时的提示信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
     * Get 是否已存在重名的任务
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IfExist 是否已存在重名的任务
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIfExist() {
        return this.IfExist;
    }

    /**
     * Set 是否已存在重名的任务
注意：此字段可能返回 null，表示取不到有效值。
     * @param IfExist 是否已存在重名的任务
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIfExist(Boolean IfExist) {
        this.IfExist = IfExist;
    }

    /**
     * Get ifExist为true时的提示信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Message ifExist为true时的提示信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set ifExist为true时的提示信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Message ifExist为true时的提示信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    public CheckTaskNameExistResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckTaskNameExistResult(CheckTaskNameExistResult source) {
        if (source.IfExist != null) {
            this.IfExist = new Boolean(source.IfExist);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IfExist", this.IfExist);
        this.setParamSimple(map, prefix + "Message", this.Message);

    }
}


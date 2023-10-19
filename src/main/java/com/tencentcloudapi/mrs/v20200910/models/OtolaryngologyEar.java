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
package com.tencentcloudapi.mrs.v20200910.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OtolaryngologyEar extends AbstractModel {

    /**
    * 耳总体描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Text")
    @Expose
    private KeyValueItem Text;

    /**
    * 听力
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Hearing")
    @Expose
    private HearingItem Hearing;

    /**
     * Get 耳总体描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Text 耳总体描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KeyValueItem getText() {
        return this.Text;
    }

    /**
     * Set 耳总体描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Text 耳总体描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setText(KeyValueItem Text) {
        this.Text = Text;
    }

    /**
     * Get 听力
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Hearing 听力
注意：此字段可能返回 null，表示取不到有效值。
     */
    public HearingItem getHearing() {
        return this.Hearing;
    }

    /**
     * Set 听力
注意：此字段可能返回 null，表示取不到有效值。
     * @param Hearing 听力
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHearing(HearingItem Hearing) {
        this.Hearing = Hearing;
    }

    public OtolaryngologyEar() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OtolaryngologyEar(OtolaryngologyEar source) {
        if (source.Text != null) {
            this.Text = new KeyValueItem(source.Text);
        }
        if (source.Hearing != null) {
            this.Hearing = new HearingItem(source.Hearing);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Text.", this.Text);
        this.setParamObj(map, prefix + "Hearing.", this.Hearing);

    }
}


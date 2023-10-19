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

public class IndicatorV3 extends AbstractModel {

    /**
    * 检验报告V3结论
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableIndictors")
    @Expose
    private TableIndicators [] TableIndictors;

    /**
    * 版本号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
     * Get 检验报告V3结论
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableIndictors 检验报告V3结论
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TableIndicators [] getTableIndictors() {
        return this.TableIndictors;
    }

    /**
     * Set 检验报告V3结论
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableIndictors 检验报告V3结论
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableIndictors(TableIndicators [] TableIndictors) {
        this.TableIndictors = TableIndictors;
    }

    /**
     * Get 版本号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Version 版本号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 版本号
注意：此字段可能返回 null，表示取不到有效值。
     * @param Version 版本号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    public IndicatorV3() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IndicatorV3(IndicatorV3 source) {
        if (source.TableIndictors != null) {
            this.TableIndictors = new TableIndicators[source.TableIndictors.length];
            for (int i = 0; i < source.TableIndictors.length; i++) {
                this.TableIndictors[i] = new TableIndicators(source.TableIndictors[i]);
            }
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "TableIndictors.", this.TableIndictors);
        this.setParamSimple(map, prefix + "Version", this.Version);

    }
}


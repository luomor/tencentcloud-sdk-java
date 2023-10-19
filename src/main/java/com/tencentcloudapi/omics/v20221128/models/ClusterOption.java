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
package com.tencentcloudapi.omics.v20221128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClusterOption extends AbstractModel {

    /**
    * 计算集群可用区。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 计算集群类型，取值范围：
- KUBERNETES
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get 计算集群可用区。 
     * @return Zone 计算集群可用区。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 计算集群可用区。
     * @param Zone 计算集群可用区。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 计算集群类型，取值范围：
- KUBERNETES 
     * @return Type 计算集群类型，取值范围：
- KUBERNETES
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 计算集群类型，取值范围：
- KUBERNETES
     * @param Type 计算集群类型，取值范围：
- KUBERNETES
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public ClusterOption() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterOption(ClusterOption source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}


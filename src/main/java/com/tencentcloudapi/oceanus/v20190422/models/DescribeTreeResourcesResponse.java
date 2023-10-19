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
package com.tencentcloudapi.oceanus.v20190422.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTreeResourcesResponse extends AbstractModel {

    /**
    * 父节点ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParentId")
    @Expose
    private String ParentId;

    /**
    * 文件夹ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 文件夹名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 文件列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Items")
    @Expose
    private TreeResourceItem [] Items;

    /**
    * 子目录列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Children")
    @Expose
    private DescribeTreeResourcesRsp [] Children;

    /**
    * 资源总数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 父节点ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParentId 父节点ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParentId() {
        return this.ParentId;
    }

    /**
     * Set 父节点ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParentId 父节点ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParentId(String ParentId) {
        this.ParentId = ParentId;
    }

    /**
     * Get 文件夹ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id 文件夹ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 文件夹ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id 文件夹ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 文件夹名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 文件夹名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 文件夹名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 文件夹名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 文件列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Items 文件列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TreeResourceItem [] getItems() {
        return this.Items;
    }

    /**
     * Set 文件列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Items 文件列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setItems(TreeResourceItem [] Items) {
        this.Items = Items;
    }

    /**
     * Get 子目录列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Children 子目录列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribeTreeResourcesRsp [] getChildren() {
        return this.Children;
    }

    /**
     * Set 子目录列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Children 子目录列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChildren(DescribeTreeResourcesRsp [] Children) {
        this.Children = Children;
    }

    /**
     * Get 资源总数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalCount 资源总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 资源总数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalCount 资源总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeTreeResourcesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTreeResourcesResponse(DescribeTreeResourcesResponse source) {
        if (source.ParentId != null) {
            this.ParentId = new String(source.ParentId);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Items != null) {
            this.Items = new TreeResourceItem[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new TreeResourceItem(source.Items[i]);
            }
        }
        if (source.Children != null) {
            this.Children = new DescribeTreeResourcesRsp[source.Children.length];
            for (int i = 0; i < source.Children.length; i++) {
                this.Children[i] = new DescribeTreeResourcesRsp(source.Children[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ParentId", this.ParentId);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "Items.", this.Items);
        this.setParamArrayObj(map, prefix + "Children.", this.Children);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


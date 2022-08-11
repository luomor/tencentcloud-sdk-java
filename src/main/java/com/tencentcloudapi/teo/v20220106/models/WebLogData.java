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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WebLogData extends AbstractModel{

    /**
    * 分组数据。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("List")
    @Expose
    private WebLogs [] List;

    /**
    * 分页拉取的起始页号。最小值：1。
    */
    @SerializedName("PageNo")
    @Expose
    private Long PageNo;

    /**
    * 分页拉取的最大返回结果数。最大值：1000。
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 总页数。
    */
    @SerializedName("Pages")
    @Expose
    private Long Pages;

    /**
    * 总条数。
    */
    @SerializedName("TotalSize")
    @Expose
    private Long TotalSize;

    /**
     * Get 分组数据。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return List 分组数据。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WebLogs [] getList() {
        return this.List;
    }

    /**
     * Set 分组数据。
注意：此字段可能返回 null，表示取不到有效值。
     * @param List 分组数据。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setList(WebLogs [] List) {
        this.List = List;
    }

    /**
     * Get 分页拉取的起始页号。最小值：1。 
     * @return PageNo 分页拉取的起始页号。最小值：1。
     */
    public Long getPageNo() {
        return this.PageNo;
    }

    /**
     * Set 分页拉取的起始页号。最小值：1。
     * @param PageNo 分页拉取的起始页号。最小值：1。
     */
    public void setPageNo(Long PageNo) {
        this.PageNo = PageNo;
    }

    /**
     * Get 分页拉取的最大返回结果数。最大值：1000。 
     * @return PageSize 分页拉取的最大返回结果数。最大值：1000。
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 分页拉取的最大返回结果数。最大值：1000。
     * @param PageSize 分页拉取的最大返回结果数。最大值：1000。
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 总页数。 
     * @return Pages 总页数。
     */
    public Long getPages() {
        return this.Pages;
    }

    /**
     * Set 总页数。
     * @param Pages 总页数。
     */
    public void setPages(Long Pages) {
        this.Pages = Pages;
    }

    /**
     * Get 总条数。 
     * @return TotalSize 总条数。
     */
    public Long getTotalSize() {
        return this.TotalSize;
    }

    /**
     * Set 总条数。
     * @param TotalSize 总条数。
     */
    public void setTotalSize(Long TotalSize) {
        this.TotalSize = TotalSize;
    }

    public WebLogData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WebLogData(WebLogData source) {
        if (source.List != null) {
            this.List = new WebLogs[source.List.length];
            for (int i = 0; i < source.List.length; i++) {
                this.List[i] = new WebLogs(source.List[i]);
            }
        }
        if (source.PageNo != null) {
            this.PageNo = new Long(source.PageNo);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.Pages != null) {
            this.Pages = new Long(source.Pages);
        }
        if (source.TotalSize != null) {
            this.TotalSize = new Long(source.TotalSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "List.", this.List);
        this.setParamSimple(map, prefix + "PageNo", this.PageNo);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "Pages", this.Pages);
        this.setParamSimple(map, prefix + "TotalSize", this.TotalSize);

    }
}


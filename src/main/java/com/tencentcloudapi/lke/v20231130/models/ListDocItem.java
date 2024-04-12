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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListDocItem extends AbstractModel {

    /**
    * 文档ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DocBizId")
    @Expose
    private String DocBizId;

    /**
    * 文件名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 文件类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * cos路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CosUrl")
    @Expose
    private String CosUrl;

    /**
    * 更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 文档状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 文档状态描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * 原因
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * 答案中是否引用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsRefer")
    @Expose
    private Boolean IsRefer;

    /**
    * 问答对数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QaNum")
    @Expose
    private Long QaNum;

    /**
    * 是否已删除
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsDeleted")
    @Expose
    private Boolean IsDeleted;

    /**
    * 文档来源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Source")
    @Expose
    private Long Source;

    /**
    * 文档来源描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceDesc")
    @Expose
    private String SourceDesc;

    /**
    * 是否允许重新生成
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsAllowRestart")
    @Expose
    private Boolean IsAllowRestart;

    /**
    * qa是否已删除
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsDeletedQa")
    @Expose
    private Boolean IsDeletedQa;

    /**
    * 问答是否生成中
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsCreatingQa")
    @Expose
    private Boolean IsCreatingQa;

    /**
    * 是否允许删除
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsAllowDelete")
    @Expose
    private Boolean IsAllowDelete;

    /**
    * 是否允许操作引用开关
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsAllowRefer")
    @Expose
    private Boolean IsAllowRefer;

    /**
    * 问答是否生成过
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsCreatedQa")
    @Expose
    private Boolean IsCreatedQa;

    /**
    * 文档字符量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DocCharSize")
    @Expose
    private String DocCharSize;

    /**
    * 属性标签适用范围
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AttrRange")
    @Expose
    private Long AttrRange;

    /**
    * 属性标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AttrLabels")
    @Expose
    private AttrLabel [] AttrLabels;

    /**
    * 是否允许编辑
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsAllowEdit")
    @Expose
    private Boolean IsAllowEdit;

    /**
    * 外部引用链接类型 0：系统链接 1：自定义链接
值为1时，WebUrl 字段不能为空，否则不生效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReferUrlType")
    @Expose
    private Long ReferUrlType;

    /**
    * 网页(或自定义链接)地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WebUrl")
    @Expose
    private String WebUrl;

    /**
    * 有效开始时间，unix时间戳
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpireStart")
    @Expose
    private String ExpireStart;

    /**
    * 有效结束时间，unix时间戳，0代表永久有效
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpireEnd")
    @Expose
    private String ExpireEnd;

    /**
     * Get 文档ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DocBizId 文档ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDocBizId() {
        return this.DocBizId;
    }

    /**
     * Set 文档ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param DocBizId 文档ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDocBizId(String DocBizId) {
        this.DocBizId = DocBizId;
    }

    /**
     * Get 文件名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileName 文件名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 文件名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileName 文件名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 文件类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileType 文件类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set 文件类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileType 文件类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get cos路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CosUrl cos路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCosUrl() {
        return this.CosUrl;
    }

    /**
     * Set cos路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param CosUrl cos路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCosUrl(String CosUrl) {
        this.CosUrl = CosUrl;
    }

    /**
     * Get 更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 文档状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 文档状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 文档状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 文档状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 文档状态描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StatusDesc 文档状态描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * Set 文档状态描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param StatusDesc 文档状态描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
    }

    /**
     * Get 原因
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Reason 原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set 原因
注意：此字段可能返回 null，表示取不到有效值。
     * @param Reason 原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    /**
     * Get 答案中是否引用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsRefer 答案中是否引用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsRefer() {
        return this.IsRefer;
    }

    /**
     * Set 答案中是否引用
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsRefer 答案中是否引用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsRefer(Boolean IsRefer) {
        this.IsRefer = IsRefer;
    }

    /**
     * Get 问答对数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QaNum 问答对数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getQaNum() {
        return this.QaNum;
    }

    /**
     * Set 问答对数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param QaNum 问答对数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQaNum(Long QaNum) {
        this.QaNum = QaNum;
    }

    /**
     * Get 是否已删除
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsDeleted 是否已删除
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsDeleted() {
        return this.IsDeleted;
    }

    /**
     * Set 是否已删除
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsDeleted 是否已删除
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsDeleted(Boolean IsDeleted) {
        this.IsDeleted = IsDeleted;
    }

    /**
     * Get 文档来源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Source 文档来源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSource() {
        return this.Source;
    }

    /**
     * Set 文档来源
注意：此字段可能返回 null，表示取不到有效值。
     * @param Source 文档来源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSource(Long Source) {
        this.Source = Source;
    }

    /**
     * Get 文档来源描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceDesc 文档来源描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSourceDesc() {
        return this.SourceDesc;
    }

    /**
     * Set 文档来源描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceDesc 文档来源描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceDesc(String SourceDesc) {
        this.SourceDesc = SourceDesc;
    }

    /**
     * Get 是否允许重新生成
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsAllowRestart 是否允许重新生成
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsAllowRestart() {
        return this.IsAllowRestart;
    }

    /**
     * Set 是否允许重新生成
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsAllowRestart 是否允许重新生成
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsAllowRestart(Boolean IsAllowRestart) {
        this.IsAllowRestart = IsAllowRestart;
    }

    /**
     * Get qa是否已删除
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsDeletedQa qa是否已删除
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsDeletedQa() {
        return this.IsDeletedQa;
    }

    /**
     * Set qa是否已删除
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsDeletedQa qa是否已删除
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsDeletedQa(Boolean IsDeletedQa) {
        this.IsDeletedQa = IsDeletedQa;
    }

    /**
     * Get 问答是否生成中
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsCreatingQa 问答是否生成中
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsCreatingQa() {
        return this.IsCreatingQa;
    }

    /**
     * Set 问答是否生成中
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsCreatingQa 问答是否生成中
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsCreatingQa(Boolean IsCreatingQa) {
        this.IsCreatingQa = IsCreatingQa;
    }

    /**
     * Get 是否允许删除
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsAllowDelete 是否允许删除
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsAllowDelete() {
        return this.IsAllowDelete;
    }

    /**
     * Set 是否允许删除
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsAllowDelete 是否允许删除
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsAllowDelete(Boolean IsAllowDelete) {
        this.IsAllowDelete = IsAllowDelete;
    }

    /**
     * Get 是否允许操作引用开关
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsAllowRefer 是否允许操作引用开关
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsAllowRefer() {
        return this.IsAllowRefer;
    }

    /**
     * Set 是否允许操作引用开关
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsAllowRefer 是否允许操作引用开关
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsAllowRefer(Boolean IsAllowRefer) {
        this.IsAllowRefer = IsAllowRefer;
    }

    /**
     * Get 问答是否生成过
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsCreatedQa 问答是否生成过
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsCreatedQa() {
        return this.IsCreatedQa;
    }

    /**
     * Set 问答是否生成过
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsCreatedQa 问答是否生成过
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsCreatedQa(Boolean IsCreatedQa) {
        this.IsCreatedQa = IsCreatedQa;
    }

    /**
     * Get 文档字符量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DocCharSize 文档字符量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDocCharSize() {
        return this.DocCharSize;
    }

    /**
     * Set 文档字符量
注意：此字段可能返回 null，表示取不到有效值。
     * @param DocCharSize 文档字符量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDocCharSize(String DocCharSize) {
        this.DocCharSize = DocCharSize;
    }

    /**
     * Get 属性标签适用范围
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AttrRange 属性标签适用范围
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAttrRange() {
        return this.AttrRange;
    }

    /**
     * Set 属性标签适用范围
注意：此字段可能返回 null，表示取不到有效值。
     * @param AttrRange 属性标签适用范围
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAttrRange(Long AttrRange) {
        this.AttrRange = AttrRange;
    }

    /**
     * Get 属性标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AttrLabels 属性标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AttrLabel [] getAttrLabels() {
        return this.AttrLabels;
    }

    /**
     * Set 属性标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param AttrLabels 属性标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAttrLabels(AttrLabel [] AttrLabels) {
        this.AttrLabels = AttrLabels;
    }

    /**
     * Get 是否允许编辑
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsAllowEdit 是否允许编辑
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsAllowEdit() {
        return this.IsAllowEdit;
    }

    /**
     * Set 是否允许编辑
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsAllowEdit 是否允许编辑
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsAllowEdit(Boolean IsAllowEdit) {
        this.IsAllowEdit = IsAllowEdit;
    }

    /**
     * Get 外部引用链接类型 0：系统链接 1：自定义链接
值为1时，WebUrl 字段不能为空，否则不生效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReferUrlType 外部引用链接类型 0：系统链接 1：自定义链接
值为1时，WebUrl 字段不能为空，否则不生效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getReferUrlType() {
        return this.ReferUrlType;
    }

    /**
     * Set 外部引用链接类型 0：系统链接 1：自定义链接
值为1时，WebUrl 字段不能为空，否则不生效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReferUrlType 外部引用链接类型 0：系统链接 1：自定义链接
值为1时，WebUrl 字段不能为空，否则不生效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReferUrlType(Long ReferUrlType) {
        this.ReferUrlType = ReferUrlType;
    }

    /**
     * Get 网页(或自定义链接)地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WebUrl 网页(或自定义链接)地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWebUrl() {
        return this.WebUrl;
    }

    /**
     * Set 网页(或自定义链接)地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param WebUrl 网页(或自定义链接)地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWebUrl(String WebUrl) {
        this.WebUrl = WebUrl;
    }

    /**
     * Get 有效开始时间，unix时间戳
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpireStart 有效开始时间，unix时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExpireStart() {
        return this.ExpireStart;
    }

    /**
     * Set 有效开始时间，unix时间戳
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpireStart 有效开始时间，unix时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpireStart(String ExpireStart) {
        this.ExpireStart = ExpireStart;
    }

    /**
     * Get 有效结束时间，unix时间戳，0代表永久有效
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpireEnd 有效结束时间，unix时间戳，0代表永久有效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExpireEnd() {
        return this.ExpireEnd;
    }

    /**
     * Set 有效结束时间，unix时间戳，0代表永久有效
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpireEnd 有效结束时间，unix时间戳，0代表永久有效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpireEnd(String ExpireEnd) {
        this.ExpireEnd = ExpireEnd;
    }

    public ListDocItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListDocItem(ListDocItem source) {
        if (source.DocBizId != null) {
            this.DocBizId = new String(source.DocBizId);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.CosUrl != null) {
            this.CosUrl = new String(source.CosUrl);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.StatusDesc != null) {
            this.StatusDesc = new String(source.StatusDesc);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
        if (source.IsRefer != null) {
            this.IsRefer = new Boolean(source.IsRefer);
        }
        if (source.QaNum != null) {
            this.QaNum = new Long(source.QaNum);
        }
        if (source.IsDeleted != null) {
            this.IsDeleted = new Boolean(source.IsDeleted);
        }
        if (source.Source != null) {
            this.Source = new Long(source.Source);
        }
        if (source.SourceDesc != null) {
            this.SourceDesc = new String(source.SourceDesc);
        }
        if (source.IsAllowRestart != null) {
            this.IsAllowRestart = new Boolean(source.IsAllowRestart);
        }
        if (source.IsDeletedQa != null) {
            this.IsDeletedQa = new Boolean(source.IsDeletedQa);
        }
        if (source.IsCreatingQa != null) {
            this.IsCreatingQa = new Boolean(source.IsCreatingQa);
        }
        if (source.IsAllowDelete != null) {
            this.IsAllowDelete = new Boolean(source.IsAllowDelete);
        }
        if (source.IsAllowRefer != null) {
            this.IsAllowRefer = new Boolean(source.IsAllowRefer);
        }
        if (source.IsCreatedQa != null) {
            this.IsCreatedQa = new Boolean(source.IsCreatedQa);
        }
        if (source.DocCharSize != null) {
            this.DocCharSize = new String(source.DocCharSize);
        }
        if (source.AttrRange != null) {
            this.AttrRange = new Long(source.AttrRange);
        }
        if (source.AttrLabels != null) {
            this.AttrLabels = new AttrLabel[source.AttrLabels.length];
            for (int i = 0; i < source.AttrLabels.length; i++) {
                this.AttrLabels[i] = new AttrLabel(source.AttrLabels[i]);
            }
        }
        if (source.IsAllowEdit != null) {
            this.IsAllowEdit = new Boolean(source.IsAllowEdit);
        }
        if (source.ReferUrlType != null) {
            this.ReferUrlType = new Long(source.ReferUrlType);
        }
        if (source.WebUrl != null) {
            this.WebUrl = new String(source.WebUrl);
        }
        if (source.ExpireStart != null) {
            this.ExpireStart = new String(source.ExpireStart);
        }
        if (source.ExpireEnd != null) {
            this.ExpireEnd = new String(source.ExpireEnd);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DocBizId", this.DocBizId);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "CosUrl", this.CosUrl);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusDesc", this.StatusDesc);
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamSimple(map, prefix + "IsRefer", this.IsRefer);
        this.setParamSimple(map, prefix + "QaNum", this.QaNum);
        this.setParamSimple(map, prefix + "IsDeleted", this.IsDeleted);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "SourceDesc", this.SourceDesc);
        this.setParamSimple(map, prefix + "IsAllowRestart", this.IsAllowRestart);
        this.setParamSimple(map, prefix + "IsDeletedQa", this.IsDeletedQa);
        this.setParamSimple(map, prefix + "IsCreatingQa", this.IsCreatingQa);
        this.setParamSimple(map, prefix + "IsAllowDelete", this.IsAllowDelete);
        this.setParamSimple(map, prefix + "IsAllowRefer", this.IsAllowRefer);
        this.setParamSimple(map, prefix + "IsCreatedQa", this.IsCreatedQa);
        this.setParamSimple(map, prefix + "DocCharSize", this.DocCharSize);
        this.setParamSimple(map, prefix + "AttrRange", this.AttrRange);
        this.setParamArrayObj(map, prefix + "AttrLabels.", this.AttrLabels);
        this.setParamSimple(map, prefix + "IsAllowEdit", this.IsAllowEdit);
        this.setParamSimple(map, prefix + "ReferUrlType", this.ReferUrlType);
        this.setParamSimple(map, prefix + "WebUrl", this.WebUrl);
        this.setParamSimple(map, prefix + "ExpireStart", this.ExpireStart);
        this.setParamSimple(map, prefix + "ExpireEnd", this.ExpireEnd);

    }
}


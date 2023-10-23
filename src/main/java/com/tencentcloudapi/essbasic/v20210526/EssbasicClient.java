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
package com.tencentcloudapi.essbasic.v20210526;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.essbasic.v20210526.models.*;

public class EssbasicClient extends AbstractClient{
    private static String endpoint = "essbasic.tencentcloudapi.com";
    private static String service = "essbasic";
    private static String version = "2021-05-26";
    
    public EssbasicClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public EssbasicClient(Credential credential, String region, ClientProfile profile) {
        super(EssbasicClient.endpoint, EssbasicClient.version, credential, region, profile);
    }

    /**
     *指定需要批量撤销的签署流程Id，批量撤销合同
客户指定需要撤销的签署流程Id，最多100个，超过100不处理；

可以撤回：未全部签署完成
 不可以撤回：已全部签署完成、已拒签、已过期、已撤回、拒绝填写、已解除等合同状态。

**满足撤销条件的合同会发起异步撤销流程，不满足撤销条件的合同返回失败原因。**

**合同撤销成功后，会通过合同状态为 CANCEL 的回调消息通知调用方 [具体可参考回调消息](https://qian.tencent.com/developers/scenes/partner/callback_data_types#-%E5%90%88%E5%90%8C%E7%8A%B6%E6%80%81%E9%80%9A%E7%9F%A5---flowstatuschange)**

**注意:
能撤回合同的只能是合同的发起人或者发起企业的超管、法人**
     * @param req ChannelBatchCancelFlowsRequest
     * @return ChannelBatchCancelFlowsResponse
     * @throws TencentCloudSDKException
     */
    public ChannelBatchCancelFlowsResponse ChannelBatchCancelFlows(ChannelBatchCancelFlowsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ChannelBatchCancelFlows", ChannelBatchCancelFlowsResponse.class);
    }

    /**
     *撤销签署流程接口，可以撤回：未全部签署完成；不可以撤回（终态）：已全部签署完成、已拒签、已过期、已撤回。
注意:
能撤回合同的只能是合同的发起人或者发起企业的超管、法人
     * @param req ChannelCancelFlowRequest
     * @return ChannelCancelFlowResponse
     * @throws TencentCloudSDKException
     */
    public ChannelCancelFlowResponse ChannelCancelFlow(ChannelCancelFlowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ChannelCancelFlow", ChannelCancelFlowResponse.class);
    }

    /**
     *此接口（ChannelCancelMultiFlowSignQRCode）用于取消一码多扫二维码。该接口对传入的二维码ID，若还在有效期内，可以提前失效。
     * @param req ChannelCancelMultiFlowSignQRCodeRequest
     * @return ChannelCancelMultiFlowSignQRCodeResponse
     * @throws TencentCloudSDKException
     */
    public ChannelCancelMultiFlowSignQRCodeResponse ChannelCancelMultiFlowSignQRCode(ChannelCancelMultiFlowSignQRCodeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ChannelCancelMultiFlowSignQRCode", ChannelCancelMultiFlowSignQRCodeResponse.class);
    }

    /**
     *此接口（ChannelCancelUserAutoSignEnableUrl）用来撤销发送给个人用户的自动签开通链接，撤销后对应的个人用户开通链接失效。若个人用户已经完成开通，将无法撤销。（处方单场景专用，使用此接口请与客户经理确认）
     * @param req ChannelCancelUserAutoSignEnableUrlRequest
     * @return ChannelCancelUserAutoSignEnableUrlResponse
     * @throws TencentCloudSDKException
     */
    public ChannelCancelUserAutoSignEnableUrlResponse ChannelCancelUserAutoSignEnableUrl(ChannelCancelUserAutoSignEnableUrlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ChannelCancelUserAutoSignEnableUrl", ChannelCancelUserAutoSignEnableUrlResponse.class);
    }

    /**
     *指定需要批量撤销的签署流程Id，获取批量撤销链接 - 不建议使用此接口，可使用ChannelBatchCancelFlows
客户指定需要撤销的签署流程Id，最多100个，超过100不处理；
接口调用成功返回批量撤销合同的链接，通过链接跳转到电子签小程序完成批量撤销;

可以撤回：未全部签署完成
 不可以撤回：已全部签署完成、已拒签、已过期、已撤回、拒绝填写、已解除等合同状态。

注意:
能撤回合同的只能是合同的发起人或者发起企业的超管、法人
     * @param req ChannelCreateBatchCancelFlowUrlRequest
     * @return ChannelCreateBatchCancelFlowUrlResponse
     * @throws TencentCloudSDKException
     */
    public ChannelCreateBatchCancelFlowUrlResponse ChannelCreateBatchCancelFlowUrl(ChannelCreateBatchCancelFlowUrlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ChannelCreateBatchCancelFlowUrl", ChannelCreateBatchCancelFlowUrlResponse.class);
    }

    /**
     *通过此接口，创建小程序批量签署链接，个人/企业员工点击此链接即可跳转小程序进行批量签署。
请确保生成链接时候的身份信息和签署合同参与方的信息保持一致。

注：
- 参与人点击链接后需短信验证码才能查看合同内容。
- 企业用户批量签署，需要传OrganizationName（参与方所在企业名称）参数生成签署链接，`请确保此企业已完成腾讯电子签企业认证`。
- 个人批量签署，签名区`仅支持手写签名`。
     * @param req ChannelCreateBatchSignUrlRequest
     * @return ChannelCreateBatchSignUrlResponse
     * @throws TencentCloudSDKException
     */
    public ChannelCreateBatchSignUrlResponse ChannelCreateBatchSignUrl(ChannelCreateBatchSignUrlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ChannelCreateBatchSignUrl", ChannelCreateBatchSignUrlResponse.class);
    }

    /**
     *此接口（ChannelCreateBoundFlows）用于子客领取合同，经办人需要有相应的角色，合同不能重复领取。
     * @param req ChannelCreateBoundFlowsRequest
     * @return ChannelCreateBoundFlowsResponse
     * @throws TencentCloudSDKException
     */
    public ChannelCreateBoundFlowsResponse ChannelCreateBoundFlows(ChannelCreateBoundFlowsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ChannelCreateBoundFlows", ChannelCreateBoundFlowsResponse.class);
    }

    /**
     *上传了word、excel、图片文件后，通过该接口发起文件转换任务，将word、excel、图片文件转换为pdf文件。
     * @param req ChannelCreateConvertTaskApiRequest
     * @return ChannelCreateConvertTaskApiResponse
     * @throws TencentCloudSDKException
     */
    public ChannelCreateConvertTaskApiResponse ChannelCreateConvertTaskApi(ChannelCreateConvertTaskApiRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ChannelCreateConvertTaskApi", ChannelCreateConvertTaskApiResponse.class);
    }

    /**
     *本接口（ChannelCreateEmbedWebUrl）用于创建常规模块嵌入web的链接
本接口支持创建：创建印章，创建模板，修改模板，预览模板，预览合同流程的web链接
进入web连接后与当前控制台操作保持一致
     * @param req ChannelCreateEmbedWebUrlRequest
     * @return ChannelCreateEmbedWebUrlResponse
     * @throws TencentCloudSDKException
     */
    public ChannelCreateEmbedWebUrlResponse ChannelCreateEmbedWebUrl(ChannelCreateEmbedWebUrlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ChannelCreateEmbedWebUrl", ChannelCreateEmbedWebUrlResponse.class);
    }

    /**
     *适用场景：
当通过模板或文件发起合同时，若未指定企业签署人信息，则可调用此接口动态补充签署人。同一签署人只允许补充一人，最终实际签署人取决于谁先领取合同完成签署。

限制条件：
1. 本企业（发起方企业）企业签署人仅支持通过企业名称+姓名+手机号进行补充。
2. 个人签署人仅支持通过姓名+手机号进行补充。
     * @param req ChannelCreateFlowApproversRequest
     * @return ChannelCreateFlowApproversResponse
     * @throws TencentCloudSDKException
     */
    public ChannelCreateFlowApproversResponse ChannelCreateFlowApprovers(ChannelCreateFlowApproversRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ChannelCreateFlowApprovers", ChannelCreateFlowApproversResponse.class);
    }

    /**
     *接口（ChannelCreateFlowByFiles）用PDF文件创建签署流程。

适用场景：适用非制式的合同文件签署，开发者有每个签署流程的PDF，可以通过该接口传入完整的PDF文件及流程信息生成待签署的合同流程。

**注**: 
<ul>
<li>此接口静默签(企业自动签)能力为白名单功能，使用前请联系对接的客户经理沟通。</li>
<li>此接口需要依赖<a href="https://qian.tencent.com/developers/partnerApis/files/UploadFiles" target="_blank">文件上传接口</a>生成pdf资源编号（FileIds）进行使用。整体的逻辑如下图</li>
</ul>

![image](https://dyn.ess.tencent.cn/guide/capi/ChannelCreateFlowByFiles.png)

**可以作为发起方和签署方的角色列表**
<table>
<thead>
<tr>
<th>场景编号</th>
<th>可作为发起方类型</th>
<th>可作为签署方的类型</th>
</tr>
</thead>

<tbody>
<tr>
<td>场景一</td>
<td>第三方子企业A员工</td>
<td>第三方子企业A员工</td>
</tr>

<tr>
<td>场景二</td>
<td>第三方子企业A员工</td>
<td>第三方子企业B(不指定经办人)</td>
</tr>

<tr>
<td>场景三</td>
<td>第三方子企业A员工</td>
<td>第三方子企业B员工</td>
</tr>

<tr>
<td>场景四</td>
<td>第三方子企业A员工</td>
<td>个人/自然人</td>
</tr>

<tr>
<td>场景五</td>
<td>第三方子企业A员工</td>
<td>SaaS平台企业员工</td>
</tr>
</tbody>
</table>

**注**: 
`1. 发起合同时候,  作为发起方的第三方子企业A员工的企业和员工必须经过实名, 而作为签署方的第三方子企业A员工/个人/自然人/SaaS平台企业员工/第三方子企业B员工企业中的企业和个人/员工可以未实名`
`2. 不同类型的签署方传参不同, 可以参考开发者中心的FlowApproverInfo结构体说明`
     * @param req ChannelCreateFlowByFilesRequest
     * @return ChannelCreateFlowByFilesResponse
     * @throws TencentCloudSDKException
     */
    public ChannelCreateFlowByFilesResponse ChannelCreateFlowByFiles(ChannelCreateFlowByFilesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ChannelCreateFlowByFiles", ChannelCreateFlowByFilesResponse.class);
    }

    /**
     *接口（ChannelCreateFlowGroupByFiles）用于通过多文件创建合同组签署流程。
     * @param req ChannelCreateFlowGroupByFilesRequest
     * @return ChannelCreateFlowGroupByFilesResponse
     * @throws TencentCloudSDKException
     */
    public ChannelCreateFlowGroupByFilesResponse ChannelCreateFlowGroupByFiles(ChannelCreateFlowGroupByFilesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ChannelCreateFlowGroupByFiles", ChannelCreateFlowGroupByFilesResponse.class);
    }

    /**
     *接口（ChannelCreateFlowGroupByTemplates）用于通过多模板创建合同组签署流程。
     * @param req ChannelCreateFlowGroupByTemplatesRequest
     * @return ChannelCreateFlowGroupByTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public ChannelCreateFlowGroupByTemplatesResponse ChannelCreateFlowGroupByTemplates(ChannelCreateFlowGroupByTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ChannelCreateFlowGroupByTemplates", ChannelCreateFlowGroupByTemplatesResponse.class);
    }

    /**
     *指定需要批量催办的签署流程Id，批量催办合同，最多100个；接口失败后返回错误信息
注意:
该接口不可直接调用，请联系客户经理申请使用
仅能催办当前状态为“待签署”的签署人，且只能催办一次
     * @param req ChannelCreateFlowRemindsRequest
     * @return ChannelCreateFlowRemindsResponse
     * @throws TencentCloudSDKException
     */
    public ChannelCreateFlowRemindsResponse ChannelCreateFlowReminds(ChannelCreateFlowRemindsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ChannelCreateFlowReminds", ChannelCreateFlowRemindsResponse.class);
    }

    /**
     *提交企业流程审批结果
目前存在两种审核操作，签署审核，发起审核
签署审核：通过接口（CreateFlowsByTemplates或ChannelCreateFlowByFiles或ChannelCreatePrepareFlow）发起签署流程后，若指定了参数 NeedSignReview 为true,则可以调用此接口，指定operate=SignReview，提交企业内部签署审批结果；若签署流程状态正常，且本企业存在签署方未签署，同一签署流程可以多次提交签署审批结果，签署时的最后一个“审批结果”有效

发起审核：通过接口ChannelCreatePrepareFlow指定发起后需要审核，则可以通过调用此接口，指定operate=CreateReview，提交企业内部审批结果，可多次提交，当通过后，后续提交结果无效
     * @param req ChannelCreateFlowSignReviewRequest
     * @return ChannelCreateFlowSignReviewResponse
     * @throws TencentCloudSDKException
     */
    public ChannelCreateFlowSignReviewResponse ChannelCreateFlowSignReview(ChannelCreateFlowSignReviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ChannelCreateFlowSignReview", ChannelCreateFlowSignReviewResponse.class);
    }

    /**
     *创建个人签署H5签署链接，请联系客户经理申请使用<br/>
该接口用于发起合同后，生成C端签署人的签署链接<br/>
注意：该接口目前签署人类型仅支持个人签署方（PERSON）<br/>
注意：该接口可生成签署链接的C端签署人必须仅有手写签名和时间类型的签署控件<br/>
注意：该接口返回的签署链接是用于APP集成的场景，支持APP打开或浏览器直接打开，不支持微信小程序嵌入。微信小程序请使用小程序跳转或半屏弹窗的方式<br/>
     * @param req ChannelCreateFlowSignUrlRequest
     * @return ChannelCreateFlowSignUrlResponse
     * @throws TencentCloudSDKException
     */
    public ChannelCreateFlowSignUrlResponse ChannelCreateFlowSignUrl(ChannelCreateFlowSignUrlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ChannelCreateFlowSignUrl", ChannelCreateFlowSignUrlResponse.class);
    }

    /**
     *此接口（ChannelCreateMultiFlowSignQRCode）用于创建一码多扫流程签署二维码。 适用场景：无需填写签署人信息，可通过模板id生成签署二维码，签署人可通过扫描二维码补充签署信息进行实名签署。常用于提前不知道签署人的身份信息场景，例如：劳务工招工、大批量员工入职等场景。

**本接口适用于发起方没有填写控件的 B2C或者单C模板**

**若是B2C模板,还要满足以下任意一个条件**

- 模板中配置的签署顺序是无序
- B端企业的签署方式是静默签署
- B端企业是非首位签署

通过一码多扫二维码发起的合同，合同涉及到的回调消息可参考文档[合同发起及签署相关回调
]( https://qian.tencent.com/developers/partner/callback_types_contracts_sign)

用户通过签署二维码发起合同时，因企业额度不足导致失败 会触发签署二维码相关回调,具体参考文档[签署二维码相关回调](https://qian.tencent.com/developers/partner/callback_types_commons#%E7%AD%BE%E7%BD%B2%E4%BA%8C%E7%BB%B4%E7%A0%81%E7%9B%B8%E5%85%B3%E5%9B%9E%E8%B0%83)
     * @param req ChannelCreateMultiFlowSignQRCodeRequest
     * @return ChannelCreateMultiFlowSignQRCodeResponse
     * @throws TencentCloudSDKException
     */
    public ChannelCreateMultiFlowSignQRCodeResponse ChannelCreateMultiFlowSignQRCode(ChannelCreateMultiFlowSignQRCodeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ChannelCreateMultiFlowSignQRCode", ChannelCreateMultiFlowSignQRCodeResponse.class);
    }

    /**
     *通过此接口，创建小程序批量签署链接，可以创建企业批量签署链接，员工只需点击链接即可跳转至控制台进行批量签署。

注：
- 员工必须在企业下完成实名认证，且需作为批量签署合同的签署方或者领取方。
- 仅支持传入待签署或者待领取的合同，待填写暂不支持。
- 员工批量签署，支持多种签名方式，包括手写签名、临摹签名、系统签名、个人印章，暂不支持签批控件
     * @param req ChannelCreateOrganizationBatchSignUrlRequest
     * @return ChannelCreateOrganizationBatchSignUrlResponse
     * @throws TencentCloudSDKException
     */
    public ChannelCreateOrganizationBatchSignUrlResponse ChannelCreateOrganizationBatchSignUrl(ChannelCreateOrganizationBatchSignUrlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ChannelCreateOrganizationBatchSignUrl", ChannelCreateOrganizationBatchSignUrlResponse.class);
    }

    /**
     *生成渠道子客编辑企业信息二维码
     * @param req ChannelCreateOrganizationModifyQrCodeRequest
     * @return ChannelCreateOrganizationModifyQrCodeResponse
     * @throws TencentCloudSDKException
     */
    public ChannelCreateOrganizationModifyQrCodeResponse ChannelCreateOrganizationModifyQrCode(ChannelCreateOrganizationModifyQrCodeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ChannelCreateOrganizationModifyQrCode", ChannelCreateOrganizationModifyQrCodeResponse.class);
    }

    /**
     *创建预发起合同
通过此接口指定：合同，签署人，填写控件信息，生成预创建合同链接，点击后跳转到web页面完成合同创建并发起
可指定合同信息不可更改，签署人信息不可更改
合同发起后，填写及签署流程与现有操作流程一致
注意：目前仅支持模板发起
     * @param req ChannelCreatePrepareFlowRequest
     * @return ChannelCreatePrepareFlowResponse
     * @throws TencentCloudSDKException
     */
    public ChannelCreatePrepareFlowResponse ChannelCreatePrepareFlow(ChannelCreatePrepareFlowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ChannelCreatePrepareFlow", ChannelCreatePrepareFlowResponse.class);
    }

    /**
     *本接口（ChannelCreatePreparedPersonalEsign）用于创建导入个人印章（处方单场景专用，使用此接口请与客户经理确认）。
     * @param req ChannelCreatePreparedPersonalEsignRequest
     * @return ChannelCreatePreparedPersonalEsignResponse
     * @throws TencentCloudSDKException
     */
    public ChannelCreatePreparedPersonalEsignResponse ChannelCreatePreparedPersonalEsign(ChannelCreatePreparedPersonalEsignRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ChannelCreatePreparedPersonalEsign", ChannelCreatePreparedPersonalEsignResponse.class);
    }

    /**
     *发起解除协议，主要应用场景为：基于一份已经签署的合同，进行解除操作。
合同发起人必须在电子签已经进行实名。
     * @param req ChannelCreateReleaseFlowRequest
     * @return ChannelCreateReleaseFlowResponse
     * @throws TencentCloudSDKException
     */
    public ChannelCreateReleaseFlowResponse ChannelCreateReleaseFlow(ChannelCreateReleaseFlowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ChannelCreateReleaseFlow", ChannelCreateReleaseFlowResponse.class);
    }

    /**
     *此接口（ChannelCreateRole）用来创建企业自定义角色。

适用场景1：创建当前企业的自定义角色，并且创建时不进行权限的设置（PermissionGroups 参数不传），角色中的权限内容可通过接口 ChannelModifyRole 完成更新。

适用场景2：创建当前企业的自定义角色，并且创建时进行权限的设置（PermissionGroups 参数要传），权限树内容 PermissionGroups 可参考接口 ChannelDescribeRoles 的输出。此处注意权限树内容可能会更新，需尽量拉取最新的权限树内容，并且权限树内容 PermissionGroups 必须是一颗完整的权限树。
     * @param req ChannelCreateRoleRequest
     * @return ChannelCreateRoleResponse
     * @throws TencentCloudSDKException
     */
    public ChannelCreateRoleResponse ChannelCreateRole(ChannelCreateRoleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ChannelCreateRole", ChannelCreateRoleResponse.class);
    }

    /**
     *将指定印章授权给第三方平台子客企业下的某些员工
     * @param req ChannelCreateSealPolicyRequest
     * @return ChannelCreateSealPolicyResponse
     * @throws TencentCloudSDKException
     */
    public ChannelCreateSealPolicyResponse ChannelCreateSealPolicy(ChannelCreateSealPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ChannelCreateSealPolicy", ChannelCreateSealPolicyResponse.class);
    }

    /**
     *企业方可以通过此接口获取个人用户开启自动签的跳转链接
     * @param req ChannelCreateUserAutoSignEnableUrlRequest
     * @return ChannelCreateUserAutoSignEnableUrlResponse
     * @throws TencentCloudSDKException
     */
    public ChannelCreateUserAutoSignEnableUrlResponse ChannelCreateUserAutoSignEnableUrl(ChannelCreateUserAutoSignEnableUrlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ChannelCreateUserAutoSignEnableUrl", ChannelCreateUserAutoSignEnableUrlResponse.class);
    }

    /**
     *获取设置自动签印章小程序链接。

注意：
<ul><li>需要<code>企业开通自动签</code>后使用。</li>
<li>仅支持<code>已经开通了自动签的个人</code>更换自动签印章。</li>
<li>链接有效期默认7天，<code>最多30天</code>。</li>
<li>该接口的链接适用于<code>小程序</code>端。</li>
<li>该接口不会扣除您的合同套餐，暂不参与计费。</li></ul>
     * @param req ChannelCreateUserAutoSignSealUrlRequest
     * @return ChannelCreateUserAutoSignSealUrlResponse
     * @throws TencentCloudSDKException
     */
    public ChannelCreateUserAutoSignSealUrlResponse ChannelCreateUserAutoSignSealUrl(ChannelCreateUserAutoSignSealUrlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ChannelCreateUserAutoSignSealUrl", ChannelCreateUserAutoSignSealUrlResponse.class);
    }

    /**
     *通过此接口，绑定员工角色，支持以电子签userId、客户系统userId两种方式调用。
     * @param req ChannelCreateUserRolesRequest
     * @return ChannelCreateUserRolesResponse
     * @throws TencentCloudSDKException
     */
    public ChannelCreateUserRolesResponse ChannelCreateUserRoles(ChannelCreateUserRolesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ChannelCreateUserRoles", ChannelCreateUserRolesResponse.class);
    }

    /**
     *用来创建嵌入式页面个性化主题配置（例如是否展示电子签logo、定义主题色等），该接口配合其他所有可嵌入页面接口使用
创建配置对当前第三方应用全局生效，如果多次调用，会以最后一次的配置为准
     * @param req ChannelCreateWebThemeConfigRequest
     * @return ChannelCreateWebThemeConfigResponse
     * @throws TencentCloudSDKException
     */
    public ChannelCreateWebThemeConfigResponse ChannelCreateWebThemeConfig(ChannelCreateWebThemeConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ChannelCreateWebThemeConfig", ChannelCreateWebThemeConfigResponse.class);
    }

    /**
     *此接口（ChannelDeleteRole）用来删除企业自定义角色。

注意：系统角色不可删除。
     * @param req ChannelDeleteRoleRequest
     * @return ChannelDeleteRoleResponse
     * @throws TencentCloudSDKException
     */
    public ChannelDeleteRoleResponse ChannelDeleteRole(ChannelDeleteRoleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ChannelDeleteRole", ChannelDeleteRoleResponse.class);
    }

    /**
     *通过此接口，删除员工绑定的角色，支持以电子签userId、客户系统userId两种方式调用。
     * @param req ChannelDeleteRoleUsersRequest
     * @return ChannelDeleteRoleUsersResponse
     * @throws TencentCloudSDKException
     */
    public ChannelDeleteRoleUsersResponse ChannelDeleteRoleUsers(ChannelDeleteRoleUsersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ChannelDeleteRoleUsers", ChannelDeleteRoleUsersResponse.class);
    }

    /**
     *删除指定印章下多个授权信息
     * @param req ChannelDeleteSealPoliciesRequest
     * @return ChannelDeleteSealPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public ChannelDeleteSealPoliciesResponse ChannelDeleteSealPolicies(ChannelDeleteSealPoliciesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ChannelDeleteSealPolicies", ChannelDeleteSealPoliciesResponse.class);
    }

    /**
     *查询企业员工列表
     * @param req ChannelDescribeEmployeesRequest
     * @return ChannelDescribeEmployeesResponse
     * @throws TencentCloudSDKException
     */
    public ChannelDescribeEmployeesResponse ChannelDescribeEmployees(ChannelDescribeEmployeesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ChannelDescribeEmployees", ChannelDescribeEmployeesResponse.class);
    }

    /**
     *查询流程填写控件内容，可以根据流程Id查询该流程相关联的填写控件信息和填写内容。 注意：使用此接口前，需要在【企业应用管理】-【应用集成】-【第三方应用管理】中开通【下载应用内全量合同文件及内容数据】功能。
     * @param req ChannelDescribeFlowComponentsRequest
     * @return ChannelDescribeFlowComponentsResponse
     * @throws TencentCloudSDKException
     */
    public ChannelDescribeFlowComponentsResponse ChannelDescribeFlowComponents(ChannelDescribeFlowComponentsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ChannelDescribeFlowComponents", ChannelDescribeFlowComponentsResponse.class);
    }

    /**
     *查询子客企业电子印章，需要操作者具有管理印章权限
客户指定需要获取的印章数量和偏移量，数量最多100，超过100按100处理；入参InfoType控制印章是否携带授权人信息，为1则携带，为0则返回的授权人信息为空数组。接口调用成功返回印章的信息列表还有企业印章的总数，只返回启用的印章。
     * @param req ChannelDescribeOrganizationSealsRequest
     * @return ChannelDescribeOrganizationSealsResponse
     * @throws TencentCloudSDKException
     */
    public ChannelDescribeOrganizationSealsResponse ChannelDescribeOrganizationSeals(ChannelDescribeOrganizationSealsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ChannelDescribeOrganizationSeals", ChannelDescribeOrganizationSealsResponse.class);
    }

    /**
     *分页查询企业角色列表，法人的角色是系统保留角色，不会返回，按照角色创建时间升序排列。
相关系统默认角色说明可参考文档：https://cloud.tencent.com/document/product/1323/61355
     * @param req ChannelDescribeRolesRequest
     * @return ChannelDescribeRolesResponse
     * @throws TencentCloudSDKException
     */
    public ChannelDescribeRolesResponse ChannelDescribeRoles(ChannelDescribeRolesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ChannelDescribeRoles", ChannelDescribeRolesResponse.class);
    }

    /**
     *企业方可以通过此接口查询个人用户自动签开启状态
     * @param req ChannelDescribeUserAutoSignStatusRequest
     * @return ChannelDescribeUserAutoSignStatusResponse
     * @throws TencentCloudSDKException
     */
    public ChannelDescribeUserAutoSignStatusResponse ChannelDescribeUserAutoSignStatus(ChannelDescribeUserAutoSignStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ChannelDescribeUserAutoSignStatus", ChannelDescribeUserAutoSignStatusResponse.class);
    }

    /**
     *企业方可以通过此接口关闭个人的自动签功能
     * @param req ChannelDisableUserAutoSignRequest
     * @return ChannelDisableUserAutoSignResponse
     * @throws TencentCloudSDKException
     */
    public ChannelDisableUserAutoSignResponse ChannelDisableUserAutoSign(ChannelDisableUserAutoSignRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ChannelDisableUserAutoSign", ChannelDisableUserAutoSignResponse.class);
    }

    /**
     *查询转换任务的状态。转换任务Id通过发起转换任务接口（ChannelCreateConvertTaskApi）获取。
注意：大文件转换所需的时间可能会比较长。
     * @param req ChannelGetTaskResultApiRequest
     * @return ChannelGetTaskResultApiResponse
     * @throws TencentCloudSDKException
     */
    public ChannelGetTaskResultApiResponse ChannelGetTaskResultApi(ChannelGetTaskResultApiRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ChannelGetTaskResultApi", ChannelGetTaskResultApiResponse.class);
    }

    /**
     *此接口（ChannelModifyRole）用来更新企业自定义角色。

适用场景1：更新当前企业的自定义角色的名称或描述等其他信息，更新时不进行权限的设置（PermissionGroups 参数不传）。

适用场景2：更新当前企业的自定义角色的权限信息，更新时进行权限的设置（PermissionGroups 参数要传），权限树内容 PermissionGroups 可参考接口 ChannelDescribeRoles 的输出。此处注意权限树内容可能会更新，需尽量拉取最新的权限树内容，并且权限树内容 PermissionGroups 必须是一颗完整的权限树。
     * @param req ChannelModifyRoleRequest
     * @return ChannelModifyRoleResponse
     * @throws TencentCloudSDKException
     */
    public ChannelModifyRoleResponse ChannelModifyRole(ChannelModifyRoleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ChannelModifyRole", ChannelModifyRoleResponse.class);
    }

    /**
     *本接口（ChannelUpdateSealStatus）用于第三方应用平台为子客企业更新印章状态
     * @param req ChannelUpdateSealStatusRequest
     * @return ChannelUpdateSealStatusResponse
     * @throws TencentCloudSDKException
     */
    public ChannelUpdateSealStatusResponse ChannelUpdateSealStatus(ChannelUpdateSealStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ChannelUpdateSealStatus", ChannelUpdateSealStatusResponse.class);
    }

    /**
     *对合同流程文件进行数字签名验证，判断数字签名是否有效，合同文件内容是否被篡改。
     * @param req ChannelVerifyPdfRequest
     * @return ChannelVerifyPdfResponse
     * @throws TencentCloudSDKException
     */
    public ChannelVerifyPdfResponse ChannelVerifyPdf(ChannelVerifyPdfRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ChannelVerifyPdf", ChannelVerifyPdfResponse.class);
    }

    /**
     *提交申请出证报告任务并返回报告ID。

注意：
<ul><li>使用此功能`需搭配出证套餐` ，使用前请联系对接的客户经理沟通。</li>
<li>操作人必须是`发起方或者签署方企业的(非走授权书认证)法人或者超管`。</li>
<li>合同流程必须所有参与方`已经签署完成`。</li>
<li>出证过程需一定时间，建议在`提交出证任务后的24小时之后`，通过<a href="https://qian.tencent.com/developers/partnerApis/certificate/DescribeChannelFlowEvidenceReport" target="_blank">获取出证报告任务执行结果</a>接口进行查询执行结果和出证报告的下载URL。</li></ul>

<svg id="SvgjsSvg1006" width="262" height="229" xmlns="http://www.w3.org/2000/svg" version="1.1" xmlns:xlink="http://www.w3.org/1999/xlink" xmlns:svgjs="http://svgjs.com/svgjs"><defs id="SvgjsDefs1007"><pattern patternUnits="userSpaceOnUse" id="pattern_mark_0" width="300" height="300"><text x="150" y="100" fill="rgba(229,229,229,0.8)" font-size="18" transform="rotate(-45, 150, 150)" style="dominant-baseline: middle; text-anchor: middle;"></text></pattern><pattern patternUnits="userSpaceOnUse" id="pattern_mark_1" width="300" height="300"><text x="150" y="200" fill="rgba(229,229,229,0.8)" font-size="18" transform="rotate(-45, 150, 150)" style="dominant-baseline: middle; text-anchor: middle;"></text></pattern><marker id="SvgjsMarker1021" markerWidth="12" markerHeight="8" refX="9" refY="4" viewBox="0 0 12 8" orient="auto" markerUnits="userSpaceOnUse" stroke-dasharray="0,0"><path id="SvgjsPath1022" d="M0,0 L12,4 L0,8 L0,0" fill="#323232" stroke="#323232" stroke-width="1"></path></marker></defs><rect id="svgbackgroundid" width="262" height="229" fill="transparent"></rect><rect id="SvgjsRect1009" width="262" height="229" fill="url(#pattern_mark_0)"></rect><rect id="SvgjsRect1010" width="262" height="229" fill="url(#pattern_mark_1)"></rect><g id="SvgjsG1011" transform="translate(31.75,25)"><path id="SvgjsPath1012" d="M 0 0L 198 0L 198 59L 0 59Z" stroke="rgba(86,146,48,1)" stroke-width="1" fill-opacity="1" fill="#e7ebed"></path><g id="SvgjsG1013"><text id="SvgjsText1014" font-family="微软雅黑" text-anchor="middle" font-size="13px" width="178px" fill="#323232" font-weight="400" align="middle" lineHeight="125%" anchor="middle" family="微软雅黑" size="13px" weight="400" font-style="" opacity="1" y="10.375" transform="rotate(0)"><tspan id="SvgjsTspan1015" dy="16" x="99"><tspan id="SvgjsTspan1016" style="text-decoration:;fill: rgb(28, 30, 33);">CreateFlowEvidenceReport</tspan></tspan><tspan id="SvgjsTspan1017" dy="16" x="99"><tspan id="SvgjsTspan1018" style="text-decoration:;fill: rgb(51, 51, 51);">提交申请出证报告任务</tspan></tspan></text></g></g><g id="SvgjsG1019"><path id="SvgjsPath1020" d="M130.75 84.5L130.75 114.5L130.75 114.5L130.75 143.2" stroke="#323232" stroke-width="1" fill="none" marker-end="url(#SvgjsMarker1021)"></path></g><g id="SvgjsG1023" transform="translate(25,145)"><path id="SvgjsPath1024" d="M 0 0L 211.5 0L 211.5 59L 0 59Z" stroke="rgba(86,146,48,1)" stroke-width="1" fill-opacity="1" fill="#e7ebed"></path><g id="SvgjsG1025"><text id="SvgjsText1026" font-family="微软雅黑" text-anchor="middle" font-size="13px" width="192px" fill="#323232" font-weight="400" align="middle" lineHeight="125%" anchor="middle" family="微软雅黑" size="13px" weight="400" font-style="" opacity="1" y="10.375" transform="rotate(0)"><tspan id="SvgjsTspan1027" dy="16" x="106"><tspan id="SvgjsTspan1028" style="text-decoration:;fill: rgb(28, 30, 33);">DescribeFlowEvidenceReport</tspan></tspan><tspan id="SvgjsTspan1029" dy="16" x="106"><tspan id="SvgjsTspan1030" style="text-decoration:;fill: rgb(51, 51, 51);">获取出证报告任务执行结果</tspan></tspan></text></g></g></svg>
     * @param req CreateChannelFlowEvidenceReportRequest
     * @return CreateChannelFlowEvidenceReportResponse
     * @throws TencentCloudSDKException
     */
    public CreateChannelFlowEvidenceReportResponse CreateChannelFlowEvidenceReport(CreateChannelFlowEvidenceReportRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateChannelFlowEvidenceReport", CreateChannelFlowEvidenceReportResponse.class);
    }

    /**
     *此接口（CreateChannelOrganizationInfoChangeUrl）用于创建子客企业信息变更链接（需要在移动端打开，会跳转到微信小程序），支持创建企业超管变更链接或企业基础信息变更链接，通过入参 ChangeType 指定。


<h3 id="1-企业超管变更">1. 企业超管变更</h3>

<p>换成企业的其他员工来当超管</p>

<h3 id="2-企业基础信息变更">2. 企业基础信息变更</h3>

<h4 id="可以变动">可以变动</h4>

<ul>
<li>企业名称<br>
</li>
<li>法定代表人姓名(新法人有邀请链接)<br>
</li>
<li>企业地址和所在地</li>
</ul>

<h4 id="不可变动">不可变动</h4>

<ul>
<li>统一社会信用代码<br>
</li>
<li>企业主体类型</li>
</ul>

<p>如果企业名称变动会引起下面的变动</p>

<ul>
<li>合同:   老合同不做任何处理,   新发起的合同需要用新的企业名字作为签署方, 否则无法签署</li>
<li>印章:   会删除所有的印章所有的机构公章和合同专用章,  然后用新企业名称生成新的机构公章 和合同专用章,  而法人章, 财务专用章和人事专用章不会处理</li>
<li>证书:   企业证书会重新请求CA机构用新企业名称生成新的证书</li>
</ul>
     * @param req CreateChannelOrganizationInfoChangeUrlRequest
     * @return CreateChannelOrganizationInfoChangeUrlResponse
     * @throws TencentCloudSDKException
     */
    public CreateChannelOrganizationInfoChangeUrlResponse CreateChannelOrganizationInfoChangeUrl(CreateChannelOrganizationInfoChangeUrlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateChannelOrganizationInfoChangeUrl", CreateChannelOrganizationInfoChangeUrlResponse.class);
    }

    /**
     *此接口（CreateConsoleLoginUrl）用于创建第三方平台子客企业控制台Web/移动登录链接。支持web控制台、电子签小程序和H5链接。登录链接是进入子客控制台的唯一入口。
链接访问后，会根据企业的和员工的状态（企业根据ProxyOrganizationOpenId参数，员工根据OpenId参数判断），进入不同的流程，主要情况分类如下：
1. 若子客企业未激活，会进入企业激活流程，首次参与激活流程的经办人会成为超管。
2. 若子客企业已激活，员工未激活，则会进入经办人激活流程。
3. 若子客企业、经办人均已完成认证，则会直接进入子客Web控制台。

如果是企业激活流程，需要注意如下情况：

1. 若在激活过程中，更换用户OpenID重新生成链接，之前的认证会被清理。因此不要在认证过程中多人同时操作，导致认证过程互相影响。
2. 若您认证中发现信息有误需要重新认证，可以通过更换OpenID重新生成链接的方式，来清理掉已有的流程。
     * @param req CreateConsoleLoginUrlRequest
     * @return CreateConsoleLoginUrlResponse
     * @throws TencentCloudSDKException
     */
    public CreateConsoleLoginUrlResponse CreateConsoleLoginUrl(CreateConsoleLoginUrlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateConsoleLoginUrl", CreateConsoleLoginUrlResponse.class);
    }

    /**
     *接口（CreateFlowsByTemplates）用于使用模板批量创建签署流程。当前可批量发起合同（签署流程）数量为1-20个。
如若在模板中配置了动态表格, 上传的附件必须为A4大小 
合同发起人必须在电子签已经进行实名。

**整体的逻辑如下**

![image](https://dyn.ess.tencent.cn/guide/capi/CreateFlowsByTemplates.png)

**可以作为发起方和签署方的角色列表**
<table>
<thead>
<tr>
<th>场景编号</th>
<th>可作为发起方类型</th>
<th>可作为签署方的类型</th>
</tr>
</thead>

<tbody>
<tr>
<td>场景一</td>
<td>第三方子企业A员工</td>
<td>第三方子企业A员工</td>
</tr>

<tr>
<td>场景二</td>
<td>第三方子企业A员工</td>
<td>第三方子企业B(不指定经办人)</td>
</tr>

<tr>
<td>场景三</td>
<td>第三方子企业A员工</td>
<td>第三方子企业B员工</td>
</tr>

<tr>
<td>场景四</td>
<td>第三方子企业A员工</td>
<td>个人/自然人</td>
</tr>

<tr>
<td>场景五</td>
<td>第三方子企业A员工</td>
<td>SaaS平台企业员工</td>
</tr>
</tbody>
</table>

**注**: 
`1. 发起合同时候,  作为发起方的第三方子企业A员工的企业和员工必须经过实名, 而作为签署方的第三方子企业A员工/个人/自然人/SaaS平台企业员工/第三方子企业B员工企业中的企业和个人/员工可以未实名`
`2. 不同类型的签署方传参不同, 可以参考开发者中心的FlowApproverInfo结构体说明`
     * @param req CreateFlowsByTemplatesRequest
     * @return CreateFlowsByTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public CreateFlowsByTemplatesResponse CreateFlowsByTemplates(CreateFlowsByTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateFlowsByTemplates", CreateFlowsByTemplatesResponse.class);
    }

    /**
     *通过图片为子客企业代创建印章，图片最大5MB
     * @param req CreateSealByImageRequest
     * @return CreateSealByImageResponse
     * @throws TencentCloudSDKException
     */
    public CreateSealByImageResponse CreateSealByImage(CreateSealByImageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSealByImage", CreateSealByImageResponse.class);
    }

    /**
     *创建跳转小程序查看或签署的链接。

跳转小程序的几种方式：主要是设置不同的EndPoint
1. 通过链接Url直接跳转到小程序，不需要返回
设置EndPoint为WEIXINAPP，得到链接打开即可。（与短信提醒用户签署形式一样）。

2. 通过链接Url打开H5引导页-->点击跳转到小程序-->签署完退出小程序-->回到H5引导页-->跳转到指定JumpUrl
设置EndPoint为CHANNEL，指定JumpUrl，得到链接打开即可。

3. 客户App直接跳转到小程序-->小程序签署完成-->返回App
跳转到小程序的实现，参考官方文档
https://developers.weixin.qq.com/miniprogram/dev/framework/open-ability/launchApp.html
其中小程序的原始Id，请联系<对接技术人员>获取，或者查看小程序信息自助获取。
使用CreateSignUrls，设置EndPoint为APP，得到path。

4. 客户小程序直接跳到电子签小程序-->签署完成退出电子签小程序-->回到客户小程序
跳转到小程序的实现，参考官方文档（分为全屏、半屏两种方式）
全屏方式：
（https://developers.weixin.qq.com/miniprogram/dev/api/navigate/wx.navigateToMiniProgram.html ）
半屏方式：
（https://developers.weixin.qq.com/miniprogram/dev/framework/open-ability/openEmbeddedMiniProgram.html ）
其中小程序的原始Id，请联系<对接技术人员>获取，或者查看小程序信息自助获取。
使用CreateSignUrls，设置EndPoint为APP，得到path。

其中小程序的原始Id如下，或者查看小程序信息自助获取。

| 小程序 | AppID | 原始ID |
| ------------ | ------------ | ------------ |
| 腾讯电子签（正式版） | wxa023b292fd19d41d | gh_da88f6188665 |
| 腾讯电子签Demo | wx371151823f6f3edf | gh_39a5d3de69fa |
     * @param req CreateSignUrlsRequest
     * @return CreateSignUrlsResponse
     * @throws TencentCloudSDKException
     */
    public CreateSignUrlsResponse CreateSignUrls(CreateSignUrlsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSignUrls", CreateSignUrlsResponse.class);
    }

    /**
     *查询出证报告，返回报告 URL。
     * @param req DescribeChannelFlowEvidenceReportRequest
     * @return DescribeChannelFlowEvidenceReportResponse
     * @throws TencentCloudSDKException
     */
    public DescribeChannelFlowEvidenceReportResponse DescribeChannelFlowEvidenceReport(DescribeChannelFlowEvidenceReportRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeChannelFlowEvidenceReport", DescribeChannelFlowEvidenceReportResponse.class);
    }

    /**
     *查询企业扩展服务的开通和授权情况，当前支持查询以下内容：
1. 企业自动签
2. 企业与港澳台居民签署合同
3. 使用手机号验证签署方身份
4. 骑缝章
5. 拓宽签署方年龄限制

注: 此接口 参数Agent. ProxyOperator.OpenId 需要传递超管或者法人的OpenId
     * @param req DescribeExtendedServiceAuthInfoRequest
     * @return DescribeExtendedServiceAuthInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExtendedServiceAuthInfoResponse DescribeExtendedServiceAuthInfo(DescribeExtendedServiceAuthInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeExtendedServiceAuthInfo", DescribeExtendedServiceAuthInfoResponse.class);
    }

    /**
     *此接口（DescribeFlowDetailInfo）用于查询合同(签署流程)的详细信息。
     * @param req DescribeFlowDetailInfoRequest
     * @return DescribeFlowDetailInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFlowDetailInfoResponse DescribeFlowDetailInfo(DescribeFlowDetailInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFlowDetailInfo", DescribeFlowDetailInfoResponse.class);
    }

    /**
     *根据签署流程信息批量获取资源下载链接，可以下载签署中、签署完的合同，需合作企业先进行授权。
此接口直接返回下载的资源的url，与接口GetDownloadFlowUrl跳转到控制台的下载方式不同。
     * @param req DescribeResourceUrlsByFlowsRequest
     * @return DescribeResourceUrlsByFlowsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourceUrlsByFlowsResponse DescribeResourceUrlsByFlows(DescribeResourceUrlsByFlowsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeResourceUrlsByFlows", DescribeResourceUrlsByFlowsResponse.class);
    }

    /**
     *通过此接口（DescribeTemplates）查询该第三方平台子客企业在电子签拥有的有效模板，不包括第三方平台模板。

> **适用场景** 
>
>  该接口常用来配合“使用模板创建签署流程”接口作为前置的接口使用。 
>  一个模板通常会包含以下结构信息
>- 模板基本信息
>- 发起方参与信息Promoter、签署参与方 Recipients，后者会在模板发起合同时用于指定参与方
>- 填写控件 Components
>- 签署控件 SignComponents
>- 生成模板的文件基础信息 FileInfos
     * @param req DescribeTemplatesRequest
     * @return DescribeTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTemplatesResponse DescribeTemplates(DescribeTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTemplates", DescribeTemplatesResponse.class);
    }

    /**
     *此接口（DescribeUsage）用于获取第三方平台所有合作企业流量消耗情况。
 注: 此接口每日限频50次，若要扩大限制次数,请提前与客服经理或邮件至e-contract@tencent.com进行联系。
     * @param req DescribeUsageRequest
     * @return DescribeUsageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUsageResponse DescribeUsage(DescribeUsageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUsage", DescribeUsageResponse.class);
    }

    /**
     *此接口（GetDownloadFlowUrl）用于创建电子签批量下载地址，让合作企业进入控制台直接下载，支持客户合同（流程）按照自定义文件夹形式 分类下载。
当前接口限制最多合同（流程）50个.
返回的链接只能使用一次
     * @param req GetDownloadFlowUrlRequest
     * @return GetDownloadFlowUrlResponse
     * @throws TencentCloudSDKException
     */
    public GetDownloadFlowUrlResponse GetDownloadFlowUrl(GetDownloadFlowUrlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetDownloadFlowUrl", GetDownloadFlowUrlResponse.class);
    }

    /**
     *修改（操作）企业扩展服务 ，企业经办人需要是企业超管或者法人。

跳转小程序的几种方式：主要是设置不同的EndPoint
1. 通过链接Url直接跳转到小程序，不需要返回
设置EndPoint为WEIXINAPP，得到链接打开即可。

2. 客户App直接跳转到小程序-->腾讯电子签小程序操作完成-->返回App
跳转到小程序的实现，参考官方文档
https://developers.weixin.qq.com/miniprogram/dev/framework/open-ability/launchApp.html
其中小程序的原始Id，请联系<对接技术人员>获取，或者查看小程序信息自助获取。
设置EndPoint为APP，得到path。

4. 客户小程序直接跳到电子签小程序-->腾讯电子签小程序操作完成--->回到客户小程序
跳转到小程序的实现，参考官方文档（分为全屏、半屏两种方式）
全屏方式：
（https://developers.weixin.qq.com/miniprogram/dev/api/navigate/wx.navigateToMiniProgram.html）
半屏方式：
（https://developers.weixin.qq.com/miniprogram/dev/framework/open-ability/openEmbeddedMiniProgram.html）
其中小程序的原始Id，请联系<对接技术人员>获取，或者查看小程序信息自助获取。
设置EndPoint为APP，得到path。

其中小程序的原始Id如下，或者查看小程序信息自助获取。

| 小程序 | AppID | 原始ID |
| ------------ | ------------ | ------------ |
| 腾讯电子签（正式版） | wxa023b292fd19d41d | gh_da88f6188665 |
| 腾讯电子签Demo | wx371151823f6f3edf | gh_39a5d3de69fa |
     * @param req ModifyExtendedServiceRequest
     * @return ModifyExtendedServiceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyExtendedServiceResponse ModifyExtendedService(ModifyExtendedServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyExtendedService", ModifyExtendedServiceResponse.class);
    }

    /**
     *此接口（OperateChannelTemplate）用于针对第三方应用平台模板库中的模板对子客企业可见性的查询和设置。

> **使用场景**
>
>  1：查询 OperateType=SELECT
> - 查询第三方应用平台模板库的可见性以及授权的子客列表。
>
>  2：修改部分子客授权 OperateType=UPDATE
> - 对子客企业进行模板库中模板可见性的进行修改操作。
>- 当模板未发布时，可以修改可见性AuthTag（part/all），当模板发布后，不可做此修改
> - 若模板已发布且可见性AuthTag是part，可以通过ProxyOrganizationOpenIds增加子客的授权范围。如果是自动领取的模板，增加授权范围后会自动下发。
>
>  3：取消部分子客授权 OperateType=DELETE
> - 对子客企业进行模板库中模板可见性的进行删除操作。
> - 主要对于手动领取的模板，去除授权后子客在模板库中看不到，就无法再领取了。但是已经领取过成为自有模板的不会同步删除。
> - 对于自动领取的模板，由于已经下发，更改授权不会影响。
> - 如果要同步删除子客自有模板库中的模板，请使用OperateType=UPDATE+Available参数处理。
     * @param req OperateChannelTemplateRequest
     * @return OperateChannelTemplateResponse
     * @throws TencentCloudSDKException
     */
    public OperateChannelTemplateResponse OperateChannelTemplate(OperateChannelTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "OperateChannelTemplate", OperateChannelTemplateResponse.class);
    }

    /**
     *该接口 (PrepareFlows) 用于创建待发起文件
用户通过该接口进入签署流程发起的确认页面，进行发起信息二次确认， 如果确认则进行正常发起。
目前该接口只支持B2C，不建议使用，将会废弃。
     * @param req PrepareFlowsRequest
     * @return PrepareFlowsResponse
     * @throws TencentCloudSDKException
     */
    public PrepareFlowsResponse PrepareFlows(PrepareFlowsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PrepareFlows", PrepareFlowsResponse.class);
    }

    /**
     *此接口（SyncProxyOrganization）用于同步第三方平台子客企业信息，包括企业名称，企业营业执照，企业统一社会信用代码和法人姓名等，便于子客企业在企业激活过程中无需手动上传营业执照或补充企业信息。注意：
1. 需要在子客企业激活前调用该接口，如果您的企业已经提交企业信息或者企业已经激活，同步的企业信息将不会生效。
2. 如果您同时传递了营业执照信息和企业名称等信息，在认证过程中将以营业执照中的企业信息为准，请注意企业信息需要和营业执照信息对应。
     * @param req SyncProxyOrganizationRequest
     * @return SyncProxyOrganizationResponse
     * @throws TencentCloudSDKException
     */
    public SyncProxyOrganizationResponse SyncProxyOrganization(SyncProxyOrganizationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SyncProxyOrganization", SyncProxyOrganizationResponse.class);
    }

    /**
     *此接口（SyncProxyOrganizationOperators）用于同步 第三方平台子客企业经办人列表，主要是同步经办人的离职状态。子客Web控制台的组织架构管理，是依赖于第三方应用平台的，无法针对员工做新增/更新/离职等操作。 
若经办人信息有误，或者需要修改，也可以先将之前的经办人做离职操作，然后重新使用控制台链接CreateConsoleLoginUrl让经办人重新实名。
     * @param req SyncProxyOrganizationOperatorsRequest
     * @return SyncProxyOrganizationOperatorsResponse
     * @throws TencentCloudSDKException
     */
    public SyncProxyOrganizationOperatorsResponse SyncProxyOrganizationOperators(SyncProxyOrganizationOperatorsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SyncProxyOrganizationOperators", SyncProxyOrganizationOperatorsResponse.class);
    }

    /**
     *此接口（UploadFiles）用于文件上传。
其中上传的文件，图片类型(png/jpg/jpeg)大小限制为5M，其他大小限制为60M。
调用时需要设置Domain, 正式环境为 file.ess.tencent.cn。
代码示例：
HttpProfile httpProfile = new HttpProfile();
httpProfile.setEndpoint("file.test.ess.tencent.cn");
     * @param req UploadFilesRequest
     * @return UploadFilesResponse
     * @throws TencentCloudSDKException
     */
    public UploadFilesResponse UploadFiles(UploadFilesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UploadFiles", UploadFilesResponse.class);
    }

}

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
package com.tencentcloudapi.mrs.v20200910;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.mrs.v20200910.models.*;

public class MrsClient extends AbstractClient{
    private static String endpoint = "mrs.tencentcloudapi.com";
    private static String service = "mrs";
    private static String version = "2020-09-10";
    
    public MrsClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public MrsClient(Credential credential, String region, ClientProfile profile) {
        super(MrsClient.endpoint, MrsClient.version, credential, region, profile);
    }

    /**
     *图片分类
     * @param req ImageToClassRequest
     * @return ImageToClassResponse
     * @throws TencentCloudSDKException
     */
    public ImageToClassResponse ImageToClass(ImageToClassRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ImageToClass", ImageToClassResponse.class);
    }

    /**
     *图片转结构化对象
     * @param req ImageToObjectRequest
     * @return ImageToObjectResponse
     * @throws TencentCloudSDKException
     */
    public ImageToObjectResponse ImageToObject(ImageToObjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ImageToObject", ImageToObjectResponse.class);
    }

    /**
     *文本分类
     * @param req TextToClassRequest
     * @return TextToClassResponse
     * @throws TencentCloudSDKException
     */
    public TextToClassResponse TextToClass(TextToClassRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TextToClass", TextToClassResponse.class);
    }

    /**
     *文本转结构化对象。

适用场景：经过腾讯医疗专用 OCR 从图片识别之后的文本，可以调用此接口。通过其它 OCR 识别的文本可能不适配。医院的 XML 格式文本也不适配，XML 文件需要经过特殊转换才能直接调用此接口。单次调用传入的文本不宜超过 2000 字。
     * @param req TextToObjectRequest
     * @return TextToObjectResponse
     * @throws TencentCloudSDKException
     */
    public TextToObjectResponse TextToObject(TextToObjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TextToObject", TextToObjectResponse.class);
    }

    /**
     *将PDF格式的体检报告文件结构化，解析关键信息。
注意：该接口是按照体检报告 PDF 页面数量统计次数，不是按照 PDF 文件数量统计次数。通过该接口传入的报告必须是体检报告，非体检报告可能无法正确解析。
     * @param req TurnPDFToObjectRequest
     * @return TurnPDFToObjectResponse
     * @throws TencentCloudSDKException
     */
    public TurnPDFToObjectResponse TurnPDFToObject(TurnPDFToObjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TurnPDFToObject", TurnPDFToObjectResponse.class);
    }

}

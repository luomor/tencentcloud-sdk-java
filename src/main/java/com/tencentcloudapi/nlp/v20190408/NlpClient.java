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
package com.tencentcloudapi.nlp.v20190408;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.nlp.v20190408.models.*;

public class NlpClient extends AbstractClient{
    private static String endpoint = "nlp.tencentcloudapi.com";
    private static String service = "nlp";
    private static String version = "2019-04-08";
    
    public NlpClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public NlpClient(Credential credential, String region, ClientProfile profile) {
        super(NlpClient.endpoint, NlpClient.version, credential, region, profile);
    }

    /**
     *情感分析接口能够对带有情感色彩的主观性文本进行分析、处理、归纳和推理，识别出用户的情感倾向，是积极、中性还是消极，并且提供各自概率。
     * @param req AnalyzeSentimentRequest
     * @return AnalyzeSentimentResponse
     * @throws TencentCloudSDKException
     */
    public AnalyzeSentimentResponse AnalyzeSentiment(AnalyzeSentimentRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AnalyzeSentimentResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<AnalyzeSentimentResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AnalyzeSentiment");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *因业务调整该接口将于北京时间2023年8月1日0点下线，届时该产品功能将无法正常使用，为了避免对您的业务造成影响，请您尽快做好相关业务调整。详见：https://cloud.tencent.com/document/product/271/90711

利用人工智能算法，自动抽取文本中的关键信息并生成指定长度的文本摘要。可用于新闻标题生成、科技文献摘要生成和商品评论摘要等。
     * @param req AutoSummarizationRequest
     * @return AutoSummarizationResponse
     * @throws TencentCloudSDKException
     */
    public AutoSummarizationResponse AutoSummarization(AutoSummarizationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AutoSummarizationResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<AutoSummarizationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AutoSummarization");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *因业务调整该接口将于北京时间2023年8月1日0点下线，届时该产品功能将无法正常使用，为了避免对您的业务造成影响，请您尽快做好相关业务调整。详见：https://cloud.tencent.com/document/product/271/90711

闲聊服务基于腾讯领先的NLP引擎能力、数据运算能力和千亿级互联网语料数据的支持，同时集成了广泛的知识问答能力，可实现上百种自定义属性配置，以及儿童语言风格及说话方式，从而让聊天变得更睿智、简单和有趣。


     * @param req ChatBotRequest
     * @return ChatBotResponse
     * @throws TencentCloudSDKException
     */
    public ChatBotResponse ChatBot(ChatBotRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ChatBotResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ChatBotResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ChatBot");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *文本分类接口能够对用户输入的文章进行自动分类，将其映射到具体的类目上，用户只需要提供待分类的文本，而无需关注具体实现。该功能定义了一套较为完备的[三级分类体系](https://cloud.tencent.com/document/product/271/94286)，积累了数百万的语料，经过多轮迭代优化打造了较先进的深度学习模型，以保证效果不断提升。
     * @param req ClassifyContentRequest
     * @return ClassifyContentResponse
     * @throws TencentCloudSDKException
     */
    public ClassifyContentResponse ClassifyContent(ClassifyContentRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ClassifyContentResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ClassifyContentResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ClassifyContent");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *对联生成接口根据用户输入的命题关键词，智能生成一副完整的春联，包括上联、下联和横批。该接口利用先进的自然语言处理技术，确保生成的春联既符合传统对仗、对韵、对义的要求，又具有新意和创意，为用户提供独特的春节祝福。
     * @param req ComposeCoupletRequest
     * @return ComposeCoupletResponse
     * @throws TencentCloudSDKException
     */
    public ComposeCoupletResponse ComposeCouplet(ComposeCoupletRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ComposeCoupletResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ComposeCoupletResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ComposeCouplet");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *诗词生成接口利用现代的自然语言处理和深度学习技术，模仿了古代著名诗人的风格，为用户产生独特的诗词。用户只需输入的命题关键词，接口就能自动生成一首七言律诗或五言律诗。
     * @param req ComposePoetryRequest
     * @return ComposePoetryResponse
     * @throws TencentCloudSDKException
     */
    public ComposePoetryResponse ComposePoetry(ComposePoetryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ComposePoetryResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ComposePoetryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ComposePoetry");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *因业务调整该接口将于北京时间2023年8月1日0点下线，届时该产品功能将无法正常使用，为了避免对您的业务造成影响，请您尽快做好相关业务调整。详见：https://cloud.tencent.com/document/product/271/90711

根据指定的名称、描述创建自定义词库。
     * @param req CreateDictRequest
     * @return CreateDictResponse
     * @throws TencentCloudSDKException
     */
    public CreateDictResponse CreateDict(CreateDictRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDictResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDictResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDict");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *因业务调整该接口将于北京时间2023年8月1日0点下线，届时该产品功能将无法正常使用，为了避免对您的业务造成影响，请您尽快做好相关业务调整。详见：https://cloud.tencent.com/document/product/271/90711

向指定的词库中添加词条。
     * @param req CreateWordItemsRequest
     * @return CreateWordItemsResponse
     * @throws TencentCloudSDKException
     */
    public CreateWordItemsResponse CreateWordItems(CreateWordItemsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateWordItemsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateWordItemsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateWordItems");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *因业务调整该接口将于北京时间2023年8月1日0点下线，届时该产品功能将无法正常使用，为了避免对您的业务造成影响，请您尽快做好相关业务调整。详见：https://cloud.tencent.com/document/product/271/90711

删除自定义词库，会附带相应删除词库包含的所有词条。
     * @param req DeleteDictRequest
     * @return DeleteDictResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDictResponse DeleteDict(DeleteDictRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteDictResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteDictResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteDict");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *因业务调整该接口将于北京时间2023年8月1日0点下线，届时该产品功能将无法正常使用，为了避免对您的业务造成影响，请您尽快做好相关业务调整。详见：https://cloud.tencent.com/document/product/271/90711

用于删除自定义词库中的词条。
     * @param req DeleteWordItemsRequest
     * @return DeleteWordItemsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteWordItemsResponse DeleteWordItems(DeleteWordItemsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteWordItemsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteWordItemsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteWordItems");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *因业务调整该接口将于北京时间2023年8月1日0点下线，届时该产品功能将无法正常使用，为了避免对您的业务造成影响，请您尽快做好相关业务调整。详见：https://cloud.tencent.com/document/product/271/90711

句法依存分析接口能够分析出句子中词与词之间的相互依存关系，并揭示其句法结构，包括主谓关系、动宾关系、核心关系等等，可用于提取句子主干、提取句子核心词等，在机器翻译、自动问答、知识抽取等领域都有很好的应用。
     * @param req DependencyParsingRequest
     * @return DependencyParsingResponse
     * @throws TencentCloudSDKException
     */
    public DependencyParsingResponse DependencyParsing(DependencyParsingRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DependencyParsingResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DependencyParsingResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DependencyParsing");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *因业务调整该接口将于北京时间2023年8月1日0点下线，届时该产品功能将无法正常使用，为了避免对您的业务造成影响，请您尽快做好相关业务调整。详见：https://cloud.tencent.com/document/product/271/90711

根据id或名称查询自定义词库信息。
     * @param req DescribeDictRequest
     * @return DescribeDictResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDictResponse DescribeDict(DescribeDictRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDictResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDictResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDict");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *因业务调整该接口将于北京时间2023年8月1日0点下线，届时该产品功能将无法正常使用，为了避免对您的业务造成影响，请您尽快做好相关业务调整。详见：https://cloud.tencent.com/document/product/271/90711

返回属于当前用户的所有自定义词库列表。
     * @param req DescribeDictsRequest
     * @return DescribeDictsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDictsResponse DescribeDicts(DescribeDictsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDictsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDictsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDicts");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *因业务调整该接口将于北京时间2023年8月1日0点下线，届时该产品功能将无法正常使用，为了避免对您的业务造成影响，请您尽快做好相关业务调整。详见：https://cloud.tencent.com/document/product/271/90711

依据自定义词库的ID，查询对应的词条信息。
     * @param req DescribeWordItemsRequest
     * @return DescribeWordItemsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWordItemsResponse DescribeWordItems(DescribeWordItemsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWordItemsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWordItemsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeWordItems");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *通过计算句子间的语义相似性，帮助您快速找到文本中重复或相似的句子，用于文本聚类、相似问题检索等应用场景。
     * @param req EvaluateSentenceSimilarityRequest
     * @return EvaluateSentenceSimilarityResponse
     * @throws TencentCloudSDKException
     */
    public EvaluateSentenceSimilarityResponse EvaluateSentenceSimilarity(EvaluateSentenceSimilarityRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EvaluateSentenceSimilarityResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<EvaluateSentenceSimilarityResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "EvaluateSentenceSimilarity");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *评估两个词语在语义空间的相似程度，为您的场景应用提供有力支持，如关键词过滤、热门话题挖掘等。（目前仅支持中文）
     * @param req EvaluateWordSimilarityRequest
     * @return EvaluateWordSimilarityResponse
     * @throws TencentCloudSDKException
     */
    public EvaluateWordSimilarityResponse EvaluateWordSimilarity(EvaluateWordSimilarityRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EvaluateWordSimilarityResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<EvaluateWordSimilarityResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "EvaluateWordSimilarity");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *因业务调整该接口将于北京时间2023年8月1日0点下线，届时该产品功能将无法正常使用，为了避免对您的业务造成影响，请您尽快做好相关业务调整。详见：https://cloud.tencent.com/document/product/271/90711

根据用户输入的命题关键词自动生成一副春联，包括上联、下联和横批。（如需开通请联系商务）
     * @param req GenerateCoupletRequest
     * @return GenerateCoupletResponse
     * @throws TencentCloudSDKException
     */
    public GenerateCoupletResponse GenerateCouplet(GenerateCoupletRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GenerateCoupletResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<GenerateCoupletResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GenerateCouplet");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *提取文本中的关键信息，生成简洁明了的关键句子，便于用户快速获取核心观点。
     * @param req GenerateKeywordSentenceRequest
     * @return GenerateKeywordSentenceResponse
     * @throws TencentCloudSDKException
     */
    public GenerateKeywordSentenceResponse GenerateKeywordSentence(GenerateKeywordSentenceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GenerateKeywordSentenceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<GenerateKeywordSentenceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GenerateKeywordSentence");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *因业务调整该接口将于北京时间2023年8月1日0点下线，届时该产品功能将无法正常使用，为了避免对您的业务造成影响，请您尽快做好相关业务调整。详见：https://cloud.tencent.com/document/product/271/90711

根据用户输入的命题关键词自动生成一首七言律诗或五言律诗。（如需开通请联系商务）
     * @param req GeneratePoetryRequest
     * @return GeneratePoetryResponse
     * @throws TencentCloudSDKException
     */
    public GeneratePoetryResponse GeneratePoetry(GeneratePoetryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GeneratePoetryResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<GeneratePoetryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GeneratePoetry");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *因业务调整该接口将于北京时间2023年8月1日0点下线，届时该产品功能将无法正常使用，为了避免对您的业务造成影响，请您尽快做好相关业务调整。详见：https://cloud.tencent.com/document/product/271/90711

基于关键词提取平台，通过对文本内容进行深度分析，提取出文本内容中的关键信息，为用户实现诸如新闻内容关键词自动提取、评论关键词提取等提供基础服务。
     * @param req KeywordsExtractionRequest
     * @return KeywordsExtractionResponse
     * @throws TencentCloudSDKException
     */
    public KeywordsExtractionResponse KeywordsExtraction(KeywordsExtractionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<KeywordsExtractionResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<KeywordsExtractionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "KeywordsExtraction");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *因业务调整该接口将于北京时间2023年8月1日0点下线，届时该产品功能将无法正常使用，为了避免对您的业务造成影响，请您尽快做好相关业务调整。详见：https://cloud.tencent.com/document/product/271/90711

词法分析接口提供以下三个功能：

1、智能分词：将连续的自然语言文本，切分成具有语义合理性和完整性的词汇序列；

2、词性标注：为每一个词附上对应的词性，例如名词、代词、形容词、动词等；

3、命名实体识别：快速识别文本中的实体，例如人名、地名、机构名等。

所有的功能均基于千亿级大规模互联网语料进行持续迭代更新，以保证效果不断提升，用户无需担心新词发现、歧义消除、调用性能等问题。目前词法分析已经在泛互联网、金融、政务等不同垂直领域提供业务支持，并取得良好的效果。
     * @param req LexicalAnalysisRequest
     * @return LexicalAnalysisResponse
     * @throws TencentCloudSDKException
     */
    public LexicalAnalysisResponse LexicalAnalysis(LexicalAnalysisRequest req) throws TencentCloudSDKException{
        JsonResponseModel<LexicalAnalysisResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<LexicalAnalysisResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "LexicalAnalysis");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *通过精准地对文本进行分词、词性标注、命名实体识别等功能，助您更好地理解文本内容，挖掘出潜在的价值信息。
     * @param req ParseWordsRequest
     * @return ParseWordsResponse
     * @throws TencentCloudSDKException
     */
    public ParseWordsResponse ParseWords(ParseWordsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ParseWordsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ParseWordsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ParseWords");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *基于大数据和深度学习技术，可以快速地找到与给定词语高度相似的其他词语，有助于提高搜索和推荐的准确性。（目前仅支持中文）
     * @param req RetrieveSimilarWordsRequest
     * @return RetrieveSimilarWordsResponse
     * @throws TencentCloudSDKException
     */
    public RetrieveSimilarWordsResponse RetrieveSimilarWords(RetrieveSimilarWordsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RetrieveSimilarWordsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<RetrieveSimilarWordsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RetrieveSimilarWords");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *因业务调整该接口将于北京时间2023年8月1日0点下线，届时该产品功能将无法正常使用，为了避免对您的业务造成影响，请您尽快做好相关业务调整。详见：https://cloud.tencent.com/document/product/271/90711

查询指定自定义词库中的词条是否存在。
     * @param req SearchWordItemsRequest
     * @return SearchWordItemsResponse
     * @throws TencentCloudSDKException
     */
    public SearchWordItemsResponse SearchWordItems(SearchWordItemsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SearchWordItemsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<SearchWordItemsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SearchWordItems");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *智能识别并纠正句子中的语法、拼写、用词等错误，确保文本的准确性和可读性。
     * @param req SentenceCorrectionRequest
     * @return SentenceCorrectionResponse
     * @throws TencentCloudSDKException
     */
    public SentenceCorrectionResponse SentenceCorrection(SentenceCorrectionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SentenceCorrectionResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<SentenceCorrectionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SentenceCorrection");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *因业务调整该接口将于北京时间2023年8月1日0点下线，届时该产品功能将无法正常使用，为了避免对您的业务造成影响，请您尽快做好相关业务调整。详见：https://cloud.tencent.com/document/product/271/90711

句向量接口能够将输入的句子映射成一个固定维度的向量，用来表示这个句子的语义特征，可用于文本聚类、文本相似度、文本分类等任务，能够显著提高它们的效果。

该句向量服务由腾讯云自然语言处理团队联合微信智言团队共同打造，基于千亿级大规模互联网语料并采用Bert等领先的深度神经网络模型训练而成，在腾讯内部诸多业务的NLP任务上实测效果显著。
     * @param req SentenceEmbeddingRequest
     * @return SentenceEmbeddingResponse
     * @throws TencentCloudSDKException
     */
    public SentenceEmbeddingResponse SentenceEmbedding(SentenceEmbeddingRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SentenceEmbeddingResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<SentenceEmbeddingResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SentenceEmbedding");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *因业务调整该接口将于北京时间2023年8月1日0点下线，届时该产品功能将无法正常使用，为了避免对您的业务造成影响，请您尽快做好相关业务调整。详见：https://cloud.tencent.com/document/product/271/90711

情感分析接口能够对带有情感色彩的主观性文本进行分析、处理、归纳和推理，识别出用户的情感倾向，是积极还是消极，并且提供各自概率。

该功能基于千亿级大规模互联网语料和LSTM、BERT等深度神经网络模型进行训练，并持续迭代更新，以保证效果不断提升。
     * @param req SentimentAnalysisRequest
     * @return SentimentAnalysisResponse
     * @throws TencentCloudSDKException
     */
    public SentimentAnalysisResponse SentimentAnalysis(SentimentAnalysisRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SentimentAnalysisResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<SentimentAnalysisResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SentimentAnalysis");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *因业务调整该接口将于北京时间2023年8月1日0点下线，届时该产品功能将无法正常使用，为了避免对您的业务造成影响，请您尽快做好相关业务调整。详见：https://cloud.tencent.com/document/product/271/90711

相似词接口能够基于同义词库及词向量技术，检索出与输入词语在语义上最相似的若干个词语，可广泛用于检索系统、问答系统、文档归档等场景。
     * @param req SimilarWordsRequest
     * @return SimilarWordsResponse
     * @throws TencentCloudSDKException
     */
    public SimilarWordsResponse SimilarWords(SimilarWordsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SimilarWordsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<SimilarWordsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SimilarWords");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *因业务调整该接口将于北京时间2023年8月1日0点下线，届时该产品功能将无法正常使用，为了避免对您的业务造成影响，请您尽快做好相关业务调整。详见：https://cloud.tencent.com/document/product/271/90711

文本分类接口能够对用户输入的文本进行自动分类，将其映射到具体的类目上，用户只需要提供待分类的文本，而无需关注具体实现。

该功能基于千亿级大规模互联网语料和LSTM、BERT等深度神经网络模型进行训练，并持续迭代更新，以保证效果不断提升。

目前已提供：

- 通用领域分类体系，二级分类，包括14个分类类目，分别是汽车、科技、健康、体育、旅行、教育、职业、文化、房产、娱乐、女性、奥运、财经以及其他，适用于通用的场景。
     * @param req TextClassificationRequest
     * @return TextClassificationResponse
     * @throws TencentCloudSDKException
     */
    public TextClassificationResponse TextClassification(TextClassificationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<TextClassificationResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<TextClassificationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "TextClassification");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *因业务调整该接口将于北京时间2023年8月1日0点下线，届时该产品功能将无法正常使用，为了避免对您的业务造成影响，请您尽快做好相关业务调整。详见：https://cloud.tencent.com/document/product/271/90711

提供对中文文本的自动纠错功能，能够识别输入文本中的错误片段，定位错误并给出正确的文本结果；支持长度不超过2000字符（含标点符号）的长文本纠错。

此功能是基于千亿级大规模互联网语料和LSTM、BERT等深度神经网络模型进行训练，并持续迭代更新，以保证效果不断提升，是搜索引擎、语音识别、内容审核等功能更好运行的基础之一。 
     * @param req TextCorrectionRequest
     * @return TextCorrectionResponse
     * @throws TencentCloudSDKException
     */
    public TextCorrectionResponse TextCorrection(TextCorrectionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<TextCorrectionResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<TextCorrectionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "TextCorrection");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *因业务调整该接口将于北京时间2023年8月1日0点下线，届时该产品功能将无法正常使用，为了避免对您的业务造成影响，请您尽快做好相关业务调整。详见：https://cloud.tencent.com/document/product/271/90711

提供对中文文本的自动纠错功能，能够识别输入文本中的错误片段，定位错误并给出正确的文本结果；支持长度不超过128字符（含标点符号）的长文本纠错。

此功能是基于千亿级大规模互联网语料和LSTM、BERT等深度神经网络模型进行训练，并持续迭代更新，以保证效果不断提升，是搜索引擎、语音识别、内容审核等功能更好运行的基础之一。
     * @param req TextCorrectionProRequest
     * @return TextCorrectionProResponse
     * @throws TencentCloudSDKException
     */
    public TextCorrectionProResponse TextCorrectionPro(TextCorrectionProRequest req) throws TencentCloudSDKException{
        JsonResponseModel<TextCorrectionProResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<TextCorrectionProResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "TextCorrectionPro");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *运用先进的自然语言处理技术，对原始文本进行优化润色，提升文本的通顺性、表达力和语言质量。
     * @param req TextEmbellishRequest
     * @return TextEmbellishResponse
     * @throws TencentCloudSDKException
     */
    public TextEmbellishResponse TextEmbellish(TextEmbellishRequest req) throws TencentCloudSDKException{
        JsonResponseModel<TextEmbellishResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<TextEmbellishResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "TextEmbellish");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *因业务调整该接口将于北京时间2023年8月1日0点下线，届时该产品功能将无法正常使用，为了避免对您的业务造成影响，请您尽快做好相关业务调整。详见：https://cloud.tencent.com/document/product/271/90711

句子相似度接口能够基于深度学习技术来计算一个源句子和多个目标句子的相似度，相似度分值越大的两个句子在语义上越相似。目前仅支持短文本（不超过500字符）的相似度计算，长文本的相似度计算也即将推出。

鉴于句子相似度是一个应用非常广泛的功能，腾讯云自然语言处理团队在Bert等领先的深度神经网络模型的基础上，专门针对文本相似任务进行了优化，并持续迭代更新。基于句子相似度，可以轻松实现诸如文本去重、相似推荐等功能。

接口将以句子数量为单位消耗资源包，而不是调用接口次数为单位。
     * @param req TextSimilarityRequest
     * @return TextSimilarityResponse
     * @throws TencentCloudSDKException
     */
    public TextSimilarityResponse TextSimilarity(TextSimilarityRequest req) throws TencentCloudSDKException{
        JsonResponseModel<TextSimilarityResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<TextSimilarityResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "TextSimilarity");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *因业务调整该接口将于北京时间2023年8月1日0点下线，届时该产品功能将无法正常使用，为了避免对您的业务造成影响，请您尽快做好相关业务调整。详见：https://cloud.tencent.com/document/product/271/90711

句子相似度接口能够基于深度学习技术来计算一个源句子和多个目标句子的相似度，相似度分值越大的两个句子在语义上越相似。目前仅支持短文本（不超过128字符）的相似度计算，长文本的相似度计算也即将推出。

鉴于句子相似度是一个应用非常广泛的功能，腾讯云自然语言处理团队在Bert等领先的深度神经网络模型的基础上，专门针对文本相似任务进行了优化，并持续迭代更新。基于句子相似度，可以轻松实现诸如文本去重、相似推荐等功能。

接口将以句子数量为单位消耗资源包，而不是调用接口次数为单位。
     * @param req TextSimilarityProRequest
     * @return TextSimilarityProResponse
     * @throws TencentCloudSDKException
     */
    public TextSimilarityProResponse TextSimilarityPro(TextSimilarityProRequest req) throws TencentCloudSDKException{
        JsonResponseModel<TextSimilarityProResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<TextSimilarityProResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "TextSimilarityPro");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *通过自动补全文本片段，帮助用户快速生成高质量、连贯的完整文本，提高创作效率。
     * @param req TextWritingRequest
     * @return TextWritingResponse
     * @throws TencentCloudSDKException
     */
    public TextWritingResponse TextWriting(TextWritingRequest req) throws TencentCloudSDKException{
        JsonResponseModel<TextWritingResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<TextWritingResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "TextWriting");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *因业务调整该接口将于北京时间2023年8月1日0点下线，届时该产品功能将无法正常使用，为了避免对您的业务造成影响，请您尽快做好相关业务调整。详见：https://cloud.tencent.com/document/product/271/90711

修改自定义词库元数据信息，包括名称、描述。
     * @param req UpdateDictRequest
     * @return UpdateDictResponse
     * @throws TencentCloudSDKException
     */
    public UpdateDictResponse UpdateDict(UpdateDictRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateDictResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateDictResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateDict");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *因业务调整该接口将于北京时间2023年8月1日0点下线，届时该产品功能将无法正常使用，为了避免对您的业务造成影响，请您尽快做好相关业务调整。详见：https://cloud.tencent.com/document/product/271/90711

词向量接口能够将输入的词语映射成一个固定维度的词向量，用来表示这个词语的语义特征。词向量是很多自然语言处理技术的基础，能够显著提高它们的效果。

该词向量服务由腾讯知文自然语言处理团队联合腾讯AI Lab共同打造。使用的词向量基于千亿级大规模互联网语料并采用AI Lab自研的DSG算法训练而成，开源的词向量包含800多万中文词汇，在覆盖率、新鲜度及准确性等三方面性能突出。

     * @param req WordEmbeddingRequest
     * @return WordEmbeddingResponse
     * @throws TencentCloudSDKException
     */
    public WordEmbeddingResponse WordEmbedding(WordEmbeddingRequest req) throws TencentCloudSDKException{
        JsonResponseModel<WordEmbeddingResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<WordEmbeddingResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "WordEmbedding");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *因业务调整该接口将于北京时间2023年8月1日0点下线，届时该产品功能将无法正常使用，为了避免对您的业务造成影响，请您尽快做好相关业务调整。详见：https://cloud.tencent.com/document/product/271/90711

词相似度接口能够基于词向量技术来计算两个输入词语的余弦相似度，相似度数值越大的两个词语在语义上越相似。
     * @param req WordSimilarityRequest
     * @return WordSimilarityResponse
     * @throws TencentCloudSDKException
     */
    public WordSimilarityResponse WordSimilarity(WordSimilarityRequest req) throws TencentCloudSDKException{
        JsonResponseModel<WordSimilarityResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<WordSimilarityResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "WordSimilarity");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}

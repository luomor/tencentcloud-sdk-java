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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Strategy extends AbstractModel{

    /**
    * 匹配字段
 
有以下枚举值：
IP-来源IP	IPV6-来源IPv6	Referer-Referer	URL-请求路径
UserAgent-UserAgent	HTTP_METHOD-HTTP请求方法	QUERY_STRING-请求字符串	GET-GET参数值	GET_PARAMS_NAMES-GET参数名	POST-POST参数值	GET_POST_NAMES-POST参数名	POST_BODY-完整BODY	COOKIE-Cookie	GET_COOKIES_NAMES-Cookie参数名	ARGS_COOKIE-Cookie参数值	GET_HEADERS_NAMES-Header参数名	ARGS_HEADER-Header参数值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Field")
    @Expose
    private String Field;

    /**
    * 逻辑符号 

有以下枚举值：
empty - 内容为空
  	null - 不存在
  	eq - 等于
  	neq - 不等于
  	contains - 包含
 	ncontains - 不包含
  	strprefix - 前缀匹配
  	strsuffix - 后缀匹配
  	len_eq - 长度等于
  	len_gt - 长度大于
  	len_lt - 长度小于
  	ipmatch - 属于
 	ipnmatch - 不属于
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CompareFunc")
    @Expose
    private String CompareFunc;

    /**
    * 匹配内容

目前 只有匹配字段为COOKIE-Cookie时，才不需要输入 匹配内容其他都需要


注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 匹配参数

目前 只有匹配字段为以下4个时，匹配参数才能选择，否则置灰无法选择	

GET-GET参数值	POST-POST参数值	ARGS_COOKIE-Cookie参数值	ARGS_HEADER-Header参数值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Arg")
    @Expose
    private String Arg;

    /**
     * Get 匹配字段
 
有以下枚举值：
IP-来源IP	IPV6-来源IPv6	Referer-Referer	URL-请求路径
UserAgent-UserAgent	HTTP_METHOD-HTTP请求方法	QUERY_STRING-请求字符串	GET-GET参数值	GET_PARAMS_NAMES-GET参数名	POST-POST参数值	GET_POST_NAMES-POST参数名	POST_BODY-完整BODY	COOKIE-Cookie	GET_COOKIES_NAMES-Cookie参数名	ARGS_COOKIE-Cookie参数值	GET_HEADERS_NAMES-Header参数名	ARGS_HEADER-Header参数值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Field 匹配字段
 
有以下枚举值：
IP-来源IP	IPV6-来源IPv6	Referer-Referer	URL-请求路径
UserAgent-UserAgent	HTTP_METHOD-HTTP请求方法	QUERY_STRING-请求字符串	GET-GET参数值	GET_PARAMS_NAMES-GET参数名	POST-POST参数值	GET_POST_NAMES-POST参数名	POST_BODY-完整BODY	COOKIE-Cookie	GET_COOKIES_NAMES-Cookie参数名	ARGS_COOKIE-Cookie参数值	GET_HEADERS_NAMES-Header参数名	ARGS_HEADER-Header参数值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getField() {
        return this.Field;
    }

    /**
     * Set 匹配字段
 
有以下枚举值：
IP-来源IP	IPV6-来源IPv6	Referer-Referer	URL-请求路径
UserAgent-UserAgent	HTTP_METHOD-HTTP请求方法	QUERY_STRING-请求字符串	GET-GET参数值	GET_PARAMS_NAMES-GET参数名	POST-POST参数值	GET_POST_NAMES-POST参数名	POST_BODY-完整BODY	COOKIE-Cookie	GET_COOKIES_NAMES-Cookie参数名	ARGS_COOKIE-Cookie参数值	GET_HEADERS_NAMES-Header参数名	ARGS_HEADER-Header参数值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Field 匹配字段
 
有以下枚举值：
IP-来源IP	IPV6-来源IPv6	Referer-Referer	URL-请求路径
UserAgent-UserAgent	HTTP_METHOD-HTTP请求方法	QUERY_STRING-请求字符串	GET-GET参数值	GET_PARAMS_NAMES-GET参数名	POST-POST参数值	GET_POST_NAMES-POST参数名	POST_BODY-完整BODY	COOKIE-Cookie	GET_COOKIES_NAMES-Cookie参数名	ARGS_COOKIE-Cookie参数值	GET_HEADERS_NAMES-Header参数名	ARGS_HEADER-Header参数值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setField(String Field) {
        this.Field = Field;
    }

    /**
     * Get 逻辑符号 

有以下枚举值：
empty - 内容为空
  	null - 不存在
  	eq - 等于
  	neq - 不等于
  	contains - 包含
 	ncontains - 不包含
  	strprefix - 前缀匹配
  	strsuffix - 后缀匹配
  	len_eq - 长度等于
  	len_gt - 长度大于
  	len_lt - 长度小于
  	ipmatch - 属于
 	ipnmatch - 不属于
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CompareFunc 逻辑符号 

有以下枚举值：
empty - 内容为空
  	null - 不存在
  	eq - 等于
  	neq - 不等于
  	contains - 包含
 	ncontains - 不包含
  	strprefix - 前缀匹配
  	strsuffix - 后缀匹配
  	len_eq - 长度等于
  	len_gt - 长度大于
  	len_lt - 长度小于
  	ipmatch - 属于
 	ipnmatch - 不属于
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCompareFunc() {
        return this.CompareFunc;
    }

    /**
     * Set 逻辑符号 

有以下枚举值：
empty - 内容为空
  	null - 不存在
  	eq - 等于
  	neq - 不等于
  	contains - 包含
 	ncontains - 不包含
  	strprefix - 前缀匹配
  	strsuffix - 后缀匹配
  	len_eq - 长度等于
  	len_gt - 长度大于
  	len_lt - 长度小于
  	ipmatch - 属于
 	ipnmatch - 不属于
注意：此字段可能返回 null，表示取不到有效值。
     * @param CompareFunc 逻辑符号 

有以下枚举值：
empty - 内容为空
  	null - 不存在
  	eq - 等于
  	neq - 不等于
  	contains - 包含
 	ncontains - 不包含
  	strprefix - 前缀匹配
  	strsuffix - 后缀匹配
  	len_eq - 长度等于
  	len_gt - 长度大于
  	len_lt - 长度小于
  	ipmatch - 属于
 	ipnmatch - 不属于
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCompareFunc(String CompareFunc) {
        this.CompareFunc = CompareFunc;
    }

    /**
     * Get 匹配内容

目前 只有匹配字段为COOKIE-Cookie时，才不需要输入 匹配内容其他都需要


注意：此字段可能返回 null，表示取不到有效值。 
     * @return Content 匹配内容

目前 只有匹配字段为COOKIE-Cookie时，才不需要输入 匹配内容其他都需要


注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 匹配内容

目前 只有匹配字段为COOKIE-Cookie时，才不需要输入 匹配内容其他都需要


注意：此字段可能返回 null，表示取不到有效值。
     * @param Content 匹配内容

目前 只有匹配字段为COOKIE-Cookie时，才不需要输入 匹配内容其他都需要


注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 匹配参数

目前 只有匹配字段为以下4个时，匹配参数才能选择，否则置灰无法选择	

GET-GET参数值	POST-POST参数值	ARGS_COOKIE-Cookie参数值	ARGS_HEADER-Header参数值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Arg 匹配参数

目前 只有匹配字段为以下4个时，匹配参数才能选择，否则置灰无法选择	

GET-GET参数值	POST-POST参数值	ARGS_COOKIE-Cookie参数值	ARGS_HEADER-Header参数值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getArg() {
        return this.Arg;
    }

    /**
     * Set 匹配参数

目前 只有匹配字段为以下4个时，匹配参数才能选择，否则置灰无法选择	

GET-GET参数值	POST-POST参数值	ARGS_COOKIE-Cookie参数值	ARGS_HEADER-Header参数值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Arg 匹配参数

目前 只有匹配字段为以下4个时，匹配参数才能选择，否则置灰无法选择	

GET-GET参数值	POST-POST参数值	ARGS_COOKIE-Cookie参数值	ARGS_HEADER-Header参数值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setArg(String Arg) {
        this.Arg = Arg;
    }

    public Strategy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Strategy(Strategy source) {
        if (source.Field != null) {
            this.Field = new String(source.Field);
        }
        if (source.CompareFunc != null) {
            this.CompareFunc = new String(source.CompareFunc);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.Arg != null) {
            this.Arg = new String(source.Arg);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Field", this.Field);
        this.setParamSimple(map, prefix + "CompareFunc", this.CompareFunc);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "Arg", this.Arg);

    }
}


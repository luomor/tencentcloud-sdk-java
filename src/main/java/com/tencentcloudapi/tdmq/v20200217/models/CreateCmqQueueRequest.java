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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCmqQueueRequest extends AbstractModel {

    /**
    * 队列名字，在单个地域同一账号下唯一。队列名称是一个不超过 64 个字符的字符串，必须以字母为首字符，剩余部分可以包含字母、数字和横划线(-)。
    */
    @SerializedName("QueueName")
    @Expose
    private String QueueName;

    /**
    * 最大堆积消息数。取值范围在公测期间为 1,000,000 - 10,000,000，正式上线后范围可达到 1000,000-1000,000,000。默认取值在公测期间为 10,000,000，正式上线后为 100,000,000。
    */
    @SerializedName("MaxMsgHeapNum")
    @Expose
    private Long MaxMsgHeapNum;

    /**
    * 消息接收长轮询等待时间。取值范围 0-30 秒，默认值 0。
    */
    @SerializedName("PollingWaitSeconds")
    @Expose
    private Long PollingWaitSeconds;

    /**
    * 消息可见性超时。取值范围 1-43200 秒（即12小时内），默认值 30。
    */
    @SerializedName("VisibilityTimeout")
    @Expose
    private Long VisibilityTimeout;

    /**
    * 消息最大长度。取值范围 1024-65536 Byte（即1-64K），默认值 65536。
    */
    @SerializedName("MaxMsgSize")
    @Expose
    private Long MaxMsgSize;

    /**
    * 消息最长未确认时间。取值范围 30-43200 秒（30秒~12小时），默认值 3600 (1 小时)。
    */
    @SerializedName("MsgRetentionSeconds")
    @Expose
    private Long MsgRetentionSeconds;

    /**
    * 队列是否开启回溯消息能力，该参数取值范围0-1296000，0表示不开启。
    */
    @SerializedName("RewindSeconds")
    @Expose
    private Long RewindSeconds;

    /**
    * 1 表示事务队列，0 表示普通队列
    */
    @SerializedName("Transaction")
    @Expose
    private Long Transaction;

    /**
    * 第一次回查间隔
    */
    @SerializedName("FirstQueryInterval")
    @Expose
    private Long FirstQueryInterval;

    /**
    * 最大回查次数
    */
    @SerializedName("MaxQueryCount")
    @Expose
    private Long MaxQueryCount;

    /**
    * 死信队列名称
    */
    @SerializedName("DeadLetterQueueName")
    @Expose
    private String DeadLetterQueueName;

    /**
    * 死信策略。0为消息被多次消费未删除，1为Time-To-Live过期
    */
    @SerializedName("Policy")
    @Expose
    private Long Policy;

    /**
    * 最大接收次数 1-1000
    */
    @SerializedName("MaxReceiveCount")
    @Expose
    private Long MaxReceiveCount;

    /**
    * policy为1时必选。最大未消费过期时间。范围300-43200，单位秒，需要小于消息最大保留时间msgRetentionSeconds
    */
    @SerializedName("MaxTimeToLive")
    @Expose
    private Long MaxTimeToLive;

    /**
    * 是否开启消息轨迹追踪，当不设置字段时，默认为不开启，该字段为true表示开启，为false表示不开启
    */
    @SerializedName("Trace")
    @Expose
    private Boolean Trace;

    /**
    * 标签数组
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 队列可回溯存储空间：若开启消息回溯，取值范围：10240MB - 512000MB，若不开启消息回溯，取值：0
    */
    @SerializedName("RetentionSizeInMB")
    @Expose
    private Long RetentionSizeInMB;

    /**
     * Get 队列名字，在单个地域同一账号下唯一。队列名称是一个不超过 64 个字符的字符串，必须以字母为首字符，剩余部分可以包含字母、数字和横划线(-)。 
     * @return QueueName 队列名字，在单个地域同一账号下唯一。队列名称是一个不超过 64 个字符的字符串，必须以字母为首字符，剩余部分可以包含字母、数字和横划线(-)。
     */
    public String getQueueName() {
        return this.QueueName;
    }

    /**
     * Set 队列名字，在单个地域同一账号下唯一。队列名称是一个不超过 64 个字符的字符串，必须以字母为首字符，剩余部分可以包含字母、数字和横划线(-)。
     * @param QueueName 队列名字，在单个地域同一账号下唯一。队列名称是一个不超过 64 个字符的字符串，必须以字母为首字符，剩余部分可以包含字母、数字和横划线(-)。
     */
    public void setQueueName(String QueueName) {
        this.QueueName = QueueName;
    }

    /**
     * Get 最大堆积消息数。取值范围在公测期间为 1,000,000 - 10,000,000，正式上线后范围可达到 1000,000-1000,000,000。默认取值在公测期间为 10,000,000，正式上线后为 100,000,000。 
     * @return MaxMsgHeapNum 最大堆积消息数。取值范围在公测期间为 1,000,000 - 10,000,000，正式上线后范围可达到 1000,000-1000,000,000。默认取值在公测期间为 10,000,000，正式上线后为 100,000,000。
     */
    public Long getMaxMsgHeapNum() {
        return this.MaxMsgHeapNum;
    }

    /**
     * Set 最大堆积消息数。取值范围在公测期间为 1,000,000 - 10,000,000，正式上线后范围可达到 1000,000-1000,000,000。默认取值在公测期间为 10,000,000，正式上线后为 100,000,000。
     * @param MaxMsgHeapNum 最大堆积消息数。取值范围在公测期间为 1,000,000 - 10,000,000，正式上线后范围可达到 1000,000-1000,000,000。默认取值在公测期间为 10,000,000，正式上线后为 100,000,000。
     */
    public void setMaxMsgHeapNum(Long MaxMsgHeapNum) {
        this.MaxMsgHeapNum = MaxMsgHeapNum;
    }

    /**
     * Get 消息接收长轮询等待时间。取值范围 0-30 秒，默认值 0。 
     * @return PollingWaitSeconds 消息接收长轮询等待时间。取值范围 0-30 秒，默认值 0。
     */
    public Long getPollingWaitSeconds() {
        return this.PollingWaitSeconds;
    }

    /**
     * Set 消息接收长轮询等待时间。取值范围 0-30 秒，默认值 0。
     * @param PollingWaitSeconds 消息接收长轮询等待时间。取值范围 0-30 秒，默认值 0。
     */
    public void setPollingWaitSeconds(Long PollingWaitSeconds) {
        this.PollingWaitSeconds = PollingWaitSeconds;
    }

    /**
     * Get 消息可见性超时。取值范围 1-43200 秒（即12小时内），默认值 30。 
     * @return VisibilityTimeout 消息可见性超时。取值范围 1-43200 秒（即12小时内），默认值 30。
     */
    public Long getVisibilityTimeout() {
        return this.VisibilityTimeout;
    }

    /**
     * Set 消息可见性超时。取值范围 1-43200 秒（即12小时内），默认值 30。
     * @param VisibilityTimeout 消息可见性超时。取值范围 1-43200 秒（即12小时内），默认值 30。
     */
    public void setVisibilityTimeout(Long VisibilityTimeout) {
        this.VisibilityTimeout = VisibilityTimeout;
    }

    /**
     * Get 消息最大长度。取值范围 1024-65536 Byte（即1-64K），默认值 65536。 
     * @return MaxMsgSize 消息最大长度。取值范围 1024-65536 Byte（即1-64K），默认值 65536。
     */
    public Long getMaxMsgSize() {
        return this.MaxMsgSize;
    }

    /**
     * Set 消息最大长度。取值范围 1024-65536 Byte（即1-64K），默认值 65536。
     * @param MaxMsgSize 消息最大长度。取值范围 1024-65536 Byte（即1-64K），默认值 65536。
     */
    public void setMaxMsgSize(Long MaxMsgSize) {
        this.MaxMsgSize = MaxMsgSize;
    }

    /**
     * Get 消息最长未确认时间。取值范围 30-43200 秒（30秒~12小时），默认值 3600 (1 小时)。 
     * @return MsgRetentionSeconds 消息最长未确认时间。取值范围 30-43200 秒（30秒~12小时），默认值 3600 (1 小时)。
     */
    public Long getMsgRetentionSeconds() {
        return this.MsgRetentionSeconds;
    }

    /**
     * Set 消息最长未确认时间。取值范围 30-43200 秒（30秒~12小时），默认值 3600 (1 小时)。
     * @param MsgRetentionSeconds 消息最长未确认时间。取值范围 30-43200 秒（30秒~12小时），默认值 3600 (1 小时)。
     */
    public void setMsgRetentionSeconds(Long MsgRetentionSeconds) {
        this.MsgRetentionSeconds = MsgRetentionSeconds;
    }

    /**
     * Get 队列是否开启回溯消息能力，该参数取值范围0-1296000，0表示不开启。 
     * @return RewindSeconds 队列是否开启回溯消息能力，该参数取值范围0-1296000，0表示不开启。
     */
    public Long getRewindSeconds() {
        return this.RewindSeconds;
    }

    /**
     * Set 队列是否开启回溯消息能力，该参数取值范围0-1296000，0表示不开启。
     * @param RewindSeconds 队列是否开启回溯消息能力，该参数取值范围0-1296000，0表示不开启。
     */
    public void setRewindSeconds(Long RewindSeconds) {
        this.RewindSeconds = RewindSeconds;
    }

    /**
     * Get 1 表示事务队列，0 表示普通队列 
     * @return Transaction 1 表示事务队列，0 表示普通队列
     */
    public Long getTransaction() {
        return this.Transaction;
    }

    /**
     * Set 1 表示事务队列，0 表示普通队列
     * @param Transaction 1 表示事务队列，0 表示普通队列
     */
    public void setTransaction(Long Transaction) {
        this.Transaction = Transaction;
    }

    /**
     * Get 第一次回查间隔 
     * @return FirstQueryInterval 第一次回查间隔
     */
    public Long getFirstQueryInterval() {
        return this.FirstQueryInterval;
    }

    /**
     * Set 第一次回查间隔
     * @param FirstQueryInterval 第一次回查间隔
     */
    public void setFirstQueryInterval(Long FirstQueryInterval) {
        this.FirstQueryInterval = FirstQueryInterval;
    }

    /**
     * Get 最大回查次数 
     * @return MaxQueryCount 最大回查次数
     */
    public Long getMaxQueryCount() {
        return this.MaxQueryCount;
    }

    /**
     * Set 最大回查次数
     * @param MaxQueryCount 最大回查次数
     */
    public void setMaxQueryCount(Long MaxQueryCount) {
        this.MaxQueryCount = MaxQueryCount;
    }

    /**
     * Get 死信队列名称 
     * @return DeadLetterQueueName 死信队列名称
     */
    public String getDeadLetterQueueName() {
        return this.DeadLetterQueueName;
    }

    /**
     * Set 死信队列名称
     * @param DeadLetterQueueName 死信队列名称
     */
    public void setDeadLetterQueueName(String DeadLetterQueueName) {
        this.DeadLetterQueueName = DeadLetterQueueName;
    }

    /**
     * Get 死信策略。0为消息被多次消费未删除，1为Time-To-Live过期 
     * @return Policy 死信策略。0为消息被多次消费未删除，1为Time-To-Live过期
     */
    public Long getPolicy() {
        return this.Policy;
    }

    /**
     * Set 死信策略。0为消息被多次消费未删除，1为Time-To-Live过期
     * @param Policy 死信策略。0为消息被多次消费未删除，1为Time-To-Live过期
     */
    public void setPolicy(Long Policy) {
        this.Policy = Policy;
    }

    /**
     * Get 最大接收次数 1-1000 
     * @return MaxReceiveCount 最大接收次数 1-1000
     */
    public Long getMaxReceiveCount() {
        return this.MaxReceiveCount;
    }

    /**
     * Set 最大接收次数 1-1000
     * @param MaxReceiveCount 最大接收次数 1-1000
     */
    public void setMaxReceiveCount(Long MaxReceiveCount) {
        this.MaxReceiveCount = MaxReceiveCount;
    }

    /**
     * Get policy为1时必选。最大未消费过期时间。范围300-43200，单位秒，需要小于消息最大保留时间msgRetentionSeconds 
     * @return MaxTimeToLive policy为1时必选。最大未消费过期时间。范围300-43200，单位秒，需要小于消息最大保留时间msgRetentionSeconds
     */
    public Long getMaxTimeToLive() {
        return this.MaxTimeToLive;
    }

    /**
     * Set policy为1时必选。最大未消费过期时间。范围300-43200，单位秒，需要小于消息最大保留时间msgRetentionSeconds
     * @param MaxTimeToLive policy为1时必选。最大未消费过期时间。范围300-43200，单位秒，需要小于消息最大保留时间msgRetentionSeconds
     */
    public void setMaxTimeToLive(Long MaxTimeToLive) {
        this.MaxTimeToLive = MaxTimeToLive;
    }

    /**
     * Get 是否开启消息轨迹追踪，当不设置字段时，默认为不开启，该字段为true表示开启，为false表示不开启 
     * @return Trace 是否开启消息轨迹追踪，当不设置字段时，默认为不开启，该字段为true表示开启，为false表示不开启
     */
    public Boolean getTrace() {
        return this.Trace;
    }

    /**
     * Set 是否开启消息轨迹追踪，当不设置字段时，默认为不开启，该字段为true表示开启，为false表示不开启
     * @param Trace 是否开启消息轨迹追踪，当不设置字段时，默认为不开启，该字段为true表示开启，为false表示不开启
     */
    public void setTrace(Boolean Trace) {
        this.Trace = Trace;
    }

    /**
     * Get 标签数组 
     * @return Tags 标签数组
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签数组
     * @param Tags 标签数组
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 队列可回溯存储空间：若开启消息回溯，取值范围：10240MB - 512000MB，若不开启消息回溯，取值：0 
     * @return RetentionSizeInMB 队列可回溯存储空间：若开启消息回溯，取值范围：10240MB - 512000MB，若不开启消息回溯，取值：0
     */
    public Long getRetentionSizeInMB() {
        return this.RetentionSizeInMB;
    }

    /**
     * Set 队列可回溯存储空间：若开启消息回溯，取值范围：10240MB - 512000MB，若不开启消息回溯，取值：0
     * @param RetentionSizeInMB 队列可回溯存储空间：若开启消息回溯，取值范围：10240MB - 512000MB，若不开启消息回溯，取值：0
     */
    public void setRetentionSizeInMB(Long RetentionSizeInMB) {
        this.RetentionSizeInMB = RetentionSizeInMB;
    }

    public CreateCmqQueueRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCmqQueueRequest(CreateCmqQueueRequest source) {
        if (source.QueueName != null) {
            this.QueueName = new String(source.QueueName);
        }
        if (source.MaxMsgHeapNum != null) {
            this.MaxMsgHeapNum = new Long(source.MaxMsgHeapNum);
        }
        if (source.PollingWaitSeconds != null) {
            this.PollingWaitSeconds = new Long(source.PollingWaitSeconds);
        }
        if (source.VisibilityTimeout != null) {
            this.VisibilityTimeout = new Long(source.VisibilityTimeout);
        }
        if (source.MaxMsgSize != null) {
            this.MaxMsgSize = new Long(source.MaxMsgSize);
        }
        if (source.MsgRetentionSeconds != null) {
            this.MsgRetentionSeconds = new Long(source.MsgRetentionSeconds);
        }
        if (source.RewindSeconds != null) {
            this.RewindSeconds = new Long(source.RewindSeconds);
        }
        if (source.Transaction != null) {
            this.Transaction = new Long(source.Transaction);
        }
        if (source.FirstQueryInterval != null) {
            this.FirstQueryInterval = new Long(source.FirstQueryInterval);
        }
        if (source.MaxQueryCount != null) {
            this.MaxQueryCount = new Long(source.MaxQueryCount);
        }
        if (source.DeadLetterQueueName != null) {
            this.DeadLetterQueueName = new String(source.DeadLetterQueueName);
        }
        if (source.Policy != null) {
            this.Policy = new Long(source.Policy);
        }
        if (source.MaxReceiveCount != null) {
            this.MaxReceiveCount = new Long(source.MaxReceiveCount);
        }
        if (source.MaxTimeToLive != null) {
            this.MaxTimeToLive = new Long(source.MaxTimeToLive);
        }
        if (source.Trace != null) {
            this.Trace = new Boolean(source.Trace);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.RetentionSizeInMB != null) {
            this.RetentionSizeInMB = new Long(source.RetentionSizeInMB);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "QueueName", this.QueueName);
        this.setParamSimple(map, prefix + "MaxMsgHeapNum", this.MaxMsgHeapNum);
        this.setParamSimple(map, prefix + "PollingWaitSeconds", this.PollingWaitSeconds);
        this.setParamSimple(map, prefix + "VisibilityTimeout", this.VisibilityTimeout);
        this.setParamSimple(map, prefix + "MaxMsgSize", this.MaxMsgSize);
        this.setParamSimple(map, prefix + "MsgRetentionSeconds", this.MsgRetentionSeconds);
        this.setParamSimple(map, prefix + "RewindSeconds", this.RewindSeconds);
        this.setParamSimple(map, prefix + "Transaction", this.Transaction);
        this.setParamSimple(map, prefix + "FirstQueryInterval", this.FirstQueryInterval);
        this.setParamSimple(map, prefix + "MaxQueryCount", this.MaxQueryCount);
        this.setParamSimple(map, prefix + "DeadLetterQueueName", this.DeadLetterQueueName);
        this.setParamSimple(map, prefix + "Policy", this.Policy);
        this.setParamSimple(map, prefix + "MaxReceiveCount", this.MaxReceiveCount);
        this.setParamSimple(map, prefix + "MaxTimeToLive", this.MaxTimeToLive);
        this.setParamSimple(map, prefix + "Trace", this.Trace);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "RetentionSizeInMB", this.RetentionSizeInMB);

    }
}


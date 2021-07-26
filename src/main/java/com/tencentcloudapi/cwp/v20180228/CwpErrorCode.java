package com.tencentcloudapi.cwp.v20180228;
public enum CwpErrorCode {
    // CAM签名/鉴权错误。
     AUTHFAILURE("AuthFailure"),
     
    // 操作失败。
     FAILEDOPERATION("FailedOperation"),
     
    // 调用API服务失败。
     FAILEDOPERATION_APISERVERFAIL("FailedOperation.APIServerFail"),
     
    // 客户端已离线。
     FAILEDOPERATION_AGENTOFFLINE("FailedOperation.AgentOffline"),
     
    // 关闭专业版失败。
     FAILEDOPERATION_CLOSEPROVERSION("FailedOperation.CloseProVersion"),
     
    // 导出文件失败。
     FAILEDOPERATION_EXPORT("FailedOperation.Export"),
     
    // 询价失败。
     FAILEDOPERATION_INQUIRYPRICE("FailedOperation.InquiryPrice"),
     
    // 卸载主机。
     FAILEDOPERATION_MACHINEDELETE("FailedOperation.MachineDelete"),
     
    // 无专业版主机。
     FAILEDOPERATION_NOPROFESSIONHOST("FailedOperation.NoProfessionHost"),
     
    // 开通专业版失败。
     FAILEDOPERATION_OPENPROVERSION("FailedOperation.OpenProVersion"),
     
    // 多台主机隔离，部分或全部失败。
     FAILEDOPERATION_PARTSEPARATE("FailedOperation.PartSeparate"),
     
    // 不能关闭预付费模式专业版。
     FAILEDOPERATION_PREPAYMODE("FailedOperation.PrePayMode"),
     
    // 回复木马失败。
     FAILEDOPERATION_RECOVER("FailedOperation.Recover"),
     
    // 重新检测漏洞失败。
     FAILEDOPERATION_RESCANVUL("FailedOperation.RescanVul"),
     
    // 该主机已有重新检测任务正在执行中。
     FAILEDOPERATION_RESCANVULPROCESSINUSE("FailedOperation.RescanVulProcessInUse"),
     
    // 单台主机隔离失败。
     FAILEDOPERATION_SINGLESEPARATE("FailedOperation.SingleSeparate"),
     
    // 创建基线策略超过上限。
     FAILEDOPERATION_TOOMANYSTRATEGY("FailedOperation.TooManyStrategy"),
     
    // 交易失败。
     FAILEDOPERATION_TRADEERROR("FailedOperation.TradeError"),
     
    // 内部错误。
     INTERNALERROR("InternalError"),
     
    // 操作数据失败。
     INTERNALERROR_MAINDBFAIL("InternalError.MainDBFail"),
     
    // 参数错误。
     INVALIDPARAMETER("InvalidParameter"),
     
    // 时间区间格式错误。
     INVALIDPARAMETER_DATERANGE("InvalidParameter.DateRange"),
     
    // 非法请求。
     INVALIDPARAMETER_ILLEGALREQUEST("InvalidParameter.IllegalRequest"),
     
    // 参数格式错误。
     INVALIDPARAMETER_INVALIDFORMAT("InvalidParameter.InvalidFormat"),
     
    // IP格式不合法。
     INVALIDPARAMETER_IPNOVALID("InvalidParameter.IpNoValid"),
     
    // 参数缺失。
     INVALIDPARAMETER_MISSINGPARAMETER("InvalidParameter.MissingParameter"),
     
    // 名字已重复。
     INVALIDPARAMETER_NAMEHASREPETITION("InvalidParameter.NameHasRepetition"),
     
    // 参数解析错误。
     INVALIDPARAMETER_PARSINGERROR("InvalidParameter.ParsingError"),
     
    // 正则参数格式错误。
     INVALIDPARAMETER_REGEXRULEERROR("InvalidParameter.RegexRuleError"),
     
    // 进程名/目标IP/目标端口，不能同时为空。
     INVALIDPARAMETER_REVERSHELLKEYFIELDALLEMPTY("InvalidParameter.ReverShellKeyFieldAllEmpty"),
     
    // 规则类接口，主机IP不正确。
     INVALIDPARAMETER_RULEHOSTIPERR("InvalidParameter.RuleHostipErr"),
     
    // 参数取值错误。
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
    // 标签名称长度不能超过15个字符。
     INVALIDPARAMETERVALUE_TAGNAMELENGTHLIMIT("InvalidParameterValue.TagNameLengthLimit"),
     
    // 超出批量添加数量。
     LIMITEXCEEDED_AREAQUOTA("LimitExceeded.AreaQuota"),
     
    // 缺少参数错误。
     MISSINGPARAMETER("MissingParameter"),
     
    // 操作被拒绝。
     OPERATIONDENIED("OperationDenied"),
     
    // 资源不存在。
     RESOURCENOTFOUND("ResourceNotFound"),
     
    // 未知参数错误。
     UNKNOWNPARAMETER("UnknownParameter");
     
    private String value;
    private CwpErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}


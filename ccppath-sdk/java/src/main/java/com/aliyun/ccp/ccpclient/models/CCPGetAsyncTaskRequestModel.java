// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccp.ccpclient.models;

import com.aliyun.tea.*;

public class CCPGetAsyncTaskRequestModel extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CCPGetAsyncTaskRequest body;

    public static CCPGetAsyncTaskRequestModel build(java.util.Map<String, ?> map) throws Exception {
        CCPGetAsyncTaskRequestModel self = new CCPGetAsyncTaskRequestModel();
        return TeaModel.build(map, self);
    }

}

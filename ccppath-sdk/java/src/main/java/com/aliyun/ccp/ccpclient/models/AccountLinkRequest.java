// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccp.ccpclient.models;

import com.aliyun.tea.*;

public class AccountLinkRequest extends TeaModel {
    @NameInMap("detail")
    public String detail;

    @NameInMap("identity")
    @Validation(required = true)
    public String identity;

    @NameInMap("status")
    public String status;

    @NameInMap("type")
    @Validation(required = true)
    public String type;

    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

}

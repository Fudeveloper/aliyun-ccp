// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccp.ccpclient.models;

import com.aliyun.tea.*;

/**
 * 
 */
public class UpdateAppRequest extends TeaModel {
    @NameInMap("app_id")
    @Validation(required = true)
    public String appId;

    @NameInMap("app_name")
    @Validation(required = true, pattern = "[0-9a-zA-Z]+")
    public String appName;

    @NameInMap("description")
    public String description;

    @NameInMap("is_third_party")
    @Validation(required = true)
    public Boolean isThirdParty;

    @NameInMap("logo")
    @Validation(required = true)
    public String logo;

    @NameInMap("redirect_uri")
    @Validation(required = true)
    public String redirectUri;

    @NameInMap("scope")
    @Validation(required = true)
    public java.util.List<String> scope;

    @NameInMap("type")
    @Validation(required = true)
    public String type;

    public static UpdateAppRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppRequest self = new UpdateAppRequest();
        return TeaModel.build(map, self);
    }

}

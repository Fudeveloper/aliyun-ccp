// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccp.ccpclient.models;

import com.aliyun.tea.*;

/**
 * 更新文件元数据
 */
public class UpdateFileMetaRequest extends TeaModel {
    @NameInMap("description")
    public String description;

    @NameInMap("drive_id")
    @Validation(required = true, pattern = "[0-9]+")
    public String driveId;

    @NameInMap("file_id")
    @Validation(required = true, pattern = "[a-z0-9.-_]{1,50}")
    public String fileId;

    @NameInMap("hidden")
    public Boolean hidden;

    @NameInMap("meta")
    public String meta;

    @NameInMap("name")
    @Validation(required = true, pattern = "[a-zA-Z0-9.-]{1,1000}")
    public String name;

    @NameInMap("share_id")
    public String shareId;

    @NameInMap("starred")
    public Boolean starred;

    @NameInMap("tags")
    public java.util.Map<String, Object> tags;

    public static UpdateFileMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFileMetaRequest self = new UpdateFileMetaRequest();
        return TeaModel.build(map, self);
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccp.ccpclient.models;

import com.aliyun.tea.*;

public class UpdateDriveRequest extends TeaModel {
    @NameInMap("description")
    public String description;

    @NameInMap("drive_id")
    @Validation(required = true)
    public String driveId;

    @NameInMap("drive_name")
    @Validation(required = true)
    public String driveName;

    @NameInMap("status")
    public String status;

    @NameInMap("total_size")
    public Long totalSize;

}


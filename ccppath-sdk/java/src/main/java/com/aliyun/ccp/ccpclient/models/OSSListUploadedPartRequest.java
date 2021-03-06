// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccp.ccpclient.models;

import com.aliyun.tea.*;

/**
 * 列举uploadID对应的已上传分片
 */
public class OSSListUploadedPartRequest extends TeaModel {
    @NameInMap("drive_id")
    @Validation(pattern = "[0-9]+")
    public String driveId;

    @NameInMap("file_path")
    @Validation(required = true)
    public String filePath;

    @NameInMap("limit")
    @Validation(required = true, pattern = "[0-9]+")
    public Long limit;

    @NameInMap("part_number_marker")
    @Validation(pattern = "[0-9]+")
    public Long partNumberMarker;

    @NameInMap("share_id")
    @Validation(pattern = "[0-9a-zA-z-]+")
    public String shareId;

    @NameInMap("upload_id")
    public String uploadId;

    public static OSSListUploadedPartRequest build(java.util.Map<String, ?> map) throws Exception {
        OSSListUploadedPartRequest self = new OSSListUploadedPartRequest();
        return TeaModel.build(map, self);
    }

}

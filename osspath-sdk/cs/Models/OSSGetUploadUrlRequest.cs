// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;

using Tea;

namespace Aliyun.SDK.CCP.OSSClient.Models
{
    public class OSSGetUploadUrlRequest : TeaModel {
        [NameInMap("content_md5")]
        [Validation(Required=false, MaxLength=32)]
        public string ContentMd5 { get; set; }

        [NameInMap("drive_id")]
        [Validation(Required=true, Pattern="[0-9]+")]
        public string DriveId { get; set; }

        [NameInMap("part_info_list")]
        [Validation(Required=false)]
        public List<UploadPartInfo> PartInfoList { get; set; }

        [NameInMap("upload_id")]
        [Validation(Required=true)]
        public string UploadId { get; set; }

        [NameInMap("file_path")]
        [Validation(Required=true)]
        public string FilePath { get; set; }

        [NameInMap("share_id")]
        [Validation(Required=true, Pattern="[0-9]+")]
        public string ShareId { get; set; }

    }

}
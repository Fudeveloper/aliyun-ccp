// This file is auto-generated, don't edit it. Thanks.

import Foundation
import Tea.Swift

open class BaseCompleteFileRequest : TeaModel {
    @objc public var driveId:String = "";

    @objc public var partInfoList:[String:Any] = [String:NSObject]();

    @objc public var uploadId:String = "";

    public override init() {
        super.init();
        self.__name["driveId"] = "drive_id";
        self.__name["partInfoList"] = "part_info_list";
        self.__name["uploadId"] = "upload_id";
        self.__required["driveId"] = true;
    }
}

package com.ido.apibackend.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ido.apibackend.model.domain.InterfaceInfo;

/**
* @author shuaishuai
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2023-08-16 16:37:17
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {
    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}

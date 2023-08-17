package com.ido.apibackend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ido.apibackend.common.ErrorCode;
import com.ido.apibackend.exception.BusinessException;
import com.ido.apibackend.mapper.InterfaceInfoMapper;
import com.ido.apibackend.model.domain.InterfaceInfo;
import com.ido.apibackend.service.InterfaceInfoService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

/**
* @author shuaishuai
* @description 针对表【interface_info(接口信息)】的数据库操作Service实现
* @createDate 2023-08-16 16:37:17
*/
@Service
public class InterfaceInfoServiceImpl extends ServiceImpl<InterfaceInfoMapper, InterfaceInfo>
    implements InterfaceInfoService{

    /**
     * 验证接口信息
     * @param interfaceInfo
     * @param add 是否为创建操作
     */
    @Override
    public void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add) {
        if (interfaceInfo == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        String name = interfaceInfo.getName();
        // 创建时，所有参数必须非空
        if (add) {
            if (StringUtils.isAnyBlank(name)) {
                throw new BusinessException(ErrorCode.PARAMS_ERROR);
            }
        }
        if (StringUtils.isNotBlank(name) && name.length() > 50) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR, "名称过长");
        }
    }
}





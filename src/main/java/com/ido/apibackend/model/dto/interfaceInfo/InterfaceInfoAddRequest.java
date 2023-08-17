package com.ido.apibackend.model.dto.interfaceInfo;

import lombok.Data;

import java.io.Serializable;

@Data
public class InterfaceInfoAddRequest implements Serializable {

    /**
     * 接口名
     */
    private String name;

    /**
     * 描述
     */
    private String description;

    /**
     * url地址
     */
    private String url;

    /**
     * 请求头
     */
    private String requestHead;

    /**
     * 响应头
     */
    private String responseHeader;

    /**
     * 请求方法
     */
    private String method;

}

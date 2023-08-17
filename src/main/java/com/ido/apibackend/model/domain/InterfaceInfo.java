package com.ido.apibackend.model.domain;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 接口信息
 * @TableName interface_info
 */
@TableName(value ="interface_info")
@Data
public class InterfaceInfo implements Serializable {
    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Long id;

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
     * 接口状态，默认0-关闭，1-开启
     */
    private Integer status;

    /**
     * 请求方法
     */
    private String method;

    /**
     * 创建人id
     */
    private Long userId;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 是否删除(0-未删, 1-已删)
     */
    @TableLogic
    private Integer isDeleted;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}
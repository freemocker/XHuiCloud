package com.xhuicloud.common.core.enums.base;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @program: XHuiCloud
 * @description:
 * @author: Sinda
 * @create: 2020-06-01 10:30
 */
@Getter
@AllArgsConstructor
public enum ParamTypeEnum {

    SYSTEM(0, "系统参数"),
    SERVICE(1, "业务参数");

    /**
     * 类型
     */
    private final Integer type;
    /**
     * 描述
     */
    private final String description;
}

package com.xhuicloud.common.datasource.context;

/**
 * @program: XHuiCloud
 * @description: 动态数据源持有者
 * @author: Sinda
 * @create: 2019-09-03
 **/
public class DynamicDataSourceHolder {
    /**
     * 创建本地线程共享对象  数据源名称
     */
    private static final ThreadLocal<String> DATASOURCENAME_THREAD_LOCAL = new ThreadLocal<>();

    public static void setDataSource(String name) {
        DATASOURCENAME_THREAD_LOCAL.set(name);
    }

    public static String getDataSource() {
        return DATASOURCENAME_THREAD_LOCAL.get();
    }

    public static void removeDataSource() {
        DATASOURCENAME_THREAD_LOCAL.remove();
    }
}

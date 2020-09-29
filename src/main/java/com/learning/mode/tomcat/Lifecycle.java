package com.learning.mode.tomcat;

/**
 * @author XIAXINYU3
 * @date 2020/9/29
 */
public interface Lifecycle {

    public static final String BEFORE_START = "before_start";

    public static final String AFTER_START = "after_start";

    public static final String BEFORE_STOP = "before_stop";

    public static final String AFTER_STOP = "afater_stop";


    /**
     * 添加一个监听器
     *
     * @param listener
     */
    void addLifecycleListener(LifecycleListener listener);

    /**
     * 获取所有的监听器
     *
     * @return
     */
    LifecycleListener[] getLifecycleEvents();

    /**
     * 启动
     */
    void start();

    /**
     * 停止
     */
    void stop();

}

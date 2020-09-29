package com.learning.mode.tomcat;

/**
 * @author XIAXINYU3
 * @date 2020/9/29
 */
public interface LifecycleListener {
    /**
     * 当被监听的对象有事件发生时 会触发该方法
     *
     * @param event
     */
    public void lifecycleEvent(LifecycleEvent event);
}
package com.learning.mode.tomcat;

/**
 * @author XIAXINYU3
 * @date 2020/9/29
 */
public class Engine implements Lifecycle {

    private LifecycleSupport lifecycle = new LifecycleSupport(this);


    @Override
    public void addLifecycleListener(LifecycleListener listener) {
        lifecycle.addLifecycleListener(listener);
    }

    @Override
    public LifecycleListener[] getLifecycleEvents() {
        return lifecycle.getLifecycleEvents();
    }

    @Override
    public void start() {
        lifecycle.fireLifecycleEvent(Lifecycle.BEFORE_START, null);
        System.out.println("发动机启动...");
        lifecycle.fireLifecycleEvent(Lifecycle.AFTER_START, null);
    }

    @Override
    public void stop() {
        lifecycle.fireLifecycleEvent(Lifecycle.BEFORE_STOP, null);
        System.out.println("发动机停止...");
        lifecycle.fireLifecycleEvent(Lifecycle.AFTER_STOP, null);
    }


}
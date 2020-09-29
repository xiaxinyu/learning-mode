package com.learning.mode.tomcat;

/**
 * @author XIAXINYU3
 * @date 2020/9/29
 */
public class LifecycleSupport {
    /**
     * 被管理的lifecycle实例
     */
    private Lifecycle lifecycle;

    private LifecycleListener[] listeners;

    public LifecycleSupport(Lifecycle lifecycle) {
        this.lifecycle = lifecycle;
    }

    public void addLifecycleListener(LifecycleListener listener) {
        if (listeners == null) {
            listeners = new LifecycleListener[1];
            listeners[0] = listener;
        } else {
            LifecycleListener[] newListeners = new LifecycleListener[listeners.length + 1];
            newListeners[newListeners.length - 1] = listener;
            listeners = newListeners;
        }

    }

    public LifecycleListener[] getLifecycleEvents() {
        return listeners;
    }

    /**
     * 触发所有的监听器
     *
     * @param type 事件类型
     * @param data
     */
    public void fireLifecycleEvent(String type, Object data) {
        if (listeners != null && listeners.length > 0) {
            for (LifecycleListener lifecycleListener : listeners) {
                lifecycleListener.lifecycleEvent(new LifecycleEvent(lifecycle, type, data));
            }
        }
    }
}
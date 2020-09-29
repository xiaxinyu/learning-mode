package com.learning.mode.tomcat;

/**
 * @author XIAXINYU3
 * @date 2020/9/29
 */
public class LifecycleEvent {
    /**
     * 触发该事件的具体实例对象
     */
    private Lifecycle lifecycle;

    /**
     * 事件类型（对应于Lifecycle中定义的几种状态）
     */
    private String type;

    /**
     * 该事件携带的参数数据
     */
    private Object data;


    public LifecycleEvent(Lifecycle lifecycle, String type, Object data) {
        this.lifecycle = lifecycle;
        this.type = type;
        this.data = data;
    }

    public Lifecycle getLifecycle() {
        return lifecycle;
    }

    public void setLifecycle(Lifecycle lifecycle) {
        this.lifecycle = lifecycle;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }


}
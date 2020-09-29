package com.learning.mode.tomcat;

/**
 * @author XIAXINYU3
 * @date 2020/9/29
 */
public class Car implements Lifecycle {

    private Light leftLight; //左大灯
    private Light rightLight; //右大灯

    private Engine engine; //引擎

    private LifecycleSupport lifecycle = new LifecycleSupport(this);

    public void run() {
        start();
        System.out.println("桑塔拉跑起来了...");
    }

    public void shutdown() {
        stop();
        System.out.println("桑塔拉停止了...");
    }

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
        //先初始化其他组件
        if (engine != null && engine instanceof Lifecycle) {
            ((Lifecycle) engine).start();
        }
        if (leftLight != null && leftLight instanceof Lifecycle) {
            ((Lifecycle) leftLight).start();
        }
        if (rightLight != null && rightLight instanceof Lifecycle) {
            ((Lifecycle) rightLight).start();
        }

        System.out.println("桑塔拉正在启动...");
        lifecycle.fireLifecycleEvent(Lifecycle.AFTER_START, null);
    }

    @Override
    public void stop() {
        //先停止其他组件
        if (engine != null && engine instanceof Lifecycle) {
            ((Lifecycle) engine).stop();
        }
        if (leftLight != null && leftLight instanceof Lifecycle) {
            ((Lifecycle) leftLight).stop();
        }
        if (rightLight != null && rightLight instanceof Lifecycle) {
            ((Lifecycle) rightLight).stop();
        }

        lifecycle.fireLifecycleEvent(Lifecycle.BEFORE_STOP, null);
        System.out.println("桑塔拉正在停止...");
        lifecycle.fireLifecycleEvent(Lifecycle.AFTER_STOP, null);
    }

    public Light getLeftLight() {
        return leftLight;
    }

    public void setLeftLight(Light leftLight) {
        this.leftLight = leftLight;
    }

    public Light getRightLight() {
        return rightLight;
    }

    public void setRightLight(Light rightLight) {
        this.rightLight = rightLight;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

}

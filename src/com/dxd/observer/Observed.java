package com.dxd.observer;

import java.util.LinkedList;
import java.util.List;

/**
 * 被观察者抽象类
 * @author Shildon
 *
 */
public abstract class Observed {
    //管理观察者的容器
    protected List<Observer> observers = new LinkedList<>();
    
    //添加观察者
    public abstract void addObserver(Observer observer);
    
    //删除管擦这
    public abstract void removeObserver(Observer observer);
    
    //通知观察者
    public abstract void notifyObserver();
}

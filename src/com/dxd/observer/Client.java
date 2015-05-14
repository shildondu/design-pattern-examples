package com.dxd.observer;

import com.dxd.observer.impl.ConcreteObserved;
import com.dxd.observer.impl.ConcreteObserver;

/**
 * 模拟客户端类
 * @author Shildon
 *
 */
public class Client {
    
    public static void main(String[] args) {
	Observed observed = new ConcreteObserved();
	Observer observer0 = new ConcreteObserver();
	Observer observer1 = new ConcreteObserver();
	observed.addObserver(observer0);
	observed.addObserver(observer1);
	observed.notifyObserver();
    }
    
}

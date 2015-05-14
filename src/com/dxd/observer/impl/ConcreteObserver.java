package com.dxd.observer.impl;

import com.dxd.observer.Observer;

/**
 * 观察者具体实现类
 * @author Shildon
 *
 */
public class ConcreteObserver implements Observer {
    
    @Override
    public void update() {
	System.out.println("I'm observing now!");
    }

}

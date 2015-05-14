package com.dxd.observer.impl;

import com.dxd.observer.Observed;
import com.dxd.observer.Observer;

/**
 * 被观察者具体实现类
 * @author Shildon
 *
 */
public class ConcreteObserved extends Observed {

    @Override
    public void addObserver(Observer observer) {
	observers.add(observer);
    }
    
    @Override
    public void removeObserver(Observer observer) {
	observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
	for(Observer observer : observers) {
	    observer.update();
	}
    }

}

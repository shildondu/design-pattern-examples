package com.dxd.singleton;

/**
 * 单例类(包括饿汉式和懒汉式)
 * @author Shildon
 *
 */
public class Singleton {
    
    //饿汉式单例模式，无多线程问题
    private static final Singleton EAGER_SINGLETON = new Singleton();
    
    //私有构造方法
    private Singleton() {
	super();
    }
    
    public static Singleton getInstance() {
	return EAGER_SINGLETON;
    }
    
    //懒汉式单例模式，有多线程问题(无法应用双重检查成例)，不建议使用
    private static Singleton LAZY_SINGLETON = null;
    
    public static Singleton getLazyInstance() {
	if(null == LAZY_SINGLETON) {
	    LAZY_SINGLETON = new Singleton();
	}
	return LAZY_SINGLETON;
    }
}

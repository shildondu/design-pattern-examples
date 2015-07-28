package com.dxd.multiton;

import java.util.HashMap;

/**
 * 多例类
 * @author Shildon
 *
 */
public class Multiton {
    //构建一个容器用来管理多例对象
    private static final HashMap<String, Multiton> multitons = new HashMap<>();
    
    //私有构造方法
    private Multiton() {
	   super();
    }
    
    //获取实例对象
    public static Multiton getInstance(String key) {
    	if(multitons.containsKey(key)) {
    	    return multitons.get(key);
    	}
    	else {
    	    Multiton multiton = new Multiton();
    	    multitons.put(key, multiton);
    	    return multiton;
    	}
    }
}

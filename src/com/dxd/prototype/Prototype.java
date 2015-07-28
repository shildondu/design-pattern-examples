package com.dxd.prototype;

/**
 * 原型类
 * @author Shildon
 *
 */
public class Prototype implements Cloneable {
    
    private String key;
    
    //重写clone方法，改变对象的创建模式
    @Override
    public Object clone() throws CloneNotSupportedException {
	   return super.clone();
    }
    
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
    
}

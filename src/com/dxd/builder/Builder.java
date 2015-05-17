package com.dxd.builder;

/**
 * 抽象建造者接口
 * @author Shildon
 *
 */
public interface Builder {
    
    //构建零件0
    public void buildPart0();
   
    //构建零件1
    public void buildPart1();
   
    //构建完后返回产品
    public Product getProduct();
    
}

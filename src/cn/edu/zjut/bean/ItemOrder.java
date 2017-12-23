package cn.edu.zjut.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ItemOrder implements IItemOrder, InitializingBean,DisposableBean {
    private IItem item;
    private int numItems;

    public ItemOrder() {
        System.out.println("Spring实例化ItemOrder...");
    }

    public void setItem(IItem item) {
        System.out.println("Spring注入item...");
        this.item = item;
    }

    public void setNumItems(int n) {
        System.out.println("Spring注入numItems...");
        this.numItems = n;
    }

    public void incrementNumItems() {
        setNumItems(getNumItems() + 1);
    }

    public void cancelOrder() {
        setNumItems(0);
    }

    public double getTotalCost() {
        return (getNumItems() * getUnitCost());
    }

    public double getUnitCost() {
        return item.getCost();
    }

    public IItem getItem() {
        return item;
    }


    public int getNumItems() {
        return numItems;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("正在执行初始化方法 afterPropertiesSet...");
    }

    public void init() {
        System.out.println("正在执行初始化方法 init...");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("正在执行方法 destroy...");
    }

    public void destroy1()throws Exception {
        System.out.println("正在执行方法 destroy111");
    }
}
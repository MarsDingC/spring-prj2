package cn.edu.zjut.bean;

public interface IItemOrder {
    IItem getItem();
    public double getTotalCost();
    int getNumItems();
}
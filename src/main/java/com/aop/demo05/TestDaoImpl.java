package com.aop.demo04;

public class TestDaoImpl implements TestDao {
    @Override
    public void save() {
        System.out.println("saving");
    }

    @Override
    public void modify() {
        System.out.println("modifying");
    }

    @Override
    public void delete() {
        System.out.println("deleting");
    }
}

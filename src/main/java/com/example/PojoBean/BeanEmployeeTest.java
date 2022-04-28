package com.example.PojoBean;

public class BeanEmployeeTest {
    public static void main(String[] args)
    {
        BeanEmployee bean = new BeanEmployee();

        bean.setProperty(0);
        System.out.println("After setting to 0: " +
                bean.getProperty());

        bean.setProperty(5);
        System.out.println("After setting to valid" +
                " value: " + bean.getProperty());
    }
}

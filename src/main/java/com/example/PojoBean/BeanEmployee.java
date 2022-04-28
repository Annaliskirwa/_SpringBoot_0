package com.example.PojoBean;

public class BeanEmployee {
    //private field property
    private Integer property;
    BeanEmployee(){
        //no arg constructor
    }

    //gettere and setter
    public Integer getProperty() {
        {
            if (property == 0){
                return null;
            }
            return property;
        }
    }

    public void setProperty(Integer property) {
        if (property == 0)
        {
            return;
        }
        this.property=property;
    }

}
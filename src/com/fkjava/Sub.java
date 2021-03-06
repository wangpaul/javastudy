package com.fkjava;

/**
 * @author wzz
 * @version V1.0
 * @Package com.fkjava
 * @date 2021/3/3 10:40
 */
class Base{
    public double size;
    public String name;

    public Base(double size, String name) {
        this.size = size;
        this.name = name;
    }
}

public class Sub extends Base{
    public String color;


    public Sub(double size, String name, String color) {
        super(size, name);
        this.color = color;
    }

    public static void main(String[] args) {
        Sub s = new Sub(5.6, "测试对象", "红色");
        System.out.println(s.size + "--" + s.name + "--" + s.color);
    }
}

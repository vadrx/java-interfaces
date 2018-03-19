package ru.novsu.povt.vas;

public class Circle extends Point {
    private int r = 0;

    public Circle(int a, int b, int r){
        super(a, b);
        changeTo(r);
    }

    public void changeTo(int r) {
        this.r = r;
    }
    @Override
    public void draw(){
        System.out.println("Circle: x=" + x + ", y=" + y + ", r=" + r);
    }

}

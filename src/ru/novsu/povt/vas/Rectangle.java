package ru.novsu.povt.vas;

public class Rectangle extends Point {
    protected int w = 0;
    protected int h = 0;
    public Rectangle(int a, int b, int w, int h){
        super(a, b);
        changeTo(w, h);
    }
    public void changeTo(int w, int h) {
        this.w = w;
        this.h = h;
    }
    @Override
    public void draw(){
        System.out.println("Rectangle: x=" + x + ", y=" + y + ", w=" + w + ", h=" + h);
    }

}

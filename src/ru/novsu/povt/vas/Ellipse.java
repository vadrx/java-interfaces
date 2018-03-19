package ru.novsu.povt.vas;

public class Ellipse extends Rectangle {
    private int r = 0;
    public Ellipse(int a, int b, int w, int h, int r) {
        super(a, b, w, h);
        changeTo(r);
    }
    public void changeTo(int r) {
        this.r = r;
    }
    @Override
    public void draw(){
        System.out.println("Ellipse: x=" + x + ", y=" + y + ", w=" + w + ", h=" + h + ", r=" + r);
    }
}
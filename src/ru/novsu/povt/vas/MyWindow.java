package ru.novsu.povt.vas;

public class MyWindow implements Movable{

    protected int x = 0;
    protected int y = 0;

    public MyWindow(int a, int b){
        moveTo(a, b);
    }

    public MyWindow() {

    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public void moveTo(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Moved to: x=" + getX() + ", y= " + getY());
    }

}

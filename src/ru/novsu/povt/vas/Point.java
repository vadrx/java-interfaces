package ru.novsu.povt.vas;

public class Point implements Graph, Movable {
    protected int x = 0;
    protected int y = 0;

    public Point(int a, int b){
        moveTo(a, b);
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    public void moveTo(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void move(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }
    @Override
    public void draw(){
        System.out.println("Point: x=" + x + ", y=" + y);
    }
}

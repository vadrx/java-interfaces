package ru.novsu.povt.vas;

public class Background implements Graph {
    private String color = "blue";
    private String texture = "glass";

    public Background(String a, String b){
        changeBg(a, b);
    }

    public void changeBg(String clr, String txtr){
        this.color = clr;
        this.texture = txtr;
    }

    @Override
    public void draw() {
        System.out.println("Background: color=" + color + ", texture=" + texture);
    }

}

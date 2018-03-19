package ru.novsu.povt.vas;


public class Main {
    public static void swapXY(Movable movable) throws NullPointerException{
        if (movable == null)
            throw new NullPointerException("ERROR: Object is not created!!!");

        System.out.println("Old: x=" + movable.getX() + ", y=" + movable.getY());
        movable.moveTo(movable.getY(),movable.getX());
        System.out.println("Swapped!\n");
    }

    public static void main(String[] args) {
        System.out.println("Java Lab 5\n");
        //Point
        Point point = new Point(1, 2);
        point.move(3, 5);
        point.draw();

        //Circle
        Circle circle = new Circle(3, 4, 3);
        circle.move(3, 3);
        circle.draw();

        //Rectangle
        Rectangle rectangle = new Rectangle(1, 2, 3, 4);
        rectangle.move(4, 6);
        rectangle.draw();

        //Ellipse
        Ellipse ellipse = new Ellipse(1, 2, 3, 4, 5);
        ellipse.move(5, 1);
        ellipse.draw();

        //Background
        Background background = new Background("blue", "metal");
        background.changeBg("green", "grass");
        background.draw();

        //MyWindow
        System.out.println("MyWindow:");
        MyWindow myWindow = new MyWindow(4,5);

        //Movable
        System.out.println("Movable:");
        Movable[] movable = new Movable[4];
        //movable[0] = new MyWindow(3,5);
        movable[1] = new MyWindow(1,2);
        movable[2] = new MyWindow(2,4);
        movable[3] = new MyWindow(0,1);

        System.out.println();
        for (int i = 0; i<movable.length; i++) {
            try {
                swapXY(movable[i]);
            } catch (NullPointerException ex) {
                System.out.println("ERROR while swapping coordinates!!!\n");
                ex.printStackTrace();
            }
        }
    }
}

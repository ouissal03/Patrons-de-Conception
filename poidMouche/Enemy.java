package poidMouche;

public class Enemy implements Flyweight {
    private String shape;
    private String color;
    private int speed;

    public Enemy(String shape, String color, int speed) {
        this.shape = shape;
        this.color = color;
        this.speed = speed;
    }

    public void render(int x, int y) {
        System.out.println("Rendering " + color + " " + shape + " enemy at (" + x + ", " + y + ") with speed " + speed);
    }
}

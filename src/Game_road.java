public class Game_road {
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    private int speed;

    public String getSprite() {
        return sprite;
    }

    private String sprite = "sprites/Road.png";

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    private int x;
    private int y;


    Game_road() {
        this.speed = 1;
        x = 0;
        y = 0;
    }
}

public class Dino {
    Dino(){
        this.x=0;
        this.y=0;
    }
    public String getSprite() {
        return sprite;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    private int x;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    private int y;
    private int width;
    private int height;
    private String sprite = "sprites/Dino.png";

}

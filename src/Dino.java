public class Dino {
    Dino(){
    }
    public String getSprite() {
        return sprite;
    }


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

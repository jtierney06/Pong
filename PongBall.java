public class PongBall {
    private int x;
    private int y;
    private int xVelocity;
    private int yVelocity;
    PongBall(int intX, int intY, int intxV, int intyV){
        x = intX;
        y = intY;
        xVelocity = intxV;
        yVelocity = intyV;
    }

    public void bounceX(){
       xVelocity = xVelocity  * -1;
    }

    public void bounceY(){
        yVelocity = yVelocity * -1;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void move(){
        x += xVelocity;
        y += yVelocity;
    }
       

}

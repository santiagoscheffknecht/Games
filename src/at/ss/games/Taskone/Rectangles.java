package at.ss.games.Taskone;

import org.newdawn.slick.Graphics;

public class Rectangles implements Actor{
    private enum DIRECTION{RIGHT, DOWN, LEFT, UP};
    private float x;
    private float y;
    private float speed;
    private int direction;

    public Rectangles(int x, int y, float speed,int direction) {
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.direction=direction;
    }

    public void render(Graphics graphics){
        graphics.drawRect(this.x,this.y,10,10);
    }
    public void update(int delta){
        if (direction == 1){
        this.x += (float)delta/this.speed;}
        else {
            this.x -= (float)delta/this.speed;
        }

        if (this.x>600){
            this.x =2;
        }
        else if (this.x <0){
            this.x = 600;
        }
    }
}

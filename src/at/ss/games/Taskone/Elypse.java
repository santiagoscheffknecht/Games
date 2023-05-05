package at.ss.games.Taskone;

import org.newdawn.slick.Graphics;

public class Elypse implements Actor{
    private float x,y;
    private float speed;

    public Elypse(float x, float y){
        this.x = x;
        this.y  =y;
    }
    @Override
    public void render(Graphics graphics) {
        graphics.drawOval(this.x,this.y,50,10);

    }

    @Override
    public void update(int delta) {
        this.y += (float)delta/this.speed;
        this.x += (float)delta/this.speed;
    }
}

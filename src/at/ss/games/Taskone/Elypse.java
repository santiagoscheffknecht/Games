package at.ss.games.Taskone;

import org.newdawn.slick.Graphics;

import java.util.Random;

public class Elypse implements Actor{
    private float x,y,xi,yi;
    private float speed;

    public Elypse(float x, float y,float speed){
        Random random = new Random();
        this.x = random.nextInt(600);
        this.y  =random.nextInt(420);
        this.speed = random.nextInt(69) + 10;
    }
    @Override
    public void render(Graphics graphics) {
        graphics.drawOval(this.x,this.y,50,10);

    }

    @Override
    public void update(int delta) {
        this.y += (float)delta/this.speed;
        this.x += (float)delta/this.speed;
        if (this.x > 500){
            this.y = 0;
            this.x = 0;
        }


    }
}

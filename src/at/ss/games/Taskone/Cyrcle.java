package at.ss.games.Taskone;

import org.newdawn.slick.Graphics;

import java.util.Random;

public class Cyrcle implements Actor{
    private enum DIRECTION{RIGHT, DOWN, LEFT, UP};
    private float x,y,xi,yi;
    private float speed;
    private int diameter;


    public Cyrcle(float x, float y,float speed){
        Random random = new Random();
        this.xi = 10;
        this.yi= 10;
        this.x = random.nextInt(600);
        this.y  =random.nextInt(420);
        this.speed = random.nextInt(69) + 10;
        this.diameter = random.nextInt(31)+1;
    }
    @Override
    public void render(Graphics graphics) {
        graphics.drawOval(this.x,this.y,this.xi,this.yi);

    }


    @Override
    public void update(int delta) {
        this.y += 2;
        this.xi += 1;
        this.yi +=1;
        if (this.y>400){
            this.y =0;
            this.xi=0;
            this.yi=0;
        }
    }
}

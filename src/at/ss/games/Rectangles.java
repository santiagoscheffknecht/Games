package at.ss.games;

import org.newdawn.slick.*;
import org.newdawn.slick.tests.AntiAliasTest;

public class Rectangles extends BasicGame {
    private float yr;
    private float xr;
    private float yo;
    private float xo;
    private float yc;
    private float xc;
    private float speed;

    public Rectangles(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.xr = 100;
        this.yr = 100;
        this.xo = 100;
        this.yc = 100;
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
       

    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        graphics.drawRect(this.xr, this.yr, 100, 100);
        graphics.drawString("santiago",50,50);
        graphics.drawOval(this.xo,this.yo,100,50);
        graphics.drawOval(this.xc,this.yc,50,50);
    }


    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new Rectangles("rectangel"));
            container.setDisplayMode(800, 600, false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}

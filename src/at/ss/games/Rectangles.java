package at.ss.games;

import org.newdawn.slick.*;

public class Rectangles extends BasicGame {
    private float yr;
    private float xr;
    private float yo;
    private float xo;
    private float yc;
    private float xc;
    private float directionr;
    private float directiono;
    private float directionc;

    public Rectangles(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.xr = 100;
        this.yr = 100;
        this.xo = 100;
        this.yc = 100;
        this.directionr = 1;
        this.directiono = 1;
        this.directionc = 1;
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {

        //rectagle
        if (directionr == 1){
            xr += delta;
        }
        else if(directionr == 2){
            yr += delta;
        }
        else if(directionr == 3){
            xr -= delta;
        }
        else if(directionr == 4){
            yr-= delta;
        }
        else {
            yr = 50;
        }

        if (xr == 500 && yr == 100){
            directionr = 2;
        }
        else if(xr == 500 && yr == 500){
            directionr = 3;
        }
        else if(xr == 100 && yr == 500){
            directionr = 4;
        }
        else if(xr == 100 && yr == 100) {
            directionr = 1;
        }

    //Oval
        if (directiono == 1){
            xo += delta;
        }
        else if (directiono == 2){
            xo -= delta;
        }

        if (xo == 500){
            directiono = 2;
        }
        else if (xo == 100){
            directiono = 1;
        }

        //cyrcle
        if (directionc == 1){
            yc += delta;
        }
        else if (directionc == 2){
            yc -= delta;
        }

        if (yc == 500){
            directionc = 2;
        }
        else if (yc == 100){
            directionc = 1;
        }





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

package at.ss.games.Taskone;

import org.newdawn.slick.*;
import org.newdawn.slick.tests.AnimationTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main extends BasicGame {
    private enum DIRECTION {RIGHT, DOWN, LEFT, UP}

    private List<Actor> actors;


    public Main(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.actors = new ArrayList<>();
        Random objekt = new Random();
        for (int i = 0; i < 10; i++) {
            Rectangles rectangle = new Rectangles(objekt.nextInt(600), objekt.nextInt(600), objekt.nextInt(50));
            actors.add(rectangle);
        }
        for (int i = 0; i < 5; i++) {
            Elypse elypse = new Elypse(objekt.nextInt(500),objekt.nextInt(600));
            this.actors.add(elypse);
        }
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        for (Actor actor : this.actors
        ) {
            actor.update(delta);
        }
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        for (Actor actor:this.actors
             ) {
            actor.render(graphics);
        }
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new Main("Main"));
            container.setDisplayMode(800, 600, false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}

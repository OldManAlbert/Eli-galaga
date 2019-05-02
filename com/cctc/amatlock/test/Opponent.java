package com.cctc.amatlock.test;

import java.awt.*;

public class Opponent extends CoreObject
{
    private Power[] powers = new Power[1000];
    private int powerCounter = 0;

    /**
     * Creates the core object. All subclasses
     * will call this with super.
     * The super call to the Rectangle class.
     *
     * @param x
     * @param y
     * @param width
     * @param height
     * @param color
     */
    public Opponent(int x, int y, int width, int height, Color color) {
        super(x, y, width, height, color);
    }

    @Override
    public void tick() {
        x += velX;
        y += velY;
        shoot();
        for (int i=0; i<powerCounter; i++)
        {
            powers[i].tick();
        }
    }

    @Override
    public void render(Graphics g) {
        g.setColor(color);
        g.fillRect(x,y,width,height);
        shoot();
        for (int i=0; i<powerCounter; i++)
        {
            powers[i].render(g);
        }
    }

    public void shoot()
    {
        Power power = new Power(x, y, 5, 5, Color.green, false);
        power.setVelY( 2.5 );

        powers[powerCounter] = power;
        powerCounter++;

        if (powerCounter>=1000)
        {
            powerCounter=0;
        }
    }
}

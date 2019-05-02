package com.cctc.amatlock.test;

import java.awt.*;

public class Power extends CoreObject
{
    public boolean ally:

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
    public Power(int x, int y, int width, int height, Color color, boolean ally) {
        super(x, y, width, height, color);
        this.ally=ally;
    }


    @Override
    public void tick()
    {
        x += velX;
        y += velY;
    }

    @Override
    public void render(Graphics g)
    {
        g.setColor(color);
        g.fillRect(x,y,width,height);
    }
}

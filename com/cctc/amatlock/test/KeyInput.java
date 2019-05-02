package com.cctc.amatlock.test;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyInput implements KeyListener
{
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e)
    {
        Galaga galaga = Screen.getInstance().galaga;

        if (e.getKeyCode()== KeyEvent.VK_RIGHT)
        {
            galaga.setVelX(3.5);
        }
        else if (e.getKeyCode()== KeyEvent.VK_LEFT)
        {
            galaga.setVelX(-3.5);
        }

        if (e.getKeyCode() == KeyEvent.VK_UP)
        {
            galaga.shoot();
        }
    }

    @Override
    public void keyReleased(KeyEvent e)
    {
        Galaga galaga = Screen.getInstance().galaga;

        if (e.getKeyCode()== KeyEvent.VK_RIGHT)
        {
            galaga.setVelX(0);
        }
        else if (e.getKeyCode()== KeyEvent.VK_LEFT)
        {
            galaga.setVelX(0);
        }
    }
}

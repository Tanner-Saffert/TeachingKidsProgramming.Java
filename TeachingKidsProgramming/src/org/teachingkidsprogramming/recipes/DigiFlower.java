package org.teachingkidsprogramming.recipes;

import java.awt.Color;

import org.teachingextensions.logo.ColorWheel;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class DigiFlower
{
  public static void main(String[] args)
  {
    //Beginning values
    Tortoise.show();
    Tortoise.setSpeed(5);
    Tortoise.getBackgroundWindow().setColor(Colors.Grays.Silver);
    Tortoise.setPenWidth(3);
    //Color Variables
    Color c1 = Colors.Reds.Red;
    Color c2 = Colors.Oranges.DarkOrange;
    Color c3 = Colors.Yellows.Gold;
    Color c4 = Colors.Yellows.Yellow;
    //Adding to the colorwheel
    ColorWheel.addColor(c1);
    ColorWheel.addColor(c2);
    ColorWheel.addColor(c3);
    ColorWheel.addColor(c4);
    ColorWheel.addColor(c4);
    ColorWheel.addColor(c3);
    ColorWheel.addColor(c2);
    ColorWheel.addColor(c1);
    //shape drawing function
    for (int i = 0; i < 15; i++)
    {
      for (int j = 0; j < 8; j++)
      {
        Tortoise.setPenColor(ColorWheel.getNextColor());
        Tortoise.move(50);
        Tortoise.turn(45);
      }
      Tortoise.turn(24);
    }
  }
}

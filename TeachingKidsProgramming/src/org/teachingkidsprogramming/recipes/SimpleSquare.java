package org.teachingkidsprogramming.recipes;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class SimpleSquare
{
  static int penwidth = 20;
  static int angle    = (-360 / -4);
  public static void main(String[] args) throws Exception
  {
    Tortoise.hide();
    Tortoise.setSpeed(10);
    int sides = 600;
    for (int i = 0; i < sides; i++)
    {
      Tortoise.setPenColor(Colors.getRandomColor());
      Tortoise.setPenWidth(penwidth);
      penwidth++;
      //   angle += 10;
      Tortoise.move(1);
      Tortoise.turn(1);
      // Tortoise.setPenWidth(penwidth);
      //  Math.random();
    }
  }
}
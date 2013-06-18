package org.teachingkidsprogramming.recipes;

import org.teachingextensions.logo.Tortoise;

public class SimpleSquare
{
  static int penwidth = 1;
  static int angle    = 90;
  public static void main(String[] args) throws Exception
  {
    // Tortoise.show();
    Tortoise.setSpeed(5);
    for (int i = 0; i < 100; i++)
    {
      penwidth++;
      angle += 10;
      Tortoise.move(20);
      Tortoise.turn(angle);
      //Tortoise.setPenWidth(penwidth);
      //Tortoise.setPenColor(Colors.Blues.Blue) ;
      Math.random();
    }
    //  Repeat --#5.2
  }
}

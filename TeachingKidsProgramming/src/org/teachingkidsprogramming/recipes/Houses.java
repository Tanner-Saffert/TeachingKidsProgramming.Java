package org.teachingkidsprogramming.recipes;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class Houses
{
  public static void main(String[] args)
  {

    Tortoise.setSpeed(10);
    Tortoise.setX(200);
    Tortoise.setPenColor(Colors.Grays.LightGray);
    int height = 50;
    drawHouse(height);
    drawHouse(120);
    drawHouse(120);
    drawHouse(20);
  }
  private static void drawHouse(int height)
  {
    Tortoise.move(height);
    Tortoise.turn(90);
    Tortoise.move(30);
    Tortoise.turn(90);
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
}

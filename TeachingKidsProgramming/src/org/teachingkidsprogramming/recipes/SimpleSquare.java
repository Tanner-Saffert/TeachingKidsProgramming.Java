package org.teachingkidsprogramming.recipes;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.windows.MessageBox;

public class SimpleSquare
{
  //static int penwidth = 20;
  //static int angle = (-360 / -4);
  public static void main(String[] args) throws Exception
  {
    Tortoise.hide();
    Tortoise.setSpeed(10);
    int sides = MessageBox.askForNumericalInput("How many sides? A negative number will not work.");
    for (int i = 0; i < sides; i++)
    {
      Tortoise.setPenColor(Colors.getRandomColor());
      Tortoise.setPenWidth(i * i * i);
      //   penwidth++;
      //   angle += 10;
      Tortoise.move(i * 3);
      Tortoise.turn(360.0 / sides);
      // Tortoise.setPenWidth(penwidth);
    }
  }
}
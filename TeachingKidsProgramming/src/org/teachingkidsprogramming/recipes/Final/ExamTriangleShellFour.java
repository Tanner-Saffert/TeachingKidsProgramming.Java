package org.teachingkidsprogramming.recipes.Final;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.windows.MessageBox;

public class ExamTriangleShellFour
{
  private static int length;
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    int sizeofshell = MessageBox.askForNumericalInput("How big do you want the shell?");
    if (sizeofshell < 210)
    {
      sizeofshell = MessageBox.askForNumericalInput("That is too small, please input a number larger than 210.");
    }
    else
    {
      for (int i = 1; i <= sizeofshell; i++)
      {
        Tortoise.setPenColor(Colors.Purples.Purple);
        int lrgLength = sizeofshell / 100;
        length += lrgLength;
        if (lrgLength < 0)
        {
          length = length + 7;
        }
        else
        {
          drawTriangle();
          int NumofRots = 12;
          Tortoise.turn((360 * NumofRots) / sizeofshell);
        }
      }
    }
  }
  public static void drawTriangle()
  {
    for (int i = 1; i <= 3; i++)
    {
      Tortoise.move(length);
      Tortoise.turn(360 / 3.1);
    }
  }
}

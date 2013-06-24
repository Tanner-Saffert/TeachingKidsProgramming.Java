package org.teachingkidsprogramming.recipes;

import org.teachingextensions.logo.Tortoise;

public class DigiFlower
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.setPenWidth(3);
    drawOctogon();
    //    Make the background silver --#8
    //    createColorPalette (recipe below) --#9
    //    Do the following 15 times --#19
    //      drawOctogon (recipe below) --#10
    //      Turn the tortoise 1/15th of 360 degrees to the right --#18
    //    Repeat
  }
  public static void drawOctogon()
  {
    for (int i = 1; i <= 8; i++)
    {
      //      Change the color of the line the tortoise draws to the next color on the color wheel --#4
      Tortoise.move(50);
      Tortoise.turn(360 / 8);
    }
  }
  public static void createColorPalette()
  {
    //  Color 1 is red --#3
    //    Color 2 is dark orange --#11
    //    Color 3 is gold --#12
    //    Color 4 is yellow --#13
    //    Add color 1 to the color wheel --#3.1
    //    Add color 2 to the color wheel --#11.1
    //    Add color 3 to the color wheel --#12.1
    //    Add color 4 to the color wheel --#13.1
    //    Add color 4 to the color wheel --#14
    //    Add color 3 to the color wheel --#15
    //    Add color 2 to the color wheel --#16
    //    Add color 1 to the color wheel --#17
  }
}

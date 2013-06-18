package org.teachingkidsprogramming.recipes.quizzes;

import java.awt.Color;

import org.teachingextensions.logo.Tortoise;
import org.teachingkidsprogramming.recipes.quizzes.graders.SimpleSquareQuizGrader;
import org.teachingkidsprogramming.recipes.quizzes.graders.SquareQuiz;

public class SimpleSquareQuiz implements SquareQuiz
{
  public void question1()
  {
    //  Turn the tortoise 1/5 of 360 degrees to the right
    Tortoise.turn(360 / 5);
  }
  public void question2()
  {
    //  Move the tortoise 110 pixels
    Tortoise.move(110);
  }
  public void question3()
  {
    //  Change the color the tortoise draws to yellow
    Tortoise.setPenColor(Color.blue);
  }
  public void question4()
  {
    //  Change the width of the line the tortoise draws to 5 pixels
    Tortoise.setPenWidth(5);
  }
  public static void main(String[] args)
  {
    new SimpleSquareQuizGrader().grade(new SimpleSquareQuiz());
  }
}

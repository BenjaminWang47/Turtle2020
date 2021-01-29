package bookClasses;

import java.util.*;


public class TurtleTest
{
  public static void main(String[] args)
  {
    Random randNumGen = new Random();
    World world = new World(false);
    Turtle me = new Turtle(world);

    Turtle[] turtleArray = new Turtle[1000];
    for (int i=0; i < 1000; i++)
      turtleArray[i] = new Turtle(world);

    for (int i=0; i < 1000; i++)
    {
      turtleArray[i].turn(randNumGen.nextInt(360));
      turtleArray[i].forward(randNumGen.nextInt(50));
    }
    
    me.moveTo(200,200);
    me.square(50);
    
    world.setVisible(true);

  }
}
package bookClasses;

import java.util.*;
import java.awt.*;

/**
 * Class that represents a turtle which is similar to a Logo turtle.
 * This class inherts from SimpleTurtle and is for students
 * to add methods to.
 *
 * Copyright Georgia Institute of Technology 2004
 * @author Barb Ericson ericson@cc.gatech.edu
 */
public class Turtle extends SimpleTurtle
{
  ////////////////// constructors ///////////////////////

  /** Constructor that takes the x and y and a picture to
   * draw on
   * @param x the starting x position
   * @param y the starting y position
   * @param picture the picture to draw on
   */
  public Turtle (int x, int y, Picture picture)
  {
    // let the parent constructor handle it
    super(x,y,picture);
  }

  /** Constructor that takes the x and y and a model
   * display to draw it on
   * @param x the starting x position
   * @param y the starting y position
   * @param modelDisplayer the thing that displays the model
   */
  public Turtle (int x, int y,
                 ModelDisplay modelDisplayer)
  {
    // let the parent constructor handle it
    super(x,y,modelDisplayer);
  }

  /** Constructor that takes the model display
   * @param modelDisplay the thing that displays the model
   */
  public Turtle (ModelDisplay modelDisplay)
  {
    // let the parent constructor handle it
    super(modelDisplay);
  }

  /**
   * Constructor that takes a picture to draw on
   * @param p the picture to draw on
   */
  public Turtle (Picture p)
  {
    // let the parent constructor handle it
    super(p);
  }

    /////////////////// methods ///////////////////////


    public static void main(String[] args)
    {
      World earth = new World();
      Turtle t1 = new Turtle(earth);
      /**/
      t1.turn(-90);
      t1.forward(200);
      t1.turn(90);
      t1.drawCircle(1200);
      
      t1.forward(7);
      t1.turn(30);
      t1.drawHex(220);
      
      t1.turn(90);
      t1.square(200);
      
      t1.turn(45);
      t1.drawRec(100, 435);
      
      t1.turn(150);
      t1.drawEquilateralTriangle(240);
      
      t1.randomWalk(100);
      /**/
    }
    
    /**
     * drawsquare - draw a square of n length
     * @param side length
     */

    public void square(int side)
    {
      forward(side);
      turn(90);
      forward(side);
      turn(90);
      forward(side);
      turn(90);
      forward(side);
    }
  
    /**
     * randomWalk - draws a specified length in a random direction
     * @param int length
     */
    public void randomWalk (int length)
    {
        //random turn
        turn((int)(Math.random() * 360 + 1));
        forward(length);
    }
      
    /**
     * drawRec - draws a rectangle of height by width
     * @param int height, int width
     */
    public void drawRec (int height, int width)
    {
        forward(height);
        turn(90);
        forward(width);
        turn(90);
        forward(height);
        turn(90);
        forward(width);
    }
      
    /**
     * drawEquilateraltriangle - makes an equilateral triangle with specified side length
     * @param int side length
     */
    public void drawEquilateralTriangle (int length)
    {
        forward(length);
        turn(120);
        forward(length);
        turn(120);
        forward(length);
    }
      
    /**
     * drawHex - makes a hexagon with specified side length
     * @param int side length
     */
    public void drawHex (int length)
    {
        forward(length);
        turn(60);
        forward(length);
        turn(60);
        forward(length);
        turn(60);
        forward(length);
        turn(60);
        forward(length);
        turn(60);
        forward(length);
    }
      
    /**
     * drawCircle - makes a circle with specified
     * @param int radius
     */
    public void drawCircle (int radius)
    {
        for (int i = 0; i < 72; i++)
        {
            forward((int)(Math.PI * radius) / 180);//(int)(Math.PI * radius) / 180
            turn(5.0);
        }
    }

} // this } is the end of class Turtle, put all new methods before this
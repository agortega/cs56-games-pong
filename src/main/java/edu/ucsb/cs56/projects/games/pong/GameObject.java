package edu.ucsb.cs56.projects.games.pong;

import edu.ucsb.cs56.projects.games.pong.entities.Paddle;

import java.awt.*;

/** edu.ucsb.cs56.projects.games.pong.gameObject is used to change velocities of objects used in the game pong
 @author Vincent Gandolfo, Krishna Lingampalli
 @version CS56, Winter 2015, UCSB
*/
public class GameObject{
    
    public int xVelocity;                  // speed horizontally
    public int yVelocity;                  // speed vertically
    public Rectangle rectangle;            // holds the x and y coordinates
                                           //   as well as width and height
    /** Default constructor, not used */
    GameObject() {  }

    /** Constructor used by both the Paddles, so all paddles are the same size */
    public GameObject(int x, int y)
    {    
	this( x, y, 10, Paddle.paddleHeight ); // paddleHeight is static
    }
    
    /** This constructor is used to set coordinates and size, used by subclasses Ball and Paddle */
    GameObject( int x, int y, int rectW, int rectH )
    {
	setXVelocity( 0 );
	setYVelocity( 0 );
	rectangle = new Rectangle( x, y, rectW, rectH );
    }
    
    // ( x, y ) coordinates are to the upper left hand corner

    // The x Coordinate to the left hand side
    /** getXCoordinate() returns the x coordinate of the Paddle */
    public int getXCoordinate()         { return rectangle.x; }
    /** setXCoordinate sets the x coordinate of the Paddle
     * @param x x coordinate of the Paddle
     */
    public void setXCoordinate( int x ) { rectangle.x = x; }

    // The y Coordinate to the top
    /** getYCoordinate() returns the y coordinate of the Paddle */
    public int getYCoordinate()         { return rectangle.y; }
    /** setYCoordinate sets the y coordinate of the Paddle
     * @param y y coordinate of the Paddle 
     */
    public void setYCoordinate( int y ) { rectangle.y = y; }

    // Stored in the rectangle
    /** getWidth() returns the width of the Paddle */
    public int getWidth()               { return rectangle.width; }
    /** setWidth sets the width of the Paddle 
     * @param w width of the Paddle
     */
    public void setWidth( int w )       { rectangle.width = w; }

    // Stored in the rectangle
    /** getHeight() returns the height of the Paddle */
    public int getHeight()              { return rectangle.height; }
    /** setHeight sets the height of the Paddle 
     * @param h height of the Paddle
     */
    public void setHeight( int h )      { rectangle.height = h; }
    /** getXVelocity() returns the x velocity of the Ball */
    public int getXVelocity()           { return xVelocity; }
    /** setXVelocity sets the x velocity of the Ball
     * @param dx the x velocity of the Ball
     */
    public void setXVelocity( int dx )  { xVelocity = dx; }
    /** getYVelocity() returns the y velocity of the Ball */
    public int getYVelocity()           { return yVelocity; }
    /** setYVelocity sets the y velocity of the Ball
     * @param dy the y velocity of the ball
     */
    public void setYVelocity( int dy )  { yVelocity = dy; }
    /** getRandomColor() returns a new color that was randomly generated */
    public Color getRandomColor()
    {
	int red = (int) (Math.random() * 250);
	int green = (int) (Math.random() * 250);
	int blue  = (int) (Math.random() * 250);

	return ( new Color( red, green, blue ) );
    }
}

    

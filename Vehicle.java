
/**
 * This class is for your week 1 portfolio project.
 * You need to draw a picture of a vehicle and add methods to move
 * the vehicle right and left across the canvas.
 * Put your name into the template below:
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vehicle
{
    // instance variables.  Declare the shapes you will use.
    // See the picture class for an example.

    private Rectangle chasis;
    private Rectangle window1;
    private Rectangle window2;
    private Triangle roof;
    private Circle wheel1;
    private Circle wheel2;
    private void posistionAllShapes () {
        chasis.setPosition(200,300);
        window1.setPosition(350,250);
        window2.setPosition(220,250);
        roof.setPosition(325,230);
        wheel1.setPosition(400,400);
        wheel2.setPosition(250,400);
        
    }


    /**
     * Constructor for objects of class Vehicle.
     */
    public Vehicle()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw your vehicle.
     */
    public void draw()
    {

        
        chasis = new Rectangle();
        chasis.changeColor("yellow");
        chasis.moveHorizontal(200);
        chasis.moveVertical(300);
        chasis.changeSize(250,100);
        chasis.makeVisible();
        
        window1 = new Rectangle();
        window1.changeColor("white");
        window1.moveHorizontal(350);
        window1.moveVertical(250);
        window1.changeSize(80,80);
        window1.makeVisible();
        
        window2 = new Rectangle();
        window2.changeColor("white");
        window2.moveHorizontal(220);
        window2.moveVertical(250);
        window2.changeSize(80,80);
        window2.makeVisible();

        roof = new Triangle(); 
        roof.changeColor("yellow");
        roof.changeSize(70, 250);
        roof.moveHorizontal(325);
        roof.moveVertical(230);
        roof.makeVisible();

        wheel1 = new Circle();
        wheel1.changeColor("black");
        wheel1.moveHorizontal(400);
        wheel1.moveVertical(400);
        wheel1.changeSize(60);
        wheel1.makeVisible();

        wheel2 = new Circle();
        wheel2.changeColor("black");
        wheel2.moveHorizontal(250);
        wheel2.moveVertical(400);
        wheel2.changeSize(60);
        wheel2.makeVisible();

        // put your code here
        // construct the shapes, move the to the right position, change color
        // and size as necessary.  See the Picture class for an example.
    }

    /**
     * Move your vehicle a little to the right.
     */
    public void moveRight()
    {
 
        chasis.setPosition(200 + 25,300);
        window1.setPosition(350 + 25,250);
        window2.setPosition(220 + 25,250);
        roof.setPosition(325 + 25,230);
        wheel1.setPosition(400 + 25,400);
        wheel2.setPosition(250 + 25,400);


        // put your code here
    }

    /**
     * Move your vehicle a little to the left.
     */
    public void moveLeft()
    {
        chasis.setPosition(200 - 25,300);
        window1.setPosition(350 - 25,250);
        window2.setPosition(220 - 25,250);
        roof.setPosition(325 - 25,230);
        wheel1.setPosition(400 - 25,400);
        wheel2.setPosition(250 - 25,400);
        // put your code here
    }
}

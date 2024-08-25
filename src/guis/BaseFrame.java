package guis;

import db_objs.User;

import javax.swing.*;

/*
    Creating an abstract class helps us setup the blueprint that our GUIs will follow, for example
    in eache of the GUIs the will be the same size and will need to invoke the own addGuiComponents()
    which will be unique to each subclass
*/

public abstract class BaseFrame extends JFrame {

    //Store user information
    protected User user;

    public BaseFrame(String title){
        initialize(title);
    }
    public BaseFrame(String title, User user){
        this.user = user;

        initialize(title);
    }

    private void initialize(String title){
        //instantiate iframe properties and add a title to the bar
        setTitle(title);

        // set size (in pixels)
        setSize(420, 600);

        //Terminate program when the gui is closed
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //set layout to null to have obsolute layout which allows us to manually specify the size and position of each gui component
        setLayout(null);

        //Prevent gui from being resized
        setResizable(false);

        //launch the gui in the center of the screen
        setLocationRelativeTo(null);

        // call on the subclass' addGuiComponent()
        addGuiComponents();
    }
    //this method will need to be defined by subclasses when this class is being inherited from
    protected abstract void addGuiComponents();
}

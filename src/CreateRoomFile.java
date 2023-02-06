import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class CreateRoomFile {

    public static void main(String[] args)
    {
        // open file for binary file output
        ObjectOutputStream output = null;
        try
        { // Create an output stream for file .txt
            output = new ObjectOutputStream(new FileOutputStream("RoomsFile.txt"));
        } catch (Exception ex)
        {
            System.out.println("Unable to open file for writing- try again");
            System.exit(0);
        }


        try
        {
            Rooms room1 = new Rooms(1, "The Open Forest", "You are standing in the middle of a forest. You can see something but are not sure what it is,\n" +
                    "so you get closer and things become clearer. It is an abandoned mine.", "WEST 2");
            output.writeObject(room1);

            Rooms room2 = new Rooms(2, "Abandoned mine.", "You have entered the mine which is pitch dark, it gets slightly larger as you go in deeper to the west.\n" +
                    "Strangely you see a faint glow coming from the east.", "EAST 1 or WEST 3");
            output.writeObject(room2);

            Rooms room3 = new Rooms(3, "Beach", "You see a large beach and you are surprised to find out that there are some tents but no people. The water\n" +
                    "down seems crystal clear which is tempting but there is a sound coming from the east.", "EAST 2 or DOWN 6");
            output.writeObject(room3);

            Rooms room4 = new Rooms(4, "Tree House", "You enter a tree house that has a set of stairs that looks like they are in pretty bad shape\n" +
                    "however, you ignore the danger and you go in.", "NORTH 5");
            output.writeObject(room4);

            Rooms room5 = new Rooms(5, "Lazy River", "You have entered an enchanted forest that seems amazing, but as time passes by you realized that it becomes\n" +
                    "harder and harder to move because of the thick bushes that surround you. You see an escape to the west.", "SOUTH 4 or WEST 6");
            output.writeObject(room5);

            Rooms room6 = new Rooms(6, "Second level", "You have climbed the top of the trees and can see how you find your way home. The scene is amazing and it is almost\n" +
                    "nightfall, so you make a camp for tonight because tomorrow will be another adventure day.", "UP 3 or EAST 5");
            output.writeObject(room6);

        } catch (IOException ex)
        {
            ex.printStackTrace();
            System.out.println("Problem writing to file");
        }

        try
        {
            // close the file
            output.close();
            System.out.println("File successfully written.");
        } catch (Exception ex)
        {
            System.out.println("unable to properly close file");
        }
    }
}

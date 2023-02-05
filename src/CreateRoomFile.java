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
            Rooms room1 = new Rooms(1, "Beginning", "You are standing at the end of a road before a dark and dank cave. The forest is covering the road lending a dark and\n" +
                    "spooky aspect to the road. You hear a low wailing that seems to be coming from the cave.", "WEST 2");
            output.writeObject(room1);

            Rooms room2 = new Rooms(2, "Entrance", "You have entered a dark, low cave that seems to lead to a slightly larger cavern to the west. Strangely you see a faint\n" +
                    "glow coming from the east.", "EAST 1 or WEST 3");
            output.writeObject(room2);

            Rooms room3 = new Rooms(3, "Cavern", "You enter a large cavern. You are surprised to find that the walls of the cave are glowing so you have no problem\n" +
                    "seeing the large stalactites that have formed. To the south you hear the sound of rushing water. To the north you hear\n" +
                    "strange sounds that sound like someone with a broken heart. You see as set of stairs at the west end of the cavern.", "EAST 2 or DOWN 6");
            output.writeObject(room3);

            Rooms room4 = new Rooms(4, "Spooky Cave", "You have entered a dark twisting, tunnel that seems to wind around the Cavern. The low wailing you heard before has\n" +
                    "risen to a screech that is making your hair stand on end. You see a sign that says \"Proceed at your own risk. Anyone\n" +
                    "entering this area will be eaten.", "NORTH 5");
            output.writeObject(room4);

            Rooms room5 = new Rooms(5, "Rushing River", "You have entered a wet, slippery cave. You are standing on a narrow ledge. As you slip toward the rushing river, you\n" +
                    "think, \"I shouldn't be here.", "SOUTH 4 or WEST 6");
            output.writeObject(room5);

            Rooms room6 = new Rooms(6, "Second level", "At the bottom of the stairs you see a skeleton from a previous adventurer. You really wish you had some good weapons.",
                    "UP 3 or EAST 5");
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

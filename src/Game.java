import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
//
public class Game {
    public static void main(String[] args) {

        String userChoice = "A";
        int currentRoom = 1;
        Rooms roomsObject = new Rooms();
        boolean checkWord = false;

        ReadRoomFile readRoomObj = new ReadRoomFile();
        ArrayList<Rooms> listOfRooms;
        listOfRooms = readRoomObj.readFile();

        System.out.println("Welcome to the adventure game. You will proceed through rooms based upon your entries.");
        System.out.println("To exit(X) the game, enter X");
        System.out.println();

        Scanner myObj = new Scanner(System.in);
        while (!userChoice.equalsIgnoreCase("x")) {

            for (Rooms room : listOfRooms) {
                if (room.getRoomId() == currentRoom) {
                    roomsObject.setRoomExit(room.getRoomExit());
                    System.out.println(room.getRoomId());
                    System.out.println(room.getRoomName());
                    System.out.println(room.getRoomDesc());
                    System.out.println(room.getRoomExit());
                }
            }

            System.out.println("What would you like to do? ");
            userChoice = myObj.nextLine();
            checkWord = roomsObject.getRoomExit().toLowerCase().contains(userChoice.toLowerCase());

            while (checkWord == false && !userChoice.equalsIgnoreCase("x")) {
                System.out.println("Invalid direction entered");
                System.out.println();

                userChoice = myObj.nextLine();
                checkWord = roomsObject.getRoomExit().toLowerCase().contains(userChoice.toLowerCase());
            }
                // update current room of player to Model.DB
                // when currentRoom 1
                if (currentRoom == 1) {
                    currentRoom = 2;
                    // when currentRoom 2

                } else if (currentRoom == 2 && (userChoice.equalsIgnoreCase("east") ||
                        userChoice.toLowerCase(Locale.ROOT).startsWith("e"))) {
                        currentRoom = 1;
                } else if (currentRoom == 2 && (userChoice.equalsIgnoreCase("west") ||
                        userChoice.toLowerCase(Locale.ROOT).startsWith("w"))) {
                        currentRoom = 3;

                    // when currentRoom 3
                } else if (currentRoom == 3 && (userChoice.equalsIgnoreCase("east") ||
                        userChoice.toLowerCase(Locale.ROOT).startsWith("e"))) {
                        currentRoom = 2;
                } else if (currentRoom == 3 && (userChoice.equalsIgnoreCase("down") ||
                        userChoice.toLowerCase(Locale.ROOT).startsWith("d"))) {
                        currentRoom = 6;

                    // when currentRoom 4
                } else if (currentRoom == 4 && (userChoice.equalsIgnoreCase("north") ||
                        userChoice.toLowerCase(Locale.ROOT).startsWith("n"))) {
                        currentRoom = 5;

                    // when currentRoom 5
                } else if (currentRoom == 5 && (userChoice.equalsIgnoreCase("south") ||
                        userChoice.toLowerCase(Locale.ROOT).startsWith("s"))) {
                        currentRoom = 4;
                } else if (currentRoom == 5 && (userChoice.equalsIgnoreCase("west") ||
                        userChoice.toLowerCase(Locale.ROOT).startsWith("w"))) {
                        currentRoom = 6;

                } else if (currentRoom == 6 && (userChoice.equalsIgnoreCase("up") ||
                        userChoice.toLowerCase(Locale.ROOT).startsWith("u"))) {
                        currentRoom = 3;
                } else if (currentRoom == 6 && (userChoice.equalsIgnoreCase("east") ||
                        userChoice.toLowerCase(Locale.ROOT).startsWith("e"))) {
                        currentRoom = 5;
            }
            checkWord = false;
        }
    }
}
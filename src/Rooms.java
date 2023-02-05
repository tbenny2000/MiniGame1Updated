import java.io.Serializable;

public class Rooms implements Serializable {

    int roomId;
    private String roomName;
    private String roomDesc;
    private String roomExit;

    public Rooms(int roomId, String roomName, String roomDesc, String roomExit) {
        this.roomId = roomId;
        this.roomName = roomName;
        this.roomDesc = roomDesc;
        this.roomExit = roomExit;
    }

    public Rooms() {

    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomDesc() {
        return roomDesc;
    }

    public void setRoomDesc(String roomDesc) {
        this.roomDesc = roomDesc;
    }

    public String getRoomExit() {
        return roomExit;
    }

    public void setRoomExit(String roomExit) {
        this.roomExit = roomExit;
    }
}



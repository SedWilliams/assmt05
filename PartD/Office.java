
// Office.java

public class Office {
    private String roomNumber;
    private Computer computer;

    public Office(String roomNumber) {
        this.roomNumber = roomNumber;
        this.computer = new Computer();
    }

    @Override
    public String toString() {
        return "Office [roomNumber=" + roomNumber + ", computer=" + computer + "]";
    }
}

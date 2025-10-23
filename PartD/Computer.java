
// Computer.java

public class Computer {
    private Keyboard keyboard;
    private Mouse mouse;
    private Monitor monitor;

    public Computer() {
        this.keyboard = new Keyboard("QWERTY");
        this.mouse = new Mouse("Optical");
        this.monitor = new Monitor(24.0);
    }

    @Override
    public String toString() {
        return "Computer [" + keyboard + ", " + mouse + ", " + monitor + "]";
    }
}

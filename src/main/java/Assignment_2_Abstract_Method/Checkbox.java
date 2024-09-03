package Assignment_2_Abstract_Method;

// Abstract class for Checkbox
abstract class Checkbox {
    protected String text;

    public Checkbox(String text) {
        this.text = text;
    }

    public abstract void display();

    public void setText(String text) {
        this.text = text;
    }
}

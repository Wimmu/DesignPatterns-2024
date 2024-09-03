package Assignment_2_Abstract_Method;

public class CheckBoxClean extends Checkbox {
    public CheckBoxClean(String text) {
        super(text);
    }

    @Override
    public void display() {
        System.out.println("☐ " + text);
    }
}

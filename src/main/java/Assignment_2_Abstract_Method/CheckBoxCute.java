package Assignment_2_Abstract_Method;

public class CheckBoxCute extends Checkbox {
    public CheckBoxCute(String text) {
        super(text);
    }

    @Override
    public void display() {
        System.out.println("[♡] " + text);
    }
}

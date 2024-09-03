package Assignment_2_Abstract_Method;

public class TextFieldClean extends TextField {
    public TextFieldClean(String text) {
        super(text);
    }

    @Override
    public void display() {
        System.out.println("┌─────────────────────────────────────┐");
        System.out.println("│ " + text);
        System.out.println("│");
        System.out.println("└─────────────────────────────────────┘");
    }
}

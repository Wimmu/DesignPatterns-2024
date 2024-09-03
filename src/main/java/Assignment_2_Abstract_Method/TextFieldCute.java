package Assignment_2_Abstract_Method;

public class TextFieldCute extends TextField {
    public TextFieldCute(String text) {
        super(text);
    }

    @Override
    public void display() {
        System.out.println("┌♡.｡..｡..｡..｡..｡..｡..｡..｡..｡..｡..｡..｡.♡┐");
        System.out.println("│ " + text);
        System.out.println("│");
        System.out.println("└♡.｡..｡..｡..｡..｡..｡..｡..｡..｡..｡..｡..｡.♡┘");
    }
}

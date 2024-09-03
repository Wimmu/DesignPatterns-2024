package Assignment_2_Abstract_Method;

class ButtonCute extends Button {
    public ButtonCute(String text) {
        super(text);
    }

    @Override
    public void display() {
        System.out.println("[♡-" + text + "-♡]");
    }
}

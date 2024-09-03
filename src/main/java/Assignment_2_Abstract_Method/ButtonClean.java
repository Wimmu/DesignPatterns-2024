package Assignment_2_Abstract_Method;

class ButtonClean extends Button {
    public ButtonClean(String text) {
        super(text);
    }

    @Override
    public void display() {
        System.out.println("[" + text + "]");
    }
}

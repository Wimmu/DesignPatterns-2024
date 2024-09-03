package Assignment_2_Abstract_Method;

// Abstract Factory class for creating UI elements
abstract class UIFactory {
    public abstract Button createButton(String text);
    public abstract TextField createTextField(String text);
    public abstract Checkbox createCheckbox(String text);
}

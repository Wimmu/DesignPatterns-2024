package Assignment_2_Abstract_Method;

public class FactoryClean extends UIFactory {
    @Override
    public Button createButton(String text) {
        return new ButtonClean(text);
    }

    @Override
    public TextField createTextField(String text) {
        return new TextFieldClean(text);
    }

    @Override
    public Checkbox createCheckbox(String text) {
        return new CheckBoxClean(text);
    }
}

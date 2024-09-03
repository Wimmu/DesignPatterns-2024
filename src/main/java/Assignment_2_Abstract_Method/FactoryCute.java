package Assignment_2_Abstract_Method;

public class FactoryCute extends UIFactory {
    @Override
    public Button createButton(String text) {
        return new ButtonCute(text);
    }

    @Override
    public TextField createTextField(String text) {
        return new TextFieldCute(text);
    }

    @Override
    public Checkbox createCheckbox(String text) {
        return new CheckBoxCute(text);
    }
}

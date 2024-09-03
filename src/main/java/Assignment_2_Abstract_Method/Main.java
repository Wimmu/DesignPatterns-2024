package Assignment_2_Abstract_Method;

public class Main {
    public static void main(String[] args) {
        // Choose a factory (style A)
        UIFactory cuteFactory = new FactoryCute();
        Button cuteButton = cuteFactory.createButton("CONTINUE");
        TextField cuteTextField = cuteFactory.createTextField("My name is...");
        Checkbox cuteCheckBox = cuteFactory.createCheckbox("I Accept the Terms and Conditions");

        // Display UI elements created by factory A
        System.out.println("-------------- CUTE FACTORY --------------");
        cuteTextField.display();
        cuteCheckBox.display();
        cuteButton.display();
        System.out.println(" ");

        // Dynamically change the content of UI elements
        cuteButton.setText("SUBMIT");
        cuteTextField.setText("This is cute text field!");
        cuteCheckBox.setText("I Agree");

        // Display updated UI elements
        System.out.println("-------------- CUTE FACTORY (UPDATED) --------------");
        cuteTextField.display();
        cuteCheckBox.display();
        cuteButton.display();
        System.out.println(" ");

        // Choose another factory (style B)
        UIFactory cleanFactory = new FactoryClean();
        Button cleanButton = cleanFactory.createButton("SEND");
        TextField cleanTextField = cleanFactory.createTextField("Enter your email address...");
        Checkbox cleanCheckBox = cleanFactory.createCheckbox("Subscribe to our newsletter");

        // Display UI elements created by factory B
        System.out.println("-------------- CLEAN FACTORY --------------");
        cleanTextField.display();
        cleanCheckBox.display();
        cleanButton.display();
    }
}

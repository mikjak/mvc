package com.jakubmikula;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Model model = createPerson();
        View view = new View();
        Controller controller = new Controller(model, view);

        controller.updateView();
        controller.setAge(399);
        controller.updateView();
    }

    private static Model createPerson() {
        Model model = new Model();
        model.setName("Jakub");
        model.setAge(49);
        model.setEmail("m@m.pl");

        return model;
    }
}
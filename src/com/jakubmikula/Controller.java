package com.jakubmikula;

public class Controller {
    private final Model model;
    private final View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void setName(String name) {
        model.setName(name);
    }

    public void setAge(int age) {
        model.setAge(age);
    }

    public void setEmail(String email) {
        model.setEmail(email);
    }

    public String getName(){
        return  model.getName();
    }

    public int getAge() {
        return model.getAge();
    }

    public String getEmail() {
        return model.getEmail();
    }

    public void updateView() {
        view.update(model.getName(), model.getAge(), model.getEmail());
    }
}

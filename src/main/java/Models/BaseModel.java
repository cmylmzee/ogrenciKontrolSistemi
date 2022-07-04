package Models;

//Bu sınınf diger modellerin ortak variable ozelliklerini tutars

import java.util.List;

public class BaseModel{
    public BaseModel(){}

    private int ID;
    private String name;
    private String lastName;
    private List<String> tasks;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<String> getTasks() {
        return tasks;
    }

    public void setTasks(List<String> tasks) {
        this.tasks = tasks;
    }

    public BaseModel(int ID, String name, String lastName, List<String> tasks) {
        this.ID = ID;
        this.name = name;
        this.lastName = lastName;
        this.tasks = tasks;
    }





}

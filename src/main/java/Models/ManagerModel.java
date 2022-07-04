package Models;

import java.util.List;

public class ManagerModel extends BaseModel{

    private int wage;
    private int password;

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }


    public ManagerModel(int ID, String name, String lastName, List<String> tasks, int wage, int password) {
        super(ID, name, lastName, tasks);
        this.wage = wage;
        this.password = password;
    }
}

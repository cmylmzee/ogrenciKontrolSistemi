package Models;

// bu sınınf ogrencı modelı ıcındır

import java.util.List;

public class StudentModel extends BaseModel{
    public StudentModel(){}
    private List<Integer> notes;
    private String className;
    public List<Integer> getNotes() {
        return notes;
    }

    public void setNotes(List<Integer> notes) {
        this.notes = notes;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public StudentModel(int ID, String name, String lastName, List<String> tasks, List<Integer> notes, String className) {
        super(ID, name, lastName, tasks);
        this.notes = notes;
        this.className = className;
    }
}

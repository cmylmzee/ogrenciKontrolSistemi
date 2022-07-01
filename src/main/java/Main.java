import Controller.StudentControler;
import Models.BaseModel;
import Models.StudentModel;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> notes = new ArrayList<>();
        List<String> tasks = new ArrayList<>();
        BaseModel studentModel = new StudentModel(1,"cem","yılmaz",tasks,notes,"2a");
        StudentControler studentControler = new StudentControler(studentModel);
        studentControler.getNotes();
    }
}

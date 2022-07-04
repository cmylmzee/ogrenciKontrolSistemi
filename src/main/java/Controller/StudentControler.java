package Controller;

import Models.BaseModel;
import Models.StudentModel;

import java.util.List;

public class StudentControler extends CommonController {

    private StudentModel studentModel;


    public StudentControler(BaseModel baseModel) {
        super(baseModel);
    }

    public List<Integer> getNotes() {
        return studentModel.getNotes();
    }

    public void setNotes(List<Integer> notes) {
        studentModel.setNotes(notes);
    }

    public String getClassName() {
        return studentModel.getClassName();
    }

    public void setClassName(String className) {
        studentModel.setClassName(className);
    }
}

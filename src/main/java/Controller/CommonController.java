package Controller;

import Models.BaseModel;
import Models.ManagerModel;
import Models.StudentModel;
import Models.TeacherModel;

import java.util.List;

public class CommonController{

    public void addNewNoteStudent(StudentModel studentModel, int note){
        studentModel.getNotes().add(note);
    }

    public void addNewTaskStudent(StudentModel studentModel, String task){
        studentModel.getTasks().add(task);
    }

    public  void addNewTaskForTheTeacher(TeacherModel teacherModel, String task){
        teacherModel.getTasks().add(task);
    }

    public void  addNewTaskForTheManager(ManagerModel managerModel, String task){
        managerModel.getTasks().add(task);
    }


}

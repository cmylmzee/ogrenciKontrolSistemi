package Controller;

import Models.BaseModel;
import Models.StudentModel;

import java.util.List;

public class StudentControler  {

    private StudentModel studentModel;


    public StudentControler(StudentModel studentModel) {
        this.studentModel = studentModel;
    }

    public int getStudentID() {
        return studentModel.getID();
    }

    public void setStudentID(int ID) {
        studentModel.setID(ID);
    }

    public String getStudentName() {
        return studentModel.getName();
    }

    public void setStudentName(String name) {
        studentModel.setName(name);
    }

    public String getStudentLastName() {
        return studentModel.getLastName();
    }

    public void setStudentLastName(String lastName) {
        studentModel.setLastName(lastName);
    }

    public List<String> getTasks() {
        return  studentModel.getTasks();
    }

    public void setTasks(List<String> tasks) {
        studentModel.setTasks(tasks);
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

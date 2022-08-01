package Controller;

import Models.StudentModel;

import java.util.List;

public class StudentController {



    private StudentModel studentModel;


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

    public StudentController(StudentModel studentModel) {
        this.studentModel = studentModel;
    }

    public void showTheNotes(){
        try{
            System.out.println("Your test notes : \n");
            for(Integer note : studentModel.getNotes()){
                System.out.println(note + "\n");
            }
        }catch (NullPointerException e){
            System.out.println("You don't have any notes\n\n");
            System.out.println("You are returned to the system screen\n\n");
        }

    }

    public void showTheTasks(){
        try{
            System.out.println("Your duties : \n");
            for(String task : studentModel.getTasks()){
                System.out.println(task + "\n");
            }

        }catch (NullPointerException nullPointerException){
            System.out.println("You don't have any tasks\n\n");
            System.out.println("You are returned to the system screen\n\n");
        }

    }

    public void showTheAverage(){
        try{
            int total = 0;
            for (int note : studentModel.getNotes()) {
                total+=note;
            }
            System.out.println("Average is : " + total % studentModel.getNotes().size());
        }catch (Exception exception){
            System.out.println("The list");
        }

    }

}

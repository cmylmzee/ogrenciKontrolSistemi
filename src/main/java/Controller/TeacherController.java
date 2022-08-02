package Controller;

import Models.TeacherModel;

public class TeacherController extends  CommonController{

    private TeacherModel teacherModel;

    public TeacherModel getTeacherModel() {
        return teacherModel;
    }

    public void setTeacherModel(TeacherModel teacherModel) {
        this.teacherModel = teacherModel;
    }


    public TeacherController(TeacherModel teacherModel) {
        this.teacherModel = teacherModel;
    }

    public void showTheTasks(){
        try{
            System.out.println("TASKS : ");
            for (String task : teacherModel.getTasks()){
                System.out.println(task);
            }
        }catch (Exception exception){
            System.out.println("There was a problem viewing the tasks, try again later\n");
        }

    }
}

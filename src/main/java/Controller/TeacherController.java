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
}

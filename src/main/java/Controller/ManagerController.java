package Controller;

import Models.BaseModel;
import Models.ManagerModel;
import Models.StudentModel;
import Models.TeacherModel;

import java.util.List;

public class ManagerController extends CommonController {

    private ManagerModel managerModel;
    public ManagerModel getManagerModel() {
        return managerModel;
    }

    public void setManagerModel(ManagerModel managerModel) {
        this.managerModel = managerModel;
    }

    public ManagerController(ManagerModel managerModel) {
        this.managerModel = managerModel;
    }



    public  void addNewStudent(StudentModel studentModel, List<StudentModel> studentModelList){
        try{
            studentModelList.add(studentModel);
        }catch (Exception exception){
            System.out.println("Student isn't registered!!!!");
        }

    }

    public  void addNewTeacher(TeacherModel teacherModel, List<TeacherModel> teacherModelList){
        try{
            teacherModelList.add(teacherModel);
        }catch (Exception exception){
            System.out.println("Teacher isn't registered!!!!");
        }

    }

    public  void addNewManager(ManagerModel managerModel, List<ManagerModel> managerModelList){
        try{
            managerModelList.add(managerModel);
        }catch (Exception exception){
            System.out.println("Manager isn't registered!!!!");
        }

    }



}

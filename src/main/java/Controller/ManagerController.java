package Controller;

import Models.ManagerModel;
import Models.StudentModel;

import java.util.List;

public class ManagerController {

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



    void addNewStudent(StudentModel studentModel, List<StudentModel> studentModelList){
        studentModelList.add(studentModel);
    }



}

package Controller;

import Models.BaseModel;

import java.util.List;

public class CommonController {

    private BaseModel baseModel;

    public CommonController(BaseModel baseModel) {
        this.baseModel = baseModel;
    }
    public void setBaseModel(BaseModel baseModel) {
        this.baseModel = baseModel;
    }

    public BaseModel getBaseModel() {
        return baseModel;
    }

    public void getModelName(){
        baseModel.getName();
    }

    public void setModelName(String name){
        baseModel.setName(name);
    }

    public String getModelLastName() {
        return baseModel.getLastName();
    }

    public void setModelLastName(String lastName) {
        baseModel.setLastName(lastName);
    }

    public List<String> getModelTasks() {
        return baseModel.getTasks();
    }

    public void setModelTasks(List<String> tasks) {
        baseModel.setTasks(tasks);
    }







}

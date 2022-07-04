import Controller.ManagerController;
import Controller.StudentController;
import Controller.TeacherController;
import Models.ManagerModel;
import Models.StudentModel;
import Models.TeacherModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentModel studentModel2 =new StudentModel();
        TeacherModel teacherModel2 = null;
        ManagerModel managerModel2 = null;

        StudentController studentController = null;
        ManagerController managerController = null;
        TeacherController teacherController = null;


        // MODELS LIST
        List<TeacherModel> teacherModels = new ArrayList<>();
        List<StudentModel> studentModels = new ArrayList<>();
        List<ManagerModel> managerModels = new ArrayList<>();
        //

        // STUDENT MODEL
        List<String> studentModelTasksList = new ArrayList<>();
        List<Integer> studentModelNotesList = new ArrayList<>();
        StudentModel studentModel = new StudentModel(1, "cem", "yılmaz", studentModelTasksList, studentModelNotesList, "1a");
        //

        // TEACHER MODEL
        List<String> teacherModelTasksList = new ArrayList<>();
        TeacherModel teacherModel = new TeacherModel(2, "Burçak", "Sessiz", teacherModelTasksList, 10000, 12345);
        //

        // MANAGER MODEL
        List<String> managerModelTasksList = new ArrayList<>();
        ManagerModel managerModel = new ManagerModel(3, "Kadir", "Tekin", managerModelTasksList, 15000, 258);
        //


        // MODELS ADDED MODEL LİSTS
        teacherModels.add(teacherModel);
        managerModels.add(managerModel);
        studentModels.add(studentModel);
        //



        int a = 0; // WHILE DONGUSUNDEN CIKMAK ICIN KULLANACAGIM

        while (a != 1) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("WELCOME\n");
                System.out.println("Select the type of user you will login\n");
                System.out.println("1-Student\n" +
                        "2-Teacher\n" +
                        "3-Manager\n" +
                        "4-Exit");
                switch (scanner.nextInt()) {
                    case 1: { // STUDENT LOGIN SCREEN
                        System.out.println("Please enter your id\n");
                        boolean idIsFound = false;
                        for (StudentModel studentModel1 : studentModels) {
                            if (studentModel1.getID() == scanner.nextInt()) {
                                studentController = new StudentController(studentModel1);
                                idIsFound = true;
                                break;
                            }

                        }
                        if (!idIsFound) {
                            System.out.println("Id not found\n");
                            break;
                        }

                        System.out.println("Welcome : " + studentModel2.getName() +"\n"); // ?
                        System.out.println("Choose your action\n");
                        System.out.println("1-Show The Test Notes\n" +
                                "2-Show The Tasks\n" +
                                "3-Show The Average Of The Notes\n" +
                                "4-Exit");
                        switch (scanner.nextInt()) {
                            case 1: {
                                studentController.showTheNotes();
                                break;
                            }
                            case 2: {
                                studentController.showTheTasks();
                                break;
                            }
                            case 3: {
                                studentController.showTheAverage();
                            }
                            case 4: {
                                System.out.println("Exiting...\n");
                                a=1;
                                break;
                            }
                            default:{
                                System.out.println("Invalid operation\n");
                                a=1;
                                break;
                            }
                        }
                        break;

                    }
                    case 2:{
                        System.out.println("Please enter your id & password\n");
                        boolean authenticaton = false;
                        for (TeacherModel teacherModel1 : teacherModels) {
                            if (teacherModel1.getID() == scanner.nextInt() && teacherModel1.getPassword() == scanner.nextInt()) {
                                teacherModel2 = teacherModel1;
                                authenticaton = true;
                                break;
                            }

                        }
                        if (!authenticaton) {
                            System.out.println("Id not found or password is false\n");
                            break;
                        }

                        System.out.println("Welcome : " + teacherModel2.getName()); // ?
                        System.out.println("Choose your action\n");
                        System.out.println("1-Add New Note\n" +
                                "2-Add New Task For The Student\n" +
                                "3-Add New Task For The Teacher\n" +
                                "4-Add New Task For The Manager" +
                                "5-Exit");
                        switch (scanner.nextInt()){
                            case 1:{
                                authenticaton = false;
                                System.out.println("Enter the id of the student you will add a grade to\n");
                                for(StudentModel studentModel1 : studentModels){
                                    if(studentModel1.getID() == scanner.nextInt()){
                                        authenticaton = true;
                                        System.out.println("Please enter the note");
                                        teacherController.addNewNoteStudent(studentModel1,scanner.nextInt());

                                        System.out.println("The note is added");
                                        break;
                                    }
                                }

                                if(!authenticaton){
                                    System.out.println("Id is not found");
                                }

                                break;
                            }
                            case 2:{
                                authenticaton = false;
                                System.out.println("Enter the id of the student you will add a task to\n");
                                for(StudentModel studentModel1 : studentModels){
                                    if(studentModel1.getID() == scanner.nextInt()){
                                        authenticaton = true;
                                        System.out.println("Please enter the task");
                                        teacherController.addNewTaskStudent(studentModel1,scanner.nextLine());

                                        System.out.println("The task is added");
                                        break;
                                    }
                                }

                                if(!authenticaton){
                                    System.out.println("Id is not found");
                                }

                                break;
                            }
                            case 3:{
                                authenticaton = false;
                                System.out.println("Enter the id of the teacher you will add a task to\n");
                                for(TeacherModel teacherModel1 : teacherModels){
                                    if(teacherModel1.getID() == scanner.nextInt()){
                                        authenticaton = true;
                                        System.out.println("Please enter the task");
                                        teacherController.addNewTaskForTheTeacher(teacherModel1,scanner.nextLine());
                                        System.out.println("The task is added");
                                        break;
                                    }
                                }

                                if(!authenticaton){
                                    System.out.println("Id is not found");
                                }

                                break;
                            }
                            case 4:{
                                authenticaton = false;
                                System.out.println("Enter the id of the manager you will add a task to\n");
                                for(ManagerModel managerModel1 : managerModels){
                                    if(managerModel1.getID() == scanner.nextInt()){
                                        authenticaton = true;
                                        System.out.println("Please enter the task");
                                        teacherController.addNewTaskForTheManager(managerModel1,scanner.nextLine());
                                        System.out.println("The task is added");
                                        break;
                                    }
                                }

                                if(!authenticaton){
                                    System.out.println("Id is not found");
                                }

                                break;
                            }
                            case 5:{
                                a =1;
                                System.out.println("Exiting...");
                                break;
                            }
                            default: a=1;
                                System.out.println("Wrong dialing\n");
                                break;
                        }
                        break;
                    }
                    case 3:break;
                    case 4:{
                        System.out.println("\nExiting....\n");
                        a=1;
                        break;
                    }
                    default: a=1;
                        System.out.println("Wrong dialing\n");
                    break;
                }
            }catch(Exception exception){
                System.out.println("Beware of wrong operation\n");
                System.out.println("You are returned to the system screen\n");
            }


        }
    }
}

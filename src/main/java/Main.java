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
        StudentModel studentModel2 =null;
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
                Scanner scanner2 = new Scanner(System.in);
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

                        System.out.println("Welcome : \n"); // ?
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
                        int id = scanner.nextInt();  // BURADA HATA İLE KARŞILAŞTIM O YÜZDEN BÖYLE
                        int password = scanner2.nextInt();
                        for (TeacherModel teacherModel1 : teacherModels) {
                            if (teacherModel1.getID() == id && teacherModel1.getPassword() == password) {
                                teacherController = new TeacherController(teacherModel1);
                                authenticaton = true;
                                break;
                            }

                        }
                        if (!authenticaton) {
                            System.out.println("Id not found or password is false\n");
                            break;
                        }

                        System.out.println("Welcome Teacher :)"); // ?
                        System.out.println("Choose your action\n");
                        System.out.println("1-Add New Note\n" +
                                "2-Add New Task For The Student\n" +
                                "3-Add New Task For The Teacher\n" +
                                "4-Add New Task For The Manager\n" +
                                "5-Show The Tasks\n" +
                                "6-Exit");
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
                                        scanner.nextLine();
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
                                        scanner.nextLine();
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
                                        scanner.nextLine();
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
                                teacherController.showTheTasks();
                                break;
                            }
                            case 6:{
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
                    case 3:{
                        System.out.println("Please enter your id & password\n");
                        int id = scanner.nextInt();  // BURADA HATA İLE KARŞILAŞTIM O YÜZDEN BÖYLE
                        int password = scanner2.nextInt();
                        boolean authenticaton = false; // generic oluştur
                        for (ManagerModel managerModel1 : managerModels) {
                            if (managerModel1.getID() == id && managerModel1.getPassword() == password) {
                                managerController = new ManagerController(managerModel1);
                                authenticaton = true;
                                break;
                            }

                        }
                        if (!authenticaton) {
                            System.out.println("Id not found or password is false\n");
                            break;
                        }

                        System.out.println("Welcome Boss `)"); // ?
                        System.out.println("Choose your action\n");
                        System.out.println("1-Add New Note\n" +
                                "2-Add New Task For The Student\n" +
                                "3-Add New Task For The Teacher\n" +
                                "4-Add New Task For The Manager\n" +
                                "5-Add New Student\n" +
                                "6-Add New Teacher" +
                                "6-Add New Manager\n" +
                                "7-Exit");
                        switch (scanner.nextInt()){
                            case 1:{
                                authenticaton = false;
                                System.out.println("Enter the id of the student you will add a grade to\n");
                                for(StudentModel studentModel1 : studentModels){
                                    if(studentModel1.getID() == scanner.nextInt()){
                                        authenticaton = true;
                                        System.out.println("Please enter the note");
                                        managerController.addNewNoteStudent(studentModel1,scanner.nextInt());
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
                                        scanner.nextLine();
                                        managerController.addNewTaskStudent(studentModel1,scanner.nextLine());
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
                                        scanner.nextLine();
                                        managerController.addNewTaskForTheTeacher(teacherModel1,scanner.nextLine());
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
                                        scanner.nextLine();
                                        System.out.println("Please enter the task");
                                        managerController.addNewTaskForTheManager(managerModel1,scanner.nextLine());
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
                                    System.out.println("Please enter the student's ID, name, surname, class number, respectively.\n");
                                    List<String> tasks = new ArrayList<>();
                                    List<Integer> notes = new ArrayList<>();
                                    id = scanner.nextInt();
                                    boolean idIsValıd = false;
                                    for(StudentModel studentModel1 : studentModels){
                                        if (studentModel1.getID()==id){
                                            idIsValıd = true;
                                        }
                                    }
                                    if(idIsValıd){
                                        System.out.println("Id is already given!!");
                                        break;
                                    }
                                    scanner.nextLine();
                                    managerController.addNewStudent(new StudentModel(id,scanner.nextLine(), scanner.nextLine(),tasks,notes,scanner.nextLine() ), studentModels);
                                    System.out.println("The students is registered.");
                                    break;
                            }
                            case 6:{
                                System.out.println("Please enter the teacher's ID, name, surname, class number, respectively.\n");
                                List<String> tasks = new ArrayList<>();
                                id = scanner.nextInt();
                                boolean idIsValıd = false;
                                for(TeacherModel teacherModel1 : teacherModels){
                                    if (teacherModel1.getID()==id){
                                        idIsValıd = true;
                                    }
                                }
                                if(idIsValıd){
                                    System.out.println("Id is already given!!");
                                    break;
                                }
                                scanner.nextLine();
                                managerController.addNewTeacher(new TeacherModel(id,scanner.nextLine(), scanner.nextLine(),tasks,scanner.nextInt(),scanner.nextInt() ), teacherModels);
                                System.out.println("The teacher is registered.");
                                break;
                            }
                            case 7:{
                                System.out.println("Please enter the manager's ID, name, surname, class number, respectively.\n");
                                List<String> tasks = new ArrayList<>();
                                List<Integer> notes = new ArrayList<>();
                                id = scanner.nextInt();
                                boolean idIsValıd = false;
                                for(ManagerModel managerModel1 : managerModels){
                                    if (managerModel1.getID()==id){
                                        idIsValıd = true;
                                    }
                                }
                                if(idIsValıd){
                                    System.out.println("Id is already given!!");
                                    break;
                                }
                                scanner.nextLine();
                                managerController.addNewManager(new ManagerModel(id,scanner.nextLine(), scanner.nextLine(),tasks,scanner.nextInt(),scanner.nextInt() ), managerModels);
                                System.out.println("The manager is registered.");
                                break;
                            }
                            case 8:{
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

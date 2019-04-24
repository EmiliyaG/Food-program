package system.logic.loginformlogic;

import system.ui.loginscreen.RegisterForm;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class NewAccountLogic {
    private RegisterForm registerForm;

    public void setRegisterLogic(RegisterForm registerLogic) {
        this.registerForm = registerForm;
    }
//    public void savingTheRegisterInfo(){
//        try {
//            File fileWithUsersInformation = new File("informationWithUsersInfo.txt");
//            PrintWriter pw= new PrintWriter(fileWithUsersInformation);
//            pw.println();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//
//    }
}

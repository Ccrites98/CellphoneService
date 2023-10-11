package com.pluralsight;
import com.pluralsight.Cellphone;
import java.util.*;
public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner keyBoard = new Scanner(System.in);
//Stuff imported, now to build the lines
        Cellphone cellphone = new Cellphone();
        System.out.print("Please input the name of the phone owner: ");
        cellphone.setPhone_number(keyBoard.nextLine());
        System.out.print("Please input your serial number: ");
        cellphone.setSerial_number(keyBoard.nextInt());
        System.out.print("Please input model of the phone: ");
        cellphone.setModel(keyBoard.nextLine());
        keyBoard.nextLine();
        System.out.print("Please input your carrier here: ");
        cellphone.setCarrier(keyBoard.nextLine());
        System.out.print("Please input your phone number: ");
        cellphone.setPhone_number(keyBoard.nextLine());
    //pull that stuff together jamie
        System.out.println(cellphone.getPhone_number());
        System.out.println(cellphone.getCarrier());
        System.out.println(cellphone.getModel());
        System.out.println(cellphone.getName());
        System.out.println(cellphone.getSerial_number());


    }

}

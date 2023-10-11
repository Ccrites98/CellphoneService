package com.pluralsight;
//Pain and suffering
public class Cellphone {
    private int serial_number = 0;
    private String model = "";
    private String carrier = "";
    private String phone_number ="";
    private String name = "";

    public Cellphone() {
        this.serial_number = serial_number;
        this.model = model;
        this.carrier = carrier;
        this.phone_number = phone_number;
        this.name = name;
    }
        public Cellphone( int serial_number, String model, String carrier,String phone_number, String name)
            {
                this.serial_number = serial_number;
                this.model = model;
                this.carrier = carrier;
                this.phone_number = phone_number;
                this.name = name;


            }
        public void setSerial_number(int serial_number){
        this.serial_number = serial_number;
        }
        public void setModel(String model){
        this.model = model;
        }
        public void setCarrier(String Carrier){
        this.carrier = carrier;
        }
        public void setPhone_number(String phone_number){
        this.phone_number = phone_number;
        }
        public void setName(String name){
        this.name = name;
        }
        public int getSerial_number(){
        return this.serial_number;
        }
        public String getModel(){
        return this.model;
        }
        public String getCarrier(){
        return this.carrier;
        }
        public String getName(){
        return this.name;
        }
        public String getPhone_number(){
        return this.phone_number;
        }

}



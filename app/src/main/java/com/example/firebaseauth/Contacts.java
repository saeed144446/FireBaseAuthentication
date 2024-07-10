package com.example.firebaseauth;

public class Contacts {
     String name;
      String number;



    public Contacts(String name, String number) {
        this.name = name;
        this.number = number;
    }
    Contacts(){

   }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

}

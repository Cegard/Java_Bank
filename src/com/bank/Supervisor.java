package com.bank;


public class Supervisor extends Agent {


    public Supervisor(int id){
        this.employeeID = id;
    }


    @Override
    public void serve() {
        System.out.printf(" Attended by Supervisor %n", this.employeeID);
    }
}

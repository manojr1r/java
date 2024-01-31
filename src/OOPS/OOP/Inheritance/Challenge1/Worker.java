package OOPS.OOP.Inheritance.Challenge1;

import java.time.LocalDate;
import java.time.Period;

public class Worker {
    protected String name, birthDate, endDate;

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getAge(){
        LocalDate dob = LocalDate.parse(birthDate);
        LocalDate curDate = LocalDate.now();
        int age = Period.between(dob, curDate).getYears();
//        int age =  Period.between(birthDate,  LocalDate.now()).getYears();
        return age ;
    }
    public double collectPay(){
        return 0.0;
    }
    public void terminate(String endDate){
        this.endDate = endDate;
        System.out.print("Hi "+name +", your end date is "+ endDate);
    }
}

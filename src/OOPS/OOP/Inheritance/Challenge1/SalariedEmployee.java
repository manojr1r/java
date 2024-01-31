package OOPS.OOP.Inheritance.Challenge1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class SalariedEmployee extends Employee{
    private double annualSalary;
    private boolean isRetired;
    public SalariedEmployee(String name, String birthDate, String hireDate,  double annualSalary ){
        super( name, birthDate, hireDate);
        this.annualSalary = annualSalary;
    }

    public void retire(){
        if (getAge() >= 60) {
            isRetired = true;
            LocalDate dob = LocalDate.parse(birthDate);
            LocalDate retireYear =  dob.plusYears(60);

            String retireYeartoString = "" + retireYear;

            terminate(retireYeartoString);
        }
    }

//    @Override
//    public String toString() {
//        return "SalariedEmployee{" +
//                "annualSalary=" + annualSalary +
//                ", isRetired=" + isRetired +
//                "} " + super.toString();
//    }
}

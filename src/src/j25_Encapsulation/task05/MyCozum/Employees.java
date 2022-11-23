package src.j25_Encapsulation.task05.MyCozum;

import java.time.LocalDate;

public class Employees {
    private String name;
    private int salary;
    private String dob;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        ageCalculator(dob);
        this.dob = dob;
    }

    int yas;
    public int ageCalculator (String dob){

        LocalDate suan =LocalDate.now();

        int dogumTarihi = Integer.parseInt(dob.substring(dob.length()-4));

        yas= (suan.getYear()-dogumTarihi);

        return yas;
    }

    public void menu (){

        if (yas>18){
            System.out.println("Welcome to our company "+ name+" your salary is "+salary);
        } else if (yas==18) {
            System.out.println("we can have inter with you after that you can have a "+salary+" salary");
        }else {
            System.out.println("come back when you are 18 years old.");
        }


    }




}

package MaasHesaplayici;

public class Employee {

    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name,int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;

    }

    double tax(double salary) {
        double vergi = 0;
        if (salary > 1000) {
            vergi = (salary * 0.03);
        }

        return vergi;
    }

    double bonus(int workHours) {
        double bonusPara = 0;
        if(workHours > 40){
            bonusPara =  (workHours - 40) * 30 ;

        }
    return bonusPara;
    }

    double raiseSalary(double salary,int hireYear){
        double maasArtisi = 0;
        System.out.println("girissalary:"+salary);
        int year  = 2021;
        if(year - hireYear < 10 ){
            maasArtisi = salary * 0.05 ;
        }
        else if(year - hireYear < 20 ){
            maasArtisi = salary * 0.1 ;
        }else{
            maasArtisi = salary * 0.15 ;


        }
        return maasArtisi;
    }

    public String toString(){
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
        System.out.println("Work Hours: " + this.workHours);
        System.out.println("Hire Year: " + this.hireYear);

        return null;
    }



}

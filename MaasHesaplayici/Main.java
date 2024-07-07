package MaasHesaplayici;

public class Main {
    public static void main(String[] args) {

        double vergi;
        double maasArtisi;
        double bonus;
        Employee e1 = new Employee("Cihan",2000,45,1985);
        Employee e2 = new Employee("Oguz",17001,60,2005);
        bonus = e1.bonus(e1.workHours);
        vergi = e1.tax(e1.salary);
        maasArtisi = e1.raiseSalary(e1.salary,e1.hireYear);
        e1.salary = e1.salary + bonus + maasArtisi - vergi;


        e1.toString();

    }
}

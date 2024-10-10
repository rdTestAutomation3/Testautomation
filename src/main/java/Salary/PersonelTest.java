package Salary;

public class PersonelTest {

    public static void main(String[] args) {

        Personels personels = new Personels();
        personels.name = "Aleyna Turk";
        personels.baseSalary = 30000;
        personels.workedDays = 28;

        Personels personels1 = new Personels();
        personels1.name = "Maura Icardi";
        personels1.baseSalary = 50000;
        personels1.workedDays = 29;

        Personels personels2 = new Personels();
        personels2.name = "Ergun Yilmaz";
        personels2.baseSalary = 20000;
        personels2.workedDays = 30;

        Personels personels3 = new Personels();
        personels3.name = "Mehmet İsler";
        personels3.baseSalary = 40000;
        personels3.workedDays = 25;

        // Her personelin maaş ve primini hesapla
        personels.calculateSalaryAndBonus();
        personels1.calculateSalaryAndBonus();
        personels2.calculateSalaryAndBonus();
        personels3.calculateSalaryAndBonus();

        // Her personelin bilgilerini yazdır
        personels.printPersonelInfo();
        personels1.printPersonelInfo();
        personels2.printPersonelInfo();
        personels3.printPersonelInfo();
    }



}

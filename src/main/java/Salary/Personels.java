package Salary;

public class Personels {

    public String name;
    public double baseSalary;
    public int workedDays;
    public double totalSalary;
    public double bonus;

    public void calculateSalaryAndBonus(){

        totalSalary = baseSalary ; //Not : Temel maaşı sabit 25 gün olarak belirliyorum.

        if(workedDays > 25)
        {
            int extraDays =workedDays - 25;
            bonus = extraDays*1000;
        }
        else
        {
            bonus = 0 ;
        }
        totalSalary += bonus;
    }

    public void printPersonelInfo() {
        System.out.println("Personel Adı: " + name);
        System.out.println("Çalışılan Gün: " + workedDays);
        System.out.println("Aylık Maaş: " + baseSalary);
        System.out.println("Prim: " + bonus);
        System.out.println("Toplam Maaş: " + totalSalary);
        System.out.println(); // Boş satır
    }
}

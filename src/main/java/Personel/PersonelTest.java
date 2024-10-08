package Personel;

public class PersonelTest {
    public static void main(String[] args) {
        PersonelInfo personelInfo1 = new PersonelInfo();
        PersonelInfo personelInfo2 = new PersonelInfo();
        PersonelInfo personelInfo3 = new PersonelInfo();

        personelInfo1.name = "Aleyna Turk";
        personelInfo1.salary = 1000f;
        personelInfo1.age = 27;

        personelInfo2.name = "Maura Icardi";
        personelInfo2.salary = 10000f;
        personelInfo2.age = 30;

        personelInfo3.name = "Ergun Yılmaz";
        personelInfo3.salary = 5000f;
        personelInfo3.age = 27;

        personelInfo1.personelList();
        personelInfo2.personelList();
        personelInfo3.personelList();
    }
}

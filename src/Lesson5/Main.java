package Lesson5;


public class Main {
    public static void main(String[]args) {
        Employee [] empArrays = new Employee[5];
        empArrays[0] = new Employee("Kesha", "Lawyer", "Keshik@yandex.com", "79045454545", 50000, 19);
        empArrays[1] = new Employee("Kris", "QA Engineer", "kriska1@bk.ru", "79253457821", 100321, 52);
        empArrays[2] = new Employee("Petya", "Engineer", "pete4ka@mail.ru", "79235676578", 74321, 19);
        empArrays[3] = new Employee("Ben", "Engineer", "BBenn@mail.ru", "79899766677", 92345, 36);
        empArrays[4] = new Employee("Djusi", "Engineer", "DJ228@mail.ru", "79765435643", 125342, 62);

        for (int i = 0; i < empArrays.length; i++) {
            if (empArrays[i].getAge() > 40)
                System.out.println(empArrays[i].getEmployer());
        }
    }

}

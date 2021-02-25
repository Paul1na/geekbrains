package Study;

public class Year {
    public void visokos(int year) {
        if (year % 400 == 0) {
            System.out.println("Високосный");
            return;
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("Високосный");
            return;
        }
        System.out.println("Не високосный");
    }
}

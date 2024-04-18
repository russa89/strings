public class Main {
    public static void main(String[] args) {
        System.out.println("\nЗадача 1\n");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф.И.О. сотрудника - " + fullName);

        System.out.println("\nЗадача 2\n");
        String s = fullName.toUpperCase();
        System.out.printf("Данные Ф.И.О. сотрудника для заполения отчета - %s\n", s);

        System.out.println("\nЗадача 3\n");
        String fullName1 = "Иванов Семён Семёнович";
        fullName1 = fullName1.replace("ё", "е");
        System.out.println("Данные Ф.И.О. сотрудника - " + fullName1);
    }
}
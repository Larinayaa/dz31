import java.math.BigDecimal;
import java.util.Arrays;

/*
Hanna Kovalchuk gr 53
 */
public class Main {
    public static void main(String[] args) {
        Employer[] employers = { //массив работников
                new Employer(1,"Вася", 28, new BigDecimal("1675.56")),
                new Employer(2,"Петя", 51, new BigDecimal("5427.22")),
                new Employer(3,"Анна", 36, new BigDecimal("4434.11")),
                new Employer(4,"Иван", 44, new BigDecimal("1123.73")),
                new Employer(5,"Катя", 19, new BigDecimal("8753.12"))
        };
        print(employers); //вывод метода принт всех
        Arrays.sort(employers); //сортировка
        System.out.println("----------------------------------------");
        print(employers); //вывод сортировки

    }
    public static void print(Employer[] employers){
        for (Employer employer : employers){
            System.out.println(employer);
        }
    }
}

import java.math.BigDecimal;

public class Employer implements Comparable<Employer>{ //реализует интерфейс и
    // переопределяет метод для сравнения зп
    private int id;
    private  String name;
    private int age;
    private BigDecimal salary; //стандартный класс для точного вычисления дробных чисел

    public Employer(int id, String name, int age, BigDecimal salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return  id +
                " работник. Имя: " + name + '\'' +
                ". Возраст: " + age +
                ". Зарплата: " + salary;
    }

    @Override
    public int compareTo(Employer o) {
        return salary.compareTo(o.salary); //для сортировки по возрастанию
    }
}

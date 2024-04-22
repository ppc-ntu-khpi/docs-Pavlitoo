package domain;

/**
 * Клас Employee представляє базовий клас для всіх працівників.
 * Він включає інформацію про ім'я, посаду, рівень, відділ та ідентифікатор працівника.
 */
public class Employee {

    /**
     * Ім'я працівника.
     */
    private String name;

    /**
     * Посада працівника.
     */
    private String jobTitle;

    /**
     * Ідентифікатор працівника.
     */
    private int ID;

    /**
     * Рівень працівника (1, 2, або 3).
     */
    private int level;

    /**
     * Відділ, в якому працює працівник.
     */
    private String dept;

    /**
     * Створює працівника з визначеними параметрами.
     *
     * @param name Ім'я працівника
     * @param jobTitle Посада працівника
     * @param level Рівень працівника
     * @param dept Відділ, де працює працівник
     */
    public Employee(String name, String jobTitle, int level, String dept) {
        this(); // Викликає конструктор за замовчуванням для встановлення ID
        setName(name);
        this.jobTitle = jobTitle;
        setLevel(level);
        this.dept = dept;
    }

    /**
     * Створює працівника з випадковим ідентифікатором.
     * 
     * Генерує ID випадковим чином між 0 і 999.
     */
    public Employee() {
        this.ID = (int) (Math.random() * 1000);
    }

    /**
     * Повертає рядкове представлення працівника.
     *
     * @return Рядок, що містить інформацію про працівника
     */
    @Override
    public String toString() {
        return "\nEmployee ID= " + ID + "\nName= " + name + "\nJobTitle= " + jobTitle + "\nLevel= " + level + "\nDept= " + dept;
    }

    /**
     * Встановлює посаду працівника.
     *
     * @param jobTitle Новий заголовок посади
     */
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    /**
     * Повертає посаду працівника.
     *
     * @return Посада працівника
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Повертає ім'я працівника.
     *
     * @return Ім'я працівника
     */
    public String getName() {
        return name;
    }

    /**
     * Встановлює рівень працівника (1, 2, або 3).
     *
     * @param level Новий рівень працівника
     */
    public void setLevel(int level) {
        if (level >= 1 && level <= 3) {
            this.level = level;
        } else {
            this.level = 1; // Значення за замовчуванням, якщо рівень некоректний
        }
    }

    /**
     * Повертає рівень працівника.
     *
     * @return Рівень працівника
     */
    public int getLevel() {
        return level;
    }

    /**
     * Повертає відділ, у якому працює працівник.
     *
     * @return Відділ працівника
     */
    public String getDept() {
        return dept;
    }

    /**
     * Встановлює відділ, у якому працює працівник.
     *
     * @param dept Новий відділ
     */
    public void setDept(String dept) {
        this.dept = dept;
    }

    /**
     * Встановлює ім'я працівника з певними обмеженнями на формат.
     *
     * @param name Нове ім'я працівника
     */
    public void setName(String name) {
        if (name.matches("^([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]*)+[ ]([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]+)+$")) {
            this.name = name;
        } else {
            this.name = "John Doe"; // Значення за замовчуванням, якщо формат неправильний
        }
    }
}

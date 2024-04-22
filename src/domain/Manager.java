package domain;

/**
 * Клас Manager представляє менеджера, який має список підлеглих працівників.
 * Цей клас є підкласом Employee.
 */
public class Manager extends Employee {

    /**
     * Список працівників, підпорядкованих менеджеру.
     */
    private Employee[] employees;

    /**
     * Створює менеджера з визначеним списком працівників, ім'ям, посадою, рівнем і відділом.
     *
     * @param employees Список підлеглих працівників
     * @param name Ім'я менеджера
     * @param jobTitle Посада менеджера
     * @param level Рівень менеджера
     * @param dept Відділ менеджера
     */
    public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.employees = employees;
    }

    /**
     * Створює менеджера з визначеним списком підлеглих працівників.
     *
     * @param employees Список підлеглих працівників
     */
    public Manager(Employee[] employees) {
        super();
        this.employees = employees;
    }

    /**
     * Створює менеджера з пустим списком підлеглих працівників (10 місць).
     */
    public Manager() {
        super();
        this.employees = new Employee[10];
    }

    /**
     * Повертає рядкове представлення менеджера та його підлеглих.
     *
     * @return Рядок, що містить інформацію про менеджера та список його підлеглих
     */
    @Override
    public String toString() {
        return super.toString() + "\nEmployees: " + getEmployees();
    }

    /**
     * Повертає список підлеглих працівників як рядок.
     *
     * @return Список підлеглих працівників у вигляді рядка
     */
    public String getEmployees() {
        String s = "";
        for (Employee e : employees) {
            s = s + e.getName() + ", ";
        }
        if (!s.isEmpty()) {
            s = s.substring(0, s.length() - 2); // Видаляє останню кому
        }
        return s;
    }

    /**
     * Встановлює список підлеглих працівників.
     *
     * @param employees Новий список підлеглих
     */
    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    /**
     * Повертає список підлеглих працівників як масив.
     *
     * @return Масив підлеглих працівників
     */
    public Employee[] getEmployeesList() {
        return employees;
    }
}

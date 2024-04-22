package domain;

/**
 * Клас Artist представляє художника, який є підкласом Employee.
 * Він додає інформацію про навички художника.
 */
public class Artist extends Employee {

    /**
     * Список навичок художника.
     */
    private String[] skills;

    /**
     * Створює нового художника з визначеними параметрами.
     *
     * @param skills Список навичок художника
     * @param name Ім'я художника
     * @param jobTitle Посада художника
     * @param level Рівень художника
     * @param dept Відділ, в якому працює художник
     */
    public Artist(String[] skills, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.skills = skills;
    }

    /**
     * Створює художника з визначеним списком навичок.
     *
     * @param skills Список навичок
     */
    public Artist(String[] skills) {
        super();
        this.skills = skills;
    }

    /**
     * Створює порожнього художника з масивом навичок, який має 10 елементів.
     */
    public Artist() {
        super();
        this.skills = new String[10];
    }

    /**
     * Повертає рядкове представлення художника.
     *
     * @return Рядок, що містить інформацію про художника та його навички
     */
    @Override
    public String toString() {
        return super.toString() + "\nSkills: " + getSkills();
    }

    /**
     * Повертає список навичок у вигляді рядка.
     *
     * @return Рядок, що містить навички художника
     */
    public String getSkills() {
        StringBuilder s = new StringBuilder();
        for (String e : skills) {
            s.append(e).append(", ");
        }
        return s.substring(0, s.length() - 2);
    }

    /**
     * Встановлює список навичок для художника.
     *
     * @param skills Список нових навичок
     */
    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    /**
     * Повертає масив навичок.
     *
     * @return Масив навичок художника
     */
    public String[] getSkillsList() {
        return skills;
    }
}

package domain;

/**
 * Клас Editor представляє редактора, який є підкласом Artist.
 * Він включає інформацію про тип редагування (електронне або паперове).
 */
public class Editor extends Artist {

    /**
     * Ознака, чи використовує редактор електронне редагування.
     */
    private boolean electronicEditing;

    /**
     * Створює редактора з визначеними параметрами.
     *
     * @param electronicEditing Визначає, чи використовується електронне редагування
     * @param skills Список навичок
     * @param name Ім'я редактора
     * @param jobTitle Посада редактора
     * @param level Рівень редактора
     * @param dept Відділ
     */
    public Editor(boolean electronicEditing, String[] skills, String name, String jobTitle, int level, String dept) {
        super(skills, name, jobTitle, level, dept);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Створює редактора з визначеними навичками та електронним редагуванням.
     *
     * @param electronicEditing Визначає, чи використовується електронне редагування
     * @param skills Список навичок
     */
    public Editor(boolean electronicEditing, String[] skills) {
        super(skills);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Створює редактора, який використовує електронне редагування.
     *
     * @param electronicEditing Визначає, чи використовується електронне редагування
     */
    public Editor(boolean electronicEditing) {
        super();
        this.electronicEditing = electronicEditing;
    }

    /**
     * Створює редактора з електронним редагуванням за замовчуванням.
     */
    public Editor() {
        super();
        this.electronicEditing = true;
    }

    /**
     * Повертає рядкове представлення редактора, включаючи інформацію про редагування.
     *
     * @return Рядок, що описує редактора
     */
    @Override
    public String toString() {
        String s = super.toString() + "\nEditing preferences= ";
        if (electronicEditing) {
            s += "electronic";
        } else {
            s += "paper";
        }
        return s;
    }

    /**
     * Повертає тип редагування, яке використовує редактор.
     *
     * @return true, якщо використовується електронне редагування; false, якщо паперове
     */
    public boolean getPreferences() {
        return electronicEditing;
    }

    /**
     * Встановлює тип редагування.
     *
     * @param electronic Якщо true, встановлює електронне редагування; якщо false, паперове
     */
    public void setPreferences(boolean electronic) {
        this.electronicEditing = electronic;
    }
}

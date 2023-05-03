import java.time.LocalDateTime;
import java.util.Objects;

public class Task implements Comparable<Task> { //добавляет Comparable в класс Task, без него в формате TreeSet будет
    private String name;                        //выдавать ошибку
    private final LocalDateTime time;
    private boolean isDone; //проверяет выполнена ли "задача", пока-что специально всё время false (не дошёл ещё)

    public Task(String name) {
        this.name = name;
        time = LocalDateTime.now();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return isDone == task.isDone && Objects.equals(name, task.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, isDone);
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", time=" + time +
                ", isDone=" + isDone +
                '}';
    }

    @Override
    public int compareTo(Task task) {
        return this.getTime().compareTo(task.getTime()); //Сортировка по времени методом сравнения
    }
}


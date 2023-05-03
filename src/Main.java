import java.util.HashSet; //изначально массив формата HashSet, но по уроку требуется сделать его в TreeSet и сортировать
import java.util.TreeSet; //по времени

public class Main {
    public static void main(String[] args) {
        TreeSet<Task> taskList = new TreeSet<>();
        taskList.add(new Task("Покормить лошадь")); //это добавляется без проблем, когда "комментирую то тогда
        taskList.add(new Task("Антонну напомнить об отчёте")); //добавляются следующие две, но последняя
        taskList.add(new Task("Купить молоко")); //игнорируется, то-есть в любом случае только две (до этого одну
        taskList.add(new Task("Выбросить мусор")); // вообще только добавлял, когда делаю HashSet работает гуд)

        for (Task task : taskList) {
            System.out.println(task);
        }
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
import java.util.ArrayList;
import java.util.List;

public class todoList {

    private List<String> tasks;

    // Konstruktor bez parametrów
    public todoList() {
        tasks = new ArrayList<>();
    }

    // Metoda dodająca zadanie do listy
    public void add(String task) {
        tasks.add(task);
    }

    // Metoda wyświetlająca zadania wraz z numerem na liście
    public void print() {
        System.out.println("Lista zadań:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }

    // Metoda usuwająca zadanie z podanego numeru
    public void remove(int number) {
        if (number > 0 && number <= tasks.size()) {
            tasks.remove(number - 1);
            System.out.println("Zadanie numer " + number + " zostało usunięte.");
        } else {
            System.out.println("Nieprawidłowy numer zadania.");
        }
    }

    public static void main(String[] args) {
        // Przykładowe użycie klasy TodoList
        todoList todoList = new todoList();

        todoList.add("Zadanie 1");
        todoList.add("Zadanie 2");
        todoList.add("Zadanie 3");

        todoList.print();

        todoList.remove(1);

        todoList.print();
    }
}

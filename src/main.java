// Реализуйте структуру телефонной книги с помощью HashMap,
// учитывая, что 1 человек может иметь несколько телефонов.

// Чубченко Светлана

import java.util.HashMap;
import java.util.List;

public class main 
{
    public static HashMap<String, List<String>> phoneBook = new HashMap<>();

    public static void main(String[] args) {
        // заполняем телефонную книгу
        addToPhoneBook("Белова", "+7(123)667-04-13", "+7(123)466-11-73");
        addToPhoneBook("Мусина", "+7(123)993-47-43", "+7(123)474-44-37");
        addToPhoneBook("Крутова", "+7(123)050-46-42", "+7(123)086-51-46");
        // выводим в консоль абонента с определенной фамилией
        findInPhoneBook("Крутова");
    }

    // в телефонной книге телефоны указываем в виде списка строк
    public static void addToPhoneBook(String name, String phone1, String phone2) {
        phoneBook.put(name, List.of(phone1, phone2));
    }

    // ищем телефон по фамилии и выводим в консоль
    public static void findInPhoneBook(String name) {
        System.out.println("У абонента '" + name + "' телефоны: " + phoneBook.get(name));
    }
}

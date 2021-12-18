package ru.skypro;

public class Main {

    public static void main(String[] args) {
//       Инициализация авторов
        Author king = new Author("Steven", "King");
        Author nabokov = new Author("Vladimir", "Nabokov");

//        Инициализация книг
        Book misery = new Book("Misery", king, 1990);
        Book lolita = new Book("Lolita", nabokov, 1955);

//      Изменение года
        misery.setYear(2015);

        Book[] massiveBooks = new Book[5];
        massiveBooks[0] = misery;
        massiveBooks[1] = lolita;
//      Поиск пустого места, добавление новой книги
        if (areEmptyBooks(massiveBooks)) {
            massiveBooks[findEmpty(massiveBooks)] = new Book("It", king, 1990);
        } else System.out.println("Нет места в массиве");

//      Печать массива
        for (int i = 0; i < massiveBooks.length; i++) {
            System.out.println(massiveBooks[i]);
        }


    }

    public static boolean areEmptyBooks(Book arr[]) {
        int empty = findEmpty(arr);
        if (empty >= 0) {
            return true;
        }
        return false;
    }

    public static int findEmpty(Book arr[]) {
        int empty = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                empty = i;
                return empty;
            }
        }
        return empty;
    }
}

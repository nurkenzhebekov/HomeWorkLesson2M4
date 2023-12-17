import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> listA = new ArrayList<>();
        System.out.println("Введите 5 строк для списка A:");
        for (int i = 0; i < 5; i++) {
            listA.add(scanner.nextLine());
        }

        System.out.println("Список A: " + listA);
        displayList(listA);

        List<String> listB = new ArrayList<>();
        System.out.println("Введите 5 строк для списка B:");
        for (int i = 0; i < 5; i++) {
            listB.add(scanner.nextLine());
        }

        System.out.println("Список B:");
        displayList(listB);

        List<String> listC = new ArrayList<>();
        int size = Math.max(listA.size(), listB.size());
        for (int i = 0; i < size; i++) {
            if (i < listA.size()) {
                listC.add(listA.get(i));
            }
            if (i < listB.size()) {
                listC.add(listB.get(listB.size() - 1 - i));
            }
        }

        System.out.println("Список C:");
        displayList(listC);

        Collections.sort(listC, Comparator.comparingInt(String::length));
        System.out.println("Отсортированный список C:");
        displayList(listC);
    }

    public static void displayList(List<String> list) {
        for (String element : list) {
            System.out.println(element);
        }
        System.out.println();
    }

}
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //ex1();
        ex2();
    }

    public static void ex2(){
        //Определить является ли список знакочередующимся? (без массивов)

        LinkedList<Integer> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n != 0) {
            list.add(n);
            n = scanner.nextInt();
        }
        scanner.close();
        boolean flag = true;
        for (int i = 1; i < list.size(); i++) {
            int current = list.get(i);
            int previous = list.get(i - 1);

            if (current * previous >= 0){
                flag = false;
                break;
            }
        }

        if (flag){
            System.out.println("Лист знакочередующийся");
        }else {
            System.out.println("Лист не знакочередующийся");
        }

    }

    public static void ex1(){

        // Вывести список на экран в перевернутом виде (без массивов)
        //Пример:
        //1 -> 2->3->4
        //Вывод:
        //4->3->2->1

        Deque<Integer> integerDeque = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n != 0) {
            integerDeque.add(n);
            n = scanner.nextInt();
        }

        scanner.close();

        while (!integerDeque.isEmpty()){
            System.out.println(integerDeque.pollLast());
        }

    }

}
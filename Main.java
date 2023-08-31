import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Rev {
    public void method(List<Integer> array) {
        for (int i = array.size() - 1; i >= 0; i--) {
            System.out.println(array.get(i));
        }
    }
}

class AddCheck {
    public void method(List <Integer> array, int target) {
        for (int i = 0; i < array.size()-1; i++) {
            for (int j = i+1; j < array.size(); j++) {
                if (array.get(i) +array.get(j) == target) {
                    System.out.println(array.get(i) + " " + array.get(j));
                } 
            }
        }
    }
}
class Target {
    static int target;

    public static void getTarget(Scanner scanner) {
        do {
            System.out.println("Enter Target");
            try {
                target = scanner.nextInt();
                break;
            } catch (Exception e) {
                System.out.println(e);
                System.out.println("Enter Valid Integer");
                scanner.nextLine();
            }
        } while (true);
    }
}

class Array {
    public static List<Integer> array = new ArrayList<>();

    public static void getArray(Scanner scanner) {
        System.out.println("Enter elements in an ARRAY");
        while(true) {
            String next = scanner.next();
            if (next.equals("end"))
                break;
            else {
                try {
                    int num = Integer.parseInt(next);
                    array.add(num);
                } catch (Exception e) {
                    System.out.println("Enter valid Integers");
                }
            }
        }
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Array.getArray(scanner);
        AddCheck obj2 = new AddCheck();
        Target.getTarget(scanner);
        obj2.method(Array.array, Target.target);
        Rev rev = new Rev();
        rev.method(Array.array);
        scanner.close();
    }
}
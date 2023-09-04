package primeNumber;
import java.util.Scanner;
class Insert {
    private int num;
    public Insert(Scanner scanner) {
        while (true) {
            try {
                int i = scanner.nextInt();
                setnum(i);
                break;
            } catch (Exception e) {
                System.out.println(e);
                System.out.println("Ënter Valid Number");
                scanner.next();
            }
        }

    }
    public int getnum() {
        return num;
    }
    public void setnum(int num) {
        this.num = num;
    }
}
class CheckPrime {
    boolean isPrime = true;
    public void setPrime(boolean isPrime) {
        this.isPrime = isPrime;
    }
    public boolean isPrime() {
        return isPrime;
    }
    public CheckPrime(int num) {
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                setPrime(false);
                break ;
            }
        }
    }
    public void display(boolean isPrime, int num) {
        if (isPrime == true) {
            System.out.println(num + " is a prime number");
        } 
        else{
            System.out.println(num + " is not a prime number");
    }
}
}
class Main {
    public static void main(String arg[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        Insert obj = new Insert(scanner);
        scanner.close();
        CheckPrime ob = new CheckPrime(obj.getnum());
        ob.display(ob.isPrime(), obj.getnum());
    }
}

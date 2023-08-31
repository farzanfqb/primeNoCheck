import java.util.Scanner;

/*class Rev {    public void method() {
        for (int i = 0; i <= Array.array.length - 1; i++) {
            System.out.println(Array.array[Array.array.length - 1 - i]);
        }
    }
}*/
class AddCheck{
    public void method(int[] array, int target){
        for (int i=0; i<array.length; i++) {
            for (int j=1 ; j<array.length; j++) {
                if (j>i && array[i]+array[j] == Target.target ){
                    System.out.println( array[i] + " " + array[j] );
            } else  continue ;
        }
        }
    }
}
class Target{
    static int target;
    public static void getTarget(Scanner scanner) {
    do{       
         System.out.println("Enter Target");
        try {
            target = scanner.nextInt();
            break;
    }
        catch (Exception e) {
            System.out.println(e);
        System.out.println("Enter Valid Integer");
        scanner.nextLine();
    }} while(true);
}
}
class Array{
    public static int[] array = new int [4];
    public  static void getArray(Scanner scanner){
        System.out.println("Enter elements in an ARRAY");
        for (int i=0; i<array.length; i++){
        try { 
         array[i] = scanner.nextInt();
        }    catch (Exception e) {
            System.out.println("Enter valid Integers");
            i--;
        }
}}}
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Array.getArray(scanner);
        AddCheck obj2 = new AddCheck();
        Target.getTarget(scanner);
        obj2.method(Array.array, Target.target); 
        
        scanner.close();
    }
}
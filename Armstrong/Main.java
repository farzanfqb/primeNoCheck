package Armstrong;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Armstrong {
    int output = 0;
    
public Armstrong(int count , List<Integer> nums){ 
    for (int i = 0 ; i < nums.size() ; i++) {
        int n = count;
        int temp = 1;
        while (n>0) { 
            temp = temp * nums.get(i) ;
            n--;
        }
        output = output + temp ;
    }
    System.out.println("Sum of powers is " + output);
    }

}
class NumList{
    private List<Integer>nums = new ArrayList<>();
    private int count = 0;
    public List<Integer> getNums() {
        return nums;
    }
    public int getCount() {
        return count;
    }
    int rem =0;
    public NumList(int num){
    while (num>0) {
        rem = num % 10;
        nums.add(rem);
        num = num/10;
        count++;        
}
System.out.println(nums);
System.out.println(count);
}
}
class Insert{
private int num;
public int getNum() {
    return num;
}
public void setNum(int num) {
    this.num = num;
}
public Insert (Scanner scanner){
while (true){
   try {
    num = scanner.nextInt();
    break;
   } catch (Exception e) {
    System.out.println(e);
    System.out.println("Enter valid Number");
    scanner.next(); // consume invalid input
   } 
}
}
}
class Mains{
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in)    ;
    System.out.println("ENTER NUMBER TO CHECK"); 
    Insert obj = new Insert(scanner)   ;
    scanner.close();
    NumList num = new NumList(obj.getNum());
    Armstrong check = new Armstrong(num.getCount() , num.getNums() );
    if (obj.getNum() ==  check.output){
        System.out.println(obj.getNum()+ " is an Armstrong Number");
    } else System.out.println(obj.getNum() + " is not an Armstrong Number");  
    }
}
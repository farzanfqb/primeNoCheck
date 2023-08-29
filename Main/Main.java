package Main;

class Rev {
    public void method() {
        for (int i = 0; i <= Main.array.length - 1; i++) {
            System.out.println(Main.array[Main.array.length - 1 - i]);
        }
    }
}


class Main {
    public static int[] array = new int[4];

    public static void main(String[] args) {
        array[0] = 2;
        array[1] = 7;
        array[2] = 11;
        array[3] = 15;
        Rev obj = new Rev();
        obj.method();
    }

}
import java.util.Scanner;

class Example {
    public static void main(String[] args) {
        //int a,b,c,d,e,f,g,h,i,j;
        int[] ar = new int[10];
        Scanner input = new Scanner(System.in);

        for(int k = 0; k < 10; k++){
            System.out.print("Input an Integer : ");
            ar[k] = input.nextInt();
        }
    }
}

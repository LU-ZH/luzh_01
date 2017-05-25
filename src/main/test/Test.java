/**
 * Created by dell on 2017/5/24.
 */
public class Test {
    public static void main(String[] args) {
        int num1=0;
        int num2=0;
        int num3=0;
        int num4=0;
        int num5=0;
        for(int i=0;i<5;i++){
            switch (i){
                case 1:num1++;
                case 2:num2++;
                case 3:num3++;
                case 4:num4++;
                case 5:num5++;
            }
        }
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
    }
}

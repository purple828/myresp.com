/**
 * Created by fff on 2017/11/16.
 */
public class Mul99Demo {
    public static void main(String[] args){

        for(int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){
                String str = j+"*"+i+"="+j*i+" ";
                System.out.print(str);
            }
            System.out.println();
        }
    }
}

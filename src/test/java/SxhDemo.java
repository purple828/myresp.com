/**
 * Created by fff on 2017/11/16.
 *
 * 求出水仙花数
 *
 */
public class SxhDemo {

    public static void main(String[] args){

        for(int i=100;i<1000;i++){
            int g = i%100%10;  //个位数
            int s = i/10%10;//十位数
            int b = i/100; //百位数
           // System.out.println("百位数："+b+"十位数："+s+"个位数："+g);
            if(mulFun(g)+mulFun(s)+mulFun(b)==i){
                System.out.println("水仙花数有："+i);
            }
        }
    }

    public static int mulFun(int a){
        return a*a*a;
    }

}

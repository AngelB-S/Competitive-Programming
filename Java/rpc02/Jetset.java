import java.util.*;
public class Jetset{
    public static void main(String[] args) {
        Scanner z= new Scanner(System.in);
        int n;
        int sum=0;
        int sum2=0;
        double aux;
        double aux2;
        n=z.nextInt();
        double la[]= new double[n];
        double lo[]= new double[n];

        for(int i=0;i<n;i++){
            la[i]=z.nextDouble();
            lo[i]=z.nextDouble();
        }
        for(int j=0;j<n;j++){
            for(int k=0;k<n;k++){
                if(la[j]==la[k] && j!=k){
                    sum=sum+1;
                }
                if(lo[j]==lo[k]  && j!=k){
                    sum2=sum2+1;
                }
            }
        }
        if(sum>0 || sum2>0){
            System.out.println("No");
        }else{
            System.out.println("Si");
        }
        
    }
}
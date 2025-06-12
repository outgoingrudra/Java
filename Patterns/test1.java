//       *
//     * * *
//   * * * * *
public class test1{
    public static void main(String args[]){
        int i , j ,k,n =5 ;
        for(i=0;i<=n ; i++){
            for(k=0;k<n-i;k+=1){
                System.out.printf(" ");
            }
            for(j=0;j<2*i+1;j+=1){
                 System.out.print("*");
            }
            System.out.println();
        }

    }
}
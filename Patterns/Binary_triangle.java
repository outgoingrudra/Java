
// 1
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1





public class Binary_triangle {
   
    public static void main(String[] args) {
        
        int i ,j,t,n=5;
       
        for(i=0;i<n;i++){
           
           if (i%2==0){
             t=0;
            for(j=0;j<i;j++){
                System.out.print(t);
                t = (t==0) ? 1 : 0;
            }
           }
            if (i%2==1){
             t=1;
            for(j=0;j<i;j++){
                System.out.print(t);
                t = (t==0) ? 1 : 0;
            }
           }
           
            System.out.print(" \n");
        }

    }
}
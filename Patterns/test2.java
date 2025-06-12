//         1
//       2 3 2
//     3 4 5 4 3
//   4 5 6 7 6 5 4
// 5 6 7 8 9 8 7 6 5



public class test2 {
    static int pattern(int val , int x){
    if(x>0){
        System.out.print(val);
       int t = pattern(val+1, x-1);
       if(t>0){
        System.out.print(val);
       }
        return 1;
    }
    return 0;


}
    public static void main(String[] args) {
    
    int i , j , n =3;
    for(i=0;i<=n;i++){
        for(j=0;j<n-i;j++){
            System.out.print(" ");
        }
        pattern(i+1,i+1);
    
        System.out.println();

        
    }
}
}
public class Patterns {

    public static void main(String[] args){

    //     //Solid Rectangle
    //     int l = 4;
    //     int b = 5;
    //     for(int i = 1; i<=l; i ++){
    //         for(int j = 1; j<=b; j++){
    //             System.out.print('*');
    //         }
    //         System.out.println();
    //     }
    //     // Hollow Rectangle
    //     int n = 4;
    //     int m = 5;
    //     for(int i = 1; i<=n; i++){
    //         for(int j = 1; j <=m; j++){
    //             if (i ==1 || j == 1 || i == n || j == m){
    //                 System.out.print("*");
    //             }
    //             else{
    //                 System.out.print(" ");
    //             }      
    //         }
    //         System.out.println();
    //     }
    int n = 4;
    for(int i = 1; i<=n; i++){
        for(int j = n; j >=i; j--){
            System.out.print("*");
            }
        System.out.println();
        }
    }

}

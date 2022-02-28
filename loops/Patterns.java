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


    for(int i = 1; i<=n; i++){
        for(int j = 1; j<=n-i; j++){
            System.out.print(" ");
            }
        for(int j =1; j<=i; j++){

            System.out.print("*");
            }
        System.out.println();
        }

    for(int i = 1; i<=n; i++){
        for(int j = 1; j<=i; j++){
            System.out.print(j + " ");
        }
        System.out.println();
    }
    for(int i = 1; i<=n; i++){
        for(int j = 1; j<=n-i+1; j++){
            System.out.print(j + " ");
        }
        System.out.println();
    }
    System.out.println();
    // Floyd's Triangle
    int f = 5;
    int num = 1;
    for(int i = 1; i<=f; i++){
        for(int j = 1; j<=i; j++){
            System.out.print(num + " ");
            num++;
        }
        System.out.println();
    }
    System.out.println();
    // 0-1 Trianglel
    for(int i = 1; i<=f; i++){
        for(int j = 1; j<=i; j++){
            if((i+j) % 2 == 0){
                System.out.print(1 + " ");
            } 
            else{
                System.out.print(0 + " ");
            }
        }
        System.out.println();
    }


    }
}
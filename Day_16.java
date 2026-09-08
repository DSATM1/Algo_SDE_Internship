// import java.util.*;

// public class Day_16 {
//     public static void main(String [] args)
//     {
//         // while innerloop
//         // int i = 1;
//         // while (i <= 3)
//         // {
//         //     int j = 1;
//         //     while (j <= 4)
//         //     {
//         //         System.out.print(j + " ");
//         //         j++;
//         //     }
//         //     System.out.println();
//         //     i++;
//         // }

//         // do while inner loop
//         // int i = 1;
//         // do 
//         // {
//         //     int j = 1;
//         //     do
//         //     {
//         //         System.out.print("A ");
//         //         j++;
//         //     } while(j<=5);
//         //     i++;
//         //     System.out.println();
//         // }while(i<=5);

//         // while in for 
//         // for (int i = 1; i<=5; i++)
//         // {
//         //     int j = 1;
//         //     while (j<=5)
//         //     {
//         //         System.out.print("Suraj " + " ");
//         //         j++;      
//         //     }
//         //     System.out.println();
//         // }

//         // Fibonacii
//         // Scanner sc = new Scanner(System.in);
//         // System.out.print("Enter the Fibo Number : ");
//         // int num = sc.nextInt();

//         // int a = 0;
//         // int b = 1;
//         // int c ;
//         // System.out.print(a + "," + b + "," );
//         // for (int i = 0; i < num - 2; i++)
//         // {
//         //     c = a+b;
//         //     System.out.print(c + ",");
//         //     a = b;
//         //     b = c;
//         // }


//         // Pattern 1 ------------------11111111
//         for (int i = 1; i<= 5; i++)
//         {
//             for (int j = 1; j<=5; j++)
//             {
//                 System.out.print(i+j +" ");
//             }
//             System.out.println();
//         }

//         // Pattern 2 -------------------22222222
//         int count = 0;
//         for(int i = 01; i<=5; i++)
//         {
//             for (int j = 01 ; j <= 5; j++)
//             {
//                 count++;
//                 System.out.printf("%02d " , count);
//             }
//             System.out.println();
//         }

//         // Pattern 3 --------------- 3333333333333
//         for (int i = 1; i<=5; i++)
//         {
//             for(int j = 1; j<=i; j++)
//             {
//                 System.out.print(j + " ");
//             }
//             System.out.println();
//         }

//         // Pattern 4 ------------- 4444444444444
//         for (int i = 1; i<=5; i++)
//         {
//             for(int j = 1; j<=i; j++)
//             {
//                 System.out.print(" * ");
//             }
//             System.out.println();
//         }

//         // pattern 5 ------------55555555555555
//         int Count = 0;
//         for(int i = 1; i<=5; i++)
//         {
//             for (int j = 1 ; j<=i; j++)
//             {
//                 Count++;
//                 System.out.print(Count + " ");
//             }
//             System.out.println();
//         }

//         // Pattern 6 ----------666666666666
//         for (int i = 1; i<=5; i++)
//         {
//             for (int j = 1; j<=5-i+1; j++)
//             {
//                 System.out.print(j + " ");
//             }
//             System.out.println();
//         }

//         // Pattern 7 ------- 77777777777777
//         for (int i = 1; i<=5;i++)
//         {
//             for (int j = 1; j<=5; j++)
//             {
//                 if (j >= i)
//                 {
//                     System.out.print(" * ");
//                 }
//                 else
//                 {
//                     System.out.print("   ");
//                 }
//             }
//             System.out.println();
//         }
//         // sc.close();
//     }
// }

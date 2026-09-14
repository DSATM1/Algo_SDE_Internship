// import java.util.*;
// public class Swaroop_Program 
// {
//     static void UserEnterPin()
//     {
//         Scanner sc = new Scanner(System.in);
//         int Attempts = 1;
//         String pin = "";
//         // Where to store the updated variable ! (pending)
//         for(int index = 3; index >= Attempts; index = index - 1 )
//         {
//             System.out.print("Enter the Pin : ");
//             pin = sc.next();
//             if (pin.equals("0095") && pin.length() == 4)
//             {
//                 PIN(pin);
//                 return ;
//             }
//             else
//             {
//                 System.out.println(index + " Attempts left " );
//             }
//         }
//         System.out.println("User is Blocked 3 of 3 Attempts");
//         // sc.close();
//     }

//     static void PIN(String pin)
//     {
//         if(pin.equals("0095") && pin.length() == 4)
//         {
//             ATMMENU();
//         }
//         else if(!pin.equals("0095") || pin.length() < 4)
//         {
//             UserEnterPin();
//         }
//     }

//     static void ATMMENU()
//     {

//         double Deposit = 0;
//         double Balance = 0;
//         // double WithDraw = 0;

//         Scanner ch = new Scanner(System.in);

//         System.out.println("=======================");
//         System.out.println("ATM System");
//         System.out.println("=======================");
//         System.out.println("1.Check Balance");
//         System.out.println("2.Deposit Money");
//         System.out.println("3.WithDraw Money");
//         System.out.println("4.Change Pin");
//         System.out.println("5.Exit");
//         System.out.println("=======================");
//         System.out.print("Enter Your Choice");
//         int choice = ch.nextInt();

//         switch(choice)
//         {
//             case 1 :
//                 CheckBalance(Balance, Deposit);
//                 break;
//             case 2 :
//                 DepositMoney(Balance);
//                 break;
//             case 3 :
//                 WithDrawMoney();
//                 break;
//             case 4 :
//                 ChangePin();
//                 break;
//             case 5 :
//                 Exit();
//                 break;
//             default :
//                 System.out.println("Inavlid Choice");
//                 break;
//         }
//         ch.close();
//     }

//     static void CheckBalance(double Deposit, double withdraw)
//     {
//         double Balance = 50000;
//         double TotalBalance = 0;
//         double Totalbalance2 = 0;
//         System.out.println("Initial balance : " + Balance);
//         if(Deposit > 0)
//         {
//             TotalBalance = Balance + Deposit;
//             System.out.println("Main Balance : " + TotalBalance);
//         }
//         else if (withdraw > 0)
//         {
//             Totalbalance2 = Balance - withdraw;
//             System.out.println("Main Balance : " + Totalbalance2);
//         }
//     }

//     static void DepositMoney(double Balance)
//     {
//         double withdraw = 0;
//         Scanner obj = new Scanner(System.in);
//         System.out.println("Enter the Amount to Deposit : ");
//         double Deposit = obj.nextDouble();
//         System.out.println("Amount : " + Deposit + " Successfully Deposited ");
//         CheckBalance(Deposit, withdraw);
//         obj.close();
//     }

//     static void WithDrawMoney()
//     {
//         double deposit = 0;
//         double WithDraw = 0;
//         Scanner obj = new Scanner(System.in);
//         System.out.println("Enter the Amount to withdraw: ");
//         WithDraw = obj.nextDouble();
//         System.out.println("Amount : " + WithDraw + " Successfully WithDraw Money");
//         CheckBalance(deposit, WithDraw);
//         obj.close();
//     }

//     static void ChangePin()
//     {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the Previous PIN : ");
//         String prev_pin=sc.next();
//         if ( prev_pin.equals("0095") && prev_pin.length() == 4)
//         {
//             System.out.println("Enter New PIN");
//             String new_pin = sc.next();
//             System.out.println("The new is Successfully Changed " + new_pin);
//         }
//         else
//         {
//             System.out.println("Previous Pin is not Matching");
//         }
//         sc.close();
//     }

//     static void Exit()
//     {
//         System.out.print(" <-> Thank You For Coding <-> ");
//     }
//     public static void main(String[] args) 
//     {
//         UserEnterPin();
//     }
// }

import java.util.*;
public class kbc
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int quesno= 1;
        int amountwon = 0;
        boolean exit = false;
        System.out.println("Welcome To Kbc");
        do
        {
            char option;
            switch(quesno)
            {
                case 1:
             System.out.println("Question 1: Who was the first prime minister of in India?");
   System.out.println("options are: A.Narendra Modi B.Amit shah");
   System.out.println("C.Jawaharlal nehru D.Rahul ghandi"); 
   System.out.println("Enter a option");
   option=sc.nextLine().charAt(0);
   if(option == 'C'||option == 'c')
   {
       amountwon=10000;
       System.out.println("price won Rs="+amountwon);
       System.out.println("Your next question is "); quesno++;
    }
    else
    {
        System.out.println("try again next time");
        exit = true;
    }
    break;
    case 2:
    System.out.println("Question 2: Which Indian state announced a second capital in 2017 ?");
                   System.out.println("A. Uttarakhand B. Karnataka");
                   System.out.println("C. Maharashtra D. Himachal Pradesh");
                   System.out.println("Please Enter an Option.");
                   option=sc.nextLine().charAt(0);
                   
                   if(option == 'D' || option =='d')
                   {
                       amountwon = 12500;
                       System.out.println("You won Rs. " + amountwon);
                       System.out.println("Your next question is "); quesno++;
                   }
                   else
                   {
                       System.out.println("You Lose.");
                       exit = true;
                    }
                    break;
                    case 3:
                    System.out.println("Question 3: Which state is the capital of India");
                   System.out.println("A. New Delhi B. Delhi");
                   System.out.println("C. Lucknow D. Himachal Pradesh");
                   System.out.println("Please Enter an Option.");
                   option=sc.nextLine().charAt(0);
                   
                   if(option == 'A' || option =='a')
                   {
                       amountwon = 15000;
                       System.out.println("You won Rs. " + amountwon);
                       System.out.println("Your next question is "); quesno++;
                   }
                   else
                   {
                       System.out.println("You Lose.");
                       exit = true;
                }
            break;
            case 4:
            System.out.println("Question 4: Who is our current prime minister");
                   System.out.println(" A. Rahul ghandi (papoo) B. Narendra Modi");
                   System.out.println("C. Amit Shah D. Yoginath Aditiya");
                   System.out.println("Please Enter an Option.");
                   option=sc.nextLine().charAt(0);
                   
                   if(option == 'B' || option =='b')
                   {
                       amountwon = 20000;
                       System.out.println("You won Rs. " + amountwon);
                       System.out.println("Thank you for playing");
                       exit = true;
                   }
                   else
                   {
                       System.out.println("You Lose.");
                       exit = true;
                    }
                    break;
                }
            }
            while(exit!=true);
        
    }
}





    
        
    
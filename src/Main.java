import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Main bh = new Main();
        bh.menu();
    }
    void menu()
    {
        Scanner input = new Scanner(System.in);

        System.out.println(" ");
        System.out.println("-------------- Tool Box --------------");
        System.out.println(" ");
        System.out.println(" ");

        System.out.println("1 ) Positive and Negative");
        System.out.println("2 ) Odd or Even ");
        System.out.println("3 ) Find biggest number");
        System.out.println("4 ) Find Factorial");
        System.out.println(" ");
        System.out.print("Enter your choice : ");
        char cho = input.next().charAt(0);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");

        if(cho == '1') {
            Main obj1 = new Main();
            obj1.posNneg();
        }
        else if(cho == '2') {
            Main obj2 = new Main();
            obj2.oddNeven();
        }
        else if (cho == '3') {
            Main obj3 = new Main();
            obj3.biggest();
        } else if (cho == '4') {
            Main obj4 = new Main();
            obj4.factorial();
        }
        else
        {
            Main obj4 = new Main();
            obj4.menu();
        }
    }
    void exit()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Back to home page  (Y/N) : ");
        char yn = input.next().charAt(0);

        if (yn=='Y'||yn=='y')
        {
            Main bh = new Main();
            bh.menu();
        }
        else if(yn=='N'||yn=='n')
        {
            Main bh = new Main();
            bh.posNneg();
        }
        else
        {
            Main bh = new Main();
            bh.exit();
        }

    }
    void posNneg()
    {
        Scanner input = new Scanner(System.in);

        System.out.println("________________Positive and Negative__________________");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");

        try
        {
            System.out.print("Enter an number : ");
            int num = input.nextInt();

            if(num>0)
            {
                System.out.println(" ");

                System.out.println("            This number is positive!");
            }
            else if(num<0)
            {
                System.out.println(" ");

                System.out.println("            This number is Negative!");
            }
            else
            {
                System.out.println(" ");

                System.out.println("            This number is zero!");
            }
            Main bh = new Main();
            bh.exit();
        }
        catch (Exception e)
        {
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("\t\t\t - Warning : Please enter only numbers! - ");
            System.out.println(" ");
            System.out.println(" ");
            Main bh = new Main();
            bh.exit();
        }

    }
    void oddNeven()
    {
        Scanner input = new Scanner(System.in);

        System.out.println("__________________odd OR even_________________");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");

        try
        {
            System.out.print("            Enter the number : ");
            int num = input.nextInt();

            if(num%2==0)
            {
                System.out.println(" ");

                System.out.println("            This number is odd!");
            }
            else
            {
                System.out.println(" ");

                System.out.println("            This number is Even!");
            }
            Main bh = new Main();
            bh.exit();
        }
        catch (Exception e)
        {
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("\t\t\t - Warning : Please enter only numbers! - ");
            System.out.println(" ");
            System.out.println(" ");
            Main bh = new Main();
            bh.exit();
        }
    }
    void biggest()
    {
        Scanner input = new Scanner(System.in);

        System.out.println("______________Biggest Number__________________");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");

        try
        {
            System.out.print("Enter the first number : ");
            int num1 = input.nextInt();

            System.out.println(" ");

            System.out.print("Enter the second number : ");
            int num2 = input.nextInt();

            System.out.println(" ");

            System.out.print("Enter the third number : ");
            int num3 = input.nextInt();

            System.out.println(" ");

            if(num1>num2&&num1>num3)
            {
                System.out.println(" ");

                System.out.println("            The biggest number : "+num1);
            }
            else if(num2>num1&&num2>num3)
            {
                System.out.println(" ");

                System.out.println("            The biggest number : "+num2);
            }
            else
            {
                System.out.println(" ");

                System.out.println("            The biggest number : "+num3);
            }
            Main bh = new Main();
            bh.exit();
        }
        catch (Exception e)
        {
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("\t\t\t - Warning : Please enter only numbers! - ");
            System.out.println(" ");
            System.out.println(" ");
            Main bh = new Main();
            bh.exit();
        }
    }
    void factorial()
    {
        Scanner input = new Scanner(System.in);

        System.out.println("___________________factorial____________________");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");

        try
        {
            System.out.print("Enter an integer : ");
            int num1 = input.nextInt();

            int facto = num1*num1;

            System.out.println("The factorial number is :"+facto);
            System.out.println(" ");

            Main exit = new Main();
            exit.exit();
        }
        catch (Exception e)
        {
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("\t\t\t - Warning : Please enter only numbers! - ");

        }

    }


}
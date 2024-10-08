import java.util.Scanner;

    public class bank {
        private long accno;
        private String name;

        private int Bal=3000;
        private int amount;
        private int withdraw;
        Scanner sc = new Scanner(System.in);

        public void add_acc() {
            System.out.println("Enter Your Name:");
            name = sc.next();
            System.out.println("Enter Your Mobile Number:");
            long mobno = sc.nextLong();

            System.out.println("Enter Account Number:");
            accno = sc.nextLong();
            System.out.println("Your Account Is added");
        }

        public void deposit() {
            System.out.println("Enter The Amount you want to deposit:");
            amount = sc.nextInt();
            Bal = amount + Bal;
            System.out.println("Your New Balance is :"+Bal);
        }

        public void withdraw() {
            System.out.println("Enter The amount you want to withdraw:");
            withdraw = sc.nextInt();
            if (Bal >= withdraw) {
                Bal = Bal - withdraw;
                System.out.println("Your bal is :"+Bal);
            } else {
                System.out.println("Insufficient Balance ");
                System.out.println("Transaction Failed");
            }

        }

        public void removeacc() {
            System.out.println("Your Account Has Been removed");
        }

        public static void main(String[] args) {
            bank call=new bank();
            Scanner s1=new Scanner(System.in);
            System.out.println("Enter choice :");
            int choice= s1.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Adding of Account");
                    call.add_acc();
                    break;

                case 2:
                    System.out.println("Deposition of Money");
                    call.deposit();
                    break;
                case 3:
                    System.out.println("Withdrawal of Money");
                    call.withdraw();
                case 4:
                    System.out.println("Removal of account");
                    call.removeacc();
            }


        }
    }



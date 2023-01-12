package chapter1_3;// Account class with a double instance variable balance,
// constructor and deposit method that perform validation.

public class AccountWithDeposit {

        private String name;
        private double balance;

        //    Required args constructor for Account
        public AccountWithDeposit(String name, double balance){
            this.name = name;
            if (balance > 0.0){
                this.balance = balance;
            }
        }
        public void deposit(double depositAmount){
            if (balance > 0.0){
                balance = balance + depositAmount;
            }
        }

        public double getBalance(){
            return balance;
        }

        public void setName(String name){
            this.name = name;
        }

        public String getName(){
            return name;
        }

    }


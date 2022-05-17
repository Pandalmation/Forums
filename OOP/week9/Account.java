public class Account {
    private double balance;

    public Account(){
        this.balance = 0;
    }

    public Account (double init_balance){
        this.balance = init_balance;
    }

    public double getBalance(){
        return this.balance;
    }
    public boolean deposit(double amt){
        boolean check = true;
        if(amt >= 0){
            this.balance +=  amt;
        }else{
            check = false;
        }
        return check;
    }

    public boolean withdraw(double amt){
        boolean check = true;
        if(amt >= 0 && this.balance >= amt){
            this.balance -= amt;
        }else{
            check = false;
        }
        return check;
    }
}
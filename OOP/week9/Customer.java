public class Customer {
    
    private String firstName;
    private String lastName;
    private Account account;

    public Customer(String fName, String lName){
        this.firstName = fName;
        this.lastName = lName;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public Account getAccount(){
        return this.account;
    }

    public void setAccount(Account acc){
        this.account = acc;
    }
}
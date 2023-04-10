package bank;

class Account{
    public String name;
    protected String email;
    private String password;

    // getter and setter
    public String getPassword(){
        return this.password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    
}
public class Bank {
    public static void main(String args[]){
        Account a1= new Account();
        a1.name = "tahir";
        a1.email = "example@gamil.com";

        a1.setPassword("1234");
        System.out.println(a1.getPassword());
    }
    
} 

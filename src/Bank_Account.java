
public class Bank_Account {
    private String name;
    private int age;
    private int accNum;
    private double balance;
    private double deposit;
       
    String getName(){
         return name;
        }     
    public void setName(String name){
            this.name= name;
    }
    int getAge(){
        return age;
    }
    public void setAge(int age){
            this.age= age;
    }
    int getAccNum(){
        return accNum;
    }
    public void setAccNum(int accNum){
            this.accNum= accNum;    
        }   
    double getBalance(){
        return balance + deposit ;
    }
    public void  setBalance(double balance){
        this.balance= balance;
    }
    double getDeposit(){
        return deposit ;
    }
    public void  setDeposit(double deposit1, double deposit2){
        this.deposit= deposit1 + deposit2;
    }
}
class Main{
    public static void main(String [] args){
        Bank_Account j= new Bank_Account();
        j.setName("KEYNA"); 
        j.setAge(19);
        j.setAccNum(78532);
        j.setDeposit(865.65, 376.90);
        j.setBalance(3456);
        
        
        System.out.println("Name: " + j.getName());
        System.out.println("Age: " + j.getAge());
        System.out.println("Account Number: " + j.getAccNum());
        System.out.println("Deposit: " + j.getDeposit());
        System.out.println("Balance: " + j.getBalance());
    }
}
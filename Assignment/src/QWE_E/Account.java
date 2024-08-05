package QWE_E;

public class Account {
    String id;
    String name;
    int balance;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String name, int balance, String id) {
        this.name = name;
        this.balance = balance;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int credit(int amount) {
        this.balance += amount;
        return this.balance;
    }

    public int debit(int amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
        } else System.out.println("Amount Exceeded balance ");

        return this.balance;
    }

    public int transferTo(Account another, int amount) {
        if (amount <= this.balance) {
            another.setBalance(another.balance+ amount);
            this.balance -= amount;
        }else{
            System.out.println("Amount Exceeded balance ");
        }
        return this.balance;
    }

    public String toString(){
        return "Account \n ID: " + id + "\nName: " + name + "\nBalance: " + balance;
    }

     public static void main(String[] args) {
            Account a1 = new Account("Raman", 300 , "1");
            Account a2 = new Account("Hari", 100 , "2");

            a1.credit(100);
            a1.debit(50);

            a1.transferTo(a2, 100);
         System.out.println(a1.toString());
         System.out.println(a2.toString());

    }

}


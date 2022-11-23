package src.j25_Encapsulation.task02.MyCozum;

public class AccountClass {

    //fields
    int accountNumber; // hesap numarası
    int balance; // bakiye

    public AccountClass(int accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int deposit (int gelenPara){ // para ekle methodu

        return this.balance +=gelenPara;
    }

    public int withdraw (int cikanPara){ // para cikar methodu

        if (balance>=cikanPara){
            balance -=cikanPara;
        }else {
            System.out.println("Yetersiz Bakiye!!!");
        }

        return this.balance;
    }

    public void guncelBalance (){
        System.out.println("Guncel Bakiyeniz: $" + balance);
    }
}

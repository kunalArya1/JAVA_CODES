package OOPS.inheritance.Account;

public class Main {
    public static void main(String[] args) {
        savingAccount sAccount =new savingAccount();
        sAccount.setName("Kunal Arya");
        sAccount.setPhoneNo(725597815);
        sAccount.setAddress("110,Indrapuri Sector A,Bhopal,Madhya pradesh");
        sAccount.setBalance(500000000);
        sAccount.setDob("06 Aug 2001");

        System.out.println(sAccount.getName());
        System.out.println(sAccount.getAddress());
        System.out.println(sAccount.getPhoneNo());
        System.out.println(sAccount.getDob());
        System.out.println(sAccount.getBalance());
        sAccount.deposite();
        sAccount.withraw();
        sAccount.fixedDeposite();
        sAccount.close();
    }
}

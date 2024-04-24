public class AccountMain {
    public static void main(String[] args) {
        Account A1 = new Account("001", "dwinanda", 25000);
        Account A2 = new Account("002", "keyzha", 15000);
        System.out.println("Informasi Akun Sebelum Transfer");
        System.out.println(A1.toString());
        System.out.println(A2.toString());

        A1.transferTo(A2, 5000);
        System.out.println("\nInformasi Akun Setelah Transfer");
        System.out.println(A1.toString());
        System.out.println(A2.toString());

    }
}

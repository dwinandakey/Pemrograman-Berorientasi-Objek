public class BookMain {
    public static void main(String[] args) {
        Author keyzha = new Author("Dwinanda M. Keyzha", "dwinandam12@gmail.com", 'm');
        Author xaqha = new Author("Trianda M. Xaqha", "triandamxaqha@gmail.com", 'm');
        System.out.println(keyzha);
        System.out.println(xaqha);

        Author[] authors = { keyzha, xaqha };

        Book pbo = new Book("Pemrograman Berorientasi Objek", authors, 10000, 100);
        System.out.println(pbo);

        // pbo.setPrice(20000);
        // pbo.setQty(200);
        // System.out.println(pbo);

        Book java = new Book("Java", authors, 50000);
        System.out.println(java);
    }
}
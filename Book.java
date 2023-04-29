public class Book {
    private String name;
    private Author[] authors;
    private double price;

    Book(String name, Author[] authors, double price) {
        this.name = name;
        this.price = price;
        this.authors = authors;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
    String getAuthorNames() {
        String res = "";
        for (int i = 0; i < authors.length; i++) {
            res += authors[i].getName();
            if (i != authors.length - 1) res += ", ";
        }
        return res;
    }
}

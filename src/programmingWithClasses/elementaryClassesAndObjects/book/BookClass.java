package programmingWithClasses.elementaryClassesAndObjects.book;

class BookClass {

    private String author;
    private String nameOfBook;
    private String publishing;
    private int year;
    private int pages;
    private double price;
    private String binding;

    //геттеры и сеттеры
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setNameOfBook(String nameOfBook) {
        this.nameOfBook = nameOfBook;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    public void setPublishing(String publishing) {
        this.publishing = publishing;
    }

    public String getPublishing() {
        return publishing;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setBinding(String binding) {
        this.binding = binding;
    }

    public String getBinding() {
        return binding;
    }

    //конструктор
    public BookClass(String author, String nameOfBook, String publishing, int year, int pages, double price, String binding){

        this.nameOfBook = nameOfBook;
        this.publishing = publishing;
        this.year = year;
        this.pages = pages;
        this.price = price;
        this.binding = binding;
        this.author = author;
    }

    //метод
    public void toString (BookClass bookClass){

        System.out.println("Book: " + this.nameOfBook + "; Author: " + this.author + "; Publishing: " + this.publishing +
                "; Year publish: " + this.year + "; Number pages: " + this.pages + "; Price: " + this.price +
                "; Type binding: " + this.binding);
    }

}

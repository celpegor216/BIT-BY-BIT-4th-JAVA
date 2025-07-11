public class Library {
    private Book[] books;
    private int bookCount;
    
    public Library(int size){
        books = new Book[size];
        bookCount = 0;
    }
    public void addBook(String title, String author){
        if (bookCount < books.length) {
            books[bookCount++] = new Book(title, author);
        } else {
            System.out.println("도서관 저장 공간이 부족합니다.");
        }
    }
    
    public void showBooks() {
        System.out.println("== 책 목록 ==");
        for (int i=0;i<bookCount;i++){
            System.out.println("도서제목 : "+books[i].title+",저자 : "books[i].author);
            
        }
    }
    
    private static class Book { //내부에서만 사용
        private String title;
        private String author;
        public Book(String title, String author){
            this.title = title;
            this.author = author;
        }
    }
}
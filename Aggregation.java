class Course{
    private String name;
    private Instructor instructor;
    private TextBook textBook;
    public Course(String name, Instructor instructor, TextBook textBook)
    {
        this.name = name;
        this.instructor = instructor;
        this.textBook = textBook;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public TextBook getTextBook() {
        return textBook;
    }

    public void setTextBook(TextBook textBook) {
        this.textBook = textBook;
    }

    public void print(){
        System.out.println("Course Name : " + name);
        System.out.println("Instructor name : " + instructor.getFirstName() + " " + instructor.getLastName() );
        System.out.println("Text book title : " + textBook.getTitle());
        System.out.println("Text book author : " + textBook.getAuthor());

    }
}

class Instructor{
    private String firstName;
    private String lastName;
    private String officeNumber;

    public Instructor(String firstName, String lastName, String officeNumber)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.officeNumber = officeNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public String getOfficeNumber() {
        return officeNumber;
    }
}
class TextBook{
    private String title;
    private String publisher;
    private String author;

    public TextBook(String title, String author, String publisher)
    {
        this.title = title;
        this.publisher = publisher;
        this.author = author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getTitle() {
        return title;
    }
}

public class Aggregation {
    public static void main(String[] args) {
        Instructor instructor = new Instructor("Nima", "Davarpanah", "3-2636");
        TextBook textbook = new TextBook("Clean Code", "Robert C. Martin", "Prentice Hall");
        Course course = new Course("Advance Software Engineer", instructor, textbook);
        course.print();
    }
}

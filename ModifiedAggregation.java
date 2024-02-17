class Course{
    private String name;
    private Instructor[] instructors;
    private TextBook[] textBooks;
    public Course(String name, Instructor[] instructors, TextBook[] textBooks)
    {
        this.name = name;
        this.instructors = instructors;
        this.textBooks = textBooks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Instructor[] getInstructor() {
        return instructors;
    }

    public void setInstructor(Instructor[] instructors) {
        this.instructors = instructors;
    }

    public TextBook[] getTextBook() {
        return textBooks;
    }

    public void setTextBook(TextBook[] textBooks) {
        this.textBooks = textBooks;
    }

    public void print(){
        System.out.println("Course Name : " + name);
        System.out.println("Instructors:");
        for (Instructor instructor : instructors) {
            System.out.println("- " + instructor.getFirstName() + " " + instructor.getLastName() + ", Office: " + instructor.getOfficeNumber());
        }
        System.out.println("Textbooks:");
        for (TextBook textbook : textBooks) {
            System.out.println("- " + textbook.getTitle() + ", Author: " + textbook.getAuthor());
        }
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

public class ModifiedAggregation {
    public static void main(String[] args) {
        Instructor[] instructors = {
                new Instructor("Nima", "Davarpanah", "3-2636"),
                new Instructor("John", "Doe", "4-1234")
        };

        TextBook[] textbooks = {
                new TextBook("Clean Code", "Robert C. Martin", "Prentice Hall"),
                new TextBook("Data Structures and Algorithms", "Michael T. Goodrich", "Wiley")
        };

        Course course = new Course("Advance Software Engineer", instructors, textbooks);
        course.print();
    }
}

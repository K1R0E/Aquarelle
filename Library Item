import javax.swing.JOptionPane;

// Superclass LibraryItem
abstract class LibraryItem {
    protected String title;
    protected String publicationDate;
    protected int daysOverdue;

    public LibraryItem(String title, String publicationDate) {
        this.title = title;
        this.publicationDate = publicationDate;
        this.daysOverdue = 0;
    }

    public abstract void displayInfo();
    
    public abstract double getFine();
    
    public void setDaysOverdue(int days) {
        this.daysOverdue = days;
    }
}

// Book subclass
class Book extends LibraryItem {
    private String author;
    private String genre;
    private int pages;
    private static final double FINE_RATE = 5.50;

    public Book(String title, String publicationDate, String author, String genre, int pages) {
        super(title, publicationDate);
        this.author = author;
        this.genre = genre;
        this.pages = pages;
    }

    public void displayInfo() {
        JOptionPane.showMessageDialog(null,
            "Book Details:\n" +
            "Title: " + title + "\n" +
            "Publication Date: " + publicationDate + "\n" +
            "Author: " + author + "\n" +
            "Genre: " + genre + "\n" +
            "Pages: " + pages,
            "Book Information",
            JOptionPane.INFORMATION_MESSAGE);
    }

    public double getFine() {
        return daysOverdue * FINE_RATE;
    }
}

// Magazine subclass
class Magazine extends LibraryItem {
    private int issueNumber;
    private String month;
    private String topic;
    private static final double FINE_RATE = 5.30;

    public Magazine(String title, String publicationDate, int issueNumber, String month, String topic) {
        super(title, publicationDate);
        this.issueNumber = issueNumber;
        this.month = month;
        this.topic = topic;
    }

    public void displayInfo() {
        JOptionPane.showMessageDialog(null,
            "Magazine Details:\n" +
            "Title: " + title + "\n" +
            "Publication Date: " + publicationDate + "\n" +
            "Issue Number: " + issueNumber + "\n" +
            "Month: " + month + "\n" +
            "Topic: " + topic,
            "Magazine Information",
            JOptionPane.INFORMATION_MESSAGE);
    }

    public double getFine() {
        return daysOverdue * FINE_RATE;
    }
}

// DVD subclass
class DVD extends LibraryItem {
    private String director;
    private int duration;
    private String mainActors;
    private static final double FINE_RATE = 10.00;

    public DVD(String title, String publicationDate, String director, int duration, String mainActors) {
        super(title, publicationDate);
        this.director = director;
        this.duration = duration;
        this.mainActors = mainActors;
    }

    public void displayInfo() {
        JOptionPane.showMessageDialog(null,
            "DVD Details:\n" +
            "Title: " + title + "\n" +
            "Publication Date: " + publicationDate + "\n" +
            "Director: " + director + "\n" +
            "Duration: " + duration + " minutes\n" +
            "Main Actors: " + mainActors,
            "DVD Information",
            JOptionPane.INFORMATION_MESSAGE);
    }

    public double getFine() {
        return daysOverdue * FINE_RATE;
    }
}

// Main class to demonstrate the library system
public class LibrarySystem {
    public static void main(String[] args) {
        // Create an array of LibraryItem references
        LibraryItem[] libraryItems = new LibraryItem[4];
        
        // Add various items to the array
        libraryItems[0] = new Book("The Great Gatsby", "1925", "F. Scott Fitzgerald", "Classic", 180);
        libraryItems[1] = new Magazine("National Geographic", "2024", 256, "March", "Science");
        libraryItems[2] = new DVD("Inception", "2010", "Christopher Nolan", 148, "Leonardo DiCaprio, Ellen Page");
        libraryItems[3] = new Book("1984", "1949", "George Orwell", "Dystopian", 328);

        // Display information for each item
        for (LibraryItem item : libraryItems) {
            item.displayInfo();
        }

        // Set overdue days for each item
        libraryItems[0].setDaysOverdue(3);  // Book overdue for 3 days
        libraryItems[1].setDaysOverdue(2);  // Magazine overdue for 2 days
        libraryItems[2].setDaysOverdue(5);  // DVD overdue for 5 days
        libraryItems[3].setDaysOverdue(1);  // Book overdue for 1 day

        // Calculate and display total fines
        double totalFine = 0;
        StringBuilder fineDetails = new StringBuilder("Fine Details:\n\n");

        for (LibraryItem item : libraryItems) {
            double itemFine = item.getFine();
            totalFine += itemFine;
            fineDetails.append(item.title)
                      .append(" - Php ")
                      .append(String.format("%.2f", itemFine))
                      .append(" (")
                      .append(item.daysOverdue)
                      .append(" days overdue)\n");
        }

        fineDetails.append("\nTotal Fine: Php ").append(String.format("%.2f", totalFine));

        JOptionPane.showMessageDialog(null, 
            fineDetails.toString(),
            "Overdue Fines",
            JOptionPane.INFORMATION_MESSAGE);
    }
}

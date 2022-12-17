import java.time.LocalDate;

// Name : Valentine Sah
// Student ID : 100757000
// Date : Dec 4th 2022
// File name : ExtendedWorkTicket.java

public class ExtendedWorkTicket extends WorkTicket
{
    boolean myOpen;

    // Default constructor
    public ExtendedWorkTicket()
    {
        super();
        myOpen = true;
    }

    // Parameterized constructor
    public ExtendedWorkTicket(int workTicketNumber, String clientID, LocalDate workTicketDate, String issueDescription, boolean myOpen)
    {
        super(workTicketNumber, clientID, workTicketDate, issueDescription);
        this.myOpen = myOpen;
    }

    // Overloaded setter method for all attributes
    public void setWorkTicketPlaceholder(int workTicketNumber, String clientID, LocalDate workTicketDate, String issueDescription, boolean myOpen)
    {
        // Validate work ticket attributes
        if (workTicketNumber <= 0)
        {
            throw new IllegalArgumentException("Work ticket number must be a positive number");
        }

        if (workTicketDate.getYear() < 2000 || workTicketDate.getYear() > 2099)
        {
            throw new IllegalArgumentException("Work ticket year must be between 2000 and 2099");
        }

        if (clientID.length() < 1 || issueDescription.length() < 1)
        {
            return;
        }

        this.workTicketNumber = workTicketNumber;
        this.clientID = clientID;
        this.workTicketDate = workTicketDate;
        this.issueDescription = issueDescription;
        this.myOpen = myOpen;
    }

    // Overloaded setter method for all attributes
    public void setWorkTicket(int workTicketNumber, String clientID, LocalDate workTicketDate, String issueDescription, boolean myOpen)
    {
        // Validate work ticket attributes
        if (workTicketNumber <= 0)
        {
            return;
        }

        if (workTicketDate.getYear() < 2000 || workTicketDate.getYear() > 2099)
        {
            return;
        }

        if (clientID.length() < 1 || issueDescription.length() < 1)
        {
            return;
        }

        // Call the base class version of setWorkTicket() to set all the inherited attributes
        super.setWorkTicket(workTicketNumber, clientID, workTicketDate, issueDescription);

        // Set the myOpen attribute
        this.myOpen = myOpen;

    }

    // Setter method for myOpen attribute
    public void setMyOpen(boolean myOpen)
    {
        this.myOpen = myOpen;
    }

    // Mutator method to close the work ticket
    public void closeTicket()
    {
        setMyOpen(false);
    }

    // Override toString() method
    @Override
    public String toString()
    {
        // Call the base class version of toString() to get a string with the inherited attributes
        String baseString = super.toString();

        // View the the result of the myOpen boolean to see whether it is true or false
        return baseString + "\n" + "Ticket: " + (myOpen ? "OPEN" : "CLOSED");
    }

}

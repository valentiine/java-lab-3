import java.time.LocalDate;

// Name : Valentine Sah
// Student ID : 100757000
// Date : Dec 4th 2022
// File name : Main.java

public class Main
{
    public static void main(String[] args)
    {
        // Create the new ticket
        ExtendedWorkTicket ticket1 = new ExtendedWorkTicket();

        // Assign variables to the work ticket
        ticket1.setWorkTicket(1, "A300", LocalDate.of(2020, 6, 5),
                "Computer is broken", true);

        // Print the work ticket
        System.out.println("\n" + ticket1 + "\n");

        // Close the work ticket
        ticket1.closeTicket();


        System.out.println(ticket1 + "\n");

        // Create ticket #2
        ExtendedWorkTicket ticket2 = new ExtendedWorkTicket(2, "B300", LocalDate.of(2021,
                7, 16), "Lost my keys", false);

        // Print the new ticket (ticket #2)
        System.out.println(ticket2 + "\n");

        // Try to set the work ticket attributes using the setWorkTicketPlaceholder() method
        try
        {
            ticket2.setWorkTicketPlaceholder(3, "C300", LocalDate.of(2022, 8,
                    21), "Laptop is broken", true);
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }

        // Print the work ticket again
        System.out.println(ticket2);
    }

}

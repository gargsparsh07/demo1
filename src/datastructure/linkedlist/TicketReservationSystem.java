package datastructure.linkedlist;

import java.time.LocalDateTime;

class TicketNode {
    int ticketId;
    String customerName;
    String movieName;
    String seatNumber;
    LocalDateTime bookingTime;
    TicketNode next;

    TicketNode(int ticketId, String customerName, String movieName,
               String seatNumber, LocalDateTime bookingTime) {
        this.ticketId = ticketId;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
        this.next = null;
    }
}

public class TicketReservationSystem {

    private TicketNode head = null;

    // 1. Add ticket at the end
    public void addTicket(int id, String customer, String movie, String seat) {
        TicketNode newNode = new TicketNode(
                id, customer, movie, seat, LocalDateTime.now()
        );

        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            TicketNode temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }
        System.out.println("Ticket booked successfully!");
    }

    // 2. Remove ticket by Ticket ID
    public void removeTicket(int ticketId) {
        if (head == null) {
            System.out.println("No tickets to remove.");
            return;
        }

        TicketNode curr = head;
        TicketNode prev = null;

        do {
            if (curr.ticketId == ticketId) {

                if (curr == head && curr.next == head) {
                    head = null;
                } else {
                    if (curr == head) {
                        TicketNode last = head;
                        while (last.next != head) {
                            last = last.next;
                        }
                        head = head.next;
                        last.next = head;
                    } else {
                        prev.next = curr.next;
                    }
                }
                System.out.println("Ticket removed successfully.");
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);

        System.out.println("Ticket ID not found.");
    }

    // 3. Display all tickets
    public void displayTickets() {
        if (head == null) {
            System.out.println("No tickets booked.");
            return;
        }

        TicketNode temp = head;
        System.out.println("\n--- Booked Tickets ---");
        do {
            System.out.println("Ticket ID: " + temp.ticketId);
            System.out.println("Customer: " + temp.customerName);
            System.out.println("Movie: " + temp.movieName);
            System.out.println("Seat: " + temp.seatNumber);
            System.out.println("Time: " + temp.bookingTime);
            System.out.println("----------------------");
            temp = temp.next;
        } while (temp != head);
    }

    // 4. Search by Customer Name or Movie Name
    public void searchTicket(String keyword) {
        if (head == null) {
            System.out.println("No tickets booked.");
            return;
        }

        TicketNode temp = head;
        boolean found = false;

        do {
            if (temp.customerName.equalsIgnoreCase(keyword)
                    || temp.movieName.equalsIgnoreCase(keyword)) {
                System.out.println("Ticket ID: " + temp.ticketId +
                        ", Customer: " + temp.customerName +
                        ", Movie: " + temp.movieName);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) {
            System.out.println("No ticket found for: " + keyword);
        }
    }

    // 5. Count total tickets
    public int countTickets() {
        if (head == null) return 0;

        int count = 0;
        TicketNode temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);

        return count;
    }

    // Main method
    public static void main(String[] args) {

        TicketReservationSystem system = new TicketReservationSystem();

        system.addTicket(101, "Amit", "Inception", "A1");
        system.addTicket(102, "Neha", "Avatar", "B5");
        system.addTicket(103, "Rahul", "Inception", "C3");

        system.displayTickets();

        system.searchTicket("Inception");
        system.searchTicket("Neha");

        System.out.println("Total Tickets: " + system.countTickets());

        system.removeTicket(102);
        system.displayTickets();

        System.out.println("Total Tickets: " + system.countTickets());
    }
}

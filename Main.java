public class Main {
    public static void main(String[] args) {

        Viewer viewer = new Viewer(1, "Vita");
        Movie movie = new Movie(101, "Avengers", 350.00);
        Ticket ticket = new Ticket(5001, viewer, movie);

        System.out.println(ticket.fulldetails());
    }
}

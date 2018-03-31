public class Driver {
    public static void main(String[] args) {
        Booking book = new Booking("M.Ahsan Khan","fa17" , "12/02/2018" ,3 ,300.00 , "Ecomomics" ,"90.000K", "pakistan");
        book.totalPrice();
        book.ticketConfirmation();
    }
}

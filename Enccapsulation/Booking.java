import java.util.Scanner;
public class Booking {
    Scanner scan = new Scanner(System.in);
    private String custName;
    private String bookingId;
    private String depatureDate;
    private int noOfTicktes;
    private double price;
    private String cabintype;
    private String totalprice;
    private String destination;
    public Booking(){

    }

    public Booking(String custName , String bookingId , String depatureDate , int noOfTicktes ,double price , String cabintype , String totalprice , String destination) {
        this.custName = custName;
        this.bookingId = bookingId;
        this.depatureDate = depatureDate;
        this.noOfTicktes = noOfTicktes;
        this.price = price;
        this.cabintype = cabintype;
        this.totalprice = totalprice;
        this.destination = destination;
    }
    public void totalPrice(){
        System.out.println("Total Price of Tickets are calculated here!!");
        System.out.println("Enter 1 To Know the Total Price of Tickets !!");
        int choice = scan.nextInt();
        if (choice == 1){
            if (cabintype.equals("Ecomomics")){
                double totalAmount = (price * noOfTicktes);
                System.out.println("The amouont of ticket is "+totalAmount);
            }
            else if(cabintype.equals("Buiness")){
                double totalAmount = (price * noOfTicktes);
                System.out.println("The amouont of ticket is "+totalAmount);
            }
            else{
                System.out.println(" ");
            }
        }
            else {
            System.out.println("please enter a valid input !!thanku");
            totalPrice();
        }
        }
        public void ticketConfirmation(){
            System.out.println("To see your Full Booking And Details oF Tickets");
            System.out.println("Press  !! 0");
            int watchDetalis = scan.nextInt();
            if (watchDetalis == 0) {

                System.out.println("Customer name is " +custName);
                System.out.println("Booking iD is " + bookingId);
                System.out.println("Departure Date is " + depatureDate);
                System.out.println("No of tickets are " + noOfTicktes);
                System.out.println("Price of 1 ticket is " + price);
                System.out.println("Cabintype is " + cabintype);
                System.out.println("Totalprice are " + totalprice);
                System.out.println(" your Destination IS " + destination);
            }
            else {
                System.out.println("Please Enter Right Input!!!! ");
                ticketConfirmation();
            }
        }

}

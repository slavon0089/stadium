public class Ticket {


    String name;
    int ticketNumber;
    Sector sector;
    int placeNumber;


    public Ticket(String name, int ticketNumber, Sector sector, int placeNumber) {
        this.name = name;
        this.ticketNumber = ticketNumber;
        this.sector = sector;
        this.placeNumber = placeNumber;

    }
    public void ticketInfo(){
        System.out.println("Билет на имя "+ name+ "  номер: " + ticketNumber + " в сектор: " + sector + " место: " + placeNumber);
    }


}

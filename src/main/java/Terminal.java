import java.util.Random;

public class Terminal {

    public static void main(String[] args) {

        Random random = new Random();

        Ticket[] tickets = new Ticket[10];
        String[] names = {"Daria", "Slava", "Алекс", null,"Artsiom", "Igor", "Kate", ""};
        for (int i = 0; i < tickets.length; i++) {
            System.out.printf(i + 1 + ") ");
            tickets[i] = new Ticket(names[new Random().nextInt(names.length)], random.nextInt(500),
                    Sector.values()[new Random().nextInt(Sector.values().length)], random.nextInt(200));
            tickets[i].ticketInfo();
            verifyTicket(tickets[i]);
        }
//        Ticket ticket = new Ticket("", random.nextInt(500), Sector.values()[new Random().nextInt(Sector.values().length)], random.nextInt(200));
//        Ticket ticket1 = new Ticket("Daria", random.nextInt(500), Sector.values()[new Random().nextInt(Sector.values().length)], random.nextInt(200));
//        Ticket ticket2 = new Ticket("Slava", random.nextInt(500), Sector.values()[new Random().nextInt(Sector.values().length)], random.nextInt(200));
//        Ticket ticket3 = new Ticket("Алекс", random.nextInt(500), Sector.values()[new Random().nextInt(Sector.values().length)], random.nextInt(200));

//        VerifyTicket(ticket);
//        VerifyTicket(ticket1);
//        VerifyTicket(ticket2);
//        VerifyTicket(ticket3);


    }

    public static void verifyTicket(Ticket ticket) {

        if (ticket.name == "" || ticket.name == null) {
            System.out.println("\u001B[31m" + "!!!Проблема с Билетом!! В билете нет ФИО" + "\u001B[0m");
            return;
        }

        switch (ticket.sector) {
            case A1:
                System.out.println("Пройти в сектор A1 можно через ворота справа и поднявшись слева на второй этаж, сохраняйте билет до конца матча.");
                break;
            case A2:
                System.out.println("Пройти в сектор A2 можно через ворота справа и поднявшись справа на второй этаж, сохраняйте билет до конца матча.");
                break;
            case A3:
                System.out.println("Пройти в сектор A3 можно через ворота слева и поднявшись справа на второй этаж,");
                break;
            case B1:
                System.out.println("Пройти в сектор В1 можно через ворота слева и поднявшись справа на первый этаж");
                break;
            case B2:
                System.out.println("Пройти в сектор В2 можно через ворота слева и поднявшись слева на первый этаж");
                break;
            case B3:
                System.out.println("Пройти в сектор В3 можно через ворота слева");
                break;
            case VIP:
                System.out.println("Здравствуйте! " + ticket.name + " Пройти в VIP зал вы можете прямо по корридору");
                break;
            default:
                System.out.println("\u001B[31m" + "!!!Проблема с Билетом!! Сектор не с нашего стадиона" + "\u001B[0m");
                break;

        }

    }
}
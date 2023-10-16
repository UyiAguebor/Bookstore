import java.awt.print.Book;
import java.time.LocalDate;
import java.util.ArrayList;

public class BookStoreMain {
    public static void main(String[] args) {
        //create a bookStore object and instantiate
        BookStore store = new BookStore();

        //create a customer who can then buy books
        Customer customer1 = new Customer("uyi","07503715491","uyiaguebor@gmail.com");
        //customer1 places an order to purchase a book
        Stock book1 = new Stock("Naruto","toshiba",21);
        //placing the order ****
        Order order1 = new Order(customer1,book1);


        //determine the shipping date
        int year = 2022;
        int month = 2;
        int day = 8;
        LocalDate shipDate = LocalDate.of(year,month,day);



        //calculate the shipping cost to send the order
        Shipping shipOrder = new Shipping(order1,shipDate);
        double shipCost = shipOrder.calcShipCost(true);


        //create an invoice ****
        Invoice inv1 = new Invoice("1",book1,shipOrder);
        inv1.invoice();

        //add the invoices to a list so that we can search for an invoice ****
        ArrayList<Invoice> orderBook = new ArrayList<Invoice>();
        orderBook.add(inv1);
        store.pilingUpOfOrders();

        //a repeat with another customer, order, etc...
        Customer customer2 = new Customer("gary","071548641654","gary@gmail.com");
        Stock book2 = new Stock("lord of the flies", "jk rowling",32);
        Order order2 = new Order(customer2,book2);
        //determine the shipping date
        int year2 = 2021;
        int month2 = 3;
        int day2 = 9;
        LocalDate shipDate2 = LocalDate.of(year2,month2,day2);

        //calculate the shipping cost to send the order
        Shipping shipOrder2 = new Shipping(order1,shipDate2);
        double shipCost2 = shipOrder.calcShipCost(true);

        //create an invoice
        Invoice inv2 = new Invoice("2",book2,shipOrder2);
        inv2.invoice();

        //add the invoices to a list so that we can search for an invoice
        orderBook.add(inv2);
        store.pilingUpOfOrders();
        //search for order
        Invoice foundInvoice;


        store.searchOrder(inv1.getInvoiceNbr());

    }
}


//import of package
import java.util.ArrayList;
import java.util.Iterator;

public class BookStore {
    //the message has been provided for you - do not change this
    private final String message = "The urgent orders are piling up .... time to ship quicker";
    //create the invoices ArrayList<>
ArrayList<Invoice> invoices = new ArrayList<Invoice>();

    public BookStore() {
    }

    //complete the constructor
public BookStore(ArrayList<Invoice> invoices){
    this.invoices = invoices;

}
    //getter() for invoices list

    public ArrayList<Invoice> getInvoices() {
        return invoices;
    }

    //search for an order
public Invoice searchOrder(String invoiceNbr){
   for(int i = 0; i < invoices.size(); ++i){
       if (invoices.get(i).getInvoiceNbr() == invoiceNbr){
           return invoices.get(i);
       }
   }
   return null;
}
    //piling up of orders
public String pilingUpOfOrders(){
    if(Shipping.countUrgent>5){return message;} else
    {return null;}
}
}

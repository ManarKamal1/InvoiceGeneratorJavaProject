
package Model;

import java.util.ArrayList;

public class Invoice {
    private final int num;
    private final String date;
    private final String customer;
    private ArrayList<Line> lines;

    public Invoice(int num, String date, String customer) {
        this.num = num;
        this.date = date;
        this.customer = customer;
    }

    public double getInvoiceTotal() {
        double total = 0.0;
        for (Line line : getLines()) {
            total += line.getLineTotal();
        }
        return total;
    }

    public ArrayList<Line> getLines() {
        if (lines == null) {
            lines = new ArrayList<>();
        }
        return lines;
    }

    public String getCustomer() {
        return customer;
    }

    public int getNum() {
        return num;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Invoice{" + "num=" + num + ", date=" + date + ", customer=" + customer + '}';
    }

    public String getAsCSV() {
        return num + "," + date + "," + customer;
    }

}

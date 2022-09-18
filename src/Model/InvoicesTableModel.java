package Model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class InvoicesTableModel extends AbstractTableModel {
    private final ArrayList<Invoice> invoices;
    private final String[] columns = {"No.", "Date", "Customer", "Total"};

    public InvoicesTableModel(ArrayList<Invoice> invoices) {
        this.invoices = invoices;
    }

    @Override
    public int getRowCount() {
        return invoices.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public String getColumnName(int column) {
        return columns[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Invoice invoice = invoices.get(rowIndex);

        return switch (columnIndex) {
            case 0 -> invoice.getNum();
            case 1 -> invoice.getDate();
            case 2 -> invoice.getCustomer();
            case 3 -> invoice.getInvoiceTotal();
            default -> "";
        };
    }
}

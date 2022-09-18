package Model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class LinesTableModel extends AbstractTableModel {

    private final ArrayList<Line> lines;
    private final String[] columns = {"No.", "Item Name", "Item Price", "Count", "Item Total"};

    public LinesTableModel(ArrayList<Line> lines) {
        this.lines = lines;
    }

    public ArrayList<Line> getLines() {
        return lines;
    }


    @Override
    public int getRowCount() {
        return lines.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public String getColumnName(int x) {
        return columns[x];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Line line = lines.get(rowIndex);

        return switch (columnIndex) {
            case 0 -> line.invoice().getNum();
            case 1 -> line.item();
            case 2 -> line.price();
            case 3 -> line.count();
            case 4 -> line.getLineTotal();
            default -> "";
        };
    }

}

package View;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class LineDialog extends JDialog{
    private final JTextField itemNameField;
    private final JTextField itemCountField;
    private final JTextField itemPriceField;

    public LineDialog(InvoiceFrame frame) {
        itemNameField = new JTextField(20);
        JLabel itemNameLbl = new JLabel("Item Name");

        itemCountField = new JTextField(20);
        JLabel itemCountLbl = new JLabel("Item Count");

        itemPriceField = new JTextField(20);
        JLabel itemPriceLbl = new JLabel("Item Price");

        JButton okBtn = new JButton("OK");
        JButton cancelBtn = new JButton("Cancel");

        okBtn.setActionCommand("createLineOK");
        cancelBtn.setActionCommand("createLineCancel");

        okBtn.addActionListener(frame.getController());
        cancelBtn.addActionListener(frame.getController());
        setLayout(new GridLayout(4, 2));

        add(itemNameLbl);
        add(itemNameField);
        add(itemCountLbl);
        add(itemCountField);
        add(itemPriceLbl);
        add(itemPriceField);
        add(okBtn);
        add(cancelBtn);

        pack();
    }

    public JTextField getItemNameField() {
        return itemNameField;
    }

    public JTextField getItemCountField() {
        return itemCountField;
    }

    public JTextField getItemPriceField() {
        return itemPriceField;
    }
}


package View;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class InvoiceDialog extends JDialog {
    private final JTextField custNameField;
    private final JTextField invDateField;

    public InvoiceDialog(InvoiceFrame frame) {
        JLabel custNameLbl = new JLabel("Customer Name:");
        custNameField = new JTextField(20);
        JLabel invDateLbl = new JLabel("Invoice Date:");
        invDateField = new JTextField(20);
        JButton okBtn = new JButton("OK");
        JButton cancelBtn = new JButton("Cancel");

        okBtn.setActionCommand("createInvoiceOK");
        cancelBtn.setActionCommand("createInvoiceCancel");

        okBtn.addActionListener(frame.getController());
        cancelBtn.addActionListener(frame.getController());
        setLayout(new GridLayout(3, 2));

        add(invDateLbl);
        add(invDateField);
        add(custNameLbl);
        add(custNameField);
        add(okBtn);
        add(cancelBtn);

        pack();

    }

    public JTextField getCustNameField() {
        return custNameField;
    }

    public JTextField getInvDateField() {
        return invDateField;
    }

}

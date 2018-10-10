
import java.awt.Color;
import java.awt.Component;
import java.time.format.DateTimeFormatter;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class VelocityTableCellRenderer implements TableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        JLabel label = new JLabel();
        Measurement m = (Measurement) value;
        switch (column) {
            case 0:
                label.setText(m.getDatum().format(DateTimeFormatter.ofPattern("dd.MM.yyyy")));
                break;
            case 1:
                label.setText(m.getDatum().format(DateTimeFormatter.ofPattern("HH:mm")));
                break;
            case 2:
                label.setText(m.getKennzeichen());
                break;
            case 3:
                label.setText("" + m.getGemessen());
                break;
            case 4:
                label.setText("" + m.getErlaubt());
                break;
            case 5:
                double v = m.berechneUebertretung();
        }
        label.setForeground(Color.black);
        if (isSelected) {
            label.setBackground(Color.lightGray);
        }
        label.setOpaque(true);
        return label;
    }

}

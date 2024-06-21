package Tugas9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.List;

/**
 *
 * @author Iman
 */
public class MahasiswaView extends JFrame {

    private JTextField nimField, namaDepanField, namaBelakangField, umurField;
    private JComboBox<String> asalComboBox;
    private JButton simpanButton, resetButton;

    public MahasiswaView() {
        setTitle("Student Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponents();
        setLayout();
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void initComponents() {
        nimField = new JTextField(6);
        namaDepanField = new JTextField(30);
        namaBelakangField = new JTextField(20);
        umurField = new JTextField(5);
        asalComboBox = new JComboBox<>(new String[]{"Jakarta", "Bogor", "Depok", "Tangerang", "Bekasi"});
        simpanButton = new JButton("Simpan");
        resetButton = new JButton("Reset");
    }

    private void setLayout() {
        JPanel mainPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.ipadx = 30;

        mainPanel.add(new JLabel("NIM: "), gbc);

        gbc.gridx++;
        gbc.insets = new Insets(5, 220, 5, 5);
        mainPanel.add(nimField, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        gbc.insets = new Insets(5, 5, 5, 5);
        mainPanel.add(new JLabel("Nama: "), gbc);

        gbc.gridx++;
        mainPanel.add(namaDepanField, gbc);

        gbc.gridx++;
        mainPanel.add(namaBelakangField, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        gbc.insets = new Insets(5, 5, 5, 5);
        mainPanel.add(new JLabel("Umur: "), gbc);

        gbc.gridx++;
        gbc.insets = new Insets(5, 228, 5, 5);
        mainPanel.add(umurField, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        gbc.insets = new Insets(5, 5, 5, 5);
        mainPanel.add(new JLabel("Asal: "), gbc);

        gbc.gridx++;
        gbc.insets = new Insets(5, 185, 5, 5);
        mainPanel.add(asalComboBox, gbc);

        JPanel buttonPanel = new JPanel(new GridLayout(1, 2, 0, 0));
        buttonPanel.add(simpanButton);
        buttonPanel.add(resetButton);

        gbc.gridx = 0;
        gbc.gridy++;
        gbc.gridwidth = 2;
        gbc.insets = new Insets(20, 5, 5, 5);
        mainPanel.add(buttonPanel, gbc);

        add(mainPanel);
    }

    public String getNIM() {
        return nimField.getText();
    }

    public String getNama() {
        return namaDepanField.getText() + " " + namaBelakangField.getText();
    }

    public String getNamaDepan() {
        return namaDepanField.getText();
    }

    public String getNamaBelakang() {
        return namaBelakangField.getText();
    }

    public String getUmur() {
        return umurField.getText();
    }

    public String getAsal() {
        return (String) asalComboBox.getSelectedItem();
    }

    public void setSimpanButtonListener(ActionListener listener) {
        simpanButton.addActionListener(listener);
    }

    public void setResetButtonListener(ActionListener listener) {
        resetButton.addActionListener(listener);
    }

    public void clearFields() {
        nimField.setText("");
        namaDepanField.setText("");
        namaBelakangField.setText("");
        umurField.setText("");
    }

    public void displayErrorMessage(List<String> errorMessages) {
        StringBuilder errorMessage = new StringBuilder();
        for (String error : errorMessages) {
            errorMessage.append(error).append("\n");
        }
        JOptionPane.showMessageDialog(this, errorMessage.toString(), "Error", JOptionPane.ERROR_MESSAGE);
    }

    public void displaySuccessMessage(String message, List<Mahasiswa> mahasiswaList) {
        StringBuilder messageBuilder = new StringBuilder(message);
        messageBuilder.append("\n\nDaftar NIM dan Nama Mahasiswa yang telah berhasil disimpan:\n");

        for (Mahasiswa mahasiswa : mahasiswaList) {
            messageBuilder.append(mahasiswa.getNim())
                    .append(" - ").append(mahasiswa.getNama())
                    .append("\n");
        }
        JOptionPane.showMessageDialog(this, messageBuilder.toString(), "Success", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MahasiswaView::new);
    }
}

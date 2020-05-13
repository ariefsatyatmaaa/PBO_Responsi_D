package responsi;

import java.awt.event.ActionEvent;
import javax.swing.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class data extends JFrame {
    String DBurl = "jdbc:mysql://localhost/responsi?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    String DBusername = "root";
    String DBpassword = "";
    Connection koneksi;
    Statement statement;

    JButton btnhome = new JButton("Home");
    JButton btngaji = new JButton("Gaji");
    JButton btndata = new JButton("Data");
    JButton btnpetunjuk = new JButton("Petunjuk");
    JButton btnadmin = new JButton("Admin");
    JLabel lfooter = new JLabel("APLIKASI PERHITUNGAN GAJI PT. VETERAN JAYA");

    JTable table;
    DefaultTableModel tableModel;
    JScrollPane scrollPane;
    Object namaKolom[] = {"ID Karyawan","Nama","Posisi","Alamat","No HP","Gaji Pokok","Jam Lembur","Tunjangan","Pajak","Total"};

    public data(){
        setTitle("Data");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(650, 450);
        setVisible(true);
        setLayout(null);

        tableModel = new DefaultTableModel(namaKolom,0);
        table = new JTable(tableModel);
        scrollPane = new JScrollPane(table);

        add(btnhome);
        btnhome.setBounds(10, 15, 100, 30);
        add(btngaji);
        btngaji.setBounds(10, 90, 100, 30);
        add(btndata);
        btndata.setBounds(10, 170, 100, 30);
        add(btnpetunjuk);
        btnpetunjuk.setBounds(10, 250, 100, 30);
        add(btnadmin);
        btnadmin.setBounds(520, 10, 100, 30);
        add(lfooter);
        lfooter.setBounds(190, 375, 300, 25);
        add(scrollPane);
        scrollPane.setBounds(140,70,760,200);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        btnhome.addActionListener((ActionEvent e) -> {
            new tampilan();
            dispose();
        });
        btngaji.addActionListener((ActionEvent e) -> {
            new gaji();
            dispose();
        });

        btndata.addActionListener((ActionEvent e) -> {
            new data();
            dispose();
        });

        btnpetunjuk.addActionListener((ActionEvent e) -> {
            new petunjuk();
            dispose();
        });
    }
}

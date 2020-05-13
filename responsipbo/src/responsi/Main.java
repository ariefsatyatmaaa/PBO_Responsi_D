package responsi;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class Main {

    public static void main(String[] args) {
        new tampilan();
    }
}

class tampilan extends JFrame {
    JButton btnhome = new JButton("Home");
    JButton btngaji = new JButton("Gaji");
    JButton btndata = new JButton("Data");
    JButton btnpetunjuk = new JButton("Petunjuk");
    JButton btnadmin = new JButton("Admin");

    JLabel ltampilan1 = new JLabel("Selamat Datang ,");
    JLabel ltampilan2 = new JLabel("Silahkan Masuk ke menu gaji untuk melakukan perhitungan gaji.");
    JLabel ltampilan3 = new JLabel("Jika mengalami kesulitan, klik Menu Petunjuk.");
    JLabel lfooter = new JLabel("APLIKASI PERHITUNGAN GAJI PT. VETERAN JAYA");

    tampilan() {
        setTitle("Home");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(650, 450);
        setVisible(true);
        setLayout(null);

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
        add(ltampilan1);
        ltampilan1.setBounds(150, 100, 200, 25);
        add(ltampilan2);
        ltampilan2.setBounds(150, 125, 375, 25);
        add(ltampilan3);
        ltampilan3.setBounds(150, 150, 350, 25);
        add(lfooter);
        lfooter.setBounds(190, 375, 300, 25);

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
        btnadmin.addActionListener((ActionEvent e) -> {
            new admin();
            dispose();
        });
    }
}
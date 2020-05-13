package responsi;

import java.awt.event.ActionEvent;
import javax.swing.*;

public class petunjuk extends  JFrame {
    JButton btnHome = new JButton("Home");
    JLabel lTampilan = new JLabel("Klik tombol Gaji Untuk Menghitung Gaji");
    JLabel lTampilan2 = new JLabel("Klik tombol data untuk melihat data sudah masuk atau belum");
    JLabel lfooter = new JLabel("APLIKASI PERHITUNGAN GAJI PT. VETERAN JAYA");

    public petunjuk(){
        setTitle("Petunjuk");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(650, 450);
        setVisible(true);
        setLayout(null);

        add(btnHome);
        btnHome.setBounds(275, 280, 100,30);
        add(lTampilan);
        lTampilan.setBounds(210, 100, 300,50);
        add(lTampilan2);
        lTampilan2.setBounds(150, 160, 350,50);
        add(lfooter);
        lfooter.setBounds(190, 375, 300, 25);

        btnHome.addActionListener((ActionEvent e) -> {
            new tampilan();
            dispose();
        });
    }
}

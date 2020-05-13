package responsi;

import java.awt.event.ActionEvent;
import javax.swing.*;
import java.sql.*;
import javax.swing.JOptionPane;


public class gaji extends JFrame {
    String DBurl = "jdbc:mysql://localhost/responsi?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    String DBusername = "root";
    String DBpassword = "";
    Connection koneksi;
    Statement statement;

    JLabel lid = new JLabel("ID Karyawan");
    JTextField tfid = new JTextField();
    JLabel lnama= new JLabel("Nama");
    JTextField tfnama = new JTextField();
    JLabel lposisi = new JLabel("Posisi");
    String[] posisi = {"Direktur","Programmer","Marketing","Supervisor"};
    JComboBox cmbposisi = new JComboBox(posisi);
    JLabel lalamat = new JLabel("Alamat ");
    JTextField tfalamat = new JTextField();
    JLabel lnohp= new JLabel("No HP");
    JTextField tfnohp = new JTextField();
    JLabel lgajipokok= new JLabel("Gaji Pokok");
    JTextField tfgajipokok = new JTextField();
    JLabel llembur= new JLabel("Jam Lembur");
    JTextField tflembur = new JTextField();
    JLabel ltunjangan= new JLabel("Tunjangan");
    JTextField tftunjangan = new JTextField();
    JLabel lpajak = new JLabel("Pajak");
    JTextField tfpajak = new JTextField();
    JLabel ltotal = new JLabel("Total");
    JTextField tftotal = new JTextField();
    JLabel lfooter = new JLabel("APLIKASI PERHITUNGAN GAJI PT. VETERAN JAYA");

    JButton btnhome = new JButton("Home");
    JButton btngaji = new JButton("Gaji");
    JButton btndata = new JButton("Data");
    JButton btnpetunjuk = new JButton("Petunjuk");
    JButton btnadmin = new JButton("Admin");
    JButton btnhitung = new JButton("Hitung");
    JButton btnsimpan = new JButton("Simpan");

    public gaji(){
        setTitle("Gaji Pegawai");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(650, 450);
        setVisible(true);
        setLayout(null);

        add(lid);
        lid.setBounds(150, 30, 100,20);
        add(lnama);
        lnama.setBounds(150, 60, 100,20);
        add(lposisi);
        lposisi.setBounds(150, 90, 100,20);
        add(lalamat);
        lalamat.setBounds(150, 120, 100,20);
        add(lnohp);
        lnohp.setBounds(150, 150, 100,20);
        add(lgajipokok);
        lgajipokok.setBounds(150, 180, 100,20);
        add(llembur);
        llembur.setBounds(150, 210, 100,20);
        add(ltunjangan);
        ltunjangan.setBounds(150, 240, 100,20);
        add(lpajak);
        lpajak.setBounds(150, 270, 100,20);
        add(ltotal);
        ltotal.setBounds(150, 300, 100,20);
        add(tfid);
        tfid.setBounds(250, 30, 250,20);
        add(tfnama);
        tfnama.setBounds(250, 60, 250,20);
        add(cmbposisi);
        cmbposisi.setBounds(250, 90, 250,20);
        add(tfalamat);
        tfalamat.setBounds(250, 120, 250,20);
        add(tfnohp);
        tfnohp.setBounds(250, 150, 250,20);
        add(tfgajipokok);
        tfgajipokok.setBounds(250, 180, 250,20);
        add(tflembur);
        tflembur.setBounds(250, 210, 250,20);
        add(tftunjangan);
        tftunjangan.setBounds(250, 240, 250,20);
        add(tfpajak);
        tfpajak.setBounds(250, 270, 250,20);
        add(tftotal);
        tftotal.setBounds(250, 300, 250,20);
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
        add(btnhitung);
        btnhitung.setBounds(520, 300, 100,30);
        add(btnsimpan);
        btnsimpan.setBounds(520, 350, 100,30);
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

        btnhitung.addActionListener((ActionEvent e) -> {
            if (tfgajipokok.getText().equals("") ) {
                JOptionPane.showMessageDialog(null, "Field tidak boleh kosong");
            } else {
                long Gajipokok, Jamlembur, Tunjangan, Pajak, Total;
                Gajipokok = Long.valueOf(tfgajipokok.getText());
                Jamlembur = Long.valueOf(tflembur.getText());
                Tunjangan = Jamlembur*1500;
                Pajak = Gajipokok/100;
                Total = Gajipokok+Tunjangan-Pajak;
                tfpajak.setText("Rp. "+String.valueOf(Pajak));
                tftunjangan.setText("Rp. "+String.valueOf(Tunjangan));
                tftotal.setText("Rp. "+String.valueOf(Total));
            }});
        btnsimpan.addActionListener((ActionEvent e) -> {
            if (tfgajipokok.getText().equals("") ) {
                JOptionPane.showMessageDialog(null, "Field tidak boleh kosong");
            } else {
                long Gajipokok, Jamlembur, Tunjangan, Pajak, Total;
                Gajipokok = Long.valueOf(tfgajipokok.getText());
                Jamlembur = Long.valueOf(tflembur.getText());
                Tunjangan = Jamlembur*1500;
                Pajak = Gajipokok/100;
                Total = Gajipokok+Tunjangan-Pajak;
                tfpajak.setText("Rp. "+String.valueOf(Pajak));
                tftunjangan.setText("Rp. "+String.valueOf(Tunjangan));
                tftotal.setText("Rp. "+String.valueOf(Total));
                String Idkaryawan = tfid.getText();
                String Nama = tfnama.getText();
                String Posisi = (String) cmbposisi.getSelectedItem();
                String Alamat = tfalamat.getText();
                String Nohp = tfnohp.getText();
                this.insertGajik(Idkaryawan, Nama, Posisi, Alamat, Nohp, Gajipokok, Jamlembur, Tunjangan, Pajak, Total);
            }});
    }
    int getBanyakData() {
        int jmlData = 0;
        try{
            statement = koneksi.createStatement();
            String query = "SELECT * from `gajik`";
            ResultSet resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                jmlData++;
            }
            return jmlData;
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL error");
            return 0;
        }
    }

    String[][] readGajik() {
        try{
            int jmlData = 0;
            String data[][]=new String[getBanyakData()][10];
            String query = "Select * from `gajik`";
            ResultSet resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                data[jmlData][0] = resultSet.getString("Idkaryawan");
                data[jmlData][1] = resultSet.getString("Nama");
                data[jmlData][2] = resultSet.getString("Posisi");
                data[jmlData][3] = resultSet.getString("Alamat");
                data[jmlData][4] = resultSet.getString("Nohp");
                data[jmlData][5] = resultSet.getString("Gajipokok");
                data[jmlData][6] = resultSet.getString("Jamlembur");
                data[jmlData][7] = resultSet.getString("Tunjangan");
                data[jmlData][8] = resultSet.getString("Pajak");
                data[jmlData][9] = resultSet.getString("Total");
                jmlData++;
            }
            return data;
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL error");
            return null;
        }
    }
    public void insertGajik (String Idkaryawan, String Nama, String Posisi, String Alamat, String Nohp, long Gajipokok, long Jamlembur, long Tunjangan, long Pajak, long Total) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            koneksi = DriverManager.getConnection(DBurl, DBusername, DBpassword);
            String query = "INSERT INTO gajik VALUES ('"+Idkaryawan+"','"+Nama+"','"+Posisi+"','"+Alamat+"','"+Nohp+"', '"+Gajipokok+"','"+Jamlembur+"','"+Tunjangan+"','"+Pajak+"','"+Total+"')";
            statement = koneksi.createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null,"Data berhasil disimpan!");
            statement.close();
            koneksi.close();
        }catch(Exception sql){
            JOptionPane.showMessageDialog(null, "Data gagal disimpan!");
        }

    }
}

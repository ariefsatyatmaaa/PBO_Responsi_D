package responsi;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class admin extends JFrame {
    JLabel username = new JLabel("Username");
    JLabel password = new JLabel("Password");
    JTextField user = new JTextField(20);
    JPasswordField pass = new JPasswordField(20);
    JButton login = new JButton("Login");
    JButton back = new JButton("Back");

    public admin(){
        setTitle("Login Admin");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(650, 450);
        setVisible(true);
        setLayout(null);

        add(username);
        username.setBounds(175, 150, 100,20);
        add(user);
        user.setBounds(250, 150, 100,20);
        add(password);
        password.setBounds(175, 200, 100,20);
        add(pass);
        pass.setBounds(250, 200, 100,20);
        add(login);
        login.setBounds(175, 250, 100,20);
        add(back);
        back.setBounds(325, 250, 100,20);

        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username, password;
                username = user.getText();
                password = pass.getText();
                if (username.length() == 0 && password.length() == 0) {
                    JOptionPane.showMessageDialog(null, "Username/Password tidak boleh kosong!");
                }
                else if (username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin") ){
                    new admin1();
                    dispose();
                }
                else
                    JOptionPane.showMessageDialog(null, "Username/Password anda salah!");
            }
        });

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new tampilan();
                dispose();
            }
        });
    }
}

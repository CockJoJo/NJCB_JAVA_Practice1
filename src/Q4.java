import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;
import com.sun.xml.internal.messaging.saaj.soap.JpegDataContentHandler;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Q4 {

    private JFrame jFrame = new JFrame("注册");
    private Container panel = jFrame.getContentPane();
    private JLabel userLabel = new JLabel("用户名");
    private JTextField usernameText = new JTextField();
    private JLabel pwdLabel = new JLabel("密码");
    private JPasswordField passwordField = new JPasswordField();
    private JLabel pwdLabelConfirm = new JLabel("确认密码");
    private JPasswordField passwordFieldConfirm = new JPasswordField();
    private JButton loginBtn = new JButton("确定");
    private JButton cancelBtn = new JButton("取消");

    public Q4() {
        jFrame.setBounds(600, 200,300,280);
        panel.setLayout(new BorderLayout());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        placeComponents();
        jFrame.setVisible(true);
        listener();
    }

    private void placeComponents(){

        JPanel titlePanel = new JPanel();
        titlePanel.setLayout(new FlowLayout());
        titlePanel.add(new JLabel("习题4"));
        panel.add(titlePanel,"North");

        JPanel fieldPanel = new JPanel();
        fieldPanel.setLayout(null);
        userLabel.setBounds(20,20,50,20);
        pwdLabel.setBounds(20,60,50,20);
        pwdLabelConfirm.setBounds(20,100,50,20);
        pwdLabelConfirm.setSize(80,20);

        fieldPanel.add(userLabel);
        fieldPanel.add(pwdLabel);
        fieldPanel.add(pwdLabelConfirm);
        usernameText.setBounds(110,20,120,20);
        passwordField.setBounds(110,60,120,20);
        passwordFieldConfirm.setBounds(110,100,120,20);
        fieldPanel.add(usernameText);
        fieldPanel.add(passwordField);
        fieldPanel.add(passwordFieldConfirm);
        panel.add(fieldPanel,"Center");

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.add(loginBtn);
        buttonPanel.add(cancelBtn);
        panel.add(buttonPanel,"South");
    }

    public void listener(){
        loginBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameText.getText();
                String pwd = String.valueOf(passwordField.getPassword());
                String pwdConfirm = String.valueOf(passwordFieldConfirm.getPassword());
                if (username.length()<=2){
                    JOptionPane.showMessageDialog(null,"用户名需要超过2位字符","出错",JOptionPane.ERROR_MESSAGE);
                    usernameText.setText("");
                }else if (pwd.length()<=5){
                    JOptionPane.showMessageDialog(null,"密码需要超过5位字符","出错",JOptionPane.ERROR_MESSAGE);
                    usernameText.setText("");
                    passwordField.setText("");
                    passwordFieldConfirm.setText("");
                }else if (!pwdConfirm.equals(pwd)){
                    JOptionPane.showMessageDialog(null,"两次输入密码需要一致，请重新输入！","出错",JOptionPane.ERROR_MESSAGE);
                    passwordField.setText("");
                    passwordFieldConfirm.setText("");
                }else {
                    JOptionPane.showMessageDialog(null,"用户注册成功","成功",JOptionPane.INFORMATION_MESSAGE);
                    System.out.println(username + " "+ pwd);
                }
                System.out.println(username + " "+ pwd);
            }
        });

        cancelBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                usernameText.setText("");
                passwordField.setText("");
                passwordFieldConfirm.setText("");
            }
        });
    }

    public static void main(String[] args) {
        new Q4();
    }
}



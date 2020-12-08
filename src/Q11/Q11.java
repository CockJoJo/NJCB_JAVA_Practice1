package Q11;

import javax.swing.JFrame;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Q11 extends JFrame {
    public static void main(String[] args) {
        new Q11("testButton");
    }
    public Q11(String s) {
        super(s);
        Button closeButton = new Button();
        closeButton.setBounds(50, 20, 60, 20);
        closeButton.setLabel("press me!");
        closeButton.addActionListener(new closeAction() {
        });
        this.setLayout(null);
        this.add(closeButton);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(400, 300, 200, 100);
        this.setVisible(true);
    }
    class closeAction implements ActionListener { // closeButton按钮的关闭监听
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }
}
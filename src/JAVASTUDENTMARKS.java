import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JAVASTUDENTMARKS {
    private JButton CALButton;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JTextField textField8;
    private JPanel Main;

    public static void main(String[] args) {
        JFrame frame = new JFrame("JAVASTUDENTMARKS");
        frame.setContentPane(new JAVASTUDENTMARKS().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public JAVASTUDENTMARKS() {
    CALButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            int n1,n2,n3,total;
            double avg;

            n1=Integer.parseInt(textField3.getText());
            n2=Integer.parseInt(textField4.getText());
            n3=Integer.parseInt(textField5.getText());

            total=n1+n2+n3;

            textField6.setText(String.valueOf(total));

            avg=total/3;
            textField7.setText(String.valueOf(avg));

            if(avg>50){
                textField8.setText("pass");
            }
            else{
                textField8.setText("fails");
            }


        }
    });
}
}

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import javax.swing.*;

public class Receiver {
    private JFrame gui = new JFrame("Receiver");
    private JTextArea messageBox = new JTextArea(8, 60);
    private JTextField senderAddress = new JTextField(40);
    private JTextField senderPort = new JTextField(40);
    private JTextField receiverPort = new JTextField(40);
    private JTextField fileName = new JTextField(40);
    private JCheckBox unreliable = new JCheckBox();

    private Receiver() {
        JButton transferBtn = new JButton("TRANSFER");
        JPanel emptyPanel = new JPanel();
        gui.setLayout(new GridLayout(2,1));
        messageBox.setEditable(false);
        messageBox.setLineWrap(true);
        JScrollPane scroll = new JScrollPane (messageBox,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);


        JPanel panelA = new JPanel();
        panelA.setLayout(new GridLayout(1,2,10,10));
        JPanel panelB = new JPanel();
        panelB.setLayout(new GridLayout(1,2,10,10));
        JPanel panelC = new JPanel();
        panelC.setLayout(new GridLayout(1,2,10,10));
        JPanel panelD = new JPanel();
        panelD.setLayout(new GridLayout(1,2,10,10));
        JPanel panelE = new JPanel();
        panelE.setLayout(new GridLayout(1,2,10,10));
        JPanel panelF = new JPanel();
        panelF.setLayout(new GridLayout(1,2,10,10));
        JPanel panelG = new JPanel();
        panelG.setLayout(new GridLayout(1,2,10,10));

        panelA.add(new JLabel("Sender Address:"));
        panelA.add(senderAddress);
        panelB.add(new JLabel("Sender Port:"));
        panelB.add(senderPort);
        panelC.add(new JLabel("Receiver Port:"));
        panelC.add(receiverPort);
        panelD.add(new JLabel("File Name:"));
        panelD.add(fileName);
        panelE.add(new JLabel());
        panelE.add(transferBtn);
        panelF.add(new JLabel("Unreliable:"));
        panelF.add(unreliable);
        panelG.add(new JLabel("Current number of received in-order packets"));

        JPanel full = new JPanel();
        full.setLayout(new GridLayout(8,2));

        full.add(panelA);
        full.add(panelB);
        full.add(panelC);
        full.add(panelD);
        full.add(panelE);
        full.add(panelF);
        full.add(emptyPanel);
        full.add(panelG);

        gui.getContentPane().add(full);
        gui.getContentPane().add(scroll);

        transferBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                messageBox.append("Hello World\n");
            }
        });

    }

    public static void main(String[] args){
        Receiver receiver = new Receiver();
        receiver.gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        receiver.gui.setSize(400,400);
        receiver.gui.setVisible(true);
    }
}
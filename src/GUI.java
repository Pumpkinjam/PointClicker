import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {

    PlayerInfo currentPlayer;

    JButton btn_getPoint;
    JPanel buttonPanel;
    JLabel lbl_showPoint;

    GUI() {
        currentPlayer = new PlayerInfo();

        setLayout(null);

        // Button and Panel for that
        btn_getPoint = new JButton("Click!");
        btn_getPoint.setSize(500, 500);
        btn_getPoint.addActionListener(e -> {
            currentPlayer.click();
            refresh();
        });

        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1,1));
        buttonPanel.setBounds(390,90,500,500);
        buttonPanel.add(btn_getPoint);

        // text label for showing points
        lbl_showPoint = new JLabel("Point : 0");
        lbl_showPoint.setPreferredSize(new Dimension(900, 50));
        lbl_showPoint.setFont(new Font("Serif", Font.PLAIN, 28));
        lbl_showPoint.setBounds(0, 0, 900, 50);

        add(lbl_showPoint);
        add(buttonPanel);

        setSize(1280,720);
        setTitle("PointClicker");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void refresh() {
        lbl_showPoint.setText("Point : " + currentPlayer.getPoints());
    }
}

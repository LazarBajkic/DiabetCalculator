import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CarbsPick extends JFrame implements ActionListener{
    
    String[] carbTypes={"Potatoes","Bread","Rice"};
    JComboBox typeOfCarb=new JComboBox(carbTypes);
    JLabel per100Grams=new JLabel();
    JLabel perPortion=new JLabel();
    JLabel valueOfType=new JLabel();

    CarbsPick(){

        this.setSize(250,500);
        this.setLayout(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);

        typeOfCarb.setSize(100,25);
        typeOfCarb.setLocation(50, 50);
        typeOfCarb.setSelectedIndex(0);
        typeOfCarb.addActionListener(this);

        per100Grams.setSize(150, 30);
        per100Grams.setLocation(50,40);
        per100Grams.setText("Value per 100g: ");
        per100Grams.setFont(new Font("Tahoma",Font.BOLD,12));

        valueOfType.setSize(150,30);
        valueOfType.setLocation(50,100);
        valueOfType.setText("Value per 100g: ");
        valueOfType.setFont(new Font("Tahoma",Font.BOLD,12));

        perPortion.setSize(150, 30);
        perPortion.setLocation(50,150);
        perPortion.setText("Value per portion: ");
        perPortion.setFont(new Font("Tahoma",Font.BOLD,12));

        this.add(typeOfCarb);
        this.add(per100Grams);
        this.add(valueOfType);
        this.add(perPortion);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
       JComboBox cb=(JComboBox)e.getSource();
       String carbType=(String)cb.getSelectedItem();
       if(carbType.equals("Bread")){
        valueOfType.setText("50g");
       }
    }
}

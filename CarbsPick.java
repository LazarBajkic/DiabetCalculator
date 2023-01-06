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

    CarbsPick(){

        this.setSize(500,500);
        this.setLayout(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);

        typeOfCarb.setSize(100,25);
        typeOfCarb.setLocation(200, 75);
        typeOfCarb.setSelectedIndex(0);
        typeOfCarb.addActionListener(this);

        per100Grams.setSize(400,30);
        per100Grams.setLocation(50,150);
        per100Grams.setFont(new Font("Tahoma",Font.BOLD,12));

        perPortion.setSize(400, 30);
        perPortion.setLocation(50,200);
        perPortion.setFont(new Font("Tahoma",Font.BOLD,12));
        
        this.add(typeOfCarb);
        this.add(per100Grams);
        this.add(perPortion);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
       JComboBox cb=(JComboBox)e.getSource();

       String carbType=(String)cb.getSelectedItem();

       if(carbType.equals("Potatoes")){
            perPortion.setText("Per portion: 10g");
            per100Grams.setText("Per 100g: 17g");

       }    else if(carbType.equals("Rice")){
                perPortion.setText("Per prtion: 10g");
                per100Grams.setText("Per 100g: 100g");

       }    else if(carbType.equals("Bread")){
            perPortion.setText("Per portion White/Wholemeal/Rye/Granary: 15g/15g/16g/15g");
            per100Grams.setText("Per 100g White/Wholemeal/Rye/Granary: 50g/42g/46g/46g");
        }

    }
}


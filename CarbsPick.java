import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CarbsPick extends JFrame implements ActionListener{
    
    String[] carbTypes={"Potatoes","Bread","Rice"};
    String[] breadTypes={"White","Wholemeal","Rye","Granary"};
    JComboBox typeOfCarb=new JComboBox(carbTypes);
    JComboBox typeOfBread=new JComboBox(breadTypes);
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

        typeOfBread.setSize(100,25);
        typeOfBread.setLocation(50, 90);
        typeOfBread.setSelectedIndex(0);
        typeOfBread.setVisible(false);
        typeOfBread.addActionListener(this);

        per100Grams.setSize(150, 30);
        per100Grams.setLocation(50,170);
        per100Grams.setFont(new Font("Tahoma",Font.BOLD,12));

        valueOfType.setSize(150,30);
        valueOfType.setLocation(50,150);
        valueOfType.setFont(new Font("Tahoma",Font.BOLD,12));

        perPortion.setSize(150, 30);
        perPortion.setLocation(50,200);
        perPortion.setFont(new Font("Tahoma",Font.BOLD,12));

        this.add(typeOfCarb);
        this.add(typeOfBread);
        this.add(per100Grams);
        this.add(valueOfType);
        this.add(perPortion);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
       JComboBox cb=(JComboBox)e.getSource();
       JComboBox cb2=(JComboBox)e.getSource();
       String carbType=(String)cb.getSelectedItem();
       String breadType=(String)cb2.getSelectedItem();
       
       if(carbType.equals("Potatoes")){
            perPortion.setText("Per portion: 10g");
            valueOfType.setText("Per 100g: 17g");
            typeOfBread.setVisible(false);

       }    else if(carbType.equals("Rice")){
                perPortion.setText("Per prtion: 10g");
                valueOfType.setText("Per 100g: 100g");
                typeOfBread.setVisible(false);


       } else if(carbType.equals("Bread")){
        
        if(breadType.equals("White")){
            perPortion.setText("15g");
            valueOfType.setText("50g");
        }
            else if(breadType.equals("Wholemeal")){
                perPortion.setText("15g");
                valueOfType.setText("42g");
        }
            else if(breadType.equals("Rye")){
                perPortion.setText("16g");
                valueOfType.setText("46g");
        }
        else if(breadType.equals("Granary")){
                perPortion.setText("15g");
                valueOfType.setText("46g");
        }
        typeOfBread.setVisible(true);
    }
}
}

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MeatPick extends JFrame implements ActionListener{
    
    String [] meatType={"Chicken","Beef","Fish"};
    JComboBox typeOfMeat=new JComboBox(meatType);
    JLabel per100g=new JLabel();
    JLabel meatStats=new JLabel();
    JLabel yourChoice=new JLabel();
    JButton confirm=new JButton("Confirm");

    MeatPick(){
        this.setSize(250,500);
        this.setVisible(true);
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);

        typeOfMeat.setSize(100,30);
        typeOfMeat.setLocation(70,50);
        typeOfMeat.addActionListener(this);
        typeOfMeat.setSelectedIndex(0);
        typeOfMeat.setSelectedItem(0);

        per100g.setSize(150,150);
        per100g.setFont(new Font("Tahoma",Font.BOLD,12));
        per100g.setLocation(10, 100);

        meatStats.setSize(150,150);
        meatStats.setLocation(10,250);
        meatStats.setFont(new Font("Tahoma",Font.BOLD,12));

        yourChoice.setSize(250, 150);
        yourChoice.setLocation(10,365);
        yourChoice.setFont(new Font("Tahoma",Font.BOLD,12));

        confirm.setSize(100, 25);
        confirm.setLocation(70,20);
        confirm.setFont(new Font("Tahoma",Font.BOLD,12));
        confirm.addActionListener(this);
        confirm.setFocusable(false);

        this.add(typeOfMeat);
        this.add(per100g);
        this.add(confirm);
        this.add(yourChoice);
        this.add(meatStats);
    }

    

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource()==confirm){
            FoodCategoryPick FCP=new FoodCategoryPick();
        }
        
        JComboBox cb=(JComboBox)e.getSource();
        String meatType=(String)cb.getSelectedItem();
        
        switch(meatType){
            
            case "Chicken":
            per100g.setText("<html>Per 100g:<br>Calories:  220<br>Fats: 13g<br>Cholesterol: 94mg<br>Sodium: 71mg<br>Potassium: 204mg<br>Carbs: 0.1g<br>Fiber: 0g<br>Protein: 24g</html>");
            meatStats.setText("<html>Vitamins:<br>Iron: 8.9%<br>Vitamin A: 12%<br>Vitamin C: 0.7%<br>Calcium: 1%</html>");
            yourChoice.setText("You chose: Chicken");
            break;

            case "Beef": 
            per100g.setText("<html>Per 100g:<br>Calories:  220<br>Fats: 14g<br>Cholesterol: 74mg<br>Sodium: 43mg<br>Potassium: 230mg<br>Carbs: 0g<br>Fiber: 0g<br>Sugars: 0g<br>Protein: 22g</html>");
            meatStats.setText("<html>Vitamins:<br>Iron: 10%<br>Vitamin A: 0.2%<br>Vitamin C: 0%<br>Calcium: 0.8%</html>");
            yourChoice.setText("You chose: Beef");
            break;
            
            case "Fish":
            per100g.setText("<html>Per 100g:<br>Calories:  218<br>Fats: 4.5g<br>Cholesterol: 97mg<br>Sodium: 95mg<br>Potassium: 646mg<br>Carbs: 0g<br>Fiber: 0g<br>Sugars: 0g<br>Protein: 44g</html>");
            meatStats.setText("<html>Vitamins:<br>Iron: 6.5%<br>Vitamin A: 0%<br>Vitamin C: 0%<br>Calcium: 1.8%</html>");
            yourChoice.setText("You chose: Fish");
            break;
        }


        FinalizationAndCalculation obj=new FinalizationAndCalculation();
        String pick=yourChoice.getText();
        obj.myUpdateMeat(pick);
        obj.setVisible(true);
        obj.dispose();
    }
    
    public String ReturnMeat(){
        return yourChoice.getText();
    }
}

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SugarsPick extends JFrame implements ActionListener {
    
    String[] sugarType={"Cake","Chocolate","Ice cream"};
    JLabel per100g=new JLabel();
    JLabel sugarInfo=new JLabel();
    JComboBox typeOfSugar=new JComboBox(sugarType);

    SugarsPick(){
        this.setSize(250,500);
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(false);

        typeOfSugar.setSize(100,30);
        typeOfSugar.setSelectedIndex(0);
        typeOfSugar.setLocation(70, 50);
        typeOfSugar.addActionListener(this);

        per100g.setSize(150,150);
        per100g.setLocation(10,100);
        per100g.setFont(new Font("Tahoma",Font.BOLD,12));

        sugarInfo.setSize(150, 150);
        sugarInfo.setLocation(10,300);
        sugarInfo.setFont(new Font("Tahoma",Font.BOLD,12));

        this.add(typeOfSugar);
        this.add(sugarInfo);
        this.add(per100g);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        JComboBox cb=(JComboBox)e.getSource();
        String sugarType=(String)cb.getSelectedItem();
        switch(sugarType){
            case "Cake":
            per100g.setText("<html>Per 100g: <br> Fat: 18g<br>Cholesterol: 75mg<br>Sodium: 269mg<br>Potassium: 53mg<br>Carbs: 56g<br>Fiber: 0.3g<br>Sugars: 42g<br>Protein: 3g</html>");
            sugarInfo.setText("<html>Vitamins:<br>Iron: 5.9%<br>Vitamin A: 2.2%<br>Vitamin C: 0%<br>Calcium: 4.8%</html>");
            break;
            case "Chocolate":
            per100g.setText("<html>Per 100g: <br> Fat: 30g<br>Cholesterol: 23mg<br>Sodium: 79mg<br>Carbs: 59g<br>Fiber: 3.4g<br>Sugars: 52g<br>Protein: 7.7g<br>Caffein: 20mg</html>");
            sugarInfo.setText("N/A");
            break;
            case "Ice cream":
            per100g.setText("<html>Per 100g: <br> Fat: 11g<br>Cholesterol: 44mg<br>Sodium: 80mg<br>Potassium: 199mg<br>Carbs: 24g<br>Fiber: 0.7g<br>Sugars: 21g<br>Protein: 3.5g</html>");
            sugarInfo.setText("<html>Vitamins:<br>Iron: 0.5%<br>Vitamin A: 8.4%<br>Vitamin C: 1%<br>Calcium: 9.8%</html>");
            break;
        }
        
    }   
}

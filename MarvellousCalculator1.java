import java.awt.event.*;
import javax.swing.*;

class Calculater extends WindowAdapter implements ActionListener
{
    public JFrame mainframe;
    public JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0,bAdd, bSub, bMult,bDiv,bEqual,bclear;
    public JTextField T1;
    Integer no1;

    public Calculater(int height, int width, String Title)
    {
        mainframe = new JFrame(Title);
        mainframe.setSize(width,height);
        mainframe.addWindowListener(this);

        b0 = new JButton("0");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        bAdd = new JButton("+");
        bSub = new JButton("-");
        bMult = new JButton("*");
        bDiv = new JButton("/");
        bEqual = new JButton("=");
        bclear =new JButton("C");

        T1 =new JTextField();
        T1.setBounds(0,0,270,70);
        mainframe.add(T1);

        b7.setBounds(0,70,50,40);
        b8.setBounds(50,70,50,40);
        b9.setBounds(100,70,50,40);
        bAdd.setBounds(150,70,50,40);

        b4.setBounds(0,110,50,40);
        b5.setBounds(50,110,50,40);
        b6.setBounds(100,110,50,40);
        bSub.setBounds(150,110,50,40);

        b1.setBounds(0,150,50,40);
        b2.setBounds(50,150,50,40);
        b3.setBounds(100,150,50,40);
        bMult.setBounds(150,150,50,40);

        b0.setBounds(0,190,50,40);
        bEqual.setBounds(50,190,50,40);
        bclear.setBounds(100,190,50,40);
        bDiv.setBounds(150,190,50,40);

        mainframe.add(b7);
        mainframe.add(b8);
        mainframe.add(b9);
        mainframe.add(bAdd);
        mainframe.add(b4);
        mainframe.add(b5);
        mainframe.add(b6);
        mainframe.add(bSub);
        mainframe.add(b1);
        mainframe.add(b2);
        mainframe.add(b3);
        mainframe.add(bMult);
        mainframe.add(b0);
        mainframe.add(bEqual);
        mainframe.add(bclear);
        mainframe.add(bDiv);

        mainframe.setLayout(null);
        mainframe.setVisible(true);

        b1.addActionListener(this); 
        b2.addActionListener(this); 
        b3.addActionListener(this); 
        b4.addActionListener(this); 
        b5.addActionListener(this); 
        b6.addActionListener(this); 
        b7.addActionListener(this); 
        b8.addActionListener(this); 
        b9.addActionListener(this); 
        b0.addActionListener(this); 
        
        bAdd.addActionListener(this); 
        bSub.addActionListener(this); 
        bMult.addActionListener(this); 
        bDiv.addActionListener(this); 
        bEqual.addActionListener(this); 
        bclear.addActionListener(this); 
        
        

       
    }
    public void windowClosing(WindowEvent obj)
    {
        System.exit(0);
    }
    public void actionPerformed(ActionEvent obj)
    {
        try
        {
        no1 =Integer.parseInt(T1.getText());
        

        if(obj.getSource() == b1)
        {
            
        }
        else if(obj.getSource() == b2)
        {
            T1.setText(T1.getText()+"2");
        }
        else if(obj.getSource() == b3)
        {
            T1.setText(T1.getText()+"3");
        }
        else if(obj.getSource() == b4)
        {
            T1.setText(T1.getText()+"4");
        }
        else if(obj.getSource() == b5)
        {
            T1.setText(T1.getText()+"5");
        }
        else if(obj.getSource() == b6)
        {
            T1.setText(T1.getText()+"6");
        }
        else if(obj.getSource() == b7)
        {
            T1.setText(T1.getText()+"7");
        }
        else if(obj.getSource() == b8)
        {
            T1.setText(T1.getText()+"8");
        }
        else if(obj.getSource() == b9)
        {
            T1.setText(T1.getText()+"9");
        }
        else if(obj.getSource() == b0)
        {
            T1.setText(T1.getText()+"0");
        }
        else if(obj.getSource() == bclear)
        {
            T1.setText(" ");
        }
        else if(obj.getSource() == bAdd)
        {
            //no1= Integer.parseInt(T1.getText());
            T1.setText(T1.getText()+"+");
        }
        else if(obj.getSource() == bSub)
        {
            //no1= Integer.parseInt(T1.getText());
            T1.setText(T1.getText()+"-");
        }
        else if(obj.getSource() == bMult)
        {
            //no1= Integer.parseInt(T1.getText());
            T1.setText(T1.getText()+"*");
        }
        else if(obj.getSource() == bDiv)
        {
            //no1= Integer.parseInt(T1.getText());
            T1.setText(T1.getText()+"/");
        }
    

        }
        catch(Exception obj1)
        {

        }
    
    }


}

class MarvellousCalculator1
{
    public static void main(String arg[]) 
    {
        Calculater obj = new Calculater(270, 200, "Calculator");
    }
}
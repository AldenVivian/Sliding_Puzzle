
import java.awt.*; 
import javax.swing.*; 
import java.awt.event.*; 
import java.io.*;
class Puzzle extends JFrame implements ActionListener
    { 
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,next,score; 
    int moves = 0;
    boolean res = false;
    static String name = "";
    Puzzle()
    { 
        super("Puzzle Game"); 
        b1=new JButton("5"); 
        b2=new JButton("7"); 
        b3=new JButton("3"); 
        b4=new JButton("8"); 
        b5=new JButton("1"); 
        b6=new JButton("6"); 
        b7=new JButton("2"); 
        b8=new JButton(" "); 
        b9=new JButton("4"); 

        score = new JButton("SCOREBOARD");

        b1.setBounds(130,30,90,90); 
        b2.setBounds(240,30,90,90); 
        b3.setBounds(350,30,90,90); 
        b4.setBounds(130,140,90,90); 
        b5.setBounds(240,140,90,90);
        b6.setBounds(350,140,90,90); 
        b7.setBounds(130,250,90,90); 
        b8.setBounds(240,250,90,90); 
        b9.setBounds(350,250,90,90); 

        score.setBounds(210,400,150,40);

       

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);

        add(score);

        b1.addActionListener(this); 
        b2.addActionListener(this); 
        b3.addActionListener(this); 
        b4.addActionListener(this); 
        b5.addActionListener(this); 
        b6.addActionListener(this); 
        b7.addActionListener(this); 
        b8.addActionListener(this); 
        b9.addActionListener(this); 

        score.addActionListener(this);

        setSize(600,600); 
        setLayout(null); 
        setVisible(true); 

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    } 

    public void actionPerformed(ActionEvent e)
    { 

        if(e.getSource()==b1)
        { 
            moves++;
            String s=b1.getLabel();
            if(b1.getLabel().equals(" "))
            {
                moves--;
            }
            else if(b2.getLabel().equals(" "))
            {
                b2.setLabel(s);
                b1.setLabel(" ");              
            } 
            else if(b4.getLabel().equals(" "))
            {
                b4.setLabel(s);
                b1.setLabel(" ");               
            }

        }

        else if(e.getSource()==b3)
        {
            moves++;
            String s=b3.getLabel();
            if(b3.getLabel().equals(" "))
            {
                moves--;
            }
            else if(b2.getLabel().equals(" "))
            {
                b2.setLabel(s);
                b3.setLabel(" ");              
            } 
            else if(b6.getLabel().equals(" "))
            {
                b6.setLabel(s);
                b3.setLabel(" ");
            } 
        }

        else if(e.getSource()==b2)
        { 
            moves++;
            String s=b2.getLabel();
            if(b2.getLabel().equals(" "))
            {
                moves--;
            }
            else if(b1.getLabel().equals(" "))
            {
                b1.setLabel(s);
                b2.setLabel(" ");               
            } 
            else if(b3.getLabel().equals(" "))
            {
                b3.setLabel(s);
                b2.setLabel(" ");               
            } 
            else if(b5.getLabel().equals(" "))
            {
                b5.setLabel(s);
                b2.setLabel(" ");
            } 
        }
        else if(e.getSource()==b4)
        {
            moves++;
            String s=b4.getLabel();
            if(b4.getLabel().equals(" "))
            {
                moves--;
            }
            else if(b1.getLabel().equals(" "))
            {
                b1.setLabel(s);
                b4.setLabel(" ");
            } 
            else if(b7.getLabel().equals(" "))
            {
                b7.setLabel(s);
                b4.setLabel(" ");
            } 
            else if(b5.getLabel().equals(" "))
            {
                b5.setLabel(s);
                b4.setLabel(" ");
            } 
        }

        else if(e.getSource()==b5)
        { 
            moves++;
            String s=b5.getLabel();
            if(b5.getLabel().equals(" "))
            {
                moves--;
            }
            else if(b2.getLabel().equals(" "))
            {
                b2.setLabel(s);
                b5.setLabel(" ");
            } 
            else if(b4.getLabel().equals(" "))
            {
                b4.setLabel(s);
                b5.setLabel(" ");
            } 
            else if(b6.getLabel().equals(" "))
            {
                b6.setLabel(s);
                b5.setLabel(" ");
            } 
            else if(b8.getLabel().equals(" "))
            {
                b8.setLabel(s);
                b5.setLabel(" ");
            } 
        }

        else if(e.getSource()==b6)
        {
            moves++;
            String s=b6.getLabel();
            if(b6.getLabel().equals(" "))
            {
                moves--;
            }
            else if(b9.getLabel().equals(" "))
            {
                b9.setLabel(s);
                b6.setLabel(" ");
            } 
            else if(b3.getLabel().equals(" "))
            {
                b3.setLabel(s);
                b6.setLabel(" ");
            } 
            else if(b5.getLabel().equals(" "))
            {
                b5.setLabel(s);
                b6.setLabel(" ");
            } 

        }

        else if(e.getSource()==b7)
        {
            moves++;
            String s=b7.getLabel(); 
            if(b7.getLabel().equals(" "))
            {
                moves--;
            }
            else if(b4.getLabel().equals(" "))
            {
                b4.setLabel(s);
                b7.setLabel(" ");
            } 
            else if(b8.getLabel().equals(" "))
            {
                b8.setLabel(s);
                b7.setLabel(" ");
            } 

        }

        else if(e.getSource()==b8)
        { 
            moves++;
            String s=b8.getLabel();
            if(b8.getLabel().equals(" "))
            {
                moves--;
            }
            else if(b7.getLabel().equals(" "))
            {
                b7.setLabel(s);
                b8.setLabel(" ");
            } 
            else if(b9.getLabel().equals(" "))
            {
                b9.setLabel(s);
                b8.setLabel(" ");
            } 
            else if(b5.getLabel().equals(" "))
            {
                b5.setLabel(s);
                b8.setLabel(" ");
            } 

        }

        else if(e.getSource()==b9)
        {
            moves++;
            String s= b9.getLabel();
            if(b9.getLabel().equals(" "))
            {
                moves--;
            }
            else if(b6.getLabel().equals(" "))
            {
                b6.setLabel(s);
                b9.setLabel(" ");
            } 
            else if(b8.getLabel().equals(" "))
            {
                b8.setLabel(s);
                b9.setLabel(" ");
            } 

            if(b1.getLabel().equals("1")&&b2.getLabel().equals("2")&&b3.getLabel().equals("3")&&b4.getLabel().equals("4")&&b5.getLabel().equals("5")&&b6.getLabel().equals("6")&&b7.getLabel().equals("7")&&b8.getLabel().equals("8")&&b9.getLabel().equals(" "))
            {  
                JOptionPane.showMessageDialog(Puzzle.this,"Finished in "+moves+" moves");
                int reply = JOptionPane.showConfirmDialog(null,"Do You Want To Restart?","Restart_Option", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.YES_OPTION)
                {                   
                    moves = 0;
                    res = true;
                    b1.setLabel("5");
                    b2.setLabel("7");
                    b3.setLabel("3");
                    b4.setLabel("8");
                    b5.setLabel("1");                    
                    b6.setLabel("6");
                    b7.setLabel("2");
                    b8.setLabel(" ");
                    b9.setLabel("4");
                    run();
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Thanks For Playing");

                    try
                    {
                        String fileName = ("C:/test/puzzle.txt");               
                        FileWriter fw = new FileWriter(fileName,true);
                        BufferedWriter bw = new BufferedWriter(fw);
                        PrintWriter outFile = new PrintWriter(bw);
                        outFile.println(name+"--"+moves);
                        outFile.close();
                        moves = 0;
                    }
                    catch(Exception ex)
                    {
                        System.out.println(ex);
                    }
                    System.exit(0);
                }
            } 
        }
        if(e.getSource()==score)
        {
            try{
                JFrame cframe = new JFrame("SCOREBOARD");
                cframe.setVisible(true);
                cframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                cframe.setSize(350,350);
                cframe.setLayout(new FlowLayout());
                List list = new List();
                list.setSize(1000, 1000);
                cframe.add(list);
                File file = new File("C:/test/puzzle.txt");
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                String line = "     ";

                while((line = br.readLine()) != null)
                { 
                    list.add(line);
                }

                br.close();

            }catch(Exception ex){
                System.out.println(ex);
            }
        }

    }

    public static void main(String[] args)
    {         
        Puzzle o1 = new Puzzle();
        o1.run();
    }

    public void run()
    {
        if(res == false)
        {
            JOptionPane.showMessageDialog(null, "How To Play: \n -Click on the button near the empty space to switch places. \n -Objective of the game is to arrange the numbers in ascending order(going down). \n i.e \n 1 2 3 \n 4 5 6 \n 7 8 ");
            name = JOptionPane.showInputDialog("Player name: ");
            if(name == null)
            {
                System.exit(0);
            }
        }

       
    }

   
} 
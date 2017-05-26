

//SplashScreen-Image:img/splash.gif
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.io.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import javax.swing.ImageIcon;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author S.S. DHILLON 
 */
public class Bword1 extends javax.swing.JFrame {
    
   private static int choice_set,font_size=15,m;
   DataProcessing Dp= new DataProcessing();
   LanguageFilter LF=new LanguageFilter();
   String font;
   
    private Component frame;
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    String pathname="/home/pi/Desktop/Braille Document";

   // lis no of character permitted in visual line
// m setting margin
   // ml is the maximum no of lines in the page
    // exp represent exceptions , the complete action must get executed when the exception is null
    //  otherwise it must get restarted by user.
    // in the form of filling the missing entry and pressing the required button again.
   // choice_set checks for available choice from choice component and print it in single time
    
   //SplashScreen-Image:img/splash.gif
  public Bword1()
    {
        this.setExtendedState(Bword1.MAXIMIZED_BOTH);
        initComponents();        
        TFW1.setText("30"); 
        LW3.setText("New File");
       
        jTextPane1.setEditable(false);
        choice_fill();
        get_font();
        font_size();      
        
        //TAW1.setFont(new Font("Tahoma",Font.PLAIN,font_size)); 
       Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
              //img.setBounds(0,0,d.width,d.height);
        
        //setting image icon
        this.setIconImage( Toolkit.getDefaultToolkit().getImage(getClass().getResource("braille.png")) );
        //set size
       
    }
   
   
   void interrupt( )
   {
       try 
       {
    Thread.sleep(2000);                 
       }
       catch(InterruptedException ex) 
       {
    Thread.currentThread().interrupt();
       }
       
       
   }
   void ProgressBar()
   {   
       String file_name=LW3.getText();
       for(int i=0;i<100;i++)
   {
     
       jProgressBar2.setStringPainted(true);
            jProgressBar2.setValue(i);
            jProgressBar2.setBackground(Color.red);   
   }
       jProgressBar2.setString(file_name+": saved");
       
       
   }
   void TextFormat()
           //bold-3           //italic-2
   {
       font=(String)jComboBox1.getSelectedItem();
       String choice=choice2.getSelectedItem();
       font_size=Integer.parseInt(choice);
       
       if(jToggleButton3.isSelected()==true)
       {
           if(jToggleButton2.isSelected()==true)
           {
               
       TAW1.setFont(new Font(font,Font.BOLD+Font.ITALIC,font_size));
           }
           else if(jToggleButton2.isSelected()==false)
           {
             TAW1.setFont(new Font(font,Font.BOLD+Font.PLAIN,font_size));  
           }
       }
       
       
       if(jToggleButton3.isSelected()==false)
       {
           if(jToggleButton2.isSelected()==true)
           {
               
       TAW1.setFont(new Font(font,Font.PLAIN+Font.ITALIC,font_size));
           }
           else if(jToggleButton2.isSelected()==false)
           {
             TAW1.setFont(new Font(font,Font.PLAIN+Font.PLAIN,font_size));  
           }
       }
   }
   private void get_font()
   {
       GraphicsEnvironment gen = GraphicsEnvironment.getLocalGraphicsEnvironment();       
       String fonts[] = gen.getAvailableFontFamilyNames();
       
       jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(fonts)); 
   }
   
   private void font_size()
   {
       int min_size=18,max_size=80;
        String value1;
       for(int i=0;i<max_size;i++)
       {
         value1=Integer.toString(min_size);
           choice2.insert(value1,i);
           min_size++;
       }
   }
   
   
   private void choice_fill( )
   {  int value=Dp.min_choice;
        String value1;
       for(int i=0;i<(Dp.max_choice-Dp.min_choice);i++)
       {
         value1=Integer.toString(value);
           choice1.insert(value1,value);
           value++;
       }
           
   }
   private void BrailleInscriptor()
   {
       String s=TAW1.getText(),lol1; int lol;
        lol1=TFW1.getText();
        
        if(lol1.isEmpty())
        {           
            lol1="30";
        }
        
        lol=Integer.parseInt(lol1);
        s=Dp.Inscriptor(" "+s, lol);
        jTextPane1.setFont(new Font("Braille Normal",Font.BOLD+Font.PLAIN,15));
        jTextPane1.setText(s);
        
   }
    
    
    // seperation of text from string
    
 /* void NewFile()
  {
      if(LW3.getText().equals("New File"))
       {
        JFileChooser saver = new JFileChooser();
        //saver.setFileFilter(new Text_Filter());
        int returnVal = saver.showSaveDialog(this);
        File file = saver.getSelectedFile();
        BufferedWriter writer = null;
        if (returnVal == JFileChooser.APPROVE_OPTION)
        {
            try
            {
            writer = new BufferedWriter( new FileWriter( file.getName()+".txt"));
            writer.write( TAW1.getText());
            writer.close( );
            jProgressBar2.setString("Previous File Saved");
            
            }
            catch (IOException e)
            {
            JOptionPane.showMessageDialog(this, "The Text could not be Saved!",
						"Error!", JOptionPane.INFORMATION_MESSAGE);
            }
        }
       }
       else
       {
           JFileChooser saver = new JFileChooser("C:\\Program Files\\Documents");
        //saver.setFileFilter(new Text_Filter());        
        File file = saver.getSelectedFile();
        BufferedWriter writer = null;       
            try
            {
            writer = new BufferedWriter( new FileWriter( LW3.getText()+".txt"));
            writer.write( TAW1.getText());
            writer.close( );
           jProgressBar2.setString("Previous File Saved");
            }
            catch (IOException e)
            {
            JOptionPane.showMessageDialog(this, "The Text could not be Saved!",
						"Error!", JOptionPane.INFORMATION_MESSAGE);
            }
        
       }
  }
  */
    
   
  
  
  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenu1 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jPopupMenu3 = new javax.swing.JPopupMenu();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        TFW1 = new javax.swing.JTextField();
        jColorChooser1 = new javax.swing.JColorChooser();
        jMenuItem12 = new javax.swing.JMenuItem();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        LW3 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        choice1 = new java.awt.Choice();
        jProgressBar2 = new javax.swing.JProgressBar();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        choice2 = new java.awt.Choice();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        L = new javax.swing.JToggleButton();
        jLabel9 = new javax.swing.JLabel();
        C = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        R = new javax.swing.JToggleButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jLabel10 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jButton3 = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel13 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenu15 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu12 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        jMenu13 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenu3.setText("jMenu3");

        jMenu1.setText("jMenu1");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jMenuItem3.setText("jMenuItem3");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jMenu7.setText("File");
        jMenuBar2.add(jMenu7);

        jMenu8.setText("Edit");
        jMenuBar2.add(jMenu8);

        jMenu10.setText("jMenu10");

        jMenu11.setText("jMenu11");

        jRadioButtonMenuItem2.setSelected(true);
        jRadioButtonMenuItem2.setText("jRadioButtonMenuItem2");

        jMenuItem4.setText("jMenuItem4");

        jMenuItem5.setText("jMenuItem5");

        jMenuItem6.setText("jMenuItem6");

        jMenuItem11.setText("jMenuItem11");

        TFW1.setText("jTextField1");
        TFW1.setToolTipText(" Maximum number of characters in a line\n which will be self adjusted in preview page");
        TFW1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFW1ActionPerformed(evt);
            }
        });

        jMenuItem12.setText("jMenuItem12");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("                                                                                                                                                       Braille Word "); // NOI18N
        setMinimumSize(new java.awt.Dimension(800, 600));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel2.setText("Characters in line");
        jLabel2.setToolTipText(" Maximum number of characters in a line\n which will be self adjusted in preview page");
        jLabel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 0, 150, 20);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(2441, 0, 30, 762);

        LW3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        LW3.setText("jLabel3");
        LW3.setToolTipText("Current file name");
        LW3.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        getContentPane().add(LW3);
        LW3.setBounds(390, 40, 160, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel3.setText("File Name:");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(310, 40, 80, 20);

        choice1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                choice1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                choice1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                choice1MouseReleased(evt);
            }
        });
        choice1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                choice1MouseMoved(evt);
            }
        });
        getContentPane().add(choice1);
        choice1.setBounds(160, 0, 50, 30);

        jProgressBar2.setToolTipText("");
        jProgressBar2.setString("");
        jProgressBar2.setStringPainted(true);
        getContentPane().add(jProgressBar2);
        jProgressBar2.setBounds(300, 620, 170, 20);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel5.setText("Font");
        jLabel5.setToolTipText("Select the Font type");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(230, 0, 44, 20);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.setOpaque(false);
        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox1MouseClicked(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(270, 0, 150, 25);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(0, 36, 2481, 0);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel6.setText("Size");
        jLabel6.setToolTipText("Size of text");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(440, 0, 40, 20);

        choice2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                choice2MouseClicked(evt);
            }
        });
        getContentPane().add(choice2);
        choice2.setBounds(480, 0, 50, 30);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel7.setText("/");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(1859, 34, 13, 0);

        jLabel8.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel8MouseMoved(evt);
            }
        });
        getContentPane().add(jLabel8);
        jLabel8.setBounds(1266, 101, 35, 152);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(0, 656, 2023, 10);

        L.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        L.setForeground(new java.awt.Color(51, 0, 255));
        L.setText("L");
        L.setToolTipText("Aligns the text at left");
        L.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LActionPerformed(evt);
            }
        });
        getContentPane().add(L);
        L.setBounds(730, 0, 50, 30);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel9.setText("Align");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(682, 0, 50, 20);

        C.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        C.setForeground(new java.awt.Color(51, 0, 255));
        C.setText("C");
        C.setToolTipText("Aligns the text at center");
        C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CActionPerformed(evt);
            }
        });
        getContentPane().add(C);
        C.setBounds(776, 0, 50, 30);

        TAW1.setToolTipText("Write the text here");
        TAW1.setAutoscrolls(false);
        TAW1.setMargin(new java.awt.Insets(3, 100, 3, 120));
        TAW1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TAW1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TAW1MouseEntered(evt);
            }
        });
        TAW1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                TAW1MouseMoved(evt);
            }
        });
        TAW1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TAW1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TAW1KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(TAW1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(300, 70, 980, 540);

        R.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        R.setForeground(new java.awt.Color(51, 0, 255));
        R.setText("R");
        R.setToolTipText("Aligns the text at right");
        R.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RActionPerformed(evt);
            }
        });
        getContentPane().add(R);
        R.setBounds(823, 0, 50, 30);

        jToggleButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jToggleButton1.setForeground(new java.awt.Color(51, 102, 255));
        jToggleButton1.setText("Font Color");
        jToggleButton1.setToolTipText("Change the color of text");
        jToggleButton1.setBorder(null);
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1);
        jToggleButton1.setBounds(890, 0, 100, 30);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText(" Background");
        jButton1.setToolTipText("Change the background image");
        jButton1.setBorder(null);
        jButton1.setMinimumSize(new java.awt.Dimension(10, 10));
        jButton1.setName(""); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(1010, 0, 162, 30);

        jToggleButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jToggleButton3.setForeground(new java.awt.Color(51, 0, 255));
        jToggleButton3.setText("B");
        jToggleButton3.setToolTipText("Bold the text");
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton3);
        jToggleButton3.setBounds(560, 0, 50, 30);

        jToggleButton2.setBackground(new java.awt.Color(0, 0, 255));
        jToggleButton2.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jToggleButton2.setForeground(new java.awt.Color(0, 0, 255));
        jToggleButton2.setText("I");
        jToggleButton2.setToolTipText("Italic text");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton2);
        jToggleButton2.setBounds(620, 0, 50, 30);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel10.setText("Add Shapes");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(80, 80, 160, 30);

        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton1.setText("Line");
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(30, 170, 60, 22);

        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton2.setText("Rectangle");
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(30, 210, 100, 22);

        jRadioButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton3.setText("Triangle");
        getContentPane().add(jRadioButton3);
        jRadioButton3.setBounds(30, 250, 100, 22);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Shape");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 130, 60, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Shape Size");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(160, 130, 100, 17);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(180, 160, 50, 30);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(180, 200, 50, 30);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(180, 240, 50, 27);
        getContentPane().add(jSeparator4);
        jSeparator4.setBounds(0, 72, 290, 10);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("ADD");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(40, 300, 70, 29);
        getContentPane().add(jSeparator5);
        jSeparator5.setBounds(0, 110, 290, 10);
        getContentPane().add(jSeparator6);
        jSeparator6.setBounds(-10, 362, 320, 10);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(150, 300, 80, 29);
        getContentPane().add(jSeparator7);
        jSeparator7.setBounds(1270, 70, 100, 30);
        getContentPane().add(jSeparator8);
        jSeparator8.setBounds(0, 610, 1370, 10);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setText("Braille Inscription");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(60, 370, 190, 22);

        jScrollPane4.setViewportView(jTextPane1);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(10, 402, 270, 200);

        jLabel13.setForeground(new java.awt.Color(153, 153, 153));
        jLabel13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel13);
        jLabel13.setBounds(10, 110, 260, 250);

        jMenuBar1.add(jMenu6);

        jMenu15.setText("File");
        jMenu15.setToolTipText("Provides file option: Save, Save As, New and Open");
        jMenu15.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jMenu15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu15MouseClicked(evt);
            }
        });
        jMenu15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu15ActionPerformed(evt);
            }
        });

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem7.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jMenuItem7.setText("Save");
        jMenuItem7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem7MouseClicked(evt);
            }
        });
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu15.add(jMenuItem7);

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem8.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jMenuItem8.setText("Save As");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu15.add(jMenuItem8);

        jMenuItem10.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem10.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jMenuItem10.setText("New");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu15.add(jMenuItem10);

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem9.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jMenuItem9.setText("Open");
        jMenuItem9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem9MouseClicked(evt);
            }
        });
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu15.add(jMenuItem9);

        jMenuBar1.add(jMenu15);

        jMenu2.setText("Preview");
        jMenu2.setToolTipText("Shows Preview of print (Click for Printing)");
        jMenu2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu12.setText("Filter ");
        jMenu12.setToolTipText("");
        jMenu12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jMenuItem13.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem13.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jMenuItem13.setText("Braille Characters only");
        jMenuItem13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem13MouseClicked(evt);
            }
        });
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem13);

        jMenuItem14.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem14.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jMenuItem14.setText("Restore Text");
        jMenuItem14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem14MouseClicked(evt);
            }
        });
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem14);

        jMenuItem15.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem15.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jMenuItem15.setText("Skip Enter");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem15);

        jMenuItem16.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem16.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jMenuItem16.setText("Trim Text");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem16);
        jMenu12.add(jSeparator9);

        jMenuBar1.add(jMenu12);

        jMenu13.setText("Language Mapping");
        jMenu13.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jMenu13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu13MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu13);

        jMenu5.setText("Clear");
        jMenu5.setToolTipText("Clears the textarea(delete everything on page)");
        jMenu5.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu5);

        jMenu4.setText("Help?");
        jMenu4.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        getAccessibleContext().setAccessibleName("");

        setSize(new java.awt.Dimension(1370, 760));
    }// </editor-fold>//GEN-END:initComponents

    private void TFW1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFW1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFW1ActionPerformed

    private void jMenu15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu15MouseClicked
        // TODO add your handling code here:
         
    }//GEN-LAST:event_jMenu15MouseClicked

    private void jMenuItem9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem9MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenuItem9MouseClicked

    private void jMenuItem7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem7MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenuItem7MouseClicked

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
      String label=LW3.getText(),data=TAW1.getText();
        FileHandling Fd=new FileHandling();
        LW3.setText(Fd.SaveFile(label,data,pathname));
        ProgressBar();
        
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed

        // TODO add your handling code here:
       String label=LW3.getText(),data=TAW1.getText();
       FileHandling Fd=new FileHandling(); 
       data=data.trim();
       if(!data.isEmpty())
       {
        Fd.SaveFile(label, data,pathname);
        jProgressBar2.setString("Previous File Saved");
       }                   
      TAW1.setText(Fd.FileOpen(pathname));
      LW3.setText(Fd.FileName());
    jProgressBar2.setString(Fd.FileName());
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenu15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu15ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenu15ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
        FileHandling Fd=new FileHandling();  
        String label=LW3.getText(),data=TAW1.getText();
        Fd.NewFile(label,data,pathname);
       
        LW3.setText("New File");
         TAW1.setText("");
         ProgressBar();
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        // TODO add your handling code here:
         String s=TAW1.getText(),st="",sf="",s1="",s2,s3="",ssd="",lol1,sa;
       
        int lol,confirm=1,check=0,pg=1;
        
       Dp.exp=0;
        
       try{ 
           if(s.isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Please write the text");
        }
        
           lol1=TFW1.getText();
        
        if(lol1.isEmpty()&&!(s.isEmpty()))
        {
            TFW1.setText("");
            check++;
            confirm=JOptionPane.showConfirmDialog(null, "The default Characters in line is 30.\n Click yes to proceed ","Confirmation Dialog" ,confirm);
            
            lol1="30";
        }
        
        lol=Integer.parseInt(lol1);
        Dp.size=lol;
        
        // functionalities
       
        st=Dp.elate(s);// text seperation // space character is covering the first character form getting vanished in furhter processing      
        sf=Dp.elafe(s);  // figure seperation
        sa=Dp.TextAdjust(st);// adjusting lines virtually         
        s1=Dp.sort(sa,lol);//sorting text        
        ssd=s1+"\n"+sf; // adding figure and text        
        s2=Dp.space(ssd,lol); // space at empty strings   
                                              //JOptionPane.showMessageDialog(this,s2);
        s3=Dp.inverts(s2, lol);// text invertion 
                                               //JOptionPane.showMessageDialog(this,s3);       
        pg=Dp.pages(s3);// count pages
       
       
        
        
            
// s3 is to be sent for printing
      
        
       }
       
       catch(Exception e)
       { 
           if(!(s.isEmpty()))
               {        
                   JOptionPane.showMessageDialog(null,e);
           JOptionPane.showMessageDialog(null," Error in Printing.\n \n"
               + "Please confirm that characters in line is either empty or \n it must contain integers greater than 10 ");
               }
           Dp.exp++;
       }
       
       
     if(!(s.isEmpty())&& Dp.exp<1 )  
     {
         try
       { 
         if(check<1)
         {
        
       Bpreview bp=new Bpreview();
       Bpreview.TAP1.setText(ssd);
       Bpreview.TAP4.setText(s3);
       Bpreview.TAP1.setEditable(false);
       Bpreview.TFP1.setText(""+Dp.size);
       Bpreview.LP2.setText("Characters in Line :"+Dp.size);  
       Bpreview.LP3.setText("Pages:"+pg); 
       
       bp.setVisible(true);
         }
         else if(check==1&&confirm==0)
         {
             
       Bpreview bp=new Bpreview();
       Bpreview.TAP1.setText(s1);
       Bpreview.TAP4.setText(s3);       
       Bpreview.TFP1.setText(""+Dp.size);
       Bpreview.LP2.setText("Characters in Line :"+Dp.size);  
       Bpreview.LP3.setText("Pages:"+pg);
       
       
        bp.setVisible(true);
         }
                 
       }
       catch(Exception e){
         JOptionPane.showMessageDialog(null,"Please enter the 'Characters in line' in Braille Word window");
     }
     }
    }//GEN-LAST:event_jMenu2MouseClicked

    private void choice1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_choice1MouseClicked
        // TODO add your handling code here:
       
       String choice;        
        choice=choice1.getSelectedItem();
        choice_set=0;
        TFW1.setText(choice);
    }//GEN-LAST:event_choice1MouseClicked

    private void choice1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_choice1MousePressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_choice1MousePressed

    private void choice1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_choice1MouseReleased
        // TODO add your handling code here:
       
    }//GEN-LAST:event_choice1MouseReleased

    private void choice1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_choice1MouseMoved
        // TODO add your handling code here:
       if(choice_set==0) {
        String choice;        
        choice=choice1.getSelectedItem(); 
        TFW1.setText(choice);}
        
    }//GEN-LAST:event_choice1MouseMoved

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        String label=LW3.getText(),data=TAW1.getText();
        FileHandling Fd=new FileHandling();   
       
        LW3.setText(Fd.SaveAs(label, data,pathname));
        
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jComboBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseClicked
        // TODO add your handling code here:
        font=(String)jComboBox1.getSelectedItem();
       TAW1.setFont(new Font(font,Font.PLAIN,font_size));
    }//GEN-LAST:event_jComboBox1MouseClicked

    private void choice2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_choice2MouseClicked
      TextFormat();
      
// TODO add your handling code here:
    }//GEN-LAST:event_choice2MouseClicked

    private void jLabel8MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseMoved
        // TODO add your handling code here:
        TextFormat();
    }//GEN-LAST:event_jLabel8MouseMoved

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        // TODO add your handling code here:
        help hp=new help();
        hp.setVisible(true);
    }//GEN-LAST:event_jMenu4MouseClicked

    private void LActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LActionPerformed
        // TODO add your handling code here:
        StyledDocument doc =TAW1.getStyledDocument();
SimpleAttributeSet left = new SimpleAttributeSet();
StyleConstants.setAlignment(left, StyleConstants.ALIGN_LEFT);
doc.setParagraphAttributes(0, doc.getLength(),left, false);
C.setSelected(false);
R.setSelected(false);
    }//GEN-LAST:event_LActionPerformed

    private void CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CActionPerformed
        // TODO add your handling code here:
        StyledDocument doc =TAW1.getStyledDocument();
SimpleAttributeSet center = new SimpleAttributeSet();
StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
doc.setParagraphAttributes(0, doc.getLength(),center, false);
L.setSelected(false);
R.setSelected(false);
    }//GEN-LAST:event_CActionPerformed

    private void RActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RActionPerformed
        // TODO add your handling code here:
        StyledDocument doc =TAW1.getStyledDocument();
SimpleAttributeSet right = new SimpleAttributeSet();
StyleConstants.setAlignment(right, StyleConstants.ALIGN_RIGHT);
doc.setParagraphAttributes(0, doc.getLength(),right, false);
L.setSelected(false);
C.setSelected(false);
    }//GEN-LAST:event_RActionPerformed

    private void TAW1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TAW1MouseClicked
        // TODO add your handling code here:
        TextFormat();
        jProgressBar2.setValue(0);
        jProgressBar2.setString(LW3.getText());
    }//GEN-LAST:event_TAW1MouseClicked

    private void TAW1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TAW1MouseMoved
        // TODO add your handling code here:
        if(choice_set==0) {
        String choice;        
        choice=choice1.getSelectedItem(); 
        TFW1.setText(choice);}
    }//GEN-LAST:event_TAW1MouseMoved

    private void TAW1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TAW1KeyPressed
       
    }//GEN-LAST:event_TAW1KeyPressed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here
        Color c = JColorChooser.showDialog(frame,"Choose a color ", getBackground());
            TAW1.setForeground(c);
            jToggleButton1.setForeground(c);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void TAW1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TAW1MouseEntered
        // TODO add your handling code here:
        TextFormat();
        BrailleInscriptor();
    }//GEN-LAST:event_TAW1MouseEntered

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       /////////////////############    Content for setting background image.....
     JFileChooser chooser = new JFileChooser();
 
chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
 
// JFileChooserEx is the name of the JFrameForm/Java class
int res = chooser.showDialog(this,"Apply");
 
if (res == JFileChooser.APPROVE_OPTION) {
 
    File file = chooser.getSelectedFile();      
 
    // Creating ImageIcon out of the selected file
    ImageIcon image = new ImageIcon(file.getAbsolutePath());
    // Get width and height of picLabel
    //Rectangle rect = img.getBounds();
    // Scaling the Image to fit in the picLabel
    //Image scaledImage = image.getImage().getScaledInstance(rect.width, rect.height, Image.SCALE_DEFAULT);
    // Converting the image back to ImageIcon to make it acceptable by picLabel
    //image = new ImageIcon(scaledImage);      
  
    //img.setIcon(image);      
}

        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
        // TODO add your handling code here:
        int i=1;
        i=JOptionPane.showConfirmDialog(null," Are you sure you want to clear the text? \n It will delete all the text in page."," Confirmation Dialog", i);
        if(i==0){
        TAW1.setText("");
        jTextPane1.setText("");}
    }//GEN-LAST:event_jMenu5MouseClicked

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
        // TODO add your handling code here:
        TextFormat();
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        // TODO add your handling code here:
        TextFormat();
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        String label=LW3.getText(),data=TAW1.getText();
        FileHandling Fd=new FileHandling();
        Fd.WindowClosing(label, data,pathname);
    }//GEN-LAST:event_formWindowClosing

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        // TODO add your handling code here:
        TAW1.setText(LF.Filter((String)Bword1.jComboBox1.getSelectedItem(),TAW1.getText()));
        
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        // TODO add your handling code here:
        TAW1.setText(LF.RestoreData());
        TAW1.setText(Dp.RestoreData());
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem13MouseClicked
        
        
    }//GEN-LAST:event_jMenuItem13MouseClicked

    private void jMenuItem14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem14MouseClicked
      
    
    }//GEN-LAST:event_jMenuItem14MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String txt=Bword1.TAW1.getText();
        
        int exp=0,lol,cn=0,y=0;
        lol=Integer.parseInt(TFW1.getText());
        
           try
        {   
            if(exp<1)
        
        {
            //line
            if(jRadioButton1.isSelected()==true)
        {
            String  size=jTextField1.getText();
           
            int size1;
           size1=Integer.parseInt(size);
           if(size1>lol)
           {
               JOptionPane.showMessageDialog(null,"Size of line can't be more than Characters in line . \n"
                       + " Please decrease the size");
               cn++;
           }
           if(cn==0)
           {
               y++;
               if(y==1)
               {
                  // bw1.TAW1.append("\n Shapes~");
                   txt=txt+"\n Shapes$";
               }
               //bw1.TAW1.append("\n Line ~\n");
               txt=txt+"\n Line $\n";
               int i;
               
            for(i=0;i<size1;i++)
            {
                //bw1.TAW1.append("*");
                txt=txt+"$";
            }
           }
           
           
        }         
            //triangle
            if(jRadioButton3.isSelected()==true)
            {
              
                String  size=jTextField3.getText();
                
            
            int r,ki;
           r=Integer.parseInt(size);
           ki=r;
           r=r/2;
            if(ki>lol)
           {                                                                                                                                                
               JOptionPane.showMessageDialog(null,"Size of shape can't be more than Characters in line .\n"
                       + " Please decrease the size in Triangle ");
               cn++;
           }  
                
            if(cn==0)    {
                y++;
               if(y==1)
               {
                   //bw1.TAW1.append("\n Shapes~");
                   txt=txt+"\n Shapes$";
               }
               // bw1.TAW1.append("\n Triangle ~\n");
                txt=txt+"\n Triangle $\n";
                int i,l,m,n,k;
        
        for(i=0;i<=r+3;i++)
        {
            for(l=i;l<=r+3;l++)
            {
               // bw1.TAW1.append(" ");
                txt=txt+" ";
            }
  
            for(m=i;m<=2*i;m++)
            {
              //  bw1.TAW1.append("* ");
                txt=txt+"$ ";
            }
           // bw1.TAW1.append("\n");
            txt=txt+"\n";
        }
            
            
            
            for(k=1;k<=(r/3)+1;k++)
            {
            for(n=1;n<=(r*2/3)+2;n++)
            {
              // bw1.TAW1.append(" ");
                txt=txt+" ";
            }
                
            }
            }
             }
            
            // rectangle
            if(jRadioButton2.isSelected()==true)
            {
               
                String  size=jTextField2.getText();
            
            int size1;
            size1=Integer.parseInt(size);
            if(size1>lol)
           {
               JOptionPane.showMessageDialog(null,"Size of shape can't be more than Characters in line .\n"
                       + " Please decrease the size in Rectangle");
               cn++;
           }  
           if(cn==0) 
           { 
               y++;
               if(y==1)
               {
                   //bw1.TAW1.append("\n Shapes~");
                   txt=txt+"\\n Shapes$";
               }
              // bw1.TAW1.append("\n Rectangle ~\n");
               txt=txt+"\n Rectangle $\n";
            int i,j; 
            for( i=0;i<size1;i++)
            {
                for(j=0;j<size1;j++)
                {
                    //bw1.TAW1.append("*");
                    txt=txt+"$";
                }
               // bw1.TAW1.append("\n");
                txt=txt+"\n";
            }
           }       
            }
                   
            
           
             TAW1.setText(txt);
           
        }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Please enter a valid size (Natural Numbers only).\n Size cannot be left empty");
            exp++;
        }
         
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jRadioButton1.setSelected(false);
        jRadioButton2.setSelected(false);
        jRadioButton3.setSelected(false);
        
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        // TODO add your handling code here:
         BrailleInscriptor();      
        
    }//GEN-LAST:event_formMouseMoved

    private void TAW1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TAW1KeyReleased
 String s=TAW1.getText(),lol1; int lol;
        lol1=TFW1.getText();
        
        if(lol1.isEmpty())
        {           
            lol1="30";
        }
        
        lol=Integer.parseInt(lol1);
        s=Dp.Inscriptor(" "+s, lol);
        jTextPane1.setFont(new Font("Braille Normal",Font.BOLD+Font.PLAIN,15));
        jTextPane1.setText(s);
    }//GEN-LAST:event_TAW1KeyReleased

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        // TODO add your handling code here:
        
        String s=Dp.SkipEnter(TAW1.getText());        
         TAW1.setText("");  TAW1.setText(s);
         JOptionPane.showMessageDialog(this,"Works\n"+s+"\n");
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"Works1\n");
        TAW1.setText(TAW1.getText().trim());
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenu13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu13MouseClicked
       LanguageMapping mp= new LanguageMapping();
       mp.setVisible(true);
        
    }//GEN-LAST:event_jMenu13MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Bword1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bword1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bword1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bword1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               try               
               {
                   Thread.sleep(500);
               }
               catch(Exception e)
               {
                   
               }
                new Bword1().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton C;
    private javax.swing.JToggleButton L;
    public static javax.swing.JLabel LW3;
    private javax.swing.JToggleButton R;
    public static final javax.swing.JTextPane TAW1 = new javax.swing.JTextPane();
    public static javax.swing.JTextField TFW1;
    public static java.awt.Choice choice1;
    public static java.awt.Choice choice2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JColorChooser jColorChooser1;
    public static javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu15;
    public static javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JPopupMenu jPopupMenu3;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    // End of variables declaration//GEN-END:variables
}


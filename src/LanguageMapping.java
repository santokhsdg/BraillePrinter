


import java.awt.Font;
import java.awt.GraphicsEnvironment;
import javax.swing.JOptionPane;


public class LanguageMapping extends javax.swing.JFrame {

  static  String ch[]=new String[64],no[]=new String[64],font,script,pathname1="/home/pi/Desktop/Braille Document/Scripts"; 
   static int index=0;
   
    
    public LanguageMapping() {
        
        initComponents();
        GetFont();
        SetFont();
         
    }
    private void SetFont()
    {
        font=(String)jComboBox2.getSelectedItem();
         jTextField2.setFont(new Font(font,Font.BOLD+Font.PLAIN,20));
    }
    
    private int UniqueN(String ch)
    {
        
        if(index>0)
        {
        for(int i=0;i<index;i++)
         { //JOptionPane.showMessageDialog(this, ch+"  "+no[i]);
             if(ch.equals(no[i]))
            { 
                //JOptionPane.showMessageDialog(this, "wrks");
                return 0;
               
            }
         }
       }
        return 1;
    }
    private int UniqueC(String cha)
    {
        
        if(index>0)
        {
        for(int i=0;i<index;i++)
         { //JOptionPane.showMessageDialog(this, ch+"  "+no[i]);
             if(cha.equals(ch[i]))
            { 
                //JOptionPane.showMessageDialog(this, "wrks");
                return 0;
               
            }
         }
       }
        return 1;
    }
    
     private void GetFont()
   {
       GraphicsEnvironment gen = GraphicsEnvironment.getLocalGraphicsEnvironment();       
       String fonts[] = gen.getAvailableFontFamilyNames();
       
       jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(fonts)); 
   }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(840, 660));
        setPreferredSize(new java.awt.Dimension(840, 660));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 24)); // NOI18N
        jLabel1.setText("Language Mapping");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(300, 20, 340, 29);

        jLabel2.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel2.setText("Braille Characters ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(190, 90, 240, 22);

        jLabel3.setText("Script");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(588, 160, 50, 17);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(660, 150, 120, 27);

        jLabel4.setText("Font");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(590, 210, 50, 17);

        jLabel5.setText("Language Character");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(566, 300, 160, 17);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(740, 290, 46, 27);

        jLabel6.setText("Braille Character");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(575, 390, 140, 17);
        getContentPane().add(jLabel7);
        jLabel7.setBounds(720, 370, 60, 60);

        jButton2.setText("Next");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(717, 450, 70, 31);

        jButton3.setText("Done Mapping");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(557, 450, 150, 31);

        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(720, 500, 70, 31);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/01.jpg"))); // NOI18N
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel8);
        jLabel8.setBounds(50, 120, 52, 50);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/02.jpg"))); // NOI18N
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel9);
        jLabel9.setBounds(110, 120, 52, 50);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/03.jpg"))); // NOI18N
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel10);
        jLabel10.setBounds(170, 120, 52, 50);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/04.jpg"))); // NOI18N
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel11);
        jLabel11.setBounds(230, 120, 52, 50);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/05.jpg"))); // NOI18N
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel12);
        jLabel12.setBounds(290, 120, 52, 50);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/06.jpg"))); // NOI18N
        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel13);
        jLabel13.setBounds(350, 120, 52, 50);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/07.jpg"))); // NOI18N
        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel14);
        jLabel14.setBounds(410, 120, 52, 50);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/08.jpg"))); // NOI18N
        jLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel15);
        jLabel15.setBounds(470, 120, 52, 50);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/09.jpg"))); // NOI18N
        jLabel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel16);
        jLabel16.setBounds(50, 180, 52, 50);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/10.jpg"))); // NOI18N
        jLabel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel17);
        jLabel17.setBounds(110, 180, 52, 50);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/11.jpg"))); // NOI18N
        jLabel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel18);
        jLabel18.setBounds(170, 180, 52, 50);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/12.jpg"))); // NOI18N
        jLabel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel19);
        jLabel19.setBounds(230, 180, 52, 50);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/13.jpg"))); // NOI18N
        jLabel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel20);
        jLabel20.setBounds(290, 180, 52, 50);

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/14.jpg"))); // NOI18N
        jLabel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel21);
        jLabel21.setBounds(350, 180, 52, 50);

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/15.jpg"))); // NOI18N
        jLabel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel22);
        jLabel22.setBounds(410, 180, 52, 52);

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/16.jpg"))); // NOI18N
        jLabel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel23);
        jLabel23.setBounds(470, 180, 52, 50);

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/17.jpg"))); // NOI18N
        jLabel24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel24);
        jLabel24.setBounds(50, 240, 50, 52);

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/18.jpg"))); // NOI18N
        jLabel25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel25MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel25);
        jLabel25.setBounds(110, 240, 52, 52);

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/19.jpg"))); // NOI18N
        jLabel26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel26MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel26);
        jLabel26.setBounds(170, 240, 52, 50);

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/20.jpg"))); // NOI18N
        jLabel27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel27MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel27);
        jLabel27.setBounds(230, 240, 52, 52);

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/21.jpg"))); // NOI18N
        jLabel28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel28MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel28);
        jLabel28.setBounds(290, 240, 52, 52);

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/22.jpg"))); // NOI18N
        jLabel29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel29MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel29);
        jLabel29.setBounds(350, 240, 52, 52);

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/23.jpg"))); // NOI18N
        jLabel30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel30MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel30);
        jLabel30.setBounds(410, 240, 52, 50);

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/24.jpg"))); // NOI18N
        jLabel31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel31MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel31);
        jLabel31.setBounds(470, 240, 52, 50);

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/25.jpg"))); // NOI18N
        jLabel32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel32MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel32);
        jLabel32.setBounds(50, 300, 52, 50);

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/26.jpg"))); // NOI18N
        jLabel33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel33MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel33);
        jLabel33.setBounds(110, 300, 52, 50);

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/27.jpg"))); // NOI18N
        jLabel34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel34MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel34);
        jLabel34.setBounds(170, 300, 52, 50);

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/28.jpg"))); // NOI18N
        jLabel35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel35MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel35);
        jLabel35.setBounds(230, 300, 52, 52);

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/29.jpg"))); // NOI18N
        jLabel36.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel36MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel36);
        jLabel36.setBounds(290, 300, 50, 50);

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/30.jpg"))); // NOI18N
        jLabel37.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel37MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel37);
        jLabel37.setBounds(350, 300, 52, 50);

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/31.jpg"))); // NOI18N
        jLabel38.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel38MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel38);
        jLabel38.setBounds(410, 300, 52, 52);

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/32.jpg"))); // NOI18N
        jLabel39.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel39MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel39);
        jLabel39.setBounds(470, 300, 52, 50);

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/33.jpg"))); // NOI18N
        jLabel40.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel40MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel40);
        jLabel40.setBounds(50, 360, 52, 50);

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/34.jpg"))); // NOI18N
        jLabel41.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel41MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel41);
        jLabel41.setBounds(110, 360, 52, 50);

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/35.jpg"))); // NOI18N
        jLabel42.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel42MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel42);
        jLabel42.setBounds(170, 360, 52, 52);

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/36.jpg"))); // NOI18N
        jLabel43.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel43MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel43);
        jLabel43.setBounds(230, 360, 52, 50);

        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/37.jpg"))); // NOI18N
        jLabel44.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel44MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel44);
        jLabel44.setBounds(290, 360, 52, 50);

        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/38.jpg"))); // NOI18N
        jLabel45.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel45.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel45MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel45);
        jLabel45.setBounds(350, 360, 52, 50);

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/39.jpg"))); // NOI18N
        jLabel46.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel46.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel46MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel46);
        jLabel46.setBounds(410, 360, 52, 50);

        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/40.jpg"))); // NOI18N
        jLabel47.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel47.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel47MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel47);
        jLabel47.setBounds(470, 360, 52, 50);

        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/41.jpg"))); // NOI18N
        jLabel48.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel48.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel48MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel48);
        jLabel48.setBounds(50, 420, 52, 52);

        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/42.jpg"))); // NOI18N
        jLabel49.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel49.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel49MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel49);
        jLabel49.setBounds(110, 420, 50, 52);

        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/43.jpg"))); // NOI18N
        jLabel50.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel50.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel50MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel50);
        jLabel50.setBounds(170, 420, 52, 50);

        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/44.jpg"))); // NOI18N
        jLabel51.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel51.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel51MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel51);
        jLabel51.setBounds(230, 420, 52, 52);

        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/45.jpg"))); // NOI18N
        jLabel52.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel52.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel52MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel52);
        jLabel52.setBounds(290, 420, 52, 50);

        jLabel53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/46.jpg"))); // NOI18N
        jLabel53.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel53.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel53MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel53);
        jLabel53.setBounds(350, 420, 52, 50);

        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/47.jpg"))); // NOI18N
        jLabel54.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel54.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel54MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel54);
        jLabel54.setBounds(410, 420, 52, 50);

        jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48.jpg"))); // NOI18N
        jLabel55.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel55.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel55MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel55);
        jLabel55.setBounds(470, 420, 52, 50);

        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/49.jpg"))); // NOI18N
        jLabel56.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel56.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel56MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel56);
        jLabel56.setBounds(50, 480, 52, 52);

        jLabel57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/50.jpg"))); // NOI18N
        jLabel57.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel57.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel57MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel57);
        jLabel57.setBounds(110, 480, 52, 50);

        jLabel58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/51.jpg"))); // NOI18N
        jLabel58.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel58.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel58MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel58);
        jLabel58.setBounds(170, 480, 52, 50);

        jLabel59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/52.jpg"))); // NOI18N
        jLabel59.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel59.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel59MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel59);
        jLabel59.setBounds(230, 480, 52, 50);

        jLabel60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/53.jpg"))); // NOI18N
        jLabel60.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel60.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel60MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel60);
        jLabel60.setBounds(290, 480, 52, 50);

        jLabel61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/54.jpg"))); // NOI18N
        jLabel61.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel61.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel61MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel61);
        jLabel61.setBounds(350, 480, 52, 50);

        jLabel62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/55.jpg"))); // NOI18N
        jLabel62.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel62.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel62MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel62);
        jLabel62.setBounds(410, 480, 52, 50);

        jLabel63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/56.jpg"))); // NOI18N
        jLabel63.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel63.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel63MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel63);
        jLabel63.setBounds(470, 480, 52, 50);

        jLabel64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/57.jpg"))); // NOI18N
        jLabel64.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel64.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel64MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel64);
        jLabel64.setBounds(50, 540, 50, 50);

        jLabel65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/58.jpg"))); // NOI18N
        jLabel65.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel65.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel65MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel65);
        jLabel65.setBounds(110, 540, 52, 50);

        jLabel66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/59.jpg"))); // NOI18N
        jLabel66.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel66.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel66MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel66);
        jLabel66.setBounds(170, 540, 52, 50);

        jLabel67.setIcon(new javax.swing.ImageIcon(getClass().getResource("/60.jpg"))); // NOI18N
        jLabel67.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel67.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel67MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel67);
        jLabel67.setBounds(230, 540, 52, 50);

        jLabel68.setIcon(new javax.swing.ImageIcon(getClass().getResource("/61.jpg"))); // NOI18N
        jLabel68.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel68.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel68MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel68);
        jLabel68.setBounds(290, 540, 52, 50);

        jLabel69.setIcon(new javax.swing.ImageIcon(getClass().getResource("/62.jpg"))); // NOI18N
        jLabel69.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel69.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel69MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel69);
        jLabel69.setBounds(350, 540, 52, 50);

        jLabel70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/63.jpg"))); // NOI18N
        jLabel70.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel70.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel70MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel70);
        jLabel70.setBounds(410, 540, 52, 50);

        jLabel71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/empty.jpg"))); // NOI18N
        jLabel71.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel71.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel71MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel71);
        jLabel71.setBounds(470, 540, 50, 50);

        jLabel72.setText("Character Number");
        getContentPane().add(jLabel72);
        jLabel72.setBounds(570, 340, 150, 17);
        getContentPane().add(jLabel73);
        jLabel73.setBounds(730, 340, 0, 0);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(660, 200, 130, 27);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 66, 830, 10);

        jLabel74.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel74);
        jLabel74.setBounds(30, 81, 510, 520);

        jLabel75.setText("Number");
        getContentPane().add(jLabel75);
        jLabel75.setBounds(724, 340, 60, 17);

        jButton1.setText("View Mapping");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(560, 500, 150, 31);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        jLabel75.setText("1");        
       jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/01.jpg"))); // NOI18N
      // jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/00.jpg")));
      // getContentPane().add(jLabel7);
       //jLabel7.setBounds(720, 370, 60, 60);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        jLabel75.setText("2");        
       jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/02.jpg")));
     //  jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/00.jpg")));
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        jLabel75.setText("3");        
       jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/03.jpg")));
       //jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/00.jpg")));
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        jLabel75.setText("4");        
       jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/04.jpg")));
       jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/00.jpg")));
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        jLabel75.setText("5");        
       jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/05.jpg")));
       jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/00.jpg")));
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        jLabel75.setText("6");        
       jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/06.jpg")));
       jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/00.jpg")));
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        jLabel75.setText("7");        
       jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/07.jpg")));
       jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/00.jpg")));
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        jLabel75.setText("8");        
       jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/08.jpg")));
       jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/00.jpg")));
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        jLabel75.setText("9");        
       jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/09.jpg")));
       jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/00.jpg")));
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        jLabel75.setText("10");        
       jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/10.jpg")));
       jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/00.jpg")));
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
     jLabel75.setText("11");        
       jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/11.jpg")));
       jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/00.jpg")));
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        jLabel75.setText("12");        
       jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/12.jpg")));
       jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/00.jpg")));
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        jLabel75.setText("13");        
       jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/13.jpg")));
       //jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/00.jpg")));
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
       jLabel75.setText("14");        
       jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/14.jpg")));
       //jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/00.jpg")));
    }//GEN-LAST:event_jLabel21MouseClicked

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        jLabel75.setText("15");        
       jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/15.jpg")));
       //jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/00.jpg")));
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        jLabel75.setText("16");        
       jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/16.jpg")));
       //jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/00.jpg")));
    }//GEN-LAST:event_jLabel23MouseClicked

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
        jLabel75.setText("17");        
       jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/17.jpg")));
      // jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/00.jpg")));
    }//GEN-LAST:event_jLabel24MouseClicked

    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseClicked
       jLabel75.setText("18");        
       jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/18.jpg")));
      // jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/00.jpg")));
    }//GEN-LAST:event_jLabel25MouseClicked

    private void jLabel26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseClicked
       jLabel75.setText("19");        
       jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/19.jpg")));
      // jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/00.jpg")));
    }//GEN-LAST:event_jLabel26MouseClicked

    private void jLabel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseClicked
        jLabel75.setText("20");        
       jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/20.jpg")));
       //jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/00.jpg")));
    }//GEN-LAST:event_jLabel27MouseClicked

    private void jLabel28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseClicked
        jLabel75.setText("21");        
       jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/21.jpg")));
       //jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/00.jpg")));
    }//GEN-LAST:event_jLabel28MouseClicked

    private void jLabel29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MouseClicked
       jLabel75.setText("22");        
       jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/22.jpg")));
       //jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/00.jpg")));
    }//GEN-LAST:event_jLabel29MouseClicked

    private void jLabel30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel30MouseClicked
       jLabel75.setText("23");        
       jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/23.jpg")));
       //jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/00.jpg")));
    }//GEN-LAST:event_jLabel30MouseClicked

    private void jLabel31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel31MouseClicked
       jLabel75.setText("24");        
       jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/24.jpg")));
      // jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/00.jpg")));
    }//GEN-LAST:event_jLabel31MouseClicked

    private void jLabel32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32MouseClicked
        jLabel75.setText("25");        
       jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/25.jpg")));
      // jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/00.jpg")));
    }//GEN-LAST:event_jLabel32MouseClicked

    private void jLabel33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel33MouseClicked
        jLabel75.setText("26");        
       jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/26.jpg")));
       //jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/00.jpg")));
    }//GEN-LAST:event_jLabel33MouseClicked

    private void jLabel34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel34MouseClicked
        jLabel75.setText("27");        
       jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/27.jpg")));
      // jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/00.jpg")));
    }//GEN-LAST:event_jLabel34MouseClicked

    private void jLabel35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel35MouseClicked
        jLabel75.setText("28");        
       jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/28.jpg")));
       //jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/00.jpg")));
    }//GEN-LAST:event_jLabel35MouseClicked

    private void jLabel36MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel36MouseClicked
        jLabel75.setText("29");        
       jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/29.jpg")));
      // jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/00.jpg")));
    }//GEN-LAST:event_jLabel36MouseClicked

    private void jLabel37MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel37MouseClicked
        jLabel75.setText("30");        
       jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/30.jpg")));
       //jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/00.jpg")));
    }//GEN-LAST:event_jLabel37MouseClicked

    private void jLabel38MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel38MouseClicked
        jLabel75.setText("31");        
       jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/31.jpg")));
       //jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/00.jpg")));
    }//GEN-LAST:event_jLabel38MouseClicked

    private void jLabel39MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel39MouseClicked
       jLabel75.setText("32");        
       jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/32.jpg")));
       //jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/00.jpg")));
    }//GEN-LAST:event_jLabel39MouseClicked

    private void jLabel40MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel40MouseClicked
        jLabel75.setText("33");        
       jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/33.jpg")));
       //jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/00.jpg")));
    }//GEN-LAST:event_jLabel40MouseClicked

    private void jLabel41MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel41MouseClicked
        jLabel75.setText("34");        
       jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/34.jpg")));
       //jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/00.jpg")));
    }//GEN-LAST:event_jLabel41MouseClicked

    private void jLabel42MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel42MouseClicked
        jLabel75.setText("35");        
       jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/35.jpg")));
      // jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/00.jpg")));
    }//GEN-LAST:event_jLabel42MouseClicked

    private void jLabel43MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel43MouseClicked
       jLabel75.setText("36");        
       jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/36.jpg")));
       //jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/00.jpg")));
    }//GEN-LAST:event_jLabel43MouseClicked

    private void jLabel44MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel44MouseClicked
       jLabel75.setText("37");        
       jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/37.jpg")));
       //jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/00.jpg")));
    }//GEN-LAST:event_jLabel44MouseClicked

    private void jLabel45MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel45MouseClicked
        jLabel75.setText("38");        
       jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/38.jpg")));
       //jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/00.jpg")));
    }//GEN-LAST:event_jLabel45MouseClicked

    private void jLabel46MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel46MouseClicked
        jLabel75.setText("39");        
       jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/39.jpg")));
       //jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/00.jpg")));
    }//GEN-LAST:event_jLabel46MouseClicked

    private void jLabel47MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel47MouseClicked
        jLabel75.setText("40");        
       jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/40.jpg")));
       //jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/00.jpg")));
    }//GEN-LAST:event_jLabel47MouseClicked

    private void jLabel48MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel48MouseClicked
        jLabel75.setText("41");        
       jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/41.jpg")));
       //jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/00.jpg")));
    }//GEN-LAST:event_jLabel48MouseClicked

    private void jLabel49MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel49MouseClicked
        jLabel75.setText("42");        
       jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/42.jpg")));
       //jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/00.jpg")));
    }//GEN-LAST:event_jLabel49MouseClicked

    private void jLabel50MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel50MouseClicked
        jLabel75.setText("43");        
       jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/43.jpg")));
       //jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/00.jpg")));
    }//GEN-LAST:event_jLabel50MouseClicked

    private void jLabel51MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel51MouseClicked
        jLabel75.setText("44");        
       jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/44.jpg")));
       //jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/00.jpg")));
    }//GEN-LAST:event_jLabel51MouseClicked

    private void jLabel52MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel52MouseClicked
       jLabel75.setText("45");        
       jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/45.jpg")));
       //jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/00.jpg")));
    }//GEN-LAST:event_jLabel52MouseClicked

    private void jLabel53MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel53MouseClicked
        jLabel75.setText("46");        
       jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/46.jpg")));
       //jLabel53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/00.jpg")));
    }//GEN-LAST:event_jLabel53MouseClicked

    private void jLabel54MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel54MouseClicked
        jLabel75.setText("47");        
       jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/47.jpg")));
      // jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/00.jpg")));
    }//GEN-LAST:event_jLabel54MouseClicked

    private void jLabel55MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel55MouseClicked
       jLabel75.setText("48");        
       jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/48.jpg")));
      // jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/00.jpg")));
    }//GEN-LAST:event_jLabel55MouseClicked

    private void jLabel56MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel56MouseClicked
        jLabel75.setText("49");        
       jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/49.jpg")));
      // jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/00.jpg")));
    }//GEN-LAST:event_jLabel56MouseClicked

    private void jLabel57MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel57MouseClicked
       jLabel75.setText("50");        
       jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/50.jpg")));
      // jLabel57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/00.jpg")));
    }//GEN-LAST:event_jLabel57MouseClicked

    private void jLabel58MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel58MouseClicked
        jLabel75.setText("51");        
       jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/51.jpg")));
      // jLabel58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/00.jpg")));
    }//GEN-LAST:event_jLabel58MouseClicked

    private void jLabel59MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel59MouseClicked
        jLabel75.setText("52");        
       jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/52.jpg")));
       //jLabel59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/00.jpg")));
    }//GEN-LAST:event_jLabel59MouseClicked

    private void jLabel60MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel60MouseClicked
        jLabel75.setText("53");        
       jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/53.jpg")));
       //jLabel60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/00.jpg")));
    }//GEN-LAST:event_jLabel60MouseClicked

    private void jLabel61MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel61MouseClicked
        jLabel75.setText("54");        
       jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/54.jpg")));
       //jLabel61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/00.jpg")));
    }//GEN-LAST:event_jLabel61MouseClicked

    private void jLabel62MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel62MouseClicked
       jLabel75.setText("55");        
       jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/55.jpg")));
       //jLabel62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/00.jpg")));
    }//GEN-LAST:event_jLabel62MouseClicked

    private void jLabel63MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel63MouseClicked
       jLabel75.setText("56");        
       jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/56.jpg")));
       //jLabel63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/00.jpg")));
    }//GEN-LAST:event_jLabel63MouseClicked

    private void jLabel64MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel64MouseClicked
        jLabel75.setText("57");        
       jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/57.jpg")));
      // jLabel64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/00.jpg")));
    }//GEN-LAST:event_jLabel64MouseClicked

    private void jLabel65MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel65MouseClicked
        jLabel75.setText("58");        
       jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/58.jpg")));
       //jLabel65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/00.jpg")));
    }//GEN-LAST:event_jLabel65MouseClicked

    private void jLabel66MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel66MouseClicked
      jLabel75.setText("59");        
       jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/59.jpg")));
       //jLabel66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/00.jpg")));
    }//GEN-LAST:event_jLabel66MouseClicked

    private void jLabel67MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel67MouseClicked
      jLabel75.setText("60");        
       jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/60.jpg")));
      // jLabel67.setIcon(new javax.swing.ImageIcon(getClass().getResource("/00.jpg")));
    }//GEN-LAST:event_jLabel67MouseClicked

    private void jLabel68MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel68MouseClicked
        jLabel75.setText("61");        
       jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/61.jpg")));
       //jLabel68.setIcon(new javax.swing.ImageIcon(getClass().getResource("/00.jpg")));
    }//GEN-LAST:event_jLabel68MouseClicked

    private void jLabel69MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel69MouseClicked
        jLabel75.setText("62");        
       jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/62.jpg")));
       //jLabel69.setIcon(new javax.swing.ImageIcon(getClass().getResource("/00.jpg")));
    }//GEN-LAST:event_jLabel69MouseClicked

    private void jLabel70MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel70MouseClicked
        jLabel75.setText("63");        
       jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/63.jpg")));
       //jLabel70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/00.jpg")));
    }//GEN-LAST:event_jLabel70MouseClicked

    private void jLabel71MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel71MouseClicked
        jLabel75.setText("64");        
       jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/64.jpg")));
      // jLabel71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/00.jpg")));
    }//GEN-LAST:event_jLabel71MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    script=jTextField1.getText();
    jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/empty.jpg")));
        if(!(script.isEmpty()))
       {
           String n=jLabel75.getText(),s=jTextField2.getText();
           if(!(s.isEmpty()))
           {     
           
           if(UniqueN(n)==1 && UniqueC(s)==1)
           {
               ch[index]=s; no[index]=n;
                        index++;
                        
           }
           else{
               
               JOptionPane.showMessageDialog(null,"This character has previously been used.\nPlease enter correctly.");                   
           }
           
           }
           
           else{
               JOptionPane.showMessageDialog(null,"Please enter the character in the character field.\nIt can't be left empty.");  
           }
           
       }
       else{
            JOptionPane.showMessageDialog(null,"The script field is empty.Please\nenter the script name.");  
       }
           
        jLabel75.setText("Number");
        jLabel7.setText("Braille Cell");
        jTextField2.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        SetFont();
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
       
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String map="";
        map=map+" "+" "+"0"+"\n";
        for(int i=1;i<index;i++)
        {
            map=map+ch[i]+" "+no[i]+"\n";
        }
        //JOptionPane.showMessageDialog(this,map);
        font=(String)jComboBox2.getSelectedItem();
        map=font+"\n"+map;        
        FileHandling fh= new FileHandling();
        fh.SaveFile(map, pathname1);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
         String map="";
        for(int i=1;i<index;i++)
        {
            map=map+ch[i]+"  "+no[i]+"\n";
            //JOptionPane.showMessageDialog(this, map);
        }
        MapView mv= new MapView(); 
        font=(String)jComboBox2.getSelectedItem();
         mv.mpane.setFont(new Font(font,Font.BOLD+Font.PLAIN,20));
        mv.mpane.setText(map);
        mv.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**00000
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LanguageMapping.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LanguageMapping.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LanguageMapping.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LanguageMapping.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LanguageMapping().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}

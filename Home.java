package org.example;
import java.util.ArrayList;
import javax.swing.JPanel;
import java.awt.Color;

public class Home extends javax.swing.JFrame {


    public Home() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        sideMenu = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        add_User_Button = new javax.swing.JPanel();
        tab1 = new javax.swing.JPanel();
        add_User_text = new javax.swing.JLabel();
        users_Button = new javax.swing.JPanel();
        tab = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        exit_button = new javax.swing.JPanel();
        tab3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        yellowBar = new javax.swing.JPanel();
        search_Text_Box = new javax.swing.JTextField();
        search_Icon = new javax.swing.JLabel();
        sort_Drop_Down = new java.awt.Choice();
        sort_Icon = new javax.swing.JLabel();
        ui = new javax.swing.JPanel();
        add_User = new javax.swing.JPanel();
        EnterNameTextBox = new javax.swing.JTextField();
        add_User_text1 = new javax.swing.JLabel();
        search_Text_Box2 = new javax.swing.JTextField();
        add_User_text2 = new javax.swing.JLabel();
        enter_payment = new javax.swing.JTextField();
        add_User_text3 = new javax.swing.JLabel();
        user = new javax.swing.JPanel();
        add_User_text4 = new javax.swing.JLabel();
        add_User_text5 = new javax.swing.JLabel();
        add_User_text6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sideMenu.setBackground(new java.awt.Color(35, 47, 52));
        sideMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Black21 & White Finance Money Care Bold Logo.png"))); // NOI18N
        logo.setToolTipText("");

        add_User_Button.setBackground(new java.awt.Color(35, 47, 52));
        add_User_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_User_ButtonMouseClicked(evt);
            }
        });

        tab1.setOpaque(false);

        javax.swing.GroupLayout tab1Layout = new javax.swing.GroupLayout(tab1);
        tab1.setLayout(tab1Layout);
        tab1Layout.setHorizontalGroup(
                tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 5, Short.MAX_VALUE)
        );
        tab1Layout.setVerticalGroup(
                tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 34, Short.MAX_VALUE)
        );

        add_User_text.setBackground(new java.awt.Color(155, 176, 185));
        add_User_text.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        add_User_text.setForeground(new java.awt.Color(155, 176, 185));
        add_User_text.setText("Add User");

        javax.swing.GroupLayout add_User_ButtonLayout = new javax.swing.GroupLayout(add_User_Button);
        add_User_Button.setLayout(add_User_ButtonLayout);
        add_User_ButtonLayout.setHorizontalGroup(
                add_User_ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(add_User_ButtonLayout.createSequentialGroup()
                                .addComponent(tab1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(add_User_text)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        add_User_ButtonLayout.setVerticalGroup(
                add_User_ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tab1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(add_User_text, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        users_Button.setBackground(new java.awt.Color(53, 71, 79));
        users_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                users_ButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout tabLayout = new javax.swing.GroupLayout(tab);
        tab.setLayout(tabLayout);
        tabLayout.setHorizontalGroup(
                tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 5, Short.MAX_VALUE)
        );
        tabLayout.setVerticalGroup(
                tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 34, Short.MAX_VALUE)
        );

        jLabel1.setBackground(new java.awt.Color(155, 176, 185));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(155, 176, 185));
        jLabel1.setText("Users");

        javax.swing.GroupLayout users_ButtonLayout = new javax.swing.GroupLayout(users_Button);
        users_Button.setLayout(users_ButtonLayout);
        users_ButtonLayout.setHorizontalGroup(
                users_ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(users_ButtonLayout.createSequentialGroup()
                                .addComponent(tab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        users_ButtonLayout.setVerticalGroup(
                users_ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(users_ButtonLayout.createSequentialGroup()
                                .addComponent(tab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        exit_button.setBackground(new java.awt.Color(35, 47, 52));
        exit_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exit_buttonMouseClicked(evt);
            }
        });

        tab3.setOpaque(false);

        javax.swing.GroupLayout tab3Layout = new javax.swing.GroupLayout(tab3);
        tab3.setLayout(tab3Layout);
        tab3Layout.setHorizontalGroup(
                tab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 5, Short.MAX_VALUE)
        );
        tab3Layout.setVerticalGroup(
                tab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 34, Short.MAX_VALUE)
        );

        jLabel6.setBackground(new java.awt.Color(155, 176, 185));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(155, 176, 185));
        jLabel6.setText("EXIT");

        javax.swing.GroupLayout exit_buttonLayout = new javax.swing.GroupLayout(exit_button);
        exit_button.setLayout(exit_buttonLayout);
        exit_buttonLayout.setHorizontalGroup(
                exit_buttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(exit_buttonLayout.createSequentialGroup()
                                .addComponent(tab3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(jLabel6)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        exit_buttonLayout.setVerticalGroup(
                exit_buttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tab3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout sideMenuLayout = new javax.swing.GroupLayout(sideMenu);
        sideMenu.setLayout(sideMenuLayout);
        sideMenuLayout.setHorizontalGroup(
                sideMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(sideMenuLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(logo)
                                .addContainerGap())
                        .addComponent(users_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(add_User_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exit_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        sideMenuLayout.setVerticalGroup(
                sideMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(sideMenuLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(users_Button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(add_User_Button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(450, 450, 450)
                                .addComponent(exit_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26))
        );

        getContentPane().add(sideMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 600));

        yellowBar.setBackground(new java.awt.Color(249, 170, 51));

        search_Text_Box.setBackground(new java.awt.Color(255, 200, 81));
        search_Text_Box.setToolTipText("Search User");
        search_Text_Box.setActionCommand("<Not Set>");
        search_Text_Box.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        search_Text_Box.setName("Search"); // NOI18N
        search_Text_Box.setPreferredSize(new java.awt.Dimension(10, 16));
        search_Text_Box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_Text_BoxActionPerformed(evt);
            }
        });

        search_Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-search-18.png"))); // NOI18N
        search_Icon.setToolTipText("");

        sort_Drop_Down.setBackground(java.awt.Color.orange);
        sort_Drop_Down.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        sort_Drop_Down.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        sort_Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-filter-18.png"))); // NOI18N
        sort_Icon.setToolTipText("");

        javax.swing.GroupLayout yellowBarLayout = new javax.swing.GroupLayout(yellowBar);
        yellowBar.setLayout(yellowBarLayout);
        yellowBarLayout.setHorizontalGroup(
                yellowBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(yellowBarLayout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(search_Text_Box, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(search_Icon)
                                .addGap(335, 335, 335)
                                .addComponent(sort_Icon, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sort_Drop_Down, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34))
        );
        yellowBarLayout.setVerticalGroup(
                yellowBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(yellowBarLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(yellowBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(search_Icon, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(search_Text_Box, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(sort_Icon)
                                        .addComponent(sort_Drop_Down, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(30, Short.MAX_VALUE))
        );

        search_Text_Box.getAccessibleContext().setAccessibleName("Search User");

        getContentPane().add(yellowBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 850, 80));

        add_User.setOpaque(false);

        EnterNameTextBox.setBackground(java.awt.Color.lightGray);
        EnterNameTextBox.setToolTipText("Search User");
        EnterNameTextBox.setActionCommand("<Not Set>");
        EnterNameTextBox.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        EnterNameTextBox.setName("Search"); // NOI18N
        EnterNameTextBox.setPreferredSize(new java.awt.Dimension(10, 16));
        EnterNameTextBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterNameTextBoxActionPerformed(evt);
            }
        });
        EnterNameTextBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                EnterNameTextBox(evt);
            }
        });

        add_User_text1.setBackground(new java.awt.Color(155, 176, 185));
        add_User_text1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        add_User_text1.setForeground(new java.awt.Color(0, 0, 0));
        add_User_text1.setText("Enter Name");

        search_Text_Box2.setBackground(java.awt.Color.lightGray);
        search_Text_Box2.setToolTipText("Search User");
        search_Text_Box2.setActionCommand("<Not Set>");
        search_Text_Box2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        search_Text_Box2.setName("Search"); // NOI18N
        search_Text_Box2.setPreferredSize(new java.awt.Dimension(10, 16));
        search_Text_Box2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_Text_Box2ActionPerformed(evt);
            }
        });

        add_User_text2.setBackground(new java.awt.Color(155, 176, 185));
        add_User_text2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        add_User_text2.setForeground(new java.awt.Color(0, 0, 0));
        add_User_text2.setText("Number of payments");

        enter_payment.setBackground(java.awt.Color.lightGray);
        enter_payment.setToolTipText("Search User");
        enter_payment.setActionCommand("<Not Set>");
        enter_payment.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        enter_payment.setName("Search"); // NOI18N
        enter_payment.setPreferredSize(new java.awt.Dimension(10, 16));
        enter_payment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enter_paymentActionPerformed(evt);
            }
        });

        add_User_text3.setBackground(new java.awt.Color(155, 176, 185));
        add_User_text3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        add_User_text3.setForeground(new java.awt.Color(0, 0, 0));
        add_User_text3.setText("Enter Payment X");

        javax.swing.GroupLayout add_UserLayout = new javax.swing.GroupLayout(add_User);
        add_User.setLayout(add_UserLayout);
        add_UserLayout.setHorizontalGroup(
                add_UserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(add_UserLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(add_UserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(add_UserLayout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addComponent(add_User_text1))
                                        .addGroup(add_UserLayout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addComponent(add_User_text3))
                                        .addComponent(add_User_text2))
                                .addGap(62, 62, 62)
                                .addGroup(add_UserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(search_Text_Box2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                                        .addComponent(EnterNameTextBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(enter_payment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(426, Short.MAX_VALUE))
        );
        add_UserLayout.setVerticalGroup(
                add_UserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(add_UserLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(add_UserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(add_User_text1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(EnterNameTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(add_UserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(add_User_text2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(search_Text_Box2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(add_UserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(enter_payment, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(add_User_text3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(385, Short.MAX_VALUE))
        );

        add_User_text4.setBackground(new java.awt.Color(155, 176, 185));
        add_User_text4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        add_User_text4.setForeground(new java.awt.Color(0, 0, 0));
        add_User_text4.setText("User");

        add_User_text5.setBackground(new java.awt.Color(155, 176, 185));
        add_User_text5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        add_User_text5.setForeground(new java.awt.Color(0, 0, 0));
        add_User_text5.setText("Amount Owed");

        add_User_text6.setBackground(new java.awt.Color(155, 176, 185));
        add_User_text6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        add_User_text6.setForeground(new java.awt.Color(0, 0, 0));
        add_User_text6.setText("Credit Score");

        javax.swing.GroupLayout userLayout = new javax.swing.GroupLayout(user);
        user.setLayout(userLayout);
        userLayout.setHorizontalGroup(
                userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(userLayout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(add_User_text4)
                                .addGap(102, 102, 102)
                                .addComponent(add_User_text5)
                                .addGap(81, 81, 81)
                                .addComponent(add_User_text6)
                                .addContainerGap(410, Short.MAX_VALUE))
        );
        userLayout.setVerticalGroup(
                userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(userLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(add_User_text4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(add_User_text5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(add_User_text6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(476, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout uiLayout = new javax.swing.GroupLayout(ui);
        ui.setLayout(uiLayout);
        uiLayout.setHorizontalGroup(
                uiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(add_User, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(uiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(user, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        uiLayout.setVerticalGroup(
                uiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(add_User, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(uiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(user, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add_User.setVisible(false);

        getContentPane().add(ui, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 850, 520));
        ui.setVisible(true);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void search_Text_BoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_Text_BoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search_Text_BoxActionPerformed

    private void users_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_users_ButtonMouseClicked
        setColor(users_Button, tab);
        resetColor(add_User_Button, tab1);
        resetColor(exit_button, tab3);
        add_User.setVisible(false);
        user.setVisible(true);


    }//GEN-LAST:event_users_ButtonMouseClicked

    private void add_User_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_User_ButtonMouseClicked
        setColor(add_User_Button, tab1);
        resetColor(users_Button, tab);
        resetColor(exit_button, tab3);
        add_User.setVisible(true);
        user.setVisible(false);
    }//GEN-LAST:event_add_User_ButtonMouseClicked

    private void exit_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_buttonMouseClicked
        setColor(exit_button, tab3);
        resetColor(users_Button, tab);
        resetColor(add_User_Button, tab1);
        System.exit(0);
    }//GEN-LAST:event_exit_buttonMouseClicked

    private void EnterNameTextBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterNameTextBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EnterNameTextBoxActionPerformed

    private void search_Text_Box2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_Text_Box2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search_Text_Box2ActionPerformed

    private void enter_paymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enter_paymentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enter_paymentActionPerformed

    private void EnterNameTextBox(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EnterNameTextBox
        if(evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            System.out.println(EnterNameTextBox.getText());
        }
    }//GEN-LAST:event_EnterNameTextBox

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    private void setColor(JPanel pane, JPanel tab){
        pane.setBackground(new Color(53,71,79));
        tab.setOpaque(true);
    }

    private void resetColor(JPanel pane, JPanel tab){
        pane.setBackground(new Color(35,47,52));
        tab.setOpaque(false);
    }

    private void usersJpanel(){

    }

    private void addUsersJpanel(){

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EnterNameTextBox;
    private javax.swing.JPanel add_User;
    private javax.swing.JPanel add_User_Button;
    private javax.swing.JLabel add_User_text;
    private javax.swing.JLabel add_User_text1;
    private javax.swing.JLabel add_User_text2;
    private javax.swing.JLabel add_User_text3;
    private javax.swing.JLabel add_User_text4;
    private javax.swing.JLabel add_User_text5;
    private javax.swing.JLabel add_User_text6;
    private javax.swing.JTextField enter_payment;
    private javax.swing.JPanel exit_button;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel search_Icon;
    private javax.swing.JTextField search_Text_Box;
    private javax.swing.JTextField search_Text_Box2;
    private javax.swing.JPanel sideMenu;
    private java.awt.Choice sort_Drop_Down;
    private javax.swing.JLabel sort_Icon;
    private javax.swing.JPanel tab;
    private javax.swing.JPanel tab1;
    private javax.swing.JPanel tab3;
    private javax.swing.JPanel ui;
    private javax.swing.JPanel user;
    private javax.swing.JPanel users_Button;
    private javax.swing.JPanel yellowBar;
    // End of variables declaration//GEN-END:variables
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculations;

/**
 *
 * @author Shivam
 */
public class Games extends javax.swing.JFrame {

    /**
     * Creates new form Calculation
     */
    int change=0,

    /**
     * Creates new form Games
     */
    b1=0,

    /**
     * Creates new form Games
     */
    b2=0,

    /**
     * Creates new form Games
     */
    b3=0,

    /**
     * Creates new form Games
     */
    b4=0,

    /**
     * Creates new form Games
     */
    b5=0,

    /**
     * Creates new form Games
     */
    b6=0,

    /**
     * Creates new form Games
     */
    b7=0,

    /**
     * Creates new form Games
     */
    b8=0,

    /**
     * Creates new form Games
     */
    b9=0,

    /**
     * Creates new form Games
     */
    won=0;
    
    char matrix[][]=new char[3][3];
    
    public Games() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn17 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        txtDisplay = new javax.swing.JTextField();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        reset = new javax.swing.JButton();

        btn17.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn17.setText("/");

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtDisplay.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtDisplay.setText("Tic-Tac-Toe");
        txtDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDisplayActionPerformed(evt);
            }
        });

        btn1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        reset.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(reset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 6, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDisplayActionPerformed
        txtDisplay.setText("Tic-Tac-Toe");// TODO add your handling code here:
    }//GEN-LAST:event_txtDisplayActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        change++;
        b7++;
        if(b7==1&&won==0)
        {
        if(change%2!=0)
        {
          btn7.setText("X");
          matrix[2][0]='X';
          if(matrix[0][2]=='X'&&matrix[1][1]=='X'||matrix[0][0]=='X'&&matrix[1][0]=='X'||matrix[2][1]=='X'&&matrix[2][2]=='X')
          {
              txtDisplay.setText("X wins");
              won=1;
          }
        }
        else 
        {
          btn7.setText("O");
          matrix[2][0]='O';
          if(matrix[0][2]=='O'&&matrix[1][1]=='O'||matrix[0][0]=='O'&&matrix[1][0]=='O'||matrix[2][1]=='O'&&matrix[2][2]=='O')
          {
              txtDisplay.setText("O wins");
              won=1;
          }
        }
        }
        if(b1==1&&b2==1&&b3==1&&b4==1&&b5==1&&b6==1&&b7==1&&b8==1&&b9==1&&won==0)
            txtDisplay.setText("Draw");
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        change++;
        b1++;
        if(b1==1&&won==0)
        {
        if(change%2!=0)
        {
          btn1.setText("X");
          matrix[0][0]='X';
          if(matrix[0][1]=='X'&&matrix[0][2]=='X'||matrix[1][0]=='X'&&matrix[2][0]=='X'||matrix[1][1]=='X'&&matrix[2][2]=='X')
          {
              txtDisplay.setText("X wins");
              won=1;
          }
        }
        else
        {
          btn1.setText("O");
          matrix[0][0]='O';
          if(matrix[0][1]=='O'&&matrix[0][2]=='O'||matrix[1][0]=='O'&&matrix[2][0]=='O'||matrix[1][1]=='O'&&matrix[2][2]=='O')
          {
              txtDisplay.setText("O wins");
              won=1;
          }
        }
        }
        if(b1==1&&b2==1&&b3==1&&b4==1&&b5==1&&b6==1&&b7==1&&b8==1&&b9==1&&won==0)
            txtDisplay.setText("Draw");
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        change++;
        b2++;
        if(b2==1&&won==0)
        {
        if(change%2!=0)
        {
          btn2.setText("X");
          matrix[0][1]='X';
          if(matrix[0][0]=='X'&&matrix[0][2]=='X'||matrix[1][1]=='X'&&matrix[2][1]=='X')
          {
              txtDisplay.setText("X wins");
              won=1;
          }
        }
        else
        {
          btn2.setText("O");
          matrix[0][1]='O';
          if(matrix[0][0]=='O'&&matrix[0][2]=='O'||matrix[1][1]=='O'&&matrix[2][1]=='O')
          {
              txtDisplay.setText("O wins");
              won=1;
          }
        }
        }
        if(b1==1&&b2==1&&b3==1&&b4==1&&b5==1&&b6==1&&b7==1&&b8==1&&b9==1&&won==0)
            txtDisplay.setText("Draw");
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        change++;
        b3++;
        if(b3==1&&won==0)
        {
        if(change%2!=0)
        {
          btn3.setText("X");
          matrix[0][2]='X';
          if(matrix[0][0]=='X'&&matrix[0][1]=='X'||matrix[1][2]=='X'&&matrix[2][2]=='X'||matrix[1][1]=='X'&&matrix[2][0]=='X')
          {
              txtDisplay.setText("X wins");
              won=1;
          }
        }
        else
        {
          btn3.setText("O");
          matrix[0][2]='O';
          if(matrix[0][0]=='O'&&matrix[0][1]=='O'||matrix[1][2]=='O'&&matrix[2][2]=='O'||matrix[1][1]=='O'&&matrix[2][0]=='O')
          {
              txtDisplay.setText("O wins");
              won=1;
          }
        }
        }
        if(b1==1&&b2==1&&b3==1&&b4==1&&b5==1&&b6==1&&b7==1&&b8==1&&b9==1&&won==0)
            txtDisplay.setText("Draw");
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        change++;
        b4++;
        if(b4==1&&won==0)
        {
        if(change%2!=0)
        {
          btn4.setText("X");
          matrix[1][0]='X';
          if(matrix[0][0]=='X'&&matrix[2][0]=='X'||matrix[1][1]=='X'&&matrix[1][2]=='X')
          {
              txtDisplay.setText("X wins");
              won=1;
          }
        }
        else
        {
          btn4.setText("O");
          matrix[1][0]='O';
          if(matrix[0][0]=='O'&&matrix[2][0]=='O'||matrix[1][1]=='O'&&matrix[1][2]=='O')
          {
              txtDisplay.setText("O wins");
              won=1;
          }
        }
        }
        if(b1==1&&b2==1&&b3==1&&b4==1&&b5==1&&b6==1&&b7==1&&b8==1&&b9==1&&won==0)
            txtDisplay.setText("Draw");
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        change++;
        b5++;
        if(b5==1&&won==0)
        {
        if(change%2!=0)
        {
          btn5.setText("X");
          matrix[1][1]='X';
          if(matrix[0][0]=='X'&&matrix[2][2]=='X'||matrix[2][0]=='X'&&matrix[0][2]=='X'||matrix[1][0]=='X'&&matrix[1][2]=='X'||matrix[0][1]=='X'&&matrix[2][1]=='X')
          {
              txtDisplay.setText("X wins");
              won=1;
          }
        }
        else
        {
          btn5.setText("O");
          matrix[1][1]='O';
          if(matrix[0][0]=='O'&&matrix[2][2]=='O'||matrix[2][0]=='O'&&matrix[0][2]=='O'||matrix[1][0]=='O'&&matrix[1][2]=='O'||matrix[0][1]=='O'&&matrix[2][1]=='O')
          {
              txtDisplay.setText("O wins");
              won=1;
          }
        }
        }
        if(b1==1&&b2==1&&b3==1&&b4==1&&b5==1&&b6==1&&b7==1&&b8==1&&b9==1&&won==0)
            txtDisplay.setText("Draw");
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        change++;
        b6++;
        if(b6==1&&won==0)
        {
        if(change%2!=0)
        {
          btn6.setText("X");
          matrix[1][2]='X';
          if(matrix[0][2]=='X'&&matrix[2][2]=='X'||matrix[1][1]=='X'&&matrix[1][0]=='X')
          {
              txtDisplay.setText("X wins");
              won=1;
          }
        }
        else
        {
          btn6.setText("O");
          matrix[1][2]='O';
          if(matrix[0][2]=='O'&&matrix[2][2]=='O'||matrix[1][1]=='O'&&matrix[1][0]=='O')
          {
              txtDisplay.setText("O wins");
              won=1;
              
          }
        }
        }
        if(b1==1&&b2==1&&b3==1&&b4==1&&b5==1&&b6==1&&b7==1&&b8==1&&b9==1&&won==0)
            txtDisplay.setText("Draw");
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        change++;
        b8++;
        if(b8==1&&won==0)
        {
        if(change%2!=0)
        {
          btn8.setText("X");
          matrix[2][1]='X';
          if(matrix[0][1]=='X'&&matrix[1][1]=='X'||matrix[2][0]=='X'&&matrix[2][2]=='X')
          {
              txtDisplay.setText("X wins");
              won=1;
          }
          
        }
        else
        {
          btn8.setText("O");
          matrix[2][1]='O';
          if(matrix[0][1]=='O'&&matrix[1][1]=='O'||matrix[2][0]=='O'&&matrix[2][2]=='O')
          {
              txtDisplay.setText("O wins");
              won=1;
          }
        }
       }
        if(b1==1&&b2==1&&b3==1&&b4==1&&b5==1&&b6==1&&b7==1&&b8==1&&b9==1&&won==0)
            txtDisplay.setText("Draw");
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        change++;
        b9++;
        if(b9==1&&won==0)
        {
        if(change%2!=0)
        {
          btn9.setText("X");
          matrix[2][2]='X';
          if(matrix[0][0]=='X'&&matrix[1][1]=='X'||matrix[2][0]=='X'&&matrix[2][1]=='X'||matrix[0][2]=='X'&&matrix[1][2]=='X')
          {
              txtDisplay.setText("X wins");
              won=1;
          }
        }
        else
        {
          btn9.setText("O");
          matrix[2][2]='O';
          if(matrix[0][0]=='O'&&matrix[1][1]=='O'||matrix[2][0]=='O'&&matrix[2][1]=='O'||matrix[0][2]=='O'&&matrix[1][2]=='O')
          {
              txtDisplay.setText("O wins");
              won=1;
          }
        }
        }
        if(b1==1&&b2==1&&b3==1&&b4==1&&b5==1&&b6==1&&b7==1&&b8==1&&b9==1&&won==0)
            txtDisplay.setText("Draw");
    }//GEN-LAST:event_btn9ActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        won=b1=b2=b3=b4=b5=b6=b7=b8=b9=change=0;
        txtDisplay.setText("Tic-Tac-Toe");
        int i, j;
        for(i=0;i<3;i++)
            for(j=0;j<3;j++)
                matrix[i][j]='A';
    }//GEN-LAST:event_resetActionPerformed

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
            java.util.logging.Logger.getLogger(Games.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Games.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Games.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Games.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Games().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn17;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton reset;
    private javax.swing.JTextField txtDisplay;
    // End of variables declaration//GEN-END:variables
}

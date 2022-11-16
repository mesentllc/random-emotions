package com.mesentllc.fun.random.emotions;

import javax.swing.ImageIcon;
import java.awt.Font;
import java.util.Objects;

import static java.awt.EventQueue.invokeLater;

public class RandomEmotions extends javax.swing.JFrame {
    public RandomEmotions() {
        initComponents();
        // Icon by https://www.flaticon.com/authors/juicy-fish
        setIconImage(new ImageIcon(Objects.requireNonNull(getClass().getResource("/mood-swings.png"))).getImage());
        emotionRefresher = new EmotionRefresher();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblEmotion = new javax.swing.JLabel();
        scrlDescription = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextArea();
        btnPick = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Random Emotions");
        setAlwaysOnTop(true);

        lblEmotion.setFont(new java.awt.Font("Arial Rounded MT Bold", Font.BOLD, 36)); // NOI18N
        lblEmotion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmotion.setText("Emotion");
        lblEmotion.setFocusable(false);

        scrlDescription.setFont(new java.awt.Font("Arial Rounded MT Bold", Font.BOLD, 24)); // NOI18N

        txtDescription.setColumns(20);
        txtDescription.setFont(new java.awt.Font("Arial Rounded MT Bold", Font.BOLD, 24)); // NOI18N
        txtDescription.setLineWrap(true);
        txtDescription.setRows(5);
        txtDescription.setFocusable(false);
        txtDescription.setMargin(new java.awt.Insets(5, 6, 5, 6));
        scrlDescription.setViewportView(txtDescription);

        btnPick.setText("Pick another");
        btnPick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPickActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
          layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
              .addContainerGap()
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(btnPick, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(scrlDescription, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
                .addComponent(lblEmotion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
              .addContainerGap())
                                 );
        layout.setVerticalGroup(
          layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
              .addContainerGap()
              .addComponent(lblEmotion, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
              .addComponent(btnPick, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
              .addComponent(scrlDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addContainerGap())
                               );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPickActionPerformed
        emotionRefresher.update(lblEmotion, txtDescription, 0);
    }//GEN-LAST:event_btnPickActionPerformed

    public static void main(String[] args) {
        RandomEmotions main = new RandomEmotions();
        final int refreshInSeconds = (args.length > 0) ? Integer.parseInt(args[0]) : 30;

        invokeLater(() -> main.emotionRefresher.update(main.lblEmotion, main.txtDescription, refreshInSeconds));
        invokeLater(() -> main.setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPick;
    private javax.swing.JLabel lblEmotion;
    private javax.swing.JScrollPane scrlDescription;
    private javax.swing.JTextArea txtDescription;
    // End of variables declaration//GEN-END:variables
    private final EmotionRefresher emotionRefresher;
}

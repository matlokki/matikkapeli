        /**
 * @author      Matias Luukkanen 
 * @version     0.01
 */
package Kayttoliittyma;

import Logiikka.Alapeli;
import Logiikka.Miinuslaskupeli;
import Logiikka.Yhteenlaskupeli;
import Matikkapeli.Oppilas;
import Tiedostonhallinta.Tiedostonhallinta;
import java.awt.SystemColor;
import static java.awt.SystemColor.control;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author matluukk
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GraafinenKayttis
     */
    private Oppilas oppilas;
    private Alapeli alapeli;
    private Tiedostonhallinta tiedostonhallinta;

    public GUI() {
        initComponents();
        tehtaviaOikein.setText("");

    }

    private void siirryTilaan(PelinTila tila) {
        if (tila == PelinTila.ALOITUS) {
            okNappi.setVisible(true);
            tuloste.setVisible(true);
            tervetuloaTeksti.setVisible(true);
            tehtaviaOikein.setVisible(false);
            yhteenLaskuNappi.setVisible(false);
            miinusLaskuNappi.setVisible(false);
            kysymys.setVisible(false);
            vastaus.setVisible(false);
            vastausNappi.setVisible(false);
            oikeinVaarin.setVisible(false);
            tallennaNappi.setVisible(false);
            this.getRootPane().setDefaultButton(okNappi);
        } else if (tila == PelinTila.PELINVALINTA) {
            okNappi.setVisible(false);
            tuloste.setVisible(true);
            tervetuloaTeksti.setVisible(false);
            tehtaviaOikein.setVisible(true);
            yhteenLaskuNappi.setVisible(true);
            miinusLaskuNappi.setVisible(true);
            kysymys.setVisible(false);
            vastaus.setVisible(false);
            vastausNappi.setVisible(false);
            oikeinVaarin.setVisible(false);
            kayttajaNimi.setVisible(false);
            tallennaNappi.setVisible(true);
        } else if (tila == PelinTila.PELI) {
            vastaus.setText("");
            oikeinVaarin.setText("");
            okNappi.setVisible(false);
            tuloste.setVisible(true);
            tervetuloaTeksti.setVisible(false);
            tehtaviaOikein.setVisible(true);
            yhteenLaskuNappi.setVisible(false);
            miinusLaskuNappi.setVisible(false);
            kysymys.setVisible(true);
            vastaus.setVisible(true);
            vastausNappi.setVisible(true);
            oikeinVaarin.setVisible(true);
            kayttajaNimi.setVisible(false);
            tallennaNappi.setVisible(false);
            this.getRootPane().setDefaultButton(vastausNappi);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        kayttajaNimi = new javax.swing.JTextField();
        okNappi = new javax.swing.JButton();
        tuloste = new javax.swing.JLabel();
        yhteenLaskuNappi = new javax.swing.JButton();
        miinusLaskuNappi = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tervetuloaTeksti = new javax.swing.JLabel();
        kysymys = new javax.swing.JLabel();
        vastaus = new javax.swing.JTextField();
        vastausNappi = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        oikeinVaarin = new javax.swing.JLabel();
        tehtaviaOikein = new javax.swing.JLabel();
        tallennaNappi = new javax.swing.JButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Tervetuloa pelaamaan!\nMikä sinun nimesi on?");
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kayttajaNimi.setText("Käyttäjänimi");
        kayttajaNimi.setNextFocusableComponent(okNappi);

        okNappi.setText("OK");
        okNappi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okNappiActionPerformed(evt);
            }
        });

        tuloste.setText("jLabel1");
        tuloste.setVisible(false);

        yhteenLaskuNappi.setText("Aloita yhteenlasku");
        yhteenLaskuNappi.setVisible(false);
        yhteenLaskuNappi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yhteenLaskuNappiActionPerformed(evt);
            }
        });

        miinusLaskuNappi.setText("Aloita miinuslasku");
        miinusLaskuNappi.setVisible(false);
        miinusLaskuNappi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miinusLaskuNappiActionPerformed(evt);
            }
        });

        tervetuloaTeksti.setText("Tervetuloa pelaamaan!");

        kysymys.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        kysymys.setText("kysymys");
        kysymys.setVisible(false);

        vastaus.setVisible(false);

        vastausNappi.setVisible(false);
        vastausNappi.setText("Vastaa");
        vastausNappi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vastausNappiActionPerformed(evt);
            }
        });

        oikeinVaarin.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        oikeinVaarin.setText("jLabel3");
        oikeinVaarin.setVisible(false);

        tehtaviaOikein.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        tehtaviaOikein.setText("Sait x oikein");
        tehtaviaOikein.setVisible(false);

        tallennaNappi.setVisible(false);
        tallennaNappi.setText("Tallenna");
        tallennaNappi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tallennaNappiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(kysymys)
                    .addComponent(vastaus, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(vastausNappi)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(108, 108, 108)
                        .addComponent(oikeinVaarin)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(244, 244, 244)
                                    .addComponent(miinusLaskuNappi))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(40, 40, 40)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tervetuloaTeksti)
                                        .addComponent(yhteenLaskuNappi)
                                        .addComponent(tehtaviaOikein))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(jLabel1)
                                .addGap(33, 33, 33)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tallennaNappi))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(kayttajaNimi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(okNappi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                        .addComponent(tuloste)))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tuloste)
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(kayttajaNimi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(okNappi)
                            .addComponent(tervetuloaTeksti))
                        .addGap(36, 36, 36)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yhteenLaskuNappi)
                    .addComponent(miinusLaskuNappi)
                    .addComponent(tallennaNappi))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(tehtaviaOikein)))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kysymys)
                    .addComponent(jLabel2)
                    .addComponent(oikeinVaarin))
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vastaus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vastausNappi))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        yhteenLaskuNappi.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okNappiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okNappiActionPerformed
        tiedostonhallinta = new Tiedostonhallinta(kayttajaNimi.getText());
        this.oppilas = tiedostonhallinta.luo();
        siirryTilaan(PelinTila.PELINVALINTA);
        tuloste.setText(kayttajaNimi.getText());
    }//GEN-LAST:event_okNappiActionPerformed

    private void yhteenLaskuNappiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yhteenLaskuNappiActionPerformed
        siirryTilaan(PelinTila.PELI);
        alapeli = new Yhteenlaskupeli(oppilas, null);
        kysymys.setText(alapeli.haeKysymys());
    }//GEN-LAST:event_yhteenLaskuNappiActionPerformed

    private void vastausNappiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vastausNappiActionPerformed
        oikeinVaarin.setText(alapeli.arvaus(vastaus.getText()));
        alapeli.seuraavaTehtava();
        if (alapeli.peliJatkuu() == false) {
            Timestamp aika = oppilas.historia.lisaaTapahtuma("Miinuslasku", oppilas.getTaso(), alapeli.getOikeatVastaukset(), 10);
            siirryTilaan(PelinTila.PELINVALINTA);
            tehtaviaOikein.setText("Sait " + alapeli.getOikeatVastaukset() + " tehtävää oikein.");
            oppilas.tarkistaTaso();
        } else {
            kysymys.setText(alapeli.haeKysymys());
            vastaus.setText("");
        }
    }//GEN-LAST:event_vastausNappiActionPerformed

    private void miinusLaskuNappiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miinusLaskuNappiActionPerformed
        siirryTilaan(PelinTila.PELI);
        alapeli = new Miinuslaskupeli(oppilas, null);
        kysymys.setText(alapeli.haeKysymys());
    }//GEN-LAST:event_miinusLaskuNappiActionPerformed

    private void tallennaNappiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tallennaNappiActionPerformed
        try {
            tiedostonhallinta.tallenna(oppilas);
        } catch (IOException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tallennaNappiActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField kayttajaNimi;
    private javax.swing.JLabel kysymys;
    private javax.swing.JButton miinusLaskuNappi;
    private javax.swing.JLabel oikeinVaarin;
    private javax.swing.JButton okNappi;
    private javax.swing.JButton tallennaNappi;
    private javax.swing.JLabel tehtaviaOikein;
    private javax.swing.JLabel tervetuloaTeksti;
    private javax.swing.JLabel tuloste;
    private javax.swing.JTextField vastaus;
    private javax.swing.JButton vastausNappi;
    private javax.swing.JButton yhteenLaskuNappi;
    // End of variables declaration//GEN-END:variables
}

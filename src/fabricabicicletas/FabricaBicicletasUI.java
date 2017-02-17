/*
 * The MIT License
 *
 * Copyright 2017 Guillermo Grande & Vincent Pérez.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package fabricabicicletas;

import static fabricabicicletas.Aplication.vec;
import java.awt.GridLayout;
import java.io.IOException;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFormattedTextField;
import javax.swing.JSpinner;
import javax.swing.SwingUtilities;
/**
 *
 * @author Guillermo Grande y Vincent Pérez.
 */
public class FabricaBicicletasUI extends javax.swing.JFrame
{
    private Fabrica f;
    
    /**
     * Creates new form FabricaBicicletasUI
     */
    public FabricaBicicletasUI(int[] vec) 
    {
        initComponents();
        f = new Fabrica(vec, inAlmacenNeum, inAlmacenBujes, inAlmacenRuedas, inAlmacenMarcos,
                readyBic, readyTric);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFabrica = new javax.swing.JPanel();
        panelNeumaticos = new javax.swing.JPanel();
        labelProdNeum = new javax.swing.JLabel();
        labelAlmacenNeum = new javax.swing.JLabel();
        labelTiempoNeum = new javax.swing.JLabel();
        tiempoNeum = new javax.swing.JLabel();
        labelDiasNeum = new javax.swing.JLabel();
        inAlmacenNeum = new javax.swing.JLabel();
        slash2 = new javax.swing.JLabel();
        maxAlmacenNeum = new javax.swing.JLabel();
        prodNeumActivo = new javax.swing.JLabel();
        slash1 = new javax.swing.JLabel();
        maxProdNeum = new javax.swing.JLabel();
        btnProdNeum = new javax.swing.JToggleButton();
        spnProdNeum = new javax.swing.JSpinner();
        panelBujes = new javax.swing.JPanel();
        maxAlmacenBujes = new javax.swing.JLabel();
        maxProdBujes = new javax.swing.JLabel();
        labelTiempoBujes = new javax.swing.JLabel();
        slash4 = new javax.swing.JLabel();
        inAlmacenBujes = new javax.swing.JLabel();
        slash3 = new javax.swing.JLabel();
        tiempoBujes = new javax.swing.JLabel();
        labelProdBujes = new javax.swing.JLabel();
        labelAlmacenBujes = new javax.swing.JLabel();
        prodBujesActivo = new javax.swing.JLabel();
        labelDiasBuje = new javax.swing.JLabel();
        btnProdBujes = new javax.swing.JToggleButton();
        spnProdBujes = new javax.swing.JSpinner();
        panelRuedas = new javax.swing.JPanel();
        slash6 = new javax.swing.JLabel();
        maxProdRuedas = new javax.swing.JLabel();
        inAlmacenRuedas = new javax.swing.JLabel();
        maxAlmacenRuedas = new javax.swing.JLabel();
        labelTiempoRuedas = new javax.swing.JLabel();
        slash5 = new javax.swing.JLabel();
        labelDiasRuedas = new javax.swing.JLabel();
        labelProdRuedas = new javax.swing.JLabel();
        labelAlmacenRuedas = new javax.swing.JLabel();
        prodRuedasActivo = new javax.swing.JLabel();
        tiempoRuedas = new javax.swing.JLabel();
        btnProdRuedas = new javax.swing.JToggleButton();
        spnProdRuedas = new javax.swing.JSpinner();
        panelMarcos = new javax.swing.JPanel();
        maxProdMarcos = new javax.swing.JLabel();
        labelProdMarcos = new javax.swing.JLabel();
        inAlmacenMarcos = new javax.swing.JLabel();
        labelDiasMarcos = new javax.swing.JLabel();
        labelAlmacenMarcos = new javax.swing.JLabel();
        slash8 = new javax.swing.JLabel();
        slash7 = new javax.swing.JLabel();
        prodMarcosActivo = new javax.swing.JLabel();
        maxAlmacenMarcos = new javax.swing.JLabel();
        labelTiempoMarcos = new javax.swing.JLabel();
        tiempoMarcos = new javax.swing.JLabel();
        btnProdMarcos = new javax.swing.JToggleButton();
        spnProdMarcos = new javax.swing.JSpinner();
        panelTric = new javax.swing.JPanel();
        slash12 = new javax.swing.JLabel();
        maxEnsTric = new javax.swing.JLabel();
        readyTric = new javax.swing.JLabel();
        maxTric = new javax.swing.JLabel();
        labelTiempoTric = new javax.swing.JLabel();
        slash11 = new javax.swing.JLabel();
        labelDiasTric = new javax.swing.JLabel();
        labelEnsTric = new javax.swing.JLabel();
        labelPedidoTric = new javax.swing.JLabel();
        ensTricActivo = new javax.swing.JLabel();
        tiempoTriciclo = new javax.swing.JLabel();
        btnEnsTric = new javax.swing.JToggleButton();
        spnEnsTric = new javax.swing.JSpinner();
        panelBic = new javax.swing.JPanel();
        slash10 = new javax.swing.JLabel();
        maxEnsBic = new javax.swing.JLabel();
        readyBic = new javax.swing.JLabel();
        maxBic = new javax.swing.JLabel();
        labelTiempoBic = new javax.swing.JLabel();
        slash9 = new javax.swing.JLabel();
        labelDiasBic = new javax.swing.JLabel();
        labelEnsBic = new javax.swing.JLabel();
        labelPedidoBic = new javax.swing.JLabel();
        ensBicActivo = new javax.swing.JLabel();
        tiempoBicicletas = new javax.swing.JLabel();
        btnEnsBic = new javax.swing.JToggleButton();
        spnEnsBic = new javax.swing.JSpinner();
        panelProgreso = new javax.swing.JPanel();
        barProgreso = new javax.swing.JProgressBar();
        labelTiempoTotal = new javax.swing.JLabel();
        tiempoTotal = new javax.swing.JLabel();
        labelDiasTotal = new javax.swing.JLabel();
        btnFabrica = new javax.swing.JButton();
        menu = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelFabrica.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fábrica", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monospaced", 1, 18))); // NOI18N

        panelNeumaticos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Produccion de neumaticos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monospaced", 1, 14))); // NOI18N

        labelProdNeum.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        labelProdNeum.setText("Nº productores:");

        labelAlmacenNeum.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        labelAlmacenNeum.setText("Almacen");

        labelTiempoNeum.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        labelTiempoNeum.setText("Tiempo total de producción:");

        tiempoNeum.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        tiempoNeum.setText("00");

        labelDiasNeum.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        labelDiasNeum.setText("dia(s)");

        inAlmacenNeum.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        inAlmacenNeum.setText("00");

        slash2.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        slash2.setText("/");

        maxAlmacenNeum.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        maxAlmacenNeum.setText("00");

        prodNeumActivo.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        prodNeumActivo.setText("00");

        slash1.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        slash1.setText("/");

        maxProdNeum.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        maxProdNeum.setText("00");

        btnProdNeum.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        btnProdNeum.setText("Pausar producción");
        btnProdNeum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdNeumActionPerformed(evt);
            }
        });

        spnProdNeum.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        spnProdNeum.setModel(new javax.swing.SpinnerNumberModel(0,0,vec[11],1));
        JFormattedTextField spnProdNeumTextField = ((JSpinner.DefaultEditor) spnProdNeum.getEditor()).getTextField();
        spnProdNeumTextField.setEditable(false);
        spnProdNeum.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnProdNeumStateChanged(evt);
            }
        });

        javax.swing.GroupLayout panelNeumaticosLayout = new javax.swing.GroupLayout(panelNeumaticos);
        panelNeumaticos.setLayout(panelNeumaticosLayout);
        panelNeumaticosLayout.setHorizontalGroup(
            panelNeumaticosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNeumaticosLayout.createSequentialGroup()
                .addGroup(panelNeumaticosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTiempoNeum)
                    .addComponent(labelAlmacenNeum)
                    .addComponent(labelProdNeum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelNeumaticosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelNeumaticosLayout.createSequentialGroup()
                        .addGroup(panelNeumaticosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelNeumaticosLayout.createSequentialGroup()
                                .addComponent(inAlmacenNeum)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(slash2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(maxAlmacenNeum))
                            .addGroup(panelNeumaticosLayout.createSequentialGroup()
                                .addComponent(tiempoNeum)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelDiasNeum)))
                        .addGap(0, 109, Short.MAX_VALUE))
                    .addGroup(panelNeumaticosLayout.createSequentialGroup()
                        .addComponent(prodNeumActivo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(slash1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(maxProdNeum)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(spnProdNeum, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(panelNeumaticosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnProdNeum))
        );
        panelNeumaticosLayout.setVerticalGroup(
            panelNeumaticosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNeumaticosLayout.createSequentialGroup()
                .addGroup(panelNeumaticosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelProdNeum)
                    .addComponent(prodNeumActivo)
                    .addComponent(slash1)
                    .addComponent(maxProdNeum)
                    .addComponent(spnProdNeum, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelNeumaticosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAlmacenNeum)
                    .addComponent(inAlmacenNeum)
                    .addComponent(slash2)
                    .addComponent(maxAlmacenNeum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelNeumaticosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTiempoNeum)
                    .addComponent(tiempoNeum)
                    .addComponent(labelDiasNeum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(btnProdNeum))
        );

        panelBujes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Produccion de bujes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monospaced", 1, 14))); // NOI18N

        maxAlmacenBujes.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        maxAlmacenBujes.setText("00");

        maxProdBujes.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        maxProdBujes.setText("00");

        labelTiempoBujes.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        labelTiempoBujes.setText("Tiempo total de producción:");

        slash4.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        slash4.setText("/");

        inAlmacenBujes.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        inAlmacenBujes.setText("00");

        slash3.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        slash3.setText("/");

        tiempoBujes.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        tiempoBujes.setText("00");

        labelProdBujes.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        labelProdBujes.setText("Nº productores:");

        labelAlmacenBujes.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        labelAlmacenBujes.setText("Almacen");

        prodBujesActivo.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        prodBujesActivo.setText("00");

        labelDiasBuje.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        labelDiasBuje.setText("dia(s)");

        btnProdBujes.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        btnProdBujes.setText("Pausar producción");
        btnProdBujes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdBujesActionPerformed(evt);
            }
        });

        spnProdBujes.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        spnProdBujes.setModel(new javax.swing.SpinnerNumberModel(0,0,vec[12],1));
        JFormattedTextField spnProdBujesTextField = ((JSpinner.DefaultEditor) spnProdBujes.getEditor()).getTextField();
        spnProdBujesTextField.setEditable(false);
        spnProdBujes.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnProdBujesStateChanged(evt);
            }
        });

        javax.swing.GroupLayout panelBujesLayout = new javax.swing.GroupLayout(panelBujes);
        panelBujes.setLayout(panelBujesLayout);
        panelBujesLayout.setHorizontalGroup(
            panelBujesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBujesLayout.createSequentialGroup()
                .addGroup(panelBujesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTiempoBujes)
                    .addComponent(labelAlmacenBujes)
                    .addComponent(labelProdBujes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBujesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBujesLayout.createSequentialGroup()
                        .addComponent(prodBujesActivo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(slash3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(maxProdBujes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                        .addComponent(spnProdBujes, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBujesLayout.createSequentialGroup()
                        .addGroup(panelBujesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBujesLayout.createSequentialGroup()
                                .addComponent(inAlmacenBujes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(slash4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(maxAlmacenBujes))
                            .addGroup(panelBujesLayout.createSequentialGroup()
                                .addComponent(tiempoBujes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelDiasBuje)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBujesLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnProdBujes))
        );
        panelBujesLayout.setVerticalGroup(
            panelBujesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBujesLayout.createSequentialGroup()
                .addGroup(panelBujesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelProdBujes)
                    .addComponent(prodBujesActivo)
                    .addComponent(slash3)
                    .addComponent(maxProdBujes)
                    .addComponent(spnProdBujes, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBujesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAlmacenBujes)
                    .addComponent(inAlmacenBujes)
                    .addComponent(slash4)
                    .addComponent(maxAlmacenBujes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBujesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTiempoBujes)
                    .addComponent(tiempoBujes)
                    .addComponent(labelDiasBuje))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnProdBujes))
        );

        panelRuedas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Produccion de ruedas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monospaced", 1, 14))); // NOI18N

        slash6.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        slash6.setText("/");

        maxProdRuedas.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        maxProdRuedas.setText("00");

        inAlmacenRuedas.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        inAlmacenRuedas.setText("00");

        maxAlmacenRuedas.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        maxAlmacenRuedas.setText("00");

        labelTiempoRuedas.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        labelTiempoRuedas.setText("Tiempo de producción:");

        slash5.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        slash5.setText("/");

        labelDiasRuedas.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        labelDiasRuedas.setText("dia(s)");

        labelProdRuedas.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        labelProdRuedas.setText("Nº productores:");

        labelAlmacenRuedas.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        labelAlmacenRuedas.setText("Almacen");

        prodRuedasActivo.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        prodRuedasActivo.setText("00");

        tiempoRuedas.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        tiempoRuedas.setText("00");

        btnProdRuedas.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        btnProdRuedas.setText("Pausar producción");
        btnProdRuedas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdRuedasActionPerformed(evt);
            }
        });

        spnProdRuedas.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        spnProdRuedas.setModel(new javax.swing.SpinnerNumberModel(0,0,vec[13],1));
        JFormattedTextField spnProdRuedasTextField = ((JSpinner.DefaultEditor) spnProdRuedas.getEditor()).getTextField();
        spnProdRuedasTextField.setEditable(false);
        spnProdRuedas.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnProdRuedasStateChanged(evt);
            }
        });

        javax.swing.GroupLayout panelRuedasLayout = new javax.swing.GroupLayout(panelRuedas);
        panelRuedas.setLayout(panelRuedasLayout);
        panelRuedasLayout.setHorizontalGroup(
            panelRuedasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRuedasLayout.createSequentialGroup()
                .addGroup(panelRuedasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTiempoRuedas)
                    .addComponent(labelAlmacenRuedas)
                    .addComponent(labelProdRuedas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRuedasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRuedasLayout.createSequentialGroup()
                        .addComponent(prodRuedasActivo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(slash5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(maxProdRuedas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(spnProdRuedas, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRuedasLayout.createSequentialGroup()
                        .addGroup(panelRuedasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRuedasLayout.createSequentialGroup()
                                .addComponent(inAlmacenRuedas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(slash6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(maxAlmacenRuedas))
                            .addGroup(panelRuedasLayout.createSequentialGroup()
                                .addComponent(tiempoRuedas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelDiasRuedas)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRuedasLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnProdRuedas))
        );
        panelRuedasLayout.setVerticalGroup(
            panelRuedasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRuedasLayout.createSequentialGroup()
                .addGroup(panelRuedasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelProdRuedas)
                    .addComponent(prodRuedasActivo)
                    .addComponent(slash5)
                    .addComponent(maxProdRuedas)
                    .addComponent(spnProdRuedas, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRuedasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAlmacenRuedas)
                    .addComponent(inAlmacenRuedas)
                    .addComponent(slash6)
                    .addComponent(maxAlmacenRuedas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRuedasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTiempoRuedas)
                    .addComponent(tiempoRuedas)
                    .addComponent(labelDiasRuedas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnProdRuedas))
        );

        panelMarcos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Produccion de marcos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monospaced", 1, 14))); // NOI18N

        maxProdMarcos.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        maxProdMarcos.setText("00");

        labelProdMarcos.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        labelProdMarcos.setText("Nº productores:");

        inAlmacenMarcos.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        inAlmacenMarcos.setText("00");

        labelDiasMarcos.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        labelDiasMarcos.setText("dia(s)");

        labelAlmacenMarcos.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        labelAlmacenMarcos.setText("Almacen");

        slash8.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        slash8.setText("/");

        slash7.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        slash7.setText("/");

        prodMarcosActivo.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        prodMarcosActivo.setText("00");

        maxAlmacenMarcos.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        maxAlmacenMarcos.setText("00");

        labelTiempoMarcos.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        labelTiempoMarcos.setText("Tiempo de producción:");

        tiempoMarcos.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        tiempoMarcos.setText("00");

        btnProdMarcos.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        btnProdMarcos.setText("Pausar producción");
        btnProdMarcos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdMarcosActionPerformed(evt);
            }
        });

        spnProdMarcos.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        spnProdMarcos.setModel(new javax.swing.SpinnerNumberModel(0,0,vec[14],1));
        JFormattedTextField spnProdMarcosTextField = ((JSpinner.DefaultEditor) spnProdMarcos.getEditor()).getTextField();
        spnProdMarcosTextField.setEditable(false);
        spnProdMarcos.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnProdMarcosStateChanged(evt);
            }
        });

        javax.swing.GroupLayout panelMarcosLayout = new javax.swing.GroupLayout(panelMarcos);
        panelMarcos.setLayout(panelMarcosLayout);
        panelMarcosLayout.setHorizontalGroup(
            panelMarcosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMarcosLayout.createSequentialGroup()
                .addGroup(panelMarcosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTiempoMarcos)
                    .addComponent(labelAlmacenMarcos)
                    .addComponent(labelProdMarcos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMarcosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMarcosLayout.createSequentialGroup()
                        .addGroup(panelMarcosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelMarcosLayout.createSequentialGroup()
                                .addComponent(inAlmacenMarcos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(slash8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(maxAlmacenMarcos))
                            .addGroup(panelMarcosLayout.createSequentialGroup()
                                .addComponent(tiempoMarcos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelDiasMarcos)))
                        .addGap(0, 151, Short.MAX_VALUE))
                    .addGroup(panelMarcosLayout.createSequentialGroup()
                        .addComponent(prodMarcosActivo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(slash7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(maxProdMarcos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(spnProdMarcos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(panelMarcosLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnProdMarcos))
        );
        panelMarcosLayout.setVerticalGroup(
            panelMarcosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMarcosLayout.createSequentialGroup()
                .addGroup(panelMarcosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelProdMarcos)
                    .addComponent(prodMarcosActivo)
                    .addComponent(slash7)
                    .addComponent(maxProdMarcos)
                    .addComponent(spnProdMarcos, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMarcosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAlmacenMarcos)
                    .addComponent(inAlmacenMarcos)
                    .addComponent(slash8)
                    .addComponent(maxAlmacenMarcos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMarcosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTiempoMarcos)
                    .addComponent(tiempoMarcos)
                    .addComponent(labelDiasMarcos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(btnProdMarcos))
        );

        panelTric.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ensamblaje de triciclos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monospaced", 1, 14))); // NOI18N

        slash12.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        slash12.setText("/");

        maxEnsTric.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        maxEnsTric.setText("00");

        readyTric.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        readyTric.setText("00");

        maxTric.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        maxTric.setText("00");

        labelTiempoTric.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        labelTiempoTric.setText("Tiempo total de ensamblaje:");

        slash11.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        slash11.setText("/");

        labelDiasTric.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        labelDiasTric.setText("dia(s)");

        labelEnsTric.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        labelEnsTric.setText("Nº ensambladores:");

        labelPedidoTric.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        labelPedidoTric.setText("Tamaño de pedido:");

        ensTricActivo.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        ensTricActivo.setText("00");

        tiempoTriciclo.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        tiempoTriciclo.setText("00");

        btnEnsTric.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        btnEnsTric.setText("Pausar ensamblaje");
        btnEnsTric.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnsTricActionPerformed(evt);
            }
        });

        spnEnsTric.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        spnEnsTric.setModel(new javax.swing.SpinnerNumberModel(0,0,vec[18],1));
        JFormattedTextField spnEnsTricTextField = ((JSpinner.DefaultEditor) spnEnsTric.getEditor()).getTextField();
        spnEnsTricTextField.setEditable(false);
        spnEnsTric.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnEnsTricStateChanged(evt);
            }
        });

        javax.swing.GroupLayout panelTricLayout = new javax.swing.GroupLayout(panelTric);
        panelTric.setLayout(panelTricLayout);
        panelTricLayout.setHorizontalGroup(
            panelTricLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTricLayout.createSequentialGroup()
                .addGroup(panelTricLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTiempoTric)
                    .addComponent(labelPedidoTric)
                    .addComponent(labelEnsTric))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTricLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTricLayout.createSequentialGroup()
                        .addComponent(ensTricActivo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(slash11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(maxEnsTric)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(spnEnsTric, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelTricLayout.createSequentialGroup()
                        .addGroup(panelTricLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelTricLayout.createSequentialGroup()
                                .addComponent(readyTric)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(slash12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(maxTric))
                            .addGroup(panelTricLayout.createSequentialGroup()
                                .addComponent(tiempoTriciclo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelDiasTric)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(panelTricLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnEnsTric))
        );
        panelTricLayout.setVerticalGroup(
            panelTricLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTricLayout.createSequentialGroup()
                .addGroup(panelTricLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEnsTric)
                    .addComponent(ensTricActivo)
                    .addComponent(slash11)
                    .addComponent(maxEnsTric)
                    .addComponent(spnEnsTric, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTricLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPedidoTric)
                    .addComponent(readyTric)
                    .addComponent(slash12)
                    .addComponent(maxTric))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTricLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTiempoTric)
                    .addComponent(tiempoTriciclo)
                    .addComponent(labelDiasTric))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEnsTric))
        );

        panelBic.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ensamblaje de bicicletas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monospaced", 1, 14))); // NOI18N

        slash10.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        slash10.setText("/");

        maxEnsBic.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        maxEnsBic.setText("00");

        readyBic.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        readyBic.setText("00");

        maxBic.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        maxBic.setText("00");

        labelTiempoBic.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        labelTiempoBic.setText("Tiempo total de ensamblaje:");

        slash9.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        slash9.setText("/");

        labelDiasBic.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        labelDiasBic.setText("dia(s)");

        labelEnsBic.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        labelEnsBic.setText("Nº ensambladores:");

        labelPedidoBic.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        labelPedidoBic.setText("Tamaño de pedido:");

        ensBicActivo.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        ensBicActivo.setText("00");

        tiempoBicicletas.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        tiempoBicicletas.setText("00");

        btnEnsBic.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        btnEnsBic.setText("Pausar ensamblaje");
        btnEnsBic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnsBicActionPerformed(evt);
            }
        });

        spnEnsBic.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        spnEnsBic.setModel(new javax.swing.SpinnerNumberModel(0,0,vec[17],1));
        JFormattedTextField spnEnsBicTextField = ((JSpinner.DefaultEditor) spnEnsBic.getEditor()).getTextField();
        spnEnsBicTextField.setEditable(false);
        spnEnsBic.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnEnsBicStateChanged(evt);
            }
        });

        javax.swing.GroupLayout panelBicLayout = new javax.swing.GroupLayout(panelBic);
        panelBic.setLayout(panelBicLayout);
        panelBicLayout.setHorizontalGroup(
            panelBicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBicLayout.createSequentialGroup()
                .addGroup(panelBicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTiempoBic)
                    .addComponent(labelPedidoBic)
                    .addComponent(labelEnsBic))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBicLayout.createSequentialGroup()
                        .addComponent(ensBicActivo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(slash9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(maxEnsBic)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                        .addComponent(spnEnsBic, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBicLayout.createSequentialGroup()
                        .addGroup(panelBicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBicLayout.createSequentialGroup()
                                .addComponent(readyBic)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(slash10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(maxBic))
                            .addGroup(panelBicLayout.createSequentialGroup()
                                .addComponent(tiempoBicicletas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelDiasBic)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(panelBicLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnEnsBic))
        );
        panelBicLayout.setVerticalGroup(
            panelBicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBicLayout.createSequentialGroup()
                .addGroup(panelBicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEnsBic)
                    .addComponent(ensBicActivo)
                    .addComponent(slash9)
                    .addComponent(maxEnsBic)
                    .addComponent(spnEnsBic, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPedidoBic)
                    .addComponent(readyBic)
                    .addComponent(slash10)
                    .addComponent(maxBic))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTiempoBic)
                    .addComponent(tiempoBicicletas)
                    .addComponent(labelDiasBic))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEnsBic))
        );

        panelProgreso.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resumen de progreso", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monospaced", 1, 14))); // NOI18N

        barProgreso.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N

        labelTiempoTotal.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        labelTiempoTotal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelTiempoTotal.setLabelFor(barProgreso);
        labelTiempoTotal.setText("Tiempo total de actividad:");

        tiempoTotal.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        tiempoTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tiempoTotal.setLabelFor(barProgreso);
        tiempoTotal.setText("00");

        labelDiasTotal.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        labelDiasTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDiasTotal.setLabelFor(barProgreso);
        labelDiasTotal.setText("dia(s)");

        javax.swing.GroupLayout panelProgresoLayout = new javax.swing.GroupLayout(panelProgreso);
        panelProgreso.setLayout(panelProgresoLayout);
        panelProgresoLayout.setHorizontalGroup(
            panelProgresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProgresoLayout.createSequentialGroup()
                .addComponent(labelTiempoTotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tiempoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelDiasTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(barProgreso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelProgresoLayout.setVerticalGroup(
            panelProgresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelProgresoLayout.createSequentialGroup()
                .addGroup(panelProgresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTiempoTotal)
                    .addComponent(tiempoTotal)
                    .addComponent(labelDiasTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(barProgreso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnFabrica.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        btnFabrica.setText("Iniciar");
        btnFabrica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFabricaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelFabricaLayout = new javax.swing.GroupLayout(panelFabrica);
        panelFabrica.setLayout(panelFabricaLayout);
        panelFabricaLayout.setHorizontalGroup(
            panelFabricaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFabricaLayout.createSequentialGroup()
                .addGroup(panelFabricaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panelProgreso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelFabricaLayout.createSequentialGroup()
                        .addGroup(panelFabricaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelFabricaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(panelRuedas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(panelBic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(panelNeumaticos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelFabricaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelBujes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelMarcos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelTric, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFabricaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFabrica, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelFabricaLayout.setVerticalGroup(
            panelFabricaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFabricaLayout.createSequentialGroup()
                .addGroup(panelFabricaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelNeumaticos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelBujes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelFabricaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelMarcos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelRuedas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelFabricaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelBic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelTric, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelProgreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFabrica, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenu1.setText("File");
        menu.add(jMenu1);

        jMenu2.setText("Edit");
        menu.add(jMenu2);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFabrica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFabrica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProdNeumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdNeumActionPerformed
        if(btnProdNeum.getText().equals("Pausar producción"))
        {
            f.pausarProductores(f.getVecProductoresNeumaticos());
            btnProdNeum.setText("Reanudar producción");
        }
        else if (btnProdNeum.getText().equals("Reanudar producción")) 
        {
            f.reanudarProductores(f.getVecProductoresNeumaticos());
            btnProdNeum.setText("Pausar producción");
        }   
    }//GEN-LAST:event_btnProdNeumActionPerformed

    private void btnProdRuedasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdRuedasActionPerformed
        if(btnProdRuedas.getText().equals("Pausar producción"))
        {
            f.pausarProductorEnsamblador(f.getVecProductoresRuedas());
            btnProdRuedas.setText("Reanudar producción");
        }
        else if (btnProdRuedas.getText().equals("Reanudar producción")) 
        {
            f.reanudarProductoreEnsamblador(f.getVecProductoresRuedas());
            btnProdRuedas.setText("Pausar producción");
        }
    }//GEN-LAST:event_btnProdRuedasActionPerformed

    private void btnProdBujesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdBujesActionPerformed
        if(btnProdBujes.getText().equals("Pausar producción"))
        {
            f.pausarProductores(f.getVecProductoresBujes());
            btnProdBujes.setText("Reanudar producción");
        }
        else if (btnProdBujes.getText().equals("Reanudar producción")) 
        {
            f.reanudarProductores(f.getVecProductoresBujes());
            btnProdBujes.setText("Pausar producción");
        }
    }//GEN-LAST:event_btnProdBujesActionPerformed

    private void btnProdMarcosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdMarcosActionPerformed
        if(btnProdMarcos.getText().equals("Pausar producción"))
        {
            f.pausarProductores(f.getVecProductoresMarcos());
            btnProdMarcos.setText("Reanudar producción");
        }
        else if (btnProdMarcos.getText().equals("Reanudar producción")) 
        {
            f.reanudarProductores(f.getVecProductoresMarcos());
            btnProdMarcos.setText("Pausar producción");
        }
    }//GEN-LAST:event_btnProdMarcosActionPerformed

    private void btnEnsBicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnsBicActionPerformed
        if(btnEnsBic.getText().equals("Pausar ensamblaje"))
        {
            f.pausarEnsamblador(f.getVecEnsambladoresBici());
            btnEnsBic.setText("Reanudar producción");
        }
        else if (btnEnsBic.getText().equals("Reanudar ensamblaje")) 
        {
            f.reanudarEnsamblador(f.getVecEnsambladoresBici());
            btnEnsBic.setText("Pausar producción");
        }
    }//GEN-LAST:event_btnEnsBicActionPerformed

    private void btnEnsTricActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnsTricActionPerformed
        if(btnEnsTric.getText().equals("Pausar ensamblaje"))
        {
            f.pausarEnsamblador(f.getVecEnsambladoresTrici());
            btnEnsTric.setText("Reanudar producción");
        }
        else if (btnEnsTric.getText().equals("Reanudar ensamblaje")) 
        {
            f.reanudarEnsamblador(f.getVecEnsambladoresTrici());
            btnEnsTric.setText("Pausar producción");
        }
        
    }//GEN-LAST:event_btnEnsTricActionPerformed

    private void btnFabricaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFabricaActionPerformed

        Tiempo t = new Tiempo(tiempoTotal, 0, vec[0], f.getAlmacenBici(), f.getAlmacenTrici(), tiempoBicicletas, tiempoTriciclo);
        t.start();
        
        f.contratarProductoresNeumaticos(vec[7]);
        f.contratarProductoresBujes(vec[8]);
        f.contratarProductoresMarcos(vec[10]);
        f.contratarProductoresRuedas(vec[9]);
        f.contratarEnsambladoresBici(vec[15]);
        f.contratarEnsambladoresTrici(vec[16]);
        
        // Productores iniciales
        prodNeumActivo.setText(Integer.toString(vec[7]));
        prodBujesActivo.setText(Integer.toString(vec[8]));
        prodRuedasActivo.setText(Integer.toString(vec[9]));
        prodMarcosActivo.setText(Integer.toString(vec[10]));
        
        // Productores maximos
        maxProdNeum.setText(Integer.toString(vec[11]));
        maxProdBujes.setText(Integer.toString(vec[12]));
        maxProdRuedas.setText(Integer.toString(vec[13]));
        maxProdMarcos.setText(Integer.toString(vec[14]));
        
        // Ensambladores iniciales
        ensBicActivo.setText(Integer.toString(vec[15]));
        ensTricActivo.setText(Integer.toString(vec[16]));
        
        // Ensambladores maximos
        maxEnsBic.setText(Integer.toString(vec[17]));
        maxEnsTric.setText(Integer.toString(vec[18]));
        
        // Tamaño de pedido
        maxBic.setText(Integer.toString(vec[1]));
        maxTric.setText(Integer.toString(vec[2]));
        
        // Tamaño de almacenes
        maxAlmacenNeum.setText(Integer.toString(vec[3]));
        maxAlmacenBujes.setText(Integer.toString(vec[4]));
        maxAlmacenRuedas.setText(Integer.toString(vec[5]));
        maxAlmacenMarcos.setText(Integer.toString(vec[6]));
        
        // Spinners
        spnProdNeum.setValue(vec[7]);   
        spnProdBujes.setValue(vec[8]);
        spnProdRuedas.setValue(vec[9]);
        spnProdMarcos.setValue(vec[10]);
        spnEnsBic.setValue(vec[15]);
        spnEnsTric.setValue(vec[16]);
        
        // Tiempos
        tiempoNeum.setText("1");
        tiempoBujes.setText("1");
        tiempoRuedas.setText("1/2");
        tiempoMarcos.setText("2");       
    }//GEN-LAST:event_btnFabricaActionPerformed

    private void spnProdNeumStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnProdNeumStateChanged
        int cantidadProductores = Integer.parseInt(spnProdNeum.getValue().toString());
        f.contratarProductoresNeumaticos(cantidadProductores);
        prodNeumActivo.setText(Integer.toString(cantidadProductores));
        f.contar(f.getVecProductoresNeumaticos());
    }//GEN-LAST:event_spnProdNeumStateChanged

    private void spnEnsBicStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnEnsBicStateChanged
        int cantidadProductores = Integer.parseInt(spnEnsBic.getValue().toString());
        f.contratarEnsambladoresBici(cantidadProductores);
        ensBicActivo.setText(Integer.toString(cantidadProductores));
        f.contar3(f.getVecEnsambladoresBici());
    }//GEN-LAST:event_spnEnsBicStateChanged

    private void spnProdBujesStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnProdBujesStateChanged
        int cantidadProductores = Integer.parseInt(spnProdBujes.getValue().toString());
        f.contratarProductoresBujes(cantidadProductores);
        prodBujesActivo.setText(Integer.toString(cantidadProductores));
        f.contar(f.getVecProductoresBujes());
    }//GEN-LAST:event_spnProdBujesStateChanged

    private void spnProdRuedasStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnProdRuedasStateChanged
        int cantidadProductores = Integer.parseInt(spnProdRuedas.getValue().toString());
        f.contratarProductoresRuedas(cantidadProductores);
        prodRuedasActivo.setText(Integer.toString(cantidadProductores));
        f.contar2(f.getVecProductoresRuedas());
    }//GEN-LAST:event_spnProdRuedasStateChanged

    private void spnProdMarcosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnProdMarcosStateChanged
        int cantidadProductores = Integer.parseInt(spnProdMarcos.getValue().toString());
        prodMarcosActivo.setText(Integer.toString(cantidadProductores));
        f.contratarProductoresMarcos(cantidadProductores);
        f.contar(f.getVecProductoresMarcos());
    }//GEN-LAST:event_spnProdMarcosStateChanged

    private void spnEnsTricStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnEnsTricStateChanged
        int cantidadProductores = Integer.parseInt(spnEnsTric.getValue().toString());
        f.contratarEnsambladoresTrici(cantidadProductores);
        ensTricActivo.setText(Integer.toString(cantidadProductores));
        f.contar3(f.getVecEnsambladoresTrici());
    }//GEN-LAST:event_spnEnsTricStateChanged
                                                                          
    public static void main(String args[])
    {
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
            java.util.logging.Logger.getLogger(FabricaBicicletasUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FabricaBicicletasUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FabricaBicicletasUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FabricaBicicletasUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() 
        {           
            @Override
            public void run() 
            {
                new FabricaBicicletasUI(vec).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barProgreso;
    private javax.swing.JToggleButton btnEnsBic;
    private javax.swing.JToggleButton btnEnsTric;
    private javax.swing.JButton btnFabrica;
    private javax.swing.JToggleButton btnProdBujes;
    private javax.swing.JToggleButton btnProdMarcos;
    private javax.swing.JToggleButton btnProdNeum;
    private javax.swing.JToggleButton btnProdRuedas;
    private javax.swing.JLabel ensBicActivo;
    private javax.swing.JLabel ensTricActivo;
    private javax.swing.JLabel inAlmacenBujes;
    private javax.swing.JLabel inAlmacenMarcos;
    private javax.swing.JLabel inAlmacenNeum;
    private javax.swing.JLabel inAlmacenRuedas;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JLabel labelAlmacenBujes;
    private javax.swing.JLabel labelAlmacenMarcos;
    private javax.swing.JLabel labelAlmacenNeum;
    private javax.swing.JLabel labelAlmacenRuedas;
    private javax.swing.JLabel labelDiasBic;
    private javax.swing.JLabel labelDiasBuje;
    private javax.swing.JLabel labelDiasMarcos;
    private javax.swing.JLabel labelDiasNeum;
    private javax.swing.JLabel labelDiasRuedas;
    private javax.swing.JLabel labelDiasTotal;
    private javax.swing.JLabel labelDiasTric;
    private javax.swing.JLabel labelEnsBic;
    private javax.swing.JLabel labelEnsTric;
    private javax.swing.JLabel labelPedidoBic;
    private javax.swing.JLabel labelPedidoTric;
    private javax.swing.JLabel labelProdBujes;
    private javax.swing.JLabel labelProdMarcos;
    private javax.swing.JLabel labelProdNeum;
    private javax.swing.JLabel labelProdRuedas;
    private javax.swing.JLabel labelTiempoBic;
    private javax.swing.JLabel labelTiempoBujes;
    private javax.swing.JLabel labelTiempoMarcos;
    private javax.swing.JLabel labelTiempoNeum;
    private javax.swing.JLabel labelTiempoRuedas;
    private javax.swing.JLabel labelTiempoTotal;
    private javax.swing.JLabel labelTiempoTric;
    private javax.swing.JLabel maxAlmacenBujes;
    private javax.swing.JLabel maxAlmacenMarcos;
    private javax.swing.JLabel maxAlmacenNeum;
    private javax.swing.JLabel maxAlmacenRuedas;
    private javax.swing.JLabel maxBic;
    private javax.swing.JLabel maxEnsBic;
    private javax.swing.JLabel maxEnsTric;
    private javax.swing.JLabel maxProdBujes;
    private javax.swing.JLabel maxProdMarcos;
    private javax.swing.JLabel maxProdNeum;
    private javax.swing.JLabel maxProdRuedas;
    private javax.swing.JLabel maxTric;
    private javax.swing.JMenuBar menu;
    private javax.swing.JPanel panelBic;
    private javax.swing.JPanel panelBujes;
    private javax.swing.JPanel panelFabrica;
    private javax.swing.JPanel panelMarcos;
    private javax.swing.JPanel panelNeumaticos;
    private javax.swing.JPanel panelProgreso;
    private javax.swing.JPanel panelRuedas;
    private javax.swing.JPanel panelTric;
    private javax.swing.JLabel prodBujesActivo;
    private javax.swing.JLabel prodMarcosActivo;
    private javax.swing.JLabel prodNeumActivo;
    private javax.swing.JLabel prodRuedasActivo;
    private javax.swing.JLabel readyBic;
    private javax.swing.JLabel readyTric;
    private javax.swing.JLabel slash1;
    private javax.swing.JLabel slash10;
    private javax.swing.JLabel slash11;
    private javax.swing.JLabel slash12;
    private javax.swing.JLabel slash2;
    private javax.swing.JLabel slash3;
    private javax.swing.JLabel slash4;
    private javax.swing.JLabel slash5;
    private javax.swing.JLabel slash6;
    private javax.swing.JLabel slash7;
    private javax.swing.JLabel slash8;
    private javax.swing.JLabel slash9;
    private javax.swing.JSpinner spnEnsBic;
    private javax.swing.JSpinner spnEnsTric;
    private javax.swing.JSpinner spnProdBujes;
    private javax.swing.JSpinner spnProdMarcos;
    private javax.swing.JSpinner spnProdNeum;
    private javax.swing.JSpinner spnProdRuedas;
    private javax.swing.JLabel tiempoBicicletas;
    private javax.swing.JLabel tiempoBujes;
    private javax.swing.JLabel tiempoMarcos;
    private javax.swing.JLabel tiempoNeum;
    private javax.swing.JLabel tiempoRuedas;
    private javax.swing.JLabel tiempoTotal;
    private javax.swing.JLabel tiempoTriciclo;
    // End of variables declaration//GEN-END:variables

}

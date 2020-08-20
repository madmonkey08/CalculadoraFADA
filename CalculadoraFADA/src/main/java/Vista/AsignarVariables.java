package Vista;

import Modelo.CalculadoraLogic;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public final class AsignarVariables extends javax.swing.JFrame {

    private static AsignarVariables instance = new AsignarVariables();

    private AsignarVariables() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {

                mostrarVariables();
            }

            @Override
            public void windowClosing(WindowEvent e) {
                txfNombreVariable.setText("");
                txfValorVariable.setText("");
            }

            @Override
            public void windowClosed(WindowEvent e) {
                txfNombreVariable.setText("");
                txfValorVariable.setText("");
            }

            @Override
            public void windowIconified(WindowEvent e) {
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
            }

            @Override
            public void windowActivated(WindowEvent e) {
                mostrarVariables();
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
            }
        });

        txfNombreVariable.requestFocus(true);
        this.getContentPane().setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
        this.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNombreVariable = new javax.swing.JLabel();
        lblValorVariable = new javax.swing.JLabel();
        txfValorVariable = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVariables = new javax.swing.JTable();
        btnAsignar = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        txfNombreVariable = new javax.swing.JTextField();
        btnCerrar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombreVariable.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNombreVariable.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreVariable.setText("Nombre de variable:");
        getContentPane().add(lblNombreVariable, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 84, -1, -1));

        lblValorVariable.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblValorVariable.setForeground(new java.awt.Color(255, 255, 255));
        lblValorVariable.setText("Valor de variable:");
        getContentPane().add(lblValorVariable, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 84, -1, -1));

        txfValorVariable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txfValorVariable.setForeground(new java.awt.Color(255, 255, 255));
        txfValorVariable.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfValorVariable.setNextFocusableComponent(txfNombreVariable);
        txfValorVariable.setOpaque(false);
        txfValorVariable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfValorVariableActionPerformed(evt);
            }
        });
        txfValorVariable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfValorVariableKeyTyped(evt);
            }
        });
        getContentPane().add(txfValorVariable, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 104, 131, 33));

        tablaVariables.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Variable", "Valor"
            }
        ));
        tablaVariables.setOpaque(false);
        tablaVariables.setSelectionBackground(new java.awt.Color(67, 67, 67));
        tablaVariables.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaVariablesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaVariables);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 171, -1, 121));

        btnAsignar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botonAsignar.PNG"))); // NOI18N
        btnAsignar.setBorderPainted(false);
        btnAsignar.setContentAreaFilled(false);
        btnAsignar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/botonAsignarPulsado.png"))); // NOI18N
        btnAsignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAsignar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 140, 40));

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Asignación de variables:");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 31, -1, -1));

        txfNombreVariable.setBackground(new java.awt.Color(67, 67, 67));
        txfNombreVariable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txfNombreVariable.setForeground(new java.awt.Color(255, 255, 255));
        txfNombreVariable.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfNombreVariable.setOpaque(false);
        txfNombreVariable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfNombreVariableActionPerformed(evt);
            }
        });
        txfNombreVariable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfNombreVariableKeyTyped(evt);
            }
        });
        getContentPane().add(txfNombreVariable, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 104, 131, 33));

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Equis.png"))); // NOI18N
        btnCerrar.setBorderPainted(false);
        btnCerrar.setContentAreaFilled(false);
        btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCerrar.setFocusable(false);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 30, 30));

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btnEliminar.PNG"))); // NOI18N
        btnEliminar.setBorderPainted(false);
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.setFocusable(false);
        btnEliminar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/btnEliminarPresionado.png"))); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 90, 40));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FondoAsignar.png"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAsignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarActionPerformed

        asignarVariable();

    }//GEN-LAST:event_btnAsignarActionPerformed

    private void txfValorVariableKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfValorVariableKeyTyped

        Character c = evt.getKeyChar();
        if (Character.isDigit(c)) {

        } else {
            evt.consume();
        }

        if (Character.isSpaceChar(c)) {
            evt.consume();
        }

        if (txfValorVariable.getText().trim().length() >= 5) {
            evt.consume();
        }

    }//GEN-LAST:event_txfValorVariableKeyTyped

    private void txfNombreVariableKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfNombreVariableKeyTyped

        Character c = evt.getKeyChar();

        if (!Character.isUpperCase(c)) {

            String cad = ("" + c).toLowerCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }

        if (Character.isAlphabetic(c)) {

        } else {
            evt.consume();
        }

        if (Character.isSpaceChar(c)) {
            evt.consume();
        }

        if (txfNombreVariable.getText().trim().length() >= 7) {
            evt.consume();
        }

    }//GEN-LAST:event_txfNombreVariableKeyTyped

    private void txfValorVariableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfValorVariableActionPerformed
        asignarVariable();
    }//GEN-LAST:event_txfValorVariableActionPerformed

    private void txfNombreVariableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfNombreVariableActionPerformed

        asignarVariable();
    }//GEN-LAST:event_txfNombreVariableActionPerformed

    private void tablaVariablesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaVariablesMouseClicked

        String nombre_variable = tablaVariables.getValueAt(tablaVariables.getSelectedRow(), 0).toString();
        String valor_variable = tablaVariables.getValueAt(tablaVariables.getSelectedRow(), 1).toString();

        txfNombreVariable.setText(nombre_variable);
        txfValorVariable.setText(valor_variable);

    }//GEN-LAST:event_tablaVariablesMouseClicked

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        if (tablaVariables.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Por favor seleccione una variable de la tabla.");
        } else {
            String nombre_variable = tablaVariables.getValueAt(tablaVariables.getSelectedRow(), 0).toString();
            if (Calculadora.variables.contains(nombre_variable)) {

                int posicion = Calculadora.variables.indexOf(nombre_variable);
                Calculadora.variables.remove(posicion);
                Calculadora.valores_variables.remove(posicion);
                JOptionPane.showMessageDialog(null, "Variable eliminada con éxito.");
                txfNombreVariable.setText("");
                txfValorVariable.setText("");
                mostrarVariables();
            } else {
                JOptionPane.showMessageDialog(null, "La variable no ha sido encontrada.");
            }
        }

    }//GEN-LAST:event_btnEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAsignar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblNombreVariable;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblValorVariable;
    private javax.swing.JTable tablaVariables;
    private javax.swing.JTextField txfNombreVariable;
    private javax.swing.JTextField txfValorVariable;
    // End of variables declaration//GEN-END:variables

    public void asignarVariable() {

        String nombre_variable = txfNombreVariable.getText().trim();
        String valor_variable = txfValorVariable.getText().trim();

        if (nombre_variable.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese el nombre de la variable por favor.");
        } else if (valor_variable.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese el valor de la variable por favor.");
        } else {

            if (Calculadora.variables.contains(nombre_variable)) {

                int posicion = Calculadora.variables.indexOf(nombre_variable);
                Calculadora.valores_variables.set(posicion, valor_variable);
                JOptionPane.showMessageDialog(null, "Variable actualizada correctamente.");
                txfNombreVariable.setText("");
                txfValorVariable.setText("");
                txfNombreVariable.requestFocus(true);
                mostrarVariables();
            } else {
                Calculadora.variables.add(nombre_variable);
                Calculadora.valores_variables.add(valor_variable);

                JOptionPane.showMessageDialog(null, "Variable asignada correctamente.");
                txfNombreVariable.setText("");
                txfValorVariable.setText("");
                txfNombreVariable.requestFocus(true);
                mostrarVariables();
            }
            System.out.println("VARIABLES: \n" + Calculadora.getVariables() + "\n" + "VALORES \n " + Calculadora.getValores_variables());
        }
    }

    public void mostrarVariables() {

        try {

            int tamaño = Calculadora.variables.size();
            DefaultTableModel modelo = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            modelo.addColumn("Variable");
            modelo.addColumn("Valor");
            modelo.setRowCount(tamaño);
            for (int i = 0; i < tamaño; i++) {
                modelo.setValueAt(Calculadora.variables.get(i), i, 0);
                modelo.setValueAt(Calculadora.valores_variables.get(i), i, 1);
            }
            tablaVariables.setModel(modelo);
        } catch (ArrayIndexOutOfBoundsException a) {
            JOptionPane.showMessageDialog(null, a.getMessage());
        }
    }

    public static AsignarVariables ObtenerInstancia() {
        if (instance == null) {
            instance = new AsignarVariables();
        }
        return instance;
    }
}

package Vista;

import Modelo.CalculadoraLogic;
import Modelo.Capturador;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import static java.lang.Math.pow;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Alvaro José Tobar, Juan Aldana, Santiago Pineda
 */
public class Calculadora extends javax.swing.JFrame implements KeyListener {

    public static List<String> variables = new ArrayList<>();
    public static List<String> valores_variables;
    private final CalculadoraLogic cal;
    private AsignarVariables ventana_asignar = AsignarVariables.ObtenerInstancia();
    private char ultimo_caracter = '0';
    private String capturador = "";
    private String acumulador = "";

    public Calculadora() {
        initComponents();
        valores_variables = new ArrayList<>();
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
        this.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
        txfPantalla.requestFocus(true);
        this.setFocusable(true);
        cal = new CalculadoraLogic();
        this.addKeyListener(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        separador = new javax.swing.JSeparator();
        btnCerrar = new javax.swing.JButton();
        botonesPanel = new javax.swing.JPanel();
        btnBorrar = new javax.swing.JButton();
        btnExp = new javax.swing.JButton();
        btnPunto = new javax.swing.JButton();
        btnDividir = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnMultiplicar = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btnSumar = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btnRestar = new javax.swing.JButton();
        btnParentesisA = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnParentesisB = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();
        txfHistorial = new javax.swing.JTextField();
        txfPantalla = new javax.swing.JTextField();
        btnAsignarVariable = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        separador.setBackground(new java.awt.Color(102, 102, 102));
        separador.setForeground(new java.awt.Color(76, 76, 76));
        getContentPane().add(separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 350, 20));

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
        getContentPane().add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 30, 30));

        botonesPanel.setBackground(new java.awt.Color(0, 0, 0));
        botonesPanel.setOpaque(false);

        btnBorrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBorrar.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrar.setText("C");
        btnBorrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnBorrar.setBorderPainted(false);
        btnBorrar.setContentAreaFilled(false);
        btnBorrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBorrar.setFocusable(false);
        btnBorrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBorrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBorrarMouseExited(evt);
            }
        });
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnExp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnExp.setForeground(new java.awt.Color(255, 255, 255));
        btnExp.setText("^");
        btnExp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnExp.setBorderPainted(false);
        btnExp.setContentAreaFilled(false);
        btnExp.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnExp.setFocusable(false);
        btnExp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExpMouseExited(evt);
            }
        });
        btnExp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExpActionPerformed(evt);
            }
        });

        btnPunto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnPunto.setForeground(new java.awt.Color(255, 255, 255));
        btnPunto.setText(".");
        btnPunto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnPunto.setBorderPainted(false);
        btnPunto.setContentAreaFilled(false);
        btnPunto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPunto.setFocusable(false);
        btnPunto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPuntoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPuntoMouseExited(evt);
            }
        });
        btnPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPuntoActionPerformed(evt);
            }
        });

        btnDividir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnDividir.setForeground(new java.awt.Color(254, 104, 108));
        btnDividir.setText("/");
        btnDividir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnDividir.setBorderPainted(false);
        btnDividir.setContentAreaFilled(false);
        btnDividir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnDividir.setFocusable(false);
        btnDividir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDividirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDividirMouseExited(evt);
            }
        });
        btnDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDividirActionPerformed(evt);
            }
        });

        btn7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn7.setForeground(new java.awt.Color(255, 255, 255));
        btn7.setText("7");
        btn7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btn7.setBorderPainted(false);
        btn7.setContentAreaFilled(false);
        btn7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn7.setFocusable(false);
        btn7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn7MouseExited(evt);
            }
        });
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn8.setForeground(new java.awt.Color(255, 255, 255));
        btn8.setText("8");
        btn8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btn8.setBorderPainted(false);
        btn8.setContentAreaFilled(false);
        btn8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn8.setFocusable(false);
        btn8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn8MouseExited(evt);
            }
        });
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn9.setForeground(new java.awt.Color(255, 255, 255));
        btn9.setText("9");
        btn9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btn9.setBorderPainted(false);
        btn9.setContentAreaFilled(false);
        btn9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn9.setFocusable(false);
        btn9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn9MouseExited(evt);
            }
        });
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btnMultiplicar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnMultiplicar.setForeground(new java.awt.Color(254, 104, 108));
        btnMultiplicar.setText("*");
        btnMultiplicar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnMultiplicar.setBorderPainted(false);
        btnMultiplicar.setContentAreaFilled(false);
        btnMultiplicar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnMultiplicar.setFocusable(false);
        btnMultiplicar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMultiplicarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMultiplicarMouseExited(evt);
            }
        });
        btnMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicarActionPerformed(evt);
            }
        });

        btn4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn4.setForeground(new java.awt.Color(255, 255, 255));
        btn4.setText("4");
        btn4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btn4.setBorderPainted(false);
        btn4.setContentAreaFilled(false);
        btn4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn4.setFocusable(false);
        btn4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn4MouseExited(evt);
            }
        });
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn5.setForeground(new java.awt.Color(255, 255, 255));
        btn5.setText("5");
        btn5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btn5.setBorderPainted(false);
        btn5.setContentAreaFilled(false);
        btn5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn5.setFocusable(false);
        btn5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn5MouseExited(evt);
            }
        });
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn6.setForeground(new java.awt.Color(255, 255, 255));
        btn6.setText("6");
        btn6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btn6.setBorderPainted(false);
        btn6.setContentAreaFilled(false);
        btn6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn6.setFocusable(false);
        btn6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn6MouseExited(evt);
            }
        });
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btnSumar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSumar.setForeground(new java.awt.Color(254, 104, 108));
        btnSumar.setText("+");
        btnSumar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnSumar.setBorderPainted(false);
        btnSumar.setContentAreaFilled(false);
        btnSumar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSumar.setFocusable(false);
        btnSumar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSumarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSumarMouseExited(evt);
            }
        });
        btnSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumarActionPerformed(evt);
            }
        });

        btn1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn1.setForeground(new java.awt.Color(255, 255, 255));
        btn1.setText("1");
        btn1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btn1.setBorderPainted(false);
        btn1.setContentAreaFilled(false);
        btn1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn1.setFocusable(false);
        btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn1MouseExited(evt);
            }
        });
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn2.setForeground(new java.awt.Color(255, 255, 255));
        btn2.setText("2");
        btn2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btn2.setBorderPainted(false);
        btn2.setContentAreaFilled(false);
        btn2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn2.setFocusable(false);
        btn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn2MouseExited(evt);
            }
        });
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn3.setForeground(new java.awt.Color(255, 255, 255));
        btn3.setText("3");
        btn3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btn3.setBorderPainted(false);
        btn3.setContentAreaFilled(false);
        btn3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn3.setFocusable(false);
        btn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn3MouseExited(evt);
            }
        });
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btnRestar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnRestar.setForeground(new java.awt.Color(254, 104, 108));
        btnRestar.setText("-");
        btnRestar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnRestar.setBorderPainted(false);
        btnRestar.setContentAreaFilled(false);
        btnRestar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRestar.setFocusable(false);
        btnRestar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRestarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRestarMouseExited(evt);
            }
        });
        btnRestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestarActionPerformed(evt);
            }
        });

        btnParentesisA.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnParentesisA.setForeground(new java.awt.Color(255, 255, 255));
        btnParentesisA.setText("(");
        btnParentesisA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnParentesisA.setBorderPainted(false);
        btnParentesisA.setContentAreaFilled(false);
        btnParentesisA.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnParentesisA.setFocusable(false);
        btnParentesisA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnParentesisAMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnParentesisAMouseExited(evt);
            }
        });
        btnParentesisA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParentesisAActionPerformed(evt);
            }
        });

        btn0.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn0.setForeground(new java.awt.Color(255, 255, 255));
        btn0.setText("0");
        btn0.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btn0.setBorderPainted(false);
        btn0.setContentAreaFilled(false);
        btn0.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn0.setFocusable(false);
        btn0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn0MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn0MouseExited(evt);
            }
        });
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btnParentesisB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnParentesisB.setForeground(new java.awt.Color(255, 255, 255));
        btnParentesisB.setText(")");
        btnParentesisB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnParentesisB.setBorderPainted(false);
        btnParentesisB.setContentAreaFilled(false);
        btnParentesisB.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnParentesisB.setFocusable(false);
        btnParentesisB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnParentesisBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnParentesisBMouseExited(evt);
            }
        });
        btnParentesisB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParentesisBActionPerformed(evt);
            }
        });

        btnIgual.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnIgual.setForeground(new java.awt.Color(254, 104, 108));
        btnIgual.setText("=");
        btnIgual.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnIgual.setBorderPainted(false);
        btnIgual.setContentAreaFilled(false);
        btnIgual.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnIgual.setFocusable(false);
        btnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout botonesPanelLayout = new javax.swing.GroupLayout(botonesPanel);
        botonesPanel.setLayout(botonesPanelLayout);
        botonesPanelLayout.setHorizontalGroup(
            botonesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonesPanelLayout.createSequentialGroup()
                .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExp, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(botonesPanelLayout.createSequentialGroup()
                .addGroup(botonesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(botonesPanelLayout.createSequentialGroup()
                        .addComponent(btnParentesisA, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnParentesisB, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(botonesPanelLayout.createSequentialGroup()
                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRestar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(botonesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(botonesPanelLayout.createSequentialGroup()
                            .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(botonesPanelLayout.createSequentialGroup()
                            .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnSumar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        botonesPanelLayout.setVerticalGroup(
            botonesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonesPanelLayout.createSequentialGroup()
                .addGroup(botonesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExp, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(botonesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(botonesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSumar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(botonesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRestar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(botonesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnParentesisA, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnParentesisB, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(botonesPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 350, 320));

        txfHistorial.setEditable(false);
        txfHistorial.setBackground(new java.awt.Color(204, 204, 204));
        txfHistorial.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txfHistorial.setForeground(new java.awt.Color(204, 204, 204));
        txfHistorial.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfHistorial.setBorder(null);
        txfHistorial.setFocusable(false);
        txfHistorial.setOpaque(false);
        getContentPane().add(txfHistorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 60, 350, 40));

        txfPantalla.setBackground(new java.awt.Color(67, 67, 67));
        txfPantalla.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        txfPantalla.setForeground(new java.awt.Color(255, 255, 255));
        txfPantalla.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txfPantalla.setText("0");
        txfPantalla.setBorder(null);
        txfPantalla.setFocusable(false);
        txfPantalla.setOpaque(false);
        txfPantalla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txfPantallaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfPantallaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfPantallaKeyTyped(evt);
            }
        });
        getContentPane().add(txfPantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 350, 43));

        btnAsignarVariable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botonAsignar.PNG"))); // NOI18N
        btnAsignarVariable.setBorderPainted(false);
        btnAsignarVariable.setContentAreaFilled(false);
        btnAsignarVariable.setFocusable(false);
        btnAsignarVariable.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/botonAsignarPulsado.png"))); // NOI18N
        btnAsignarVariable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarVariableActionPerformed(evt);
            }
        });
        getContentPane().add(btnAsignarVariable, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 470, 140, 40));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondoCalculadora2.png"))); // NOI18N
        fondo.setText(" ");
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txfPantallaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfPantallaKeyPressed

        Character c = evt.getKeyChar();
        if (evt.getKeyCode() == KeyEvent.VK_DELETE) {

            if (txfPantalla.getText().length() == 1) {

                txfPantalla.setText("0");
            }

        }

    }//GEN-LAST:event_txfPantallaKeyPressed

    private void txfPantallaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfPantallaKeyTyped

    }//GEN-LAST:event_txfPantallaKeyTyped

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnBorrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBorrarMouseEntered

        btnBorrar.setOpaque(true);
        btnBorrar.setBackground(new Color(102, 102, 102));
    }//GEN-LAST:event_btnBorrarMouseEntered

    private void btnBorrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBorrarMouseExited

        btnBorrar.setOpaque(false);
    }//GEN-LAST:event_btnBorrarMouseExited

    private void btnExpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExpMouseEntered

        btnExp.setOpaque(true);
        btnExp.setBackground(new Color(102, 102, 102));
    }//GEN-LAST:event_btnExpMouseEntered

    private void btnExpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExpMouseExited
        btnExp.setOpaque(false);
    }//GEN-LAST:event_btnExpMouseExited

    private void btnPuntoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPuntoMouseEntered

        btnPunto.setOpaque(true);
        btnPunto.setBackground(new Color(102, 102, 102));
    }//GEN-LAST:event_btnPuntoMouseEntered

    private void btnPuntoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPuntoMouseExited

        btnPunto.setOpaque(false);
    }//GEN-LAST:event_btnPuntoMouseExited

    private void btnDividirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDividirMouseEntered

        btnDividir.setOpaque(true);
        btnDividir.setBackground(new Color(102, 102, 102));
    }//GEN-LAST:event_btnDividirMouseEntered

    private void btnDividirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDividirMouseExited

        btnDividir.setOpaque(false);
    }//GEN-LAST:event_btnDividirMouseExited

    private void btn7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn7MouseEntered

        btn7.setOpaque(true);
        btn7.setBackground(new Color(102, 102, 102));
    }//GEN-LAST:event_btn7MouseEntered

    private void btn7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn7MouseExited

        btn7.setOpaque(false);
    }//GEN-LAST:event_btn7MouseExited

    private void btn8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn8MouseEntered

        btn8.setOpaque(true);
        btn8.setBackground(new Color(102, 102, 102));
    }//GEN-LAST:event_btn8MouseEntered

    private void btn8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn8MouseExited

        btn8.setOpaque(false);
    }//GEN-LAST:event_btn8MouseExited

    private void btn9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn9MouseEntered

        btn9.setOpaque(true);
        btn9.setBackground(new Color(102, 102, 102));
    }//GEN-LAST:event_btn9MouseEntered

    private void btn9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn9MouseExited

        btn9.setOpaque(false);
    }//GEN-LAST:event_btn9MouseExited

    private void btnMultiplicarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMultiplicarMouseEntered

        btnMultiplicar.setOpaque(true);
        btnMultiplicar.setBackground(new Color(102, 102, 102));
    }//GEN-LAST:event_btnMultiplicarMouseEntered

    private void btnMultiplicarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMultiplicarMouseExited

        btnMultiplicar.setOpaque(false);
    }//GEN-LAST:event_btnMultiplicarMouseExited

    private void btn4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn4MouseEntered

        btn4.setOpaque(true);
        btn4.setBackground(new Color(102, 102, 102));
    }//GEN-LAST:event_btn4MouseEntered

    private void btn4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn4MouseExited

        btn4.setOpaque(false);
    }//GEN-LAST:event_btn4MouseExited

    private void btn5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn5MouseEntered

        btn5.setOpaque(true);
        btn5.setBackground(new Color(102, 102, 102));
    }//GEN-LAST:event_btn5MouseEntered

    private void btn5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn5MouseExited

        btn5.setOpaque(false);
    }//GEN-LAST:event_btn5MouseExited

    private void btn6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn6MouseEntered

        btn6.setOpaque(true);
        btn6.setBackground(new Color(102, 102, 102));
    }//GEN-LAST:event_btn6MouseEntered

    private void btn6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn6MouseExited

        btn6.setOpaque(false);
    }//GEN-LAST:event_btn6MouseExited

    private void btnSumarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSumarMouseEntered

        btnSumar.setOpaque(true);
        btnSumar.setBackground(new Color(102, 102, 102));
    }//GEN-LAST:event_btnSumarMouseEntered

    private void btnSumarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSumarMouseExited

        btnSumar.setOpaque(false);
    }//GEN-LAST:event_btnSumarMouseExited

    private void btn1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1MouseEntered

        btn1.setOpaque(true);
        btn1.setBackground(new Color(102, 102, 102));
    }//GEN-LAST:event_btn1MouseEntered

    private void btn1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1MouseExited

        btn1.setOpaque(false);
    }//GEN-LAST:event_btn1MouseExited

    private void btn2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2MouseEntered

        btn2.setOpaque(true);
        btn2.setBackground(new Color(102, 102, 102));
    }//GEN-LAST:event_btn2MouseEntered

    private void btn2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2MouseExited

        btn2.setOpaque(false);
    }//GEN-LAST:event_btn2MouseExited

    private void btn3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn3MouseEntered

        btn3.setOpaque(true);
        btn3.setBackground(new Color(102, 102, 102));
    }//GEN-LAST:event_btn3MouseEntered

    private void btn3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn3MouseExited

        btn3.setOpaque(false);
    }//GEN-LAST:event_btn3MouseExited

    private void btnRestarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRestarMouseEntered

        btnRestar.setOpaque(true);
        btnRestar.setBackground(new Color(102, 102, 102));
    }//GEN-LAST:event_btnRestarMouseEntered

    private void btnRestarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRestarMouseExited

        btnRestar.setOpaque(false);
    }//GEN-LAST:event_btnRestarMouseExited

    private void btnParentesisAMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnParentesisAMouseEntered

        btnParentesisA.setOpaque(true);
        btnParentesisA.setBackground(new Color(102, 102, 102));
    }//GEN-LAST:event_btnParentesisAMouseEntered

    private void btnParentesisAMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnParentesisAMouseExited

        btnParentesisA.setOpaque(false);
    }//GEN-LAST:event_btnParentesisAMouseExited

    private void btn0MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn0MouseEntered

        btn0.setOpaque(true);
        btn0.setBackground(new Color(102, 102, 102));
    }//GEN-LAST:event_btn0MouseEntered

    private void btn0MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn0MouseExited

        btn0.setOpaque(false);
    }//GEN-LAST:event_btn0MouseExited

    private void btnParentesisBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnParentesisBMouseEntered

        btnParentesisB.setOpaque(true);
        btnParentesisB.setBackground(new Color(102, 102, 102));
    }//GEN-LAST:event_btnParentesisBMouseEntered

    private void btnParentesisBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnParentesisBMouseExited

        btnParentesisB.setOpaque(false);
    }//GEN-LAST:event_btnParentesisBMouseExited

    private void txfPantallaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfPantallaKeyReleased

        Character c = evt.getKeyChar();

        if (evt.getKeyCode() == KeyEvent.VK_DELETE) {

            if (txfPantalla.getText().length() == 1) {

                txfPantalla.setText("0");
            }

        }
    }//GEN-LAST:event_txfPantallaKeyReleased

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        txfHistorial.setText("");
        txfPantalla.setText("0");
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        escribir("1");
    }//GEN-LAST:event_btn1ActionPerformed

    private void btnSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumarActionPerformed
        escribirOperador("+");
    }//GEN-LAST:event_btnSumarActionPerformed

    private String analizer(String value) {
        boolean vol = false;
        if (!value.isEmpty()) {
            if (variables.isEmpty()) {
                JOptionPane.showMessageDialog(null, "La variable '" + value + "' no existe.");
                variables.add(value);
                valores_variables.add("0");
                txfPantalla.setText(txfPantalla.getText().replaceAll(value, "0"));
            } else {
                for (int i = 0; i < variables.size(); i++) {
                    if (variables.get(i).contains(value)) {
                        txfPantalla.setText(txfPantalla.getText().replaceAll(value, valores_variables.get(i)));
                        i = variables.size();
                        vol = true;
                    }
                }

                if (vol == false) {
                    JOptionPane.showMessageDialog(null, "La variable '" + value + "' no existe.");
                    variables.add(value);
                    valores_variables.add("0");
                    txfPantalla.setText(txfPantalla.getText().replaceAll(value, "0"));
                }

            }
        }
        return txfPantalla.getText() + " ";
    }

    private void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualActionPerformed
        calcular();
    }//GEN-LAST:event_btnIgualActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        escribir("3");
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        escribir("2");
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        escribir("4");
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        escribir("5");
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        escribir("6");
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        escribir("7");
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        escribir("8");
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        escribir("9");
    }//GEN-LAST:event_btn9ActionPerformed

    private void btnDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDividirActionPerformed
        escribirOperador("/");
    }//GEN-LAST:event_btnDividirActionPerformed

    private void btnMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicarActionPerformed
        escribirOperador("*");
    }//GEN-LAST:event_btnMultiplicarActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        escribir("0");
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuntoActionPerformed

        escribirOperador(".");

    }//GEN-LAST:event_btnPuntoActionPerformed

    private void btnRestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestarActionPerformed
        escribirOperador("-");
    }//GEN-LAST:event_btnRestarActionPerformed

    private void btnExpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExpActionPerformed
        escribirOperador("^");
    }//GEN-LAST:event_btnExpActionPerformed

    private void btnParentesisAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParentesisAActionPerformed
        escribirParentesisIzquierda("(");
    }//GEN-LAST:event_btnParentesisAActionPerformed

    private void btnParentesisBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParentesisBActionPerformed
        escribirParentesisIzquierda("()");
    }//GEN-LAST:event_btnParentesisBActionPerformed

    private void btnAsignarVariableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarVariableActionPerformed

        ventana_asignar.setVisible(true);

    }//GEN-LAST:event_btnAsignarVariableActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel botonesPanel;
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnAsignarVariable;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnDividir;
    private javax.swing.JButton btnExp;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnMultiplicar;
    private javax.swing.JButton btnParentesisA;
    private javax.swing.JButton btnParentesisB;
    private javax.swing.JButton btnPunto;
    private javax.swing.JButton btnRestar;
    private javax.swing.JButton btnSumar;
    private javax.swing.JLabel fondo;
    private javax.swing.JSeparator separador;
    private javax.swing.JTextField txfHistorial;
    private javax.swing.JTextField txfPantalla;
    // End of variables declaration//GEN-END:variables

    public static List<String> getVariables() {
        return variables;
    }

    public static List<String> getValores_variables() {
        return valores_variables;
    }

    public void escribir(String valor) {
        if (txfPantalla.getText().equals("0") || txfPantalla.getText().equals("0.0")) {
            txfPantalla.setText("");
        }
        if (Character.isLetter(ultimo_caracter)) {
            txfPantalla.setText(txfPantalla.getText() + "*" + valor);
            ultimo_caracter = valor.charAt(0);
        } else {
            txfPantalla.setText(txfPantalla.getText() + valor);
            ultimo_caracter = valor.charAt(0);
        }
    }

    public void escribirLetra(String valor) {
        if (txfPantalla.getText().equals("0") || txfPantalla.getText().equals("0.0")) {
            txfPantalla.setText("");
        }
        if (ultimo_caracter == '.') {

        } else if (Character.isDigit(ultimo_caracter) && ultimo_caracter != '0') {
            txfPantalla.setText(txfPantalla.getText() + "*" + valor);
            ultimo_caracter = valor.charAt(0);
        } else if (ultimo_caracter == ')') {
            txfPantalla.setText(txfPantalla.getText() + "*" + valor);
            ultimo_caracter = valor.charAt(0);
        } else {
            txfPantalla.setText(txfPantalla.getText() + valor);
            ultimo_caracter = valor.charAt(0);
        }
    }

    public void escribirParentesisIzquierda(String valor) {
        if (txfPantalla.getText().equals("0") || txfPantalla.getText().equals("0.0")) {
            txfPantalla.setText(txfPantalla.getText() + "*" + valor);
            ultimo_caracter = valor.charAt(0);
        } else if (ultimo_caracter == '(') {

        } else if (ultimo_caracter == ')') {
            txfPantalla.setText(txfPantalla.getText() + "*" + valor);
            ultimo_caracter = valor.charAt(0);
        } else if (Character.isDigit(ultimo_caracter) || Character.isLetter(ultimo_caracter)) {
            txfPantalla.setText(txfPantalla.getText() + "*" + valor);
            ultimo_caracter = valor.charAt(0);
        } else {
            txfPantalla.setText(txfPantalla.getText() + valor);
            ultimo_caracter = valor.charAt(0);
        }
    }

    public void escribirParentesisDerecha(String valor) {
        if (txfPantalla.getText().equals("0") || txfPantalla.getText().equals("0.0")) {

        } else if (ultimo_caracter == ')') {

        } else if (Character.isDigit(ultimo_caracter)) {
            txfPantalla.setText(txfPantalla.getText() + valor);
            ultimo_caracter = valor.charAt(0);
        } else {
            txfPantalla.setText(txfPantalla.getText() + valor);
            ultimo_caracter = valor.charAt(0);
        }
    }

    public void escribirOperador(String valor) {

        if (Character.isLetter(ultimo_caracter) || Character.isDigit(ultimo_caracter)) {

            txfPantalla.setText(txfPantalla.getText() + valor);
            ultimo_caracter = valor.charAt(0);
        }
    }

    public void calcular() {
        try {
            txfHistorial.setText(txfPantalla.getText() + " = ");
            capturador = txfPantalla.getText() + " ";
            acumulador = "";

            if (!capturador.trim().equalsIgnoreCase("sintax error!")) {
                for (int i = 0; i < capturador.length(); i++) {
                    if (Character.isDigit(capturador.charAt(i))) {
                    } else {
                    }
                    if (Character.isLetter(capturador.charAt(i))) {
                        acumulador += capturador.charAt(i);
                    } else {
                    }
                    if ((!(Character.isLetter(capturador.charAt(i)))) && (!(Character.isDigit(capturador.charAt(i))))) {
                        if (Character.isSpaceChar(capturador.charAt(i))) {
                            capturador = capturador.replaceAll(" ", "");
                            capturador = analizer(acumulador);
                            acumulador = "";
                        } else {
                            txfPantalla.setText(analizer(acumulador));
                            acumulador = "";
                        }

                    } else {
                    }

                }

                Capturador<String, String> resultado = cal.resolverValorExpresion(txfPantalla.getText());
                txfPantalla.setText(resultado.getFirst());
            }
        } catch (NumberFormatException nfe) {

            JOptionPane.showMessageDialog(null, nfe.getMessage());
            txfPantalla.setText("Sintax ERROR!");
        } finally {

        }
    }

    @Override
    public void keyTyped(KeyEvent e
    ) {
        Character c = e.getKeyChar();
        if (Character.isSpaceChar(c)) {
            e.consume();
        }
    }

    @Override
    public void keyPressed(KeyEvent e
    ) {
    }

    @Override
    public void keyReleased(KeyEvent e
    ) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_0:
                escribir("0");
                break;
            case KeyEvent.VK_1:
                escribir("1");
                break;
            case KeyEvent.VK_2:
                escribir("2");
                break;
            case KeyEvent.VK_3:
                escribir("3");
                break;
            case KeyEvent.VK_4:
                escribir("4");
                break;
            case KeyEvent.VK_5:
                escribir("5");
                break;
            case KeyEvent.VK_6:
                escribir("6");
                break;
            case KeyEvent.VK_7:
                if (e.isShiftDown()) {
                    escribirOperador("/");
                } else {
                    escribir("7");
                }
                break;
            case KeyEvent.VK_8:
                if (e.isShiftDown()) {
                    escribirParentesisIzquierda("(");
                } else {
                    escribir("8");
                }
                break;
            case KeyEvent.VK_9:
                if (e.isShiftDown()) {
                    escribirParentesisDerecha(")");
                } else {
                    escribir("9");
                }
                break;
            case KeyEvent.VK_Q:
                escribirLetra("q");
                break;
            case KeyEvent.VK_W:
                escribirLetra("w");
                break;
            case KeyEvent.VK_E:
                escribirLetra("e");
                break;
            case KeyEvent.VK_R:
                escribirLetra("r");
                break;
            case KeyEvent.VK_T:
                escribirLetra("t");
                break;
            case KeyEvent.VK_Y:
                escribirLetra("y");
                break;
            case KeyEvent.VK_U:
                escribirLetra("u");
                break;
            case KeyEvent.VK_I:
                escribirLetra("i");
                break;
            case KeyEvent.VK_O:
                escribirLetra("o");
                break;
            case KeyEvent.VK_P:
                escribirLetra("p");
                break;
            case KeyEvent.VK_A:
                escribirLetra("a");
                break;
            case KeyEvent.VK_S:
                escribirLetra("s");
                break;
            case KeyEvent.VK_D:
                escribirLetra("d");
                break;
            case KeyEvent.VK_F:
                escribirLetra("f");
                break;
            case KeyEvent.VK_G:
                escribirLetra("g");
                break;
            case KeyEvent.VK_H:
                escribirLetra("h");
                break;
            case KeyEvent.VK_J:
                escribirLetra("j");
                break;
            case KeyEvent.VK_K:
                escribirLetra("k");
                break;
            case KeyEvent.VK_L:
                escribirLetra("l");
                break;
            case KeyEvent.VK_Z:
                escribirLetra("z");
                break;
            case KeyEvent.VK_X:
                escribirLetra("x");
                break;
            case KeyEvent.VK_C:
                escribirLetra("c");
                break;
            case KeyEvent.VK_V:
                escribirLetra("v");
                break;
            case KeyEvent.VK_B:
                escribirLetra("b");
                break;
            case KeyEvent.VK_N:
                escribirLetra("n");
                break;
            case KeyEvent.VK_M:
                escribirLetra("m");
                break;
            case KeyEvent.VK_PLUS:
                if (e.isShiftDown()) {
                    escribirOperador("*");
                } else {
                    escribirOperador("+");
                }
                break;
            case KeyEvent.VK_MINUS:
                escribirOperador("-");
                break;
            case KeyEvent.VK_DIVIDE:
                escribirOperador("/");
                break;
            case KeyEvent.VK_DEAD_CIRCUMFLEX:
                escribirOperador("^");
                break;
            case KeyEvent.VK_PERIOD:
                escribirOperador(".");
                break;
            case KeyEvent.VK_BRACELEFT:
                escribirOperador("^");
                break;
            case KeyEvent.VK_ENTER:
                calcular();
                break;
            case KeyEvent.VK_DELETE:
                txfHistorial.setText("");
                txfPantalla.setText("0");
                ultimo_caracter = '0';
                break;
            case KeyEvent.VK_BACK_SPACE:
                String capturador = txfPantalla.getText();
                if (capturador.length() != 0) {
                    if (capturador.length() == 1) {
                        txfPantalla.setText("0");
                        ultimo_caracter = '0';

                    } else if (txfPantalla.getText().equalsIgnoreCase("sintax error!")) {
                        txfHistorial.setText("");
                        txfPantalla.setText("0");
                        ultimo_caracter = '0';
                    } else {
                        capturador = capturador.substring(0, capturador.length() - 1);
                        txfPantalla.setText(capturador);
                        ultimo_caracter = txfPantalla.getText().charAt(txfPantalla.getText().length() - 1);
                    }
                    break;
                } else {
                    txfPantalla.setText("0");
                    ultimo_caracter = '0';
                }

        }
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.robinzon.buscarsunat;

import com.formdev.flatlaf.FlatLightLaf;
import com.robinzon.buscarsunat.modelo.Empresa;
import com.robinzon.buscarsunat.modelo.Persona;
import com.robinzon.buscarsunat.repositorio.EmpresaRepo;
import com.robinzon.buscarsunat.repositorio.PersonaRepo;
import com.robinzon.buscarsunat.vista.jdEspera;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Matteo
 */
public class Dashboard extends javax.swing.JFrame {

    private boolean stsBotonBuscar;
    private boolean stsBtnRegistrar;
    private Empresa objEmpresa;
    private Persona objPersona;

    public Dashboard() {
        this.iniciarEstilos();
        initComponents();
        this.cambiarPlaceholderNumDocu();
        this.cambiarPlaceholderResultado();
        this.btnBuscar.setEnabled(false);
        this.limpiarResultado();
    }

    private void iniciarEstilos() {
        FlatLightLaf.setup();
        UIManager.put("TextComponent.arc", 5);
        UIManager.put("Component.focusWidth", 1);
    }

    private void cambiarPlaceholderNumDocu() {
        String tipoDoc = (String) this.cbxTipoDocumento.getSelectedItem();
        txtNumeroDocumento.putClientProperty("JTextField.placeholderText", "Ingrese " + tipoDoc);
        txtNumDocu.putClientProperty("JTextField.placeholderText", "N° " + tipoDoc);
        if (tipoDoc.equalsIgnoreCase("RUC")) {
            txtNombre.putClientProperty("JTextField.placeholderText", "Razón Social");
            lblNumDocu.setText("N° RUC");
            lblNombre.setText("Razón Social");
        } else {
            lblNumDocu.setText("N° DNI");
            lblNombre.setText("Apellidos y Nombre(s)");
            txtNombre.putClientProperty("JTextField.placeholderText", "Apellidos y Nombre(s)");
        }
        btnRegistrar.setEnabled(false);
    }

    private void cambiarPlaceholderResultado() {
        txtEstado.putClientProperty("JTextField.placeholderText", "Estado");
        txtCondicion.putClientProperty("JTextField.placeholderText", "Condición");
        txtDireccion.putClientProperty("JTextField.placeholderText", "Dirección");
        txtDepartamento.putClientProperty("JTextField.placeholderText", "Departamento");
        txtProvincia.putClientProperty("JTextField.placeholderText", "Provincia");
        txtDistrito.putClientProperty("JTextField.placeholderText", "Distrito");
        txtUbigeo.putClientProperty("JTextField.placeholderText", "Ubigeo");
        lblNumDocu.setText("N° RUC");
        lblNombre.setText("Razón Social");

        txtNumDocu.setEditable(false);
        txtEstado.setEditable(false);
        txtCondicion.setEditable(false);
        txtNombre.setEditable(false);
        txtDireccion.setEditable(false);
        txtDepartamento.setEditable(false);
        txtProvincia.setEditable(false);
        txtDistrito.setEditable(false);
        txtUbigeo.setEditable(false);
    }

    public Empresa getObjEmpresa() {
        return objEmpresa;
    }

    public void setObjEmpresa(Empresa objEmpresa) {
        this.objEmpresa = objEmpresa;
    }

    public Persona getObjPersona() {
        return objPersona;
    }

    public void setObjPersona(Persona objPersona) {
        this.objPersona = objPersona;
    }

    public void mostrarResultado(String tipoDocu, Empresa objEmpresa, Persona objPersona) {
        this.stsBtnRegistrar = true;
        this.limpiarResultado();


        if (tipoDocu.equalsIgnoreCase("RUC")) {
            this.setObjEmpresa(objEmpresa);
            if (objEmpresa.getNombre().substring(0, 1).equalsIgnoreCase("1")) {
                txtNumDocu.setText(objEmpresa.getNumeroDocumento());
                txtEstado.setText(objEmpresa.getEstado());
                txtNombre.setText(objEmpresa.getNombre());
                txtCondicion.setText(objEmpresa.getCondicion());
            } else {
                txtNumDocu.setText(objEmpresa.getNumeroDocumento());
                txtEstado.setText(objEmpresa.getEstado());
                txtCondicion.setText(objEmpresa.getCondicion());
                txtNombre.setText(objEmpresa.getNombre());                
                txtDireccion.setText(objEmpresa.getDireccion());
                txtDepartamento.setText(objEmpresa.getDepartamento());
                txtProvincia.setText(objEmpresa.getProvincia());
                txtDistrito.setText(objEmpresa.getDistrito());
                txtUbigeo.setText(objEmpresa.getUbigeo());
            }

        } else {
            this.setObjPersona(objPersona);
            txtNumDocu.setText(objPersona.getNumeroDocumento());
            txtNombre.setText(objPersona.getNombre());
        }
        this.limpiarBuscar();
        btnRegistrar.setEnabled(stsBtnRegistrar);
    }

    private void limpiarBuscar() {
        stsBotonBuscar = false;
        txtNumeroDocumento.setText("");
        btnBuscar.setEnabled(stsBotonBuscar);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        background = new javax.swing.JPanel();
        jpBuscar = new javax.swing.JPanel();
        cbxTipoDocumento = new javax.swing.JComboBox<>();
        txtNumeroDocumento = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jpResultado = new javax.swing.JPanel();
        txtProvincia = new javax.swing.JTextField();
        txtNumDocu = new javax.swing.JTextField();
        txtDistrito = new javax.swing.JTextField();
        txtUbigeo = new javax.swing.JTextField();
        txtDepartamento = new javax.swing.JTextField();
        txtCondicion = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        lblCondicion = new javax.swing.JLabel();
        lblNumDocu = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        lblDistrito = new javax.swing.JLabel();
        lblProvincia = new javax.swing.JLabel();
        lblDepartamento = new javax.swing.JLabel();
        lblUbigeo = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        lblEstado = new javax.swing.JLabel();
        jpRegistrar = new javax.swing.JPanel();
        btnRegistrar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Consultando RENIEC");

        background.setBackground(new java.awt.Color(255, 255, 255));

        jpBuscar.setBackground(new java.awt.Color(255, 255, 255));
        jpBuscar.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(204, 204, 204)), "Documento de Identificación", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(102, 102, 102))); // NOI18N

        cbxTipoDocumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "RUC", "DNI" }));
        cbxTipoDocumento.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxTipoDocumentoItemStateChanged(evt);
            }
        });

        txtNumeroDocumento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumeroDocumento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNumeroDocumentoKeyReleased(evt);
            }
        });

        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/archivo-de-busqueda.png"))); // NOI18N
        btnBuscar.setText("BUSCAR");
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jpBuscarLayout = new javax.swing.GroupLayout(jpBuscar);
        jpBuscar.setLayout(jpBuscarLayout);
        jpBuscarLayout.setHorizontalGroup(
            jpBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBuscarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbxTipoDocumento, 0, 103, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(txtNumeroDocumento, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpBuscarLayout.setVerticalGroup(
            jpBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBuscarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxTipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumeroDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpResultado.setBackground(new java.awt.Color(255, 255, 255));
        jpResultado.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(204, 204, 204)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(102, 102, 102))); // NOI18N

        txtCondicion.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N

        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N

        txtDireccion.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N

        lblCondicion.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblCondicion.setText("Condición");

        lblNumDocu.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N

        lblNombre.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N

        lblDireccion.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblDireccion.setText("Dirección");

        lblDistrito.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblDistrito.setText("Distrito");

        lblProvincia.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblProvincia.setText("Provincia");

        lblDepartamento.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblDepartamento.setText("Departamento");

        lblUbigeo.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblUbigeo.setText("Ubigeo");

        txtEstado.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N

        lblEstado.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblEstado.setText("Estado");

        javax.swing.GroupLayout jpResultadoLayout = new javax.swing.GroupLayout(jpResultado);
        jpResultado.setLayout(jpResultadoLayout);
        jpResultadoLayout.setHorizontalGroup(
            jpResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpResultadoLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jpResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpResultadoLayout.createSequentialGroup()
                        .addComponent(lblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jpResultadoLayout.createSequentialGroup()
                        .addComponent(lblDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jpResultadoLayout.createSequentialGroup()
                        .addComponent(txtDireccion)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpResultadoLayout.createSequentialGroup()
                        .addGroup(jpResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtDistrito, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                            .addComponent(lblDistrito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jpResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUbigeo)
                            .addComponent(lblUbigeo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(120, 120, 120))))
            .addGroup(jpResultadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpResultadoLayout.createSequentialGroup()
                        .addGroup(jpResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNumDocu, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNumDocu, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEstado)
                            .addGroup(jpResultadoLayout.createSequentialGroup()
                                .addComponent(lblEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCondicion, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCondicion, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpResultadoLayout.createSequentialGroup()
                        .addGroup(jpResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDepartamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtDepartamento))
                        .addGroup(jpResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpResultadoLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtProvincia))
                            .addGroup(jpResultadoLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lblProvincia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jpResultadoLayout.setVerticalGroup(
            jpResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpResultadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblCondicion, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblNumDocu, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jpResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCondicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumDocu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(jpResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblProvincia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDistrito)
                    .addComponent(lblUbigeo, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jpResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDistrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUbigeo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpRegistrar.setBackground(new java.awt.Color(255, 255, 255));
        jpRegistrar.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(204, 204, 204)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(102, 102, 102))); // NOI18N

        btnRegistrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guardar-el-archivo.png"))); // NOI18N
        btnRegistrar.setText("1. REGISTRAR");
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarMouseClicked(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cerrar-sesion.png"))); // NOI18N
        btnSalir.setText("2. SALIR");
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpRegistrarLayout = new javax.swing.GroupLayout(jpRegistrar);
        jpRegistrar.setLayout(jpRegistrarLayout);
        jpRegistrarLayout.setHorizontalGroup(
            jpRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRegistrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpRegistrarLayout.setVerticalGroup(
            jpRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRegistrarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cbxTipoDocumentoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxTipoDocumentoItemStateChanged
        // TODO add your handling code here:
        this.stsBtnRegistrar = false;
        this.cambiarPlaceholderNumDocu();
        this.txtNumeroDocumento.requestFocus();
        this.limpiarResultado();
    }//GEN-LAST:event_cbxTipoDocumentoItemStateChanged

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        // TODO add your handling code here:
        //this.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        if (stsBotonBuscar) {
            this.stsBtnRegistrar = false;
            btnRegistrar.setEnabled(this.stsBtnRegistrar);
            this.limpiarResultado();
            String tipoDocu = (String) this.cbxTipoDocumento.getSelectedItem();
            String numDocu = txtNumeroDocumento.getText();
            EmpresaRepo objRepo = new EmpresaRepo();
            boolean stsExisteCliente = objRepo.buscar("01", numDocu.trim());

            if (stsExisteCliente) {
                String mensaje = "El " + tipoDocu + " " + numDocu + " se encuentra registrado.";
                JOptionPane.showMessageDialog(null,
                        mensaje,
                        "Éxito",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                jdEspera espera = new jdEspera(this, true, tipoDocu, numDocu);
                espera.setVisible(stsBotonBuscar);
            }
        }
    }//GEN-LAST:event_btnBuscarMouseClicked

    private void limpiarResultado() {
        txtNumDocu.setText("");
        txtEstado.setText("");
        txtCondicion.setText("");
        txtNombre.setText("");
        txtDireccion.setText("");
        txtDepartamento.setText("");
        txtProvincia.setText("");
        txtDistrito.setText("");
        txtUbigeo.setText("");
    }

    private void btnRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseClicked
        // TODO add your handling code here:
        if (this.stsBtnRegistrar) {
            String numDocu = this.txtNumDocu.getText();
            if (!numDocu.trim().equalsIgnoreCase("")) {
                String mensaje = "¿Desea registrar el cliente con N° " + numDocu + " ?";
                int stsConfirmacion = JOptionPane.showConfirmDialog(null, mensaje, "Confirmar", 0, 3);
                if (stsConfirmacion == 0) {
                    this.registrarNuevoCliente();
                }
            }
        }
    }//GEN-LAST:event_btnRegistrarMouseClicked

    private void registrarNuevoCliente() {        
        String nombre="";
        String depar="";
        String prov="";
        String dist="";
        String ubigeo="";
        String direccion="";
        boolean estado = false;
        
        if (this.objPersona != null) {
               nombre = this.objPersona.getNombre();
               if (nombre.length() > 80) {
                  nombre = nombre.substring(0, 80).trim();
               }
               PersonaRepo repo = new PersonaRepo();
               estado = repo.crearPersona("01", this.objPersona.getNumeroDocumento(), "N", "DNI", this.objPersona.getNumeroDocumento(), "", nombre, "******", "150101", "15", "01", "01");
        }
        if (this.objEmpresa != null) {
               
               String stsJuridico = this.objEmpresa.getNumeroDocumento().substring(0, 1);
               nombre = this.objEmpresa.getNombre();
                              
               if (!stsJuridico.equalsIgnoreCase("1")) { // JURIDICO                  
                   ubigeo = this.objEmpresa.getUbigeo();
                   depar = ubigeo.substring(0, 2);
                   prov = ubigeo.substring(2, 4);
                   dist = ubigeo.substring(4, 6);
                   direccion = this.objEmpresa.getDireccion();
               }
               
               if (nombre.length() > 80) {
                  nombre = nombre.substring(0, 80).trim();
               }
               if (direccion.length() > 150) {
                   direccion = direccion.substring(0, 150).trim();
               }
               
               EmpresaRepo repo = new EmpresaRepo();
               estado = repo.guardarRuc("01", this.objEmpresa.getNumeroDocumento(), "J", "RUC",
                        this.objEmpresa.getNumeroDocumento(), this.objEmpresa.getNumeroDocumento(), nombre,
                        direccion, ubigeo, depar, prov, dist);
        }
        
        if (estado) {
            JOptionPane.showMessageDialog(null, "Se guardo el cliente correctamente.");
            System.exit(0);
        } else {
            JOptionPane.showMessageDialog(null, "Error no sé guardo los datos.");
        }

    }

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtNumeroDocumentoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroDocumentoKeyReleased
        // TODO add your handling code here:
        int code = evt.getKeyCode();
        String id = this.txtNumeroDocumento.getText().trim();
        char numero = evt.getKeyChar();
        String charToString = String.valueOf(numero);
        boolean isNumeric = charToString.matches("[+-]?\\d*(\\.\\)d+)?");
        if (!isNumeric && code != 37 & code != 39 & code != 8) {
            id = id.replace(charToString, "");
            this.txtNumeroDocumento.setText(id.trim());
        }

        String tipoDocu = (String) this.cbxTipoDocumento.getSelectedItem();

        if (tipoDocu.equalsIgnoreCase("RUC")) {
            stsBotonBuscar = (this.txtNumeroDocumento.getText().length() == 11);
        } else {
            stsBotonBuscar = (this.txtNumeroDocumento.getText().length() == 8);
        }
        this.btnBuscar.setEnabled(stsBotonBuscar);

    }//GEN-LAST:event_txtNumeroDocumentoKeyReleased

    private void btnBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseEntered
        // TODO add your handling code here:

    }//GEN-LAST:event_btnBuscarMouseEntered

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cbxTipoDocumento;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JPanel jpBuscar;
    private javax.swing.JPanel jpRegistrar;
    private javax.swing.JPanel jpResultado;
    private javax.swing.JLabel lblCondicion;
    private javax.swing.JLabel lblDepartamento;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblDistrito;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNumDocu;
    private javax.swing.JLabel lblProvincia;
    private javax.swing.JLabel lblUbigeo;
    private javax.swing.JTextField txtCondicion;
    private javax.swing.JTextField txtDepartamento;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDistrito;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumDocu;
    private javax.swing.JTextField txtNumeroDocumento;
    private javax.swing.JTextField txtProvincia;
    private javax.swing.JTextField txtUbigeo;
    // End of variables declaration//GEN-END:variables
}

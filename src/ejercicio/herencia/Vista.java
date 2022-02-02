package ejercicio.herencia;

import javax.swing.JOptionPane;

/** @author Jose Ignacio  */

public class Vista extends javax.swing.JFrame {

    Arreglo a = new Arreglo();

    int numest = 0;
    
    public Vista() {
        initComponents();
        btnEstudiante.setBackground(new java.awt.Color(44, 59, 66));
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnProfesor = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        btnSalir = new javax.swing.JLabel();
        btnEstudiante = new javax.swing.JLabel();
        btnEmpleado = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        pnlEstudiante = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtcedulaEs = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        btnBuscarEs = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        txtDireccionEs = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        txtNombreEs = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        txtTelefonoEs = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel20 = new javax.swing.JLabel();
        txtCarreraEs = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel21 = new javax.swing.JLabel();
        txtSemestreEs = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        btnGuardarEs = new javax.swing.JButton();
        pnlEmpleado = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        txtCedulaEm = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        btnBuscarEm = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        txtDireccionEm = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        txtNombreEm = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        txtTelefonoEm = new javax.swing.JTextField();
        jSeparator13 = new javax.swing.JSeparator();
        btnGuardarEm = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        txtCarreraEm = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel47 = new javax.swing.JLabel();
        txtCargoEm = new javax.swing.JTextField();
        jSeparator20 = new javax.swing.JSeparator();
        txtHorasEm = new javax.swing.JTextField();
        jSeparator21 = new javax.swing.JSeparator();
        jLabel48 = new javax.swing.JLabel();
        txtValorHoraEm = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        jLabel49 = new javax.swing.JLabel();
        pnlProfesor = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        txtCedulaPro = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        btnGuardarPro = new javax.swing.JButton();
        jSeparator15 = new javax.swing.JSeparator();
        txtDireccionPro = new javax.swing.JTextField();
        jSeparator16 = new javax.swing.JSeparator();
        txtNombrePro = new javax.swing.JTextField();
        jSeparator17 = new javax.swing.JSeparator();
        txtTelefonoPro = new javax.swing.JTextField();
        jSeparator18 = new javax.swing.JSeparator();
        jLabel50 = new javax.swing.JLabel();
        txtMateriaPro = new javax.swing.JTextField();
        jSeparator22 = new javax.swing.JSeparator();
        jLabel51 = new javax.swing.JLabel();
        txtCargoPro = new javax.swing.JTextField();
        jSeparator23 = new javax.swing.JSeparator();
        jLabel52 = new javax.swing.JLabel();
        txtValorHoraPro = new javax.swing.JTextField();
        jSeparator24 = new javax.swing.JSeparator();
        jLabel53 = new javax.swing.JLabel();
        txtHoraPro = new javax.swing.JTextField();
        jSeparator25 = new javax.swing.JSeparator();
        btnBuscarPro = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(34, 45, 49));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(54, 127, 168));
        jLabel3.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("online");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 50, 30));

        btnProfesor.setBackground(new java.awt.Color(34, 45, 49));
        btnProfesor.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        btnProfesor.setForeground(new java.awt.Color(255, 255, 255));
        btnProfesor.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnProfesor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/profesor.png"))); // NOI18N
        btnProfesor.setText("Profesor");
        btnProfesor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProfesor.setOpaque(true);
        btnProfesor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProfesorMouseClicked(evt);
            }
        });
        jPanel2.add(btnProfesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 150, 30));

        lblUser.setBackground(new java.awt.Color(54, 127, 168));
        lblUser.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        lblUser.setForeground(new java.awt.Color(255, 255, 255));
        lblUser.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblUser.setText("Jose Ignacio");
        jPanel2.add(lblUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 110, 30));

        btnSalir.setBackground(new java.awt.Color(34, 45, 49));
        btnSalir.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-salida-32.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });
        jPanel2.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 150, 30));

        btnEstudiante.setBackground(new java.awt.Color(34, 45, 49));
        btnEstudiante.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        btnEstudiante.setForeground(new java.awt.Color(255, 255, 255));
        btnEstudiante.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEstudiante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/estudiante.png"))); // NOI18N
        btnEstudiante.setText("Estudiante");
        btnEstudiante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEstudiante.setOpaque(true);
        btnEstudiante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEstudianteMouseClicked(evt);
            }
        });
        jPanel2.add(btnEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 150, 30));

        btnEmpleado.setBackground(new java.awt.Color(34, 45, 49));
        btnEmpleado.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        btnEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        btnEmpleado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/empleado.png"))); // NOI18N
        btnEmpleado.setText("Empleado");
        btnEmpleado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEmpleado.setOpaque(true);
        btnEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEmpleadoMouseClicked(evt);
            }
        });
        jPanel2.add(btnEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 150, 30));

        jLabel11.setBackground(new java.awt.Color(54, 127, 168));
        jLabel11.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/perfil.png"))); // NOI18N
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 50, -1));

        jLabel18.setBackground(new java.awt.Color(54, 127, 168));
        jLabel18.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("ESCUELA");
        jLabel18.setOpaque(true);
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 460));

        jPanel3.setBackground(new java.awt.Color(60, 141, 188));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(54, 127, 168));
        jLabel2.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/perfil.png"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 40, 40));

        jLabel4.setBackground(new java.awt.Color(54, 127, 168));
        jLabel4.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Escuela");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 110, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 690, 40));

        jPanel6.setLayout(new java.awt.CardLayout());

        pnlEstudiante.setBackground(new java.awt.Color(236, 239, 244));
        pnlEstudiante.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/estudiante.png"))); // NOI18N
        jLabel10.setText("Home  >");

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Estudiante");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pnlEstudiante.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 550, 30));

        jLabel13.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Cedula:");
        pnlEstudiante.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        txtcedulaEs.setBackground(new java.awt.Color(236, 239, 244));
        txtcedulaEs.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtcedulaEs.setBorder(null);
        txtcedulaEs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlEstudiante.add(txtcedulaEs, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 100, 20));

        jLabel15.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Nombre:");
        pnlEstudiante.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, -1, -1));

        jLabel16.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Direccíon:");
        pnlEstudiante.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel17.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Telefono:");
        pnlEstudiante.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, -1, -1));

        btnBuscarEs.setBackground(new java.awt.Color(60, 141, 188));
        btnBuscarEs.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnBuscarEs.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarEs.setText("Buscar");
        btnBuscarEs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarEs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarEsActionPerformed(evt);
            }
        });
        pnlEstudiante.add(btnBuscarEs, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, -1, -1));
        pnlEstudiante.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 110, 10));

        txtDireccionEs.setBackground(new java.awt.Color(236, 239, 244));
        txtDireccionEs.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDireccionEs.setBorder(null);
        txtDireccionEs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlEstudiante.add(txtDireccionEs, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 110, 20));
        pnlEstudiante.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 110, 10));

        txtNombreEs.setBackground(new java.awt.Color(236, 239, 244));
        txtNombreEs.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNombreEs.setBorder(null);
        txtNombreEs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlEstudiante.add(txtNombreEs, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 100, 20));
        pnlEstudiante.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 110, 10));

        txtTelefonoEs.setBackground(new java.awt.Color(236, 239, 244));
        txtTelefonoEs.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTelefonoEs.setBorder(null);
        txtTelefonoEs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlEstudiante.add(txtTelefonoEs, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 110, 20));
        pnlEstudiante.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 110, 10));

        jLabel20.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Carrera:");
        pnlEstudiante.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        txtCarreraEs.setBackground(new java.awt.Color(236, 239, 244));
        txtCarreraEs.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCarreraEs.setBorder(null);
        txtCarreraEs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlEstudiante.add(txtCarreraEs, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 110, 20));
        pnlEstudiante.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 110, 10));

        jLabel21.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Semestre:");
        pnlEstudiante.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, -1, -1));

        txtSemestreEs.setBackground(new java.awt.Color(236, 239, 244));
        txtSemestreEs.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSemestreEs.setBorder(null);
        txtSemestreEs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlEstudiante.add(txtSemestreEs, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 110, 20));
        pnlEstudiante.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 110, 10));

        btnGuardarEs.setBackground(new java.awt.Color(60, 141, 188));
        btnGuardarEs.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnGuardarEs.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarEs.setText("Guardar ");
        btnGuardarEs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardarEs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarEsActionPerformed(evt);
            }
        });
        pnlEstudiante.add(btnGuardarEs, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, -1, -1));

        jPanel6.add(pnlEstudiante, "card2");

        pnlEmpleado.setBackground(new java.awt.Color(236, 239, 244));
        pnlEmpleado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(204, 204, 204));

        jLabel33.setBackground(new java.awt.Color(0, 0, 0));
        jLabel33.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(0, 0, 0));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/empleado.png"))); // NOI18N
        jLabel33.setText("Home  >");

        jLabel34.setBackground(new java.awt.Color(0, 0, 0));
        jLabel34.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(102, 102, 102));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel34.setText("Empleado");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel34)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pnlEmpleado.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 550, 30));

        jLabel36.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(0, 0, 0));
        jLabel36.setText("Cedula:");
        pnlEmpleado.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        txtCedulaEm.setBackground(new java.awt.Color(236, 239, 244));
        txtCedulaEm.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCedulaEm.setBorder(null);
        txtCedulaEm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlEmpleado.add(txtCedulaEm, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 100, 20));

        jLabel37.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(0, 0, 0));
        jLabel37.setText("Nombre:");
        pnlEmpleado.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, -1, -1));

        jLabel38.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(0, 0, 0));
        jLabel38.setText("Direccíon:");
        pnlEmpleado.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel39.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(0, 0, 0));
        jLabel39.setText("Telefono:");
        pnlEmpleado.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, -1, -1));

        btnBuscarEm.setBackground(new java.awt.Color(60, 141, 188));
        btnBuscarEm.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnBuscarEm.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarEm.setText("Buscar");
        btnBuscarEm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarEm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarEmActionPerformed(evt);
            }
        });
        pnlEmpleado.add(btnBuscarEm, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, -1, -1));
        pnlEmpleado.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 110, 10));

        txtDireccionEm.setBackground(new java.awt.Color(236, 239, 244));
        txtDireccionEm.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDireccionEm.setBorder(null);
        txtDireccionEm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlEmpleado.add(txtDireccionEm, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 110, 20));
        pnlEmpleado.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 110, 10));

        txtNombreEm.setBackground(new java.awt.Color(236, 239, 244));
        txtNombreEm.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNombreEm.setBorder(null);
        txtNombreEm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlEmpleado.add(txtNombreEm, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 100, 20));
        pnlEmpleado.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 110, 10));

        txtTelefonoEm.setBackground(new java.awt.Color(236, 239, 244));
        txtTelefonoEm.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTelefonoEm.setBorder(null);
        txtTelefonoEm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlEmpleado.add(txtTelefonoEm, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 110, 20));
        pnlEmpleado.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 110, 10));

        btnGuardarEm.setBackground(new java.awt.Color(60, 141, 188));
        btnGuardarEm.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnGuardarEm.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarEm.setText("Guardar ");
        btnGuardarEm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardarEm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarEmActionPerformed(evt);
            }
        });
        pnlEmpleado.add(btnGuardarEm, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, -1, -1));

        jLabel41.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(0, 0, 0));
        jLabel41.setText("Carrera:");
        pnlEmpleado.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        txtCarreraEm.setBackground(new java.awt.Color(236, 239, 244));
        txtCarreraEm.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCarreraEm.setBorder(null);
        txtCarreraEm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlEmpleado.add(txtCarreraEm, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 110, 20));
        pnlEmpleado.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 110, 10));

        jLabel47.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(0, 0, 0));
        jLabel47.setText("Cargo:");
        pnlEmpleado.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, -1, -1));

        txtCargoEm.setBackground(new java.awt.Color(236, 239, 244));
        txtCargoEm.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCargoEm.setBorder(null);
        txtCargoEm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlEmpleado.add(txtCargoEm, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 110, 20));
        pnlEmpleado.add(jSeparator20, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 110, 10));

        txtHorasEm.setBackground(new java.awt.Color(236, 239, 244));
        txtHorasEm.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtHorasEm.setBorder(null);
        txtHorasEm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlEmpleado.add(txtHorasEm, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, 110, 20));
        pnlEmpleado.add(jSeparator21, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, 110, 10));

        jLabel48.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(0, 0, 0));
        jLabel48.setText("Horas:");
        pnlEmpleado.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, -1, -1));

        txtValorHoraEm.setBackground(new java.awt.Color(236, 239, 244));
        txtValorHoraEm.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtValorHoraEm.setBorder(null);
        txtValorHoraEm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlEmpleado.add(txtValorHoraEm, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 110, 20));
        pnlEmpleado.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 110, 10));

        jLabel49.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(0, 0, 0));
        jLabel49.setText("Valor Hora");
        pnlEmpleado.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jPanel6.add(pnlEmpleado, "card2");

        pnlProfesor.setBackground(new java.awt.Color(236, 239, 244));
        pnlProfesor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(204, 204, 204));

        jLabel28.setBackground(new java.awt.Color(0, 0, 0));
        jLabel28.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 0, 0));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/profesor.png"))); // NOI18N
        jLabel28.setText("Home  >");

        jLabel29.setBackground(new java.awt.Color(0, 0, 0));
        jLabel29.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(102, 102, 102));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel29.setText("Profesor");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel29)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pnlProfesor.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 550, 30));

        jLabel42.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(0, 0, 0));
        jLabel42.setText("Cedula:");
        pnlProfesor.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        txtCedulaPro.setBackground(new java.awt.Color(236, 239, 244));
        txtCedulaPro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCedulaPro.setBorder(null);
        txtCedulaPro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlProfesor.add(txtCedulaPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 100, 20));

        jLabel43.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(0, 0, 0));
        jLabel43.setText("Nombre:");
        pnlProfesor.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, -1, -1));

        jLabel44.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(0, 0, 0));
        jLabel44.setText("Direccíon:");
        pnlProfesor.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel45.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(0, 0, 0));
        jLabel45.setText("Telefono:");
        pnlProfesor.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, -1, -1));

        btnGuardarPro.setBackground(new java.awt.Color(60, 141, 188));
        btnGuardarPro.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnGuardarPro.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarPro.setText("Guardar ");
        btnGuardarPro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardarPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarProActionPerformed(evt);
            }
        });
        pnlProfesor.add(btnGuardarPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, -1, -1));
        pnlProfesor.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 110, 10));

        txtDireccionPro.setBackground(new java.awt.Color(236, 239, 244));
        txtDireccionPro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDireccionPro.setBorder(null);
        txtDireccionPro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlProfesor.add(txtDireccionPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 110, 20));
        pnlProfesor.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 110, 10));

        txtNombrePro.setBackground(new java.awt.Color(236, 239, 244));
        txtNombrePro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNombrePro.setBorder(null);
        txtNombrePro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlProfesor.add(txtNombrePro, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 100, 20));
        pnlProfesor.add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 110, 10));

        txtTelefonoPro.setBackground(new java.awt.Color(236, 239, 244));
        txtTelefonoPro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTelefonoPro.setBorder(null);
        txtTelefonoPro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlProfesor.add(txtTelefonoPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 110, 20));
        pnlProfesor.add(jSeparator18, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 110, 10));

        jLabel50.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(0, 0, 0));
        jLabel50.setText("Materia:");
        pnlProfesor.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        txtMateriaPro.setBackground(new java.awt.Color(236, 239, 244));
        txtMateriaPro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtMateriaPro.setBorder(null);
        txtMateriaPro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlProfesor.add(txtMateriaPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 110, 20));
        pnlProfesor.add(jSeparator22, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 110, 10));

        jLabel51.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(0, 0, 0));
        jLabel51.setText("Cargo:");
        pnlProfesor.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, -1, -1));

        txtCargoPro.setBackground(new java.awt.Color(236, 239, 244));
        txtCargoPro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCargoPro.setBorder(null);
        txtCargoPro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlProfesor.add(txtCargoPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 110, 20));
        pnlProfesor.add(jSeparator23, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 110, 10));

        jLabel52.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(0, 0, 0));
        jLabel52.setText("Valor Hora:");
        pnlProfesor.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        txtValorHoraPro.setBackground(new java.awt.Color(236, 239, 244));
        txtValorHoraPro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtValorHoraPro.setBorder(null);
        txtValorHoraPro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlProfesor.add(txtValorHoraPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 110, 20));
        pnlProfesor.add(jSeparator24, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 110, 10));

        jLabel53.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(0, 0, 0));
        jLabel53.setText("Horas:");
        pnlProfesor.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, -1, -1));

        txtHoraPro.setBackground(new java.awt.Color(236, 239, 244));
        txtHoraPro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtHoraPro.setBorder(null);
        txtHoraPro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlProfesor.add(txtHoraPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, 110, 20));
        pnlProfesor.add(jSeparator25, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, 110, 10));

        btnBuscarPro.setBackground(new java.awt.Color(60, 141, 188));
        btnBuscarPro.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnBuscarPro.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarPro.setText("Buscar");
        btnBuscarPro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProActionPerformed(evt);
            }
        });
        pnlProfesor.add(btnBuscarPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, -1, -1));

        jPanel6.add(pnlProfesor, "card2");

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 580, 420));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 742, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 451, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEstudianteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEstudianteMouseClicked
        btnEstudiante.setBackground(new java.awt.Color(44, 59, 66));
        pnlEstudiante.setVisible(true);

        btnEmpleado.setBackground(new java.awt.Color(34, 45, 49));
        pnlEmpleado.setVisible(false);

        btnProfesor.setBackground(new java.awt.Color(34, 45, 49));
        pnlProfesor.setVisible(false);
    }//GEN-LAST:event_btnEstudianteMouseClicked

    private void btnEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEmpleadoMouseClicked
        btnEstudiante.setBackground(new java.awt.Color(34, 45, 49));
        pnlEstudiante.setVisible(false);

        btnEmpleado.setBackground(new java.awt.Color(44, 59, 66));
        pnlEmpleado.setVisible(true);

        btnProfesor.setBackground(new java.awt.Color(34, 45, 49));
        pnlProfesor.setVisible(false);
    }//GEN-LAST:event_btnEmpleadoMouseClicked

    private void btnProfesorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProfesorMouseClicked
        btnEstudiante.setBackground(new java.awt.Color(34, 45, 49));
        pnlEstudiante.setVisible(false);

        btnEmpleado.setBackground(new java.awt.Color(34, 45, 49));
        pnlEmpleado.setVisible(false);

        btnProfesor.setBackground(new java.awt.Color(44, 59, 66));
        pnlProfesor.setVisible(true);
    }//GEN-LAST:event_btnProfesorMouseClicked

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnBuscarEsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarEsActionPerformed
        try {
            
            if (txtcedulaEs.getText().isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "INGRESE LA CEDULA");
            } else {
                int cod = Integer.parseInt(txtcedulaEs.getText());
                int pos = a.buscarEstudiante(cod, numest);
                if (pos != -1) {
                    txtNombreEs.setText(a.getListaPersona(pos).getNombre());
                    txtDireccionEs.setText(a.getListaPersona(pos).getDir());
                    txtTelefonoEs.setText(a.getListaPersona(pos).getTel());
                } else {
                    LimpiarCampos();
                    JOptionPane.showMessageDialog(null, "LA CEDULA " + cod + " NO HA SIDO REGISTRADA");
                }
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "EL VALOR INGRESADO EN LA CEDULA ES INVALIDO.");
        }
       
    }//GEN-LAST:event_btnBuscarEsActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        this.setState(WIDTH);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void btnBuscarEmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarEmActionPerformed
         try {
             
            if (txtCedulaEm.getText().isEmpty()){
                JOptionPane.showMessageDialog(rootPane, "INGRESE LA CEDULA");
            } else {
              int cod = Integer.parseInt(txtCedulaEm.getText());
                int pos=a.buscarEstudiante(cod, numest);   
                if (pos != -1) {
                    txtNombreEm.setText(a.getListaPersona(pos).getNombre());
                    txtDireccionEm.setText(a.getListaPersona(pos).getDir());
                    txtTelefonoEm.setText(a.getListaPersona(pos).getTel());
                } else {
                    LimpiarCampos();
                    JOptionPane.showMessageDialog(null, "NO HAY NADIE GUARDADO CON LA CEDULA " + cod);
                }
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "EL VALOR INGRESADO EN LA CEDULA ES INVALIDO.");
        }
    }//GEN-LAST:event_btnBuscarEmActionPerformed

    private void btnGuardarProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarProActionPerformed
        try {
            int cod = Integer.parseInt(txtCedulaPro.getText());
            if (a.validarEstudiante(cod, numest) == false) {
                int ced = Integer.parseInt(txtCedulaPro.getText());
                String nom = txtNombrePro.getText();
                String D = txtDireccionPro.getText();
                String T = txtTelefonoPro.getText();
                String carr = txtMateriaPro.getText();
                String car = txtCargoPro.getText();
                float vh = Float.parseFloat(txtValorHoraPro.getText());
                int nh = Integer.parseInt(txtHoraPro.getText());

                Profesor pro = new Profesor();
                pro.setdatospersonas(ced, nom, D, T, carr, car, vh, nh);
                a.setListaPersona(numest, pro);
                numest++;

                LimpiarCampos();
            } else {
                JOptionPane.showMessageDialog(rootPane, "NO SE PUEDEN GUARDAR 2 PERSONAS CON LA MISMA CEDULA");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "INGRESE TODOS LOS DATOS");
        }
    }//GEN-LAST:event_btnGuardarProActionPerformed

    private void btnGuardarEsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarEsActionPerformed
         try {
            
                if (txtcedulaEs.getText().isEmpty() || txtNombreEs.getText().isEmpty()
                        || txtDireccionEs.getText().isEmpty() || txtTelefonoEs.getText().isEmpty()
                        || txtCarreraEs.getText().isEmpty() || txtSemestreEs.getText().isEmpty()) {

                    JOptionPane.showMessageDialog(rootPane, "NO PUEDEN QUEDAR CAMPOS VACIOS");
                } else {
           int cod = Integer.parseInt(txtcedulaEs.getText());
            if (a.validarEstudiante(cod, numest) == false) {
                    int ced = Integer.parseInt(txtcedulaEs.getText());
                    String nom = txtNombreEs.getText();
                    String D = txtDireccionEs.getText();
                    String T = txtTelefonoEs.getText();
                    String carr = txtCarreraEs.getText();
                    String sem = txtSemestreEs.getText();

                    Estudiante Es = new Estudiante();
                    Es.setdatospersonas(ced, nom, D, T, carr, sem);
                    a.setListaPersona(numest, Es);
                    numest++;

                     LimpiarCampos();

                 } else {
                     JOptionPane.showMessageDialog(rootPane, "NO SE PUEDEN GUARDAR 2 PERSONAS CON LA MISMA CEDULA");
                 }
             }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "INGRESE TODOS LOS DATOS");
        }
    }//GEN-LAST:event_btnGuardarEsActionPerformed

    private void btnGuardarEmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarEmActionPerformed
        try {    
              int cod = Integer.parseInt(txtCedulaEm.getText());
            if (a.validarEstudiante(cod, numest) == false) {
                int ced = Integer.parseInt(txtCedulaEm.getText());
                String nom = txtNombreEm.getText();
                String D = txtDireccionEm.getText();
                String T = txtTelefonoEm.getText();
                String carr = txtCarreraEm.getText();
                String car = txtCargoEm.getText();
                float vh = Float.parseFloat(txtValorHoraEm.getText());
                int nh = Integer.parseInt(txtHorasEm.getText());

                Empleado Em = new Empleado();
                Em.setdatospersonas(ced, nom, D, T, carr, car, vh, nh);
                a.setListaPersona(numest, Em);
                numest++;

                LimpiarCampos();

            } else {
                JOptionPane.showMessageDialog(rootPane, "NO SE PUEDEN GUARDAR 2 PERSONAS CON LA MISMA CEDULA");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "INGRESE TODOS LOS DATOS");
        }
    }//GEN-LAST:event_btnGuardarEmActionPerformed

    private void btnBuscarProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProActionPerformed
         try {
            
            if (txtCedulaPro.getText().isEmpty()){
                JOptionPane.showMessageDialog(rootPane, "INGRESE LA CEDULA");
            } else {
              int cod = Integer.parseInt(txtCedulaPro.getText());
                int pos=a.buscarEstudiante(cod, numest);   
                if (pos != -1) {
                    txtNombrePro.setText(a.getListaPersona(pos).getNombre());
                    txtDireccionPro.setText(a.getListaPersona(pos).getDir());
                    txtTelefonoPro.setText(a.getListaPersona(pos).getTel());
                } else {
                     LimpiarCampos();
                    JOptionPane.showMessageDialog(null, "NO HAY NADIE GUARDADO CON LA CEDULA " + cod);
                }
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "EL VALOR INGRESADO EN LA CEDULA ES INVALIDO.");
        }
    }//GEN-LAST:event_btnBuscarProActionPerformed

    public void LimpiarCampos(){
    txtcedulaEs.setText("");
    txtNombreEs.setText("");
    txtDireccionEs.setText("");
    txtTelefonoEs.setText("");
    txtCarreraEs.setText("");
    txtSemestreEs.setText("");
    txtCedulaEm.setText("");
    txtNombreEm.setText("");
    txtDireccionEm.setText("");
    txtTelefonoEm.setText("");
    txtCarreraEm.setText("");
    txtCargoEm.setText("");
    txtValorHoraEm.setText("");
    txtHorasEm.setText("");
    txtCedulaPro.setText("");
    txtNombrePro.setText("");
    txtDireccionPro.setText("");
    txtTelefonoPro.setText("");
    txtMateriaPro.setText("");
    txtCargoPro.setText("");
    txtValorHoraPro.setText("");
    txtHoraPro.setText("");
    
    }
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarEm;
    private javax.swing.JButton btnBuscarEs;
    private javax.swing.JButton btnBuscarPro;
    private javax.swing.JLabel btnEmpleado;
    private javax.swing.JLabel btnEstudiante;
    private javax.swing.JButton btnGuardarEm;
    private javax.swing.JButton btnGuardarEs;
    private javax.swing.JButton btnGuardarPro;
    private javax.swing.JLabel btnProfesor;
    private javax.swing.JLabel btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator23;
    private javax.swing.JSeparator jSeparator24;
    private javax.swing.JSeparator jSeparator25;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPanel pnlEmpleado;
    private javax.swing.JPanel pnlEstudiante;
    private javax.swing.JPanel pnlProfesor;
    private javax.swing.JTextField txtCargoEm;
    private javax.swing.JTextField txtCargoPro;
    private javax.swing.JTextField txtCarreraEm;
    private javax.swing.JTextField txtCarreraEs;
    private javax.swing.JTextField txtCedulaEm;
    private javax.swing.JTextField txtCedulaPro;
    private javax.swing.JTextField txtDireccionEm;
    private javax.swing.JTextField txtDireccionEs;
    private javax.swing.JTextField txtDireccionPro;
    private javax.swing.JTextField txtHoraPro;
    private javax.swing.JTextField txtHorasEm;
    private javax.swing.JTextField txtMateriaPro;
    private javax.swing.JTextField txtNombreEm;
    private javax.swing.JTextField txtNombreEs;
    private javax.swing.JTextField txtNombrePro;
    private javax.swing.JTextField txtSemestreEs;
    private javax.swing.JTextField txtTelefonoEm;
    private javax.swing.JTextField txtTelefonoEs;
    private javax.swing.JTextField txtTelefonoPro;
    private javax.swing.JTextField txtValorHoraEm;
    private javax.swing.JTextField txtValorHoraPro;
    private javax.swing.JTextField txtcedulaEs;
    // End of variables declaration//GEN-END:variables
}

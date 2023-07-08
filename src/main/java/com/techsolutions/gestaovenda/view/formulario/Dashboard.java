/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techsolutions.gestaovenda.view.formulario;

import com.techsolutions.gestaovenda.modelo.controller.CategoriaController;
import com.techsolutions.gestaovenda.modelo.controller.ClienteController;
import com.techsolutions.gestaovenda.modelo.controller.DashboardController;
import com.techsolutions.gestaovenda.modelo.controller.ProdutoController;
import com.techsolutions.gestaovenda.modelo.controller.UsuarioController;
import com.techsolutions.gestaovenda.modelo.controller.ValidarCPF;
import com.techsolutions.gestaovenda.modelo.controller.VendaController;
import com.techsolutions.gestaovenda.modelo.entidades.Usuario;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Dashboard extends javax.swing.JFrame {

    private DashboardController dashboardController;
    private CategoriaController categoriaController;
    private ProdutoController produtoController;
    private UsuarioController usuarioController;
    private VendaController vendaController;
    private ClienteController clienteController;
    
    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
        setLocationRelativeTo(null);
        this.dashboardController = new DashboardController(this);
        this.categoriaController = new CategoriaController(this);
        this.usuarioController = new UsuarioController(this);
        this.produtoController = new ProdutoController(this);
        this.vendaController = new VendaController(this);
        this.clienteController = new ClienteController(this);
        eventosDashboard();
        eventoUsuario();
        eventoProduto();
        eventoCategoria();
        eventoVenda();
        eventoCliente();
    }
    
    
    private void eventosDashboard() {
        botaoDashboardProdutos.addActionListener(dashboardController);
        botaoDashboardClientes.addActionListener(dashboardController);
        botaoDashboardHome.addActionListener(dashboardController);
        botaoDashboardVendas.addActionListener(dashboardController);
        botaoDashboardUsuario.addActionListener(dashboardController);
        botaoDashboardSobre.addActionListener(dashboardController);
        botaoDashboardSair.addActionListener(dashboardController);
    }
    
    private void eventoUsuario() {
        botaoUsuarioAdicionar.addActionListener(usuarioController);
        botaoUsuarioEditar.addActionListener(usuarioController);
        botaoUsuarioApagar.addActionListener(usuarioController);
        botaoUsuarioSalvar.addActionListener(usuarioController);
        botaoUsuarioCancelar.addActionListener(usuarioController);
        tabelaUsuario.addMouseListener(usuarioController);
        txtUsuarioPesquisar.addKeyListener(usuarioController);
    }
    
    private void eventoProduto() {
        botaoProdutoAdicionar.addActionListener(produtoController);
        botaoProdutoAdicionarCategoria.addActionListener(produtoController);
        botaoProdutoSalvar.addActionListener(produtoController);
        botaoProdutoCancelar.addActionListener(produtoController);
        botaoProdutoEditar.addActionListener(produtoController);
        botaoProdutoApagar.addActionListener(produtoController);
        tabelaProduto.addMouseListener(produtoController);
        txtProdutoPesquisar.addKeyListener(produtoController);
    }
    
    private void eventoVenda() {
        botaoVendaAdicionar.addActionListener(vendaController);
        botaoVendaCancelar.addActionListener(vendaController);
        botaoVendaLimpar.addActionListener(vendaController);
        botaoVendaRegistroRemover.addActionListener(vendaController);
        botaoVendaResgistroAdicionar.addActionListener(vendaController);
        botaoVendaVender.addActionListener(vendaController);
        botaoVendaDetalhes.addActionListener(vendaController);
        
        comboBoxVendaProduto.addActionListener(vendaController);
        comboBoxVendaPesquisarProdutoPelaCategoria.addActionListener(vendaController);
        txtVendaPesquisarProduto.addKeyListener(vendaController);
        tabelaVendRegistro.addMouseListener(vendaController);
        tabelaVenda.addMouseListener(vendaController);
        checkboxVendaDesconto.addActionListener(vendaController);
    }
    
    private void eventoCategoria() {
       botaoCategoriaApagar.addActionListener(categoriaController);
       botaoCategoriaLimpar.addActionListener(categoriaController);
       botaoCategoriaSalvar.addActionListener(categoriaController);
       botaoCategoriaCancelar.addActionListener(categoriaController);
       tabelaCategoria.addMouseListener(categoriaController);
    }
    
    private void eventoCliente() {
        botaoClienteAdicionar.addActionListener(clienteController);        
        botaoClienteCancelar.addActionListener(clienteController);
        botaoClienteSalvar.addActionListener(clienteController);
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogUsuario = new javax.swing.JDialog();
        jPanel13 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        botaoUsuarioCancelar = new javax.swing.JButton();
        botaoUsuarioSalvar = new javax.swing.JButton();
        txtUsuarioId = new javax.swing.JTextField();
        txtUsuarioNome = new javax.swing.JTextField();
        txtUsuarioUsername = new javax.swing.JTextField();
        comboBoxUsuarioPerfil = new javax.swing.JComboBox<>();
        radioBotaoUsuarioActivo = new javax.swing.JRadioButton();
        radioBotaoUsuarioDesativo = new javax.swing.JRadioButton();
        txtUsuarioSenha = new javax.swing.JPasswordField();
        labelUsuarioMensagem = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        labelUsuarioLogadoId = new javax.swing.JLabel();
        dialogProduto = new javax.swing.JDialog();
        jPanel21 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        botaoProdutoCancelar = new javax.swing.JButton();
        botaoProdutoSalvar = new javax.swing.JButton();
        txtProdutoId = new javax.swing.JTextField();
        txtProdutoNome = new javax.swing.JTextField();
        txtProdutoPreco = new javax.swing.JTextField();
        comboBoxProdutoCategoria = new javax.swing.JComboBox<>();
        labelProdutoMensagem = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtProdutoDescricao = new javax.swing.JTextArea();
        botaoProdutoAdicionarCategoria = new javax.swing.JButton();
        txtProdutoQuantidade = new javax.swing.JSpinner();
        dialogCategoria = new javax.swing.JDialog();
        jPanel22 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        botaoCategoriaCancelar = new javax.swing.JButton();
        botaoCategoriaSalvar = new javax.swing.JButton();
        txtCategoriaId = new javax.swing.JTextField();
        txtCategoriaNome = new javax.swing.JTextField();
        labelCategoriaMensagem = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtCategoriaDescricao = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaCategoria = new javax.swing.JTable();
        botaoCategoriaApagar = new javax.swing.JButton();
        botaoCategoriaLimpar = new javax.swing.JButton();
        dialogVenda = new javax.swing.JDialog();
        jPanel23 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        botaoVendaCancelar = new javax.swing.JButton();
        botaoVendaVender = new javax.swing.JButton();
        txtVendaId = new javax.swing.JTextField();
        txtVendaPesquisarProduto = new javax.swing.JTextField();
        txtVendaValorPago = new javax.swing.JTextField();
        comboBoxVendaPesquisarProdutoPelaCategoria = new javax.swing.JComboBox<>();
        labelVendaMensagem = new javax.swing.JLabel();
        botaoVendaResgistroAdicionar = new javax.swing.JButton();
        txtVendaQuantidade = new javax.swing.JSpinner();
        jLabel22 = new javax.swing.JLabel();
        comboBoxVendaProduto = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        botaoVendaRegistroRemover = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        txtVendaDesconto = new javax.swing.JTextField();
        checkboxVendaDesconto = new javax.swing.JCheckBox();
        jSeparator6 = new javax.swing.JSeparator();
        labelVendaTotalDaVenda = new javax.swing.JLabel();
        labelVendaValorPago = new javax.swing.JLabel();
        labelVendaDesconto = new javax.swing.JLabel();
        labelVendaTroco = new javax.swing.JLabel();
        labelVendaPrecoDoProduto = new javax.swing.JLabel();
        labelVendaQuantidadeDoProduto = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        labelVendaNomeDoProduto = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        txtVendaCliente = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel24 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tabelaVendRegistro = new javax.swing.JTable();
        botaoVendaLimpar = new javax.swing.JButton();
        dialogCliente = new javax.swing.JDialog();
        jPanel14 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        botaoClienteCancelar = new javax.swing.JButton();
        botaoClienteSalvar = new javax.swing.JButton();
        txtClienteId = new javax.swing.JTextField();
        txtClienteNome = new javax.swing.JTextField();
        txtClienteEndereco = new javax.swing.JTextField();
        labelClienteMensagem = new javax.swing.JLabel();
        txtClienteTelefone = new javax.swing.JFormattedTextField();
        jLabel66 = new javax.swing.JLabel();
        txtClienteNascimento = new javax.swing.JFormattedTextField();
        jLabel125 = new javax.swing.JLabel();
        txtClienteIdade = new javax.swing.JTextField();
        dialogQuemSomos = new javax.swing.JDialog();
        jPanel28 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jPanel31 = new javax.swing.JPanel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jPanel32 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel0 = new javax.swing.JPanel();
        botaoDashboardHome = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        botaoDashboardProdutos = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        botaoDashboardClientes = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        botaoDashboardSair = new javax.swing.JButton();
        botaoDashboardUsuario = new javax.swing.JButton();
        jLabel55 = new javax.swing.JLabel();
        botaoDashboardVendas = new javax.swing.JButton();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        botaoDashboardSobre = new javax.swing.JButton();
        jLabel65 = new javax.swing.JLabel();
        panelBody = new javax.swing.JPanel();
        panelHome = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        labelHomeProduto = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        labelHomeCliente = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        labelHomeVenda = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        labelDashboardBemvidoUsuario = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        panelCliente = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        botaoClienteAdicionar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaCliente = new javax.swing.JTable();
        jPanel16 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtClientesPesquisar = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        panelVendas = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        botaoVendaAdicionar = new javax.swing.JButton();
        botaoVendaDetalhes = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tabelaVenda = new javax.swing.JTable();
        jPanel20 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        panelUsuarios = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        botaoUsuarioAdicionar = new javax.swing.JButton();
        botaoUsuarioEditar = new javax.swing.JButton();
        botaoUsuarioApagar = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabelaUsuario = new javax.swing.JTable();
        jPanel18 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txtUsuarioPesquisar = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        panelSobre = new javax.swing.JPanel();
        jPanel34 = new javax.swing.JPanel();
        jPanel35 = new javax.swing.JPanel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jPanel36 = new javax.swing.JPanel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jPanel37 = new javax.swing.JPanel();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        jPanel38 = new javax.swing.JPanel();
        jLabel121 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        panelProduto = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        botaoProdutoAdicionar = new javax.swing.JButton();
        botaoProdutoEditar = new javax.swing.JButton();
        botaoProdutoApagar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaProduto = new javax.swing.JTable();
        jPanel12 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtProdutoPesquisar = new javax.swing.JTextField();
        labelP = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        dialogUsuario.setTitle("Registro de usuarios");

        jPanel13.setBackground(java.awt.Color.white);

        jLabel9.setBackground(java.awt.Color.white);
        jLabel9.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("REGISTRO DE USUARIO");
        jLabel9.setOpaque(true);

        jLabel10.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel10.setText("Id:");

        jLabel11.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel11.setText("Nome:");

        jLabel18.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel18.setText("Username");

        jLabel19.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel19.setText("Senha:");

        jLabel20.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel20.setText("Perfil:");

        jLabel21.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel21.setText("Estado");

        botaoUsuarioCancelar.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        botaoUsuarioCancelar.setText("Cancelar");

        botaoUsuarioSalvar.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        botaoUsuarioSalvar.setText("Salvar");

        txtUsuarioId.setEditable(false);
        txtUsuarioId.setText("0");

        comboBoxUsuarioPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        buttonGroup1.add(radioBotaoUsuarioActivo);
        radioBotaoUsuarioActivo.setText("Activo");
        radioBotaoUsuarioActivo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        buttonGroup1.add(radioBotaoUsuarioDesativo);
        radioBotaoUsuarioDesativo.setText("Desativo");

        labelUsuarioMensagem.setBackground(java.awt.Color.white);
        labelUsuarioMensagem.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        labelUsuarioMensagem.setForeground(java.awt.Color.white);
        labelUsuarioMensagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelUsuarioMensagem.setText("OLA");
        labelUsuarioMensagem.setOpaque(true);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(botaoUsuarioSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoUsuarioCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel13Layout.createSequentialGroup()
                            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel21)
                                .addComponent(jLabel20)
                                .addComponent(jLabel19)
                                .addComponent(jLabel18)
                                .addComponent(jLabel11)
                                .addComponent(jLabel10))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtUsuarioId)
                                .addComponent(txtUsuarioNome)
                                .addComponent(txtUsuarioUsername)
                                .addComponent(comboBoxUsuarioPerfil, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel13Layout.createSequentialGroup()
                                    .addComponent(radioBotaoUsuarioActivo)
                                    .addGap(34, 34, 34)
                                    .addComponent(radioBotaoUsuarioDesativo)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addComponent(txtUsuarioSenha)))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(98, Short.MAX_VALUE))
            .addComponent(labelUsuarioMensagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(labelUsuarioMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtUsuarioId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtUsuarioNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtUsuarioUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtUsuarioSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(comboBoxUsuarioPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel21)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(radioBotaoUsuarioActivo)
                        .addComponent(radioBotaoUsuarioDesativo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoUsuarioCancelar)
                    .addComponent(botaoUsuarioSalvar))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout dialogUsuarioLayout = new javax.swing.GroupLayout(dialogUsuario.getContentPane());
        dialogUsuario.getContentPane().setLayout(dialogUsuarioLayout);
        dialogUsuarioLayout.setHorizontalGroup(
            dialogUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dialogUsuarioLayout.setVerticalGroup(
            dialogUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        labelUsuarioLogadoId.setText("0");

        dialogProduto.setTitle("Registro de produtos");

        jPanel21.setBackground(java.awt.Color.white);

        jLabel30.setBackground(java.awt.Color.white);
        jLabel30.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("REGISTRO DE PRODUTO");
        jLabel30.setOpaque(true);

        jLabel31.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel31.setText("Id:");

        jLabel32.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel32.setText("Nome:");

        jLabel33.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel33.setText("Preço:");

        jLabel34.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel34.setText("Quantidade:");

        jLabel35.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel35.setText("Categoria:");

        jLabel36.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel36.setText("Descrição:");

        botaoProdutoCancelar.setBackground(new java.awt.Color(255, 0, 0));
        botaoProdutoCancelar.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        botaoProdutoCancelar.setText("Cancelar");

        botaoProdutoSalvar.setBackground(new java.awt.Color(0, 204, 51));
        botaoProdutoSalvar.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        botaoProdutoSalvar.setText("Salvar");

        txtProdutoId.setEditable(false);
        txtProdutoId.setText("0");

        txtProdutoPreco.setText("1");

        comboBoxProdutoCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBoxProdutoCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxProdutoCategoriaActionPerformed(evt);
            }
        });

        labelProdutoMensagem.setBackground(java.awt.Color.white);
        labelProdutoMensagem.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        labelProdutoMensagem.setForeground(java.awt.Color.white);
        labelProdutoMensagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelProdutoMensagem.setText("OLA");
        labelProdutoMensagem.setOpaque(true);

        txtProdutoDescricao.setColumns(20);
        txtProdutoDescricao.setRows(5);
        jScrollPane6.setViewportView(txtProdutoDescricao);

        botaoProdutoAdicionarCategoria.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cledson\\Downloads\\add.png")); // NOI18N
        botaoProdutoAdicionarCategoria.setActionCommand("adicionarcategoria");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(botaoProdutoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoProdutoCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel21Layout.createSequentialGroup()
                            .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel36)
                                .addComponent(jLabel35)
                                .addComponent(jLabel34)
                                .addComponent(jLabel33)
                                .addComponent(jLabel32)
                                .addComponent(jLabel31))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtProdutoId)
                                .addComponent(txtProdutoNome)
                                .addComponent(txtProdutoPreco)
                                .addComponent(jScrollPane6)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                                    .addComponent(comboBoxProdutoCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(0, 0, 0)
                                    .addComponent(botaoProdutoAdicionarCategoria))
                                .addComponent(txtProdutoQuantidade)))
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(98, Short.MAX_VALUE))
            .addComponent(labelProdutoMensagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(labelProdutoMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(txtProdutoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(txtProdutoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(txtProdutoPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(txtProdutoQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoProdutoAdicionarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel35)
                        .addComponent(comboBoxProdutoCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel36)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoProdutoCancelar)
                    .addComponent(botaoProdutoSalvar))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout dialogProdutoLayout = new javax.swing.GroupLayout(dialogProduto.getContentPane());
        dialogProduto.getContentPane().setLayout(dialogProdutoLayout);
        dialogProdutoLayout.setHorizontalGroup(
            dialogProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dialogProdutoLayout.setVerticalGroup(
            dialogProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogProdutoLayout.createSequentialGroup()
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        dialogCategoria.setTitle("Registro de categorias");

        jPanel22.setBackground(java.awt.Color.white);

        jLabel37.setBackground(java.awt.Color.white);
        jLabel37.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("REGISTRO DE CATEGORIA");
        jLabel37.setOpaque(true);

        jLabel38.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel38.setText("Id:");

        jLabel39.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel39.setText("Nome:");

        jLabel43.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel43.setText("Descrição:");

        botaoCategoriaCancelar.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        botaoCategoriaCancelar.setText("Cancelar");

        botaoCategoriaSalvar.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        botaoCategoriaSalvar.setText("Salvar");

        txtCategoriaId.setEditable(false);
        txtCategoriaId.setText("0");

        labelCategoriaMensagem.setBackground(java.awt.Color.white);
        labelCategoriaMensagem.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        labelCategoriaMensagem.setForeground(java.awt.Color.white);
        labelCategoriaMensagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCategoriaMensagem.setText("OLA");
        labelCategoriaMensagem.setOpaque(true);

        txtCategoriaDescricao.setColumns(20);
        txtCategoriaDescricao.setRows(5);
        jScrollPane7.setViewportView(txtCategoriaDescricao);

        tabelaCategoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tabelaCategoria);

        botaoCategoriaApagar.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        botaoCategoriaApagar.setText("Apagar");

        botaoCategoriaLimpar.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        botaoCategoriaLimpar.setText("Limpar");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(labelCategoriaMensagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(botaoCategoriaLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoCategoriaApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoCategoriaSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoCategoriaCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel22Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel43)
                            .addComponent(jLabel39)
                            .addComponent(jLabel38))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCategoriaId)
                            .addComponent(txtCategoriaNome)
                            .addComponent(jScrollPane7)))
                    .addComponent(jSeparator4)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(labelCategoriaMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(txtCategoriaId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(txtCategoriaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel43)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoCategoriaCancelar)
                    .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botaoCategoriaSalvar)
                        .addComponent(botaoCategoriaApagar)
                        .addComponent(botaoCategoriaLimpar)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout dialogCategoriaLayout = new javax.swing.GroupLayout(dialogCategoria.getContentPane());
        dialogCategoria.getContentPane().setLayout(dialogCategoriaLayout);
        dialogCategoriaLayout.setHorizontalGroup(
            dialogCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogCategoriaLayout.createSequentialGroup()
                .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        dialogCategoriaLayout.setVerticalGroup(
            dialogCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogCategoriaLayout.createSequentialGroup()
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        dialogVenda.setTitle("Registro de vendas");

        jPanel23.setBackground(java.awt.Color.white);

        jLabel40.setBackground(java.awt.Color.white);
        jLabel40.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("REGISTRO DE VENDAS");
        jLabel40.setOpaque(true);

        jLabel41.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel41.setText("Id:");

        jLabel42.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel42.setText("Pesquisar produto:");

        jLabel44.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel44.setText("Valor pago:");

        jLabel45.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel45.setText("Quantidade:");

        jLabel46.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel46.setText("Categoria:");

        botaoVendaCancelar.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        botaoVendaCancelar.setText("Cancelar");

        botaoVendaVender.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        botaoVendaVender.setText("Vender");

        txtVendaId.setEditable(false);
        txtVendaId.setText("0");

        comboBoxVendaPesquisarProdutoPelaCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBoxVendaPesquisarProdutoPelaCategoria.setActionCommand("comboboxVendaCategoria");
        comboBoxVendaPesquisarProdutoPelaCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxVendaPesquisarProdutoPelaCategoriaActionPerformed(evt);
            }
        });

        labelVendaMensagem.setBackground(java.awt.Color.white);
        labelVendaMensagem.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        labelVendaMensagem.setForeground(java.awt.Color.white);
        labelVendaMensagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelVendaMensagem.setText("OLA");
        labelVendaMensagem.setOpaque(true);

        botaoVendaResgistroAdicionar.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        botaoVendaResgistroAdicionar.setText("Adiconar");
        botaoVendaResgistroAdicionar.setActionCommand("adicionarnocesto");

        txtVendaQuantidade.setValue(Integer.valueOf("1")
        );

        jLabel22.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel22.setText("Produto:");

        comboBoxVendaProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBoxVendaProduto.setActionCommand("comboboxvendaproduto");
        comboBoxVendaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxVendaProdutoActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel23.setText("Preço:");

        jLabel24.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel24.setText("Quantidade disponivel:");

        jLabel25.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel25.setText("Total da Venda:");

        jLabel26.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel26.setText("Valor pago:");

        jLabel27.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel27.setText("Desconto:");

        jLabel28.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel28.setText("Troco:");

        botaoVendaRegistroRemover.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        botaoVendaRegistroRemover.setText("Remover");

        jLabel29.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel29.setText("Desconto:");

        txtVendaDesconto.setEditable(false);
        txtVendaDesconto.setText("0");
        txtVendaDesconto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVendaDescontoActionPerformed(evt);
            }
        });

        checkboxVendaDesconto.setActionCommand("checkboxvendadesconto");

        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);

        labelVendaTotalDaVenda.setText("0.00");

        labelVendaValorPago.setText("0.00");

        labelVendaDesconto.setText("0.00");

        labelVendaTroco.setText("0.00");

        labelVendaPrecoDoProduto.setText("0,00");

        labelVendaQuantidadeDoProduto.setText("0");

        jLabel47.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel47.setText("Nome do produto:");

        jLabel53.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel53.setText("Buscar cliente:");

        jButton1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jButton1.setText("Limpar");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator5)
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel23Layout.createSequentialGroup()
                                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(botaoVendaResgistroAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(botaoVendaRegistroRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(botaoVendaVender, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(botaoVendaCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel23Layout.createSequentialGroup()
                                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel44)
                                            .addComponent(jLabel41)
                                            .addComponent(jLabel46)
                                            .addComponent(jLabel45)
                                            .addComponent(jLabel29)
                                            .addComponent(jLabel42)
                                            .addComponent(jLabel53))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel23Layout.createSequentialGroup()
                                                .addComponent(jLabel47)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(labelVendaNomeDoProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(txtVendaId)
                                            .addComponent(txtVendaPesquisarProduto)
                                            .addComponent(txtVendaValorPago)
                                            .addGroup(jPanel23Layout.createSequentialGroup()
                                                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel23Layout.createSequentialGroup()
                                                        .addComponent(comboBoxVendaPesquisarProdutoPelaCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel22))
                                                    .addGroup(jPanel23Layout.createSequentialGroup()
                                                        .addComponent(jLabel23)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(labelVendaPrecoDoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel23Layout.createSequentialGroup()
                                                        .addComponent(jLabel24)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(labelVendaQuantidadeDoProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                    .addComponent(comboBoxVendaProduto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                            .addComponent(txtVendaQuantidade)
                                            .addGroup(jPanel23Layout.createSequentialGroup()
                                                .addComponent(txtVendaDesconto)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(checkboxVendaDesconto))
                                            .addGroup(jPanel23Layout.createSequentialGroup()
                                                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel25)
                                                    .addComponent(jLabel26)
                                                    .addComponent(jLabel27)
                                                    .addComponent(jLabel28))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(labelVendaTotalDaVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(labelVendaValorPago, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(labelVendaDesconto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(labelVendaTroco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                            .addComponent(jSeparator2)
                                            .addComponent(txtVendaCliente))))))
                        .addGap(22, 22, 22))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelVendaMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 788, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 788, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(labelVendaMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(txtVendaId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(txtVendaPesquisarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(comboBoxVendaPesquisarProdutoPelaCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(comboBoxVendaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel24)
                    .addComponent(jLabel23)
                    .addComponent(labelVendaQuantidadeDoProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelVendaPrecoDoProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(labelVendaNomeDoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(txtVendaQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkboxVendaDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel29)
                        .addComponent(txtVendaDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtVendaValorPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53)
                    .addComponent(txtVendaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelVendaTotalDaVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel26)
                    .addComponent(labelVendaValorPago, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27)
                    .addComponent(labelVendaDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(labelVendaTroco))
                .addGap(18, 18, 18)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoVendaCancelar)
                    .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botaoVendaVender)
                        .addComponent(botaoVendaResgistroAdicionar)
                        .addComponent(botaoVendaRegistroRemover)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jSeparator6))
        );

        jPanel24.setBackground(java.awt.Color.white);

        tabelaVendRegistro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane8.setViewportView(tabelaVendRegistro);

        botaoVendaLimpar.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        botaoVendaLimpar.setText("Limpar");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botaoVendaLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8)
                .addGap(18, 18, 18)
                .addComponent(botaoVendaLimpar)
                .addContainerGap())
        );

        javax.swing.GroupLayout dialogVendaLayout = new javax.swing.GroupLayout(dialogVenda.getContentPane());
        dialogVenda.getContentPane().setLayout(dialogVendaLayout);
        dialogVendaLayout.setHorizontalGroup(
            dialogVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogVendaLayout.createSequentialGroup()
                .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        dialogVendaLayout.setVerticalGroup(
            dialogVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogVendaLayout.createSequentialGroup()
                .addGroup(dialogVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        dialogCliente.setTitle("Registro de clientes");

        jPanel14.setBackground(java.awt.Color.white);

        jLabel48.setBackground(java.awt.Color.white);
        jLabel48.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setText("REGISTRO DE CLIENTE");
        jLabel48.setOpaque(true);

        jLabel49.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel49.setText("Id:");

        jLabel50.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel50.setText("Nome:");

        jLabel51.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel51.setText("CPF: ");

        jLabel52.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel52.setText("Endereço:");

        botaoClienteCancelar.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        botaoClienteCancelar.setText("Cancelar");
        botaoClienteCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoClienteCancelarActionPerformed(evt);
            }
        });

        botaoClienteSalvar.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        botaoClienteSalvar.setText("Salvar");
        botaoClienteSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoClienteSalvarActionPerformed(evt);
            }
        });

        txtClienteId.setEditable(false);
        txtClienteId.setText("0");

        labelClienteMensagem.setBackground(java.awt.Color.white);
        labelClienteMensagem.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        labelClienteMensagem.setForeground(java.awt.Color.white);
        labelClienteMensagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelClienteMensagem.setText("OLA");
        labelClienteMensagem.setOpaque(true);

        try {
            txtClienteTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel66.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel66.setText("Nascimento: ");

        try {
            txtClienteNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtClienteNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteNascimentoActionPerformed(evt);
            }
        });

        txtClienteIdade.setFont(new java.awt.Font("Segoe UI", 3, 13)); // NOI18N
        txtClienteIdade.setForeground(new java.awt.Color(255, 51, 51));
        txtClienteIdade.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtClienteIdade.setBorder(null);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(labelClienteMensagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(botaoClienteSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoClienteCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel52)
                                    .addComponent(jLabel51)
                                    .addComponent(jLabel50)
                                    .addComponent(jLabel49))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtClienteId, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
                                    .addComponent(txtClienteNome)
                                    .addComponent(txtClienteEndereco)
                                    .addComponent(txtClienteTelefone)))))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel66)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtClienteNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel125, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtClienteIdade, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE))))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(labelClienteMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49)
                    .addComponent(txtClienteId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(txtClienteNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(txtClienteTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel52)
                    .addComponent(txtClienteEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel66)
                            .addComponent(jLabel125))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtClienteNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtClienteIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)))
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoClienteSalvar)
                    .addComponent(botaoClienteCancelar))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout dialogClienteLayout = new javax.swing.GroupLayout(dialogCliente.getContentPane());
        dialogCliente.getContentPane().setLayout(dialogClienteLayout);
        dialogClienteLayout.setHorizontalGroup(
            dialogClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dialogClienteLayout.setVerticalGroup(
            dialogClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel28.setBackground(new java.awt.Color(255, 255, 255));

        jPanel29.setBackground(new java.awt.Color(100, 158, 204));

        jLabel78.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cledson\\Downloads\\icons8-phone-16.png")); // NOI18N

        jLabel79.setText("jLabel79");

        jLabel80.setText("jLabel80");

        jLabel93.setText("jLabel93");

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel78)
                .addGap(18, 18, 18)
                .addComponent(jLabel79)
                .addGap(97, 97, 97)
                .addComponent(jLabel80)
                .addGap(18, 18, 18)
                .addComponent(jLabel93)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel78)
                    .addComponent(jLabel79)
                    .addComponent(jLabel80)
                    .addComponent(jLabel93))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel30.setBackground(new java.awt.Color(30, 113, 183));

        jLabel84.setBackground(new java.awt.Color(51, 51, 0));
        jLabel84.setForeground(new java.awt.Color(51, 255, 51));
        jLabel84.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cledson\\Downloads\\SOFTWARE_LOGO.png")); // NOI18N

        jLabel85.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel85.setForeground(new java.awt.Color(255, 255, 255));
        jLabel85.setText("Tech");

        jLabel86.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        jLabel86.setForeground(new java.awt.Color(51, 255, 255));
        jLabel86.setText("Solutions");

        jLabel87.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel87.setForeground(new java.awt.Color(255, 255, 255));
        jLabel87.setText("A T. Solutions foi idealizado ");

        jLabel88.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel88.setForeground(new java.awt.Color(255, 255, 255));
        jLabel88.setText("para atender a todos");

        jLabel89.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel89.setForeground(new java.awt.Color(255, 255, 255));
        jLabel89.setText("aqueles que buscam");

        jLabel90.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel90.setForeground(new java.awt.Color(255, 255, 255));
        jLabel90.setText("nas área de logística e ");

        jLabel91.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel91.setForeground(new java.awt.Color(255, 255, 255));
        jLabel91.setText("setores varejistas.");

        jLabel92.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel92.setForeground(new java.awt.Color(255, 255, 255));
        jLabel92.setText("controle no seu estoque");

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(jLabel84)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel86)))
                    .addComponent(jLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel89)
                    .addComponent(jLabel92)
                    .addComponent(jLabel90)
                    .addComponent(jLabel91)
                    .addComponent(jLabel87))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(jLabel85)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel87)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel88)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel89)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel92)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel90)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel91)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel31.setBackground(new java.awt.Color(51, 51, 51));
        jPanel31.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jLabel67.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(255, 255, 255));
        jLabel67.setText("     Somos uma empresa focada na geração de soluções e conhecimento técnico");

        jLabel68.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(255, 255, 255));
        jLabel68.setText("empresarial para os diferentes tipos de organizações e profissionais que buscam");

        jLabel69.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(255, 255, 255));
        jLabel69.setText("melhor desempenho e alcançar os melhores resultados.");

        jLabel70.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(255, 255, 255));
        jLabel70.setText("A Tech Solutions foi idealizado para atender todas as empresas e profissionais que buscam");

        jLabel71.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(255, 255, 255));
        jLabel71.setText("melhoria de desempenho e excelentes resultados de uma maneira diferente,");

        jLabel72.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(255, 255, 255));
        jLabel72.setText("adequada, eficiente e eficaz!");

        jLabel73.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(255, 255, 255));
        jLabel73.setText("MISSÃO: Atender e suprir com excelência e elevado padrão de qualidade às");

        jLabel74.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(255, 255, 255));
        jLabel74.setText("necessidades mercadológicas atuais de serviços de consultoria empresarial,");

        jLabel75.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(255, 255, 255));
        jLabel75.setText("capacitação técnica profissional e pessoal, gerando satisfação, agregando valor e");

        jLabel76.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(255, 255, 255));
        jLabel76.setText("melhorando os resultados atingidos dos nossos clientes, equipe, sociedade e dos");

        jLabel77.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(255, 255, 255));
        jLabel77.setText("acionistas da empresa de forma confiável e sustentável.");

        jLabel82.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(255, 255, 255));
        jLabel82.setText("NOSSOS VALORES: Atitude, Transparência, Excelência, Confiança, Compromisso,");

        jLabel83.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(255, 255, 255));
        jLabel83.setText("Ética, Respeito, Integridade, Modernidade.");

        jLabel81.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(255, 255, 255));
        jLabel81.setText("profissionalismo, ética, confiança e responsabilidade social.");

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel81)
                    .addComponent(jLabel83)
                    .addComponent(jLabel82)
                    .addComponent(jLabel77)
                    .addComponent(jLabel76)
                    .addComponent(jLabel75)
                    .addComponent(jLabel74)
                    .addComponent(jLabel73)
                    .addComponent(jLabel72)
                    .addComponent(jLabel70)
                    .addComponent(jLabel71)
                    .addGroup(jPanel31Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel68)
                            .addComponent(jLabel67)
                            .addComponent(jLabel69)))))
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel68)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel69)
                .addGap(18, 18, 18)
                .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel71)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel72)
                .addGap(33, 33, 33)
                .addComponent(jLabel73)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel74)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel75)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel76)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel77)
                .addGap(18, 18, 18)
                .addComponent(jLabel82)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel83)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel81)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
            .addComponent(jPanel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(108, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout dialogQuemSomosLayout = new javax.swing.GroupLayout(dialogQuemSomos.getContentPane());
        dialogQuemSomos.getContentPane().setLayout(dialogQuemSomosLayout);
        dialogQuemSomosLayout.setHorizontalGroup(
            dialogQuemSomosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        dialogQuemSomosLayout.setVerticalGroup(
            dialogQuemSomosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogQuemSomosLayout.createSequentialGroup()
                .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Gerenciamento de estoque e vendas - Tech Solutions");
        setBackground(java.awt.Color.white);
        setPreferredSize(new java.awt.Dimension(1680, 940));
        setResizable(false);
        setSize(new java.awt.Dimension(0, 10));

        jPanel1.setBackground(new java.awt.Color(86, 102, 117));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel3.setBackground(java.awt.Color.white);
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );

        jPanel0.setBackground(new java.awt.Color(86, 102, 117));

        botaoDashboardHome.setBackground(new java.awt.Color(86, 102, 117));
        botaoDashboardHome.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        botaoDashboardHome.setForeground(new java.awt.Color(204, 204, 204));
        botaoDashboardHome.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cledson\\Downloads\\home-5-16.png")); // NOI18N
        botaoDashboardHome.setText("Home");
        botaoDashboardHome.setBorder(null);
        botaoDashboardHome.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                botaoDashboardHomeMouseDragged(evt);
            }
        });
        botaoDashboardHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDashboardHomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel0Layout = new javax.swing.GroupLayout(jPanel0);
        jPanel0.setLayout(jPanel0Layout);
        jPanel0Layout.setHorizontalGroup(
            jPanel0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel0Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(botaoDashboardHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel0Layout.setVerticalGroup(
            jPanel0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel0Layout.createSequentialGroup()
                .addComponent(botaoDashboardHome, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(86, 102, 117));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Gerenciamento");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(86, 102, 117));

        botaoDashboardProdutos.setBackground(new java.awt.Color(85, 101, 116));
        botaoDashboardProdutos.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        botaoDashboardProdutos.setForeground(new java.awt.Color(204, 204, 204));
        botaoDashboardProdutos.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cledson\\Downloads\\package-2-16.png")); // NOI18N
        botaoDashboardProdutos.setText("Produtos");
        botaoDashboardProdutos.setBorder(null);
        botaoDashboardProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDashboardProdutosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botaoDashboardProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(botaoDashboardProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(86, 102, 117));

        botaoDashboardClientes.setBackground(new java.awt.Color(85, 101, 116));
        botaoDashboardClientes.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        botaoDashboardClientes.setForeground(new java.awt.Color(204, 204, 204));
        botaoDashboardClientes.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cledson\\Downloads\\package-2-16.png")); // NOI18N
        botaoDashboardClientes.setText("Clientes");
        botaoDashboardClientes.setBorder(null);
        botaoDashboardClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDashboardClientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botaoDashboardClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(botaoDashboardClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel7.setBackground(java.awt.Color.white);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        botaoDashboardSair.setBackground(new java.awt.Color(86, 102, 117));
        botaoDashboardSair.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        botaoDashboardSair.setForeground(new java.awt.Color(204, 204, 204));
        botaoDashboardSair.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cledson\\Downloads\\logout-16.png")); // NOI18N
        botaoDashboardSair.setText("Sair");
        botaoDashboardSair.setBorder(null);

        botaoDashboardUsuario.setBackground(new java.awt.Color(86, 102, 117));
        botaoDashboardUsuario.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        botaoDashboardUsuario.setForeground(new java.awt.Color(204, 204, 204));
        botaoDashboardUsuario.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cledson\\Downloads\\package-2-16.png")); // NOI18N
        botaoDashboardUsuario.setText("Usuarios");
        botaoDashboardUsuario.setBorder(null);
        botaoDashboardUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDashboardUsuarioActionPerformed(evt);
            }
        });

        jLabel55.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(255, 255, 255));
        jLabel55.setText("Administração");

        botaoDashboardVendas.setBackground(new java.awt.Color(86, 102, 117));
        botaoDashboardVendas.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        botaoDashboardVendas.setForeground(new java.awt.Color(204, 204, 204));
        botaoDashboardVendas.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cledson\\Downloads\\package-2-16.png")); // NOI18N
        botaoDashboardVendas.setText("Vendas");
        botaoDashboardVendas.setBorder(null);
        botaoDashboardVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDashboardVendasActionPerformed(evt);
            }
        });

        jLabel61.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(255, 255, 255));
        jLabel61.setText("Logout");

        jLabel62.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cledson\\Downloads\\icons8-software-100 (1).png")); // NOI18N

        jLabel63.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(255, 255, 255));
        jLabel63.setText("Tech");

        jLabel64.setFont(new java.awt.Font("Segoe UI", 3, 26)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(0, 255, 255));
        jLabel64.setText("Solutions");

        botaoDashboardSobre.setBackground(new java.awt.Color(86, 102, 117));
        botaoDashboardSobre.setFont(new java.awt.Font("Segoe UI", 3, 15)); // NOI18N
        botaoDashboardSobre.setForeground(new java.awt.Color(204, 204, 204));
        botaoDashboardSobre.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cledson\\Downloads\\question-mark-16.png")); // NOI18N
        botaoDashboardSobre.setText("Quem somos");
        botaoDashboardSobre.setBorder(null);
        botaoDashboardSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDashboardSobreActionPerformed(evt);
            }
        });

        jLabel65.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(255, 255, 255));
        jLabel65.setText("Sobre");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botaoDashboardUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel0, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(botaoDashboardSair, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(botaoDashboardVendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel55))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel65)
                            .addComponent(jLabel61))))
                .addGap(0, 173, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(botaoDashboardSobre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel62)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel63)
                    .addComponent(jLabel64))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(botaoDashboardVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel55)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoDashboardUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel65)
                .addGap(14, 14, 14)
                .addComponent(botaoDashboardSobre, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel61)
                .addGap(18, 18, 18)
                .addComponent(botaoDashboardSair, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel63)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel64))
                    .addComponent(jLabel62))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelBody.setBackground(java.awt.Color.white);
        panelBody.setPreferredSize(new java.awt.Dimension(1701, 960));
        panelBody.setLayout(new java.awt.CardLayout());

        panelHome.setBackground(new java.awt.Color(86, 102, 117));
        panelHome.setMaximumSize(new java.awt.Dimension(1701, 950));
        panelHome.setPreferredSize(new java.awt.Dimension(728, 595));

        jPanel5.setBackground(new java.awt.Color(201, 64, 46));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 25)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PRODUTOS CADASTRADOS");

        labelHomeProduto.setFont(new java.awt.Font("Ubuntu", 1, 66)); // NOI18N
        labelHomeProduto.setForeground(new java.awt.Color(255, 255, 255));
        labelHomeProduto.setText("0");

        jPanel6.setBackground(new java.awt.Color(175, 58, 41));

        jLabel56.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cledson\\Downloads\\icons8-barcode-100.png")); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(jLabel56)
                .addContainerGap(131, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jLabel2))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(labelHomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel2)
                .addGap(60, 60, 60)
                .addComponent(labelHomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel10.setBackground(new java.awt.Color(247, 157, 17));
        jPanel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel10.setPreferredSize(new java.awt.Dimension(204, 88));

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 46)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CLIENTES");

        labelHomeCliente.setFont(new java.awt.Font("Ubuntu", 1, 54)); // NOI18N
        labelHomeCliente.setForeground(new java.awt.Color(255, 255, 255));
        labelHomeCliente.setText("0");

        jPanel27.setBackground(new java.awt.Color(199, 121, 20));

        jLabel60.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cledson\\Downloads\\group-128.png")); // NOI18N

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel60)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(jLabel60)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(337, 337, 337)
                        .addComponent(jLabel4))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(430, 430, 430)
                        .addComponent(labelHomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel4)
                .addGap(51, 51, 51)
                .addComponent(labelHomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
            .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel11.setBackground(new java.awt.Color(1, 166, 90));
        jPanel11.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel11.setPreferredSize(new java.awt.Dimension(204, 88));

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("TOTAL DE VENDAS");

        labelHomeVenda.setFont(new java.awt.Font("Ubuntu", 1, 66)); // NOI18N
        labelHomeVenda.setForeground(new java.awt.Color(255, 255, 255));
        labelHomeVenda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelHomeVenda.setText("0");

        jPanel25.setBackground(new java.awt.Color(0, 133, 74));

        jLabel57.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cledson\\Downloads\\icons8-money-100.png")); // NOI18N

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel57)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(jLabel57)
                .addContainerGap(131, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel6))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(labelHomeVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(141, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel6)
                .addGap(59, 59, 59)
                .addComponent(labelHomeVenda)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        labelDashboardBemvidoUsuario.setBackground(new java.awt.Color(255, 255, 255));
        labelDashboardBemvidoUsuario.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        labelDashboardBemvidoUsuario.setForeground(new java.awt.Color(255, 255, 255));
        labelDashboardBemvidoUsuario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelDashboardBemvidoUsuario.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cledson\\Downloads\\batman.png")); // NOI18N

        jLabel58.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(255, 255, 255));
        jLabel58.setText("Dashboard");

        jLabel59.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(204, 204, 204));
        jLabel59.setText("Painel de controle");

        javax.swing.GroupLayout panelHomeLayout = new javax.swing.GroupLayout(panelHome);
        panelHome.setLayout(panelHomeLayout);
        panelHomeLayout.setHorizontalGroup(
            panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHomeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelHomeLayout.createSequentialGroup()
                        .addComponent(jLabel58)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel59)
                        .addGap(382, 382, 382)
                        .addComponent(labelDashboardBemvidoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelHomeLayout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, 1315, Short.MAX_VALUE))
                .addGap(59, 839, Short.MAX_VALUE))
        );
        panelHomeLayout.setVerticalGroup(
            panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHomeLayout.createSequentialGroup()
                .addGroup(panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelHomeLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel58)
                            .addComponent(jLabel59))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHomeLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelDashboardBemvidoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );

        panelBody.add(panelHome, "card6");

        panelCliente.setBackground(new java.awt.Color(86, 102, 117));

        jPanel15.setBackground(java.awt.Color.white);
        jPanel15.setLayout(new java.awt.GridLayout(1, 0));

        botaoClienteAdicionar.setBackground(new java.awt.Color(0, 204, 0));
        botaoClienteAdicionar.setText("Adicionar");
        jPanel15.add(botaoClienteAdicionar);

        tabelaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ));
        jScrollPane3.setViewportView(tabelaCliente);

        jPanel16.setBackground(java.awt.Color.white);
        jPanel16.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cledson\\Downloads\\magnifying-glass (1).png")); // NOI18N

        txtClientesPesquisar.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGap(0, 0, 0)
                .addComponent(txtClientesPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(txtClientesPesquisar)
        );

        jLabel13.setBackground(new java.awt.Color(86, 102, 117));
        jLabel13.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("CLIENTES");

        javax.swing.GroupLayout panelClienteLayout = new javax.swing.GroupLayout(panelCliente);
        panelCliente.setLayout(panelClienteLayout);
        panelClienteLayout.setHorizontalGroup(
            panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 2148, Short.MAX_VALUE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelClienteLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelClienteLayout.setVerticalGroup(
            panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 778, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelBody.add(panelCliente, "card3");

        panelVendas.setBackground(new java.awt.Color(86, 102, 117));

        jPanel19.setBackground(java.awt.Color.white);
        jPanel19.setLayout(new java.awt.GridLayout(1, 0));

        botaoVendaAdicionar.setBackground(new java.awt.Color(0, 204, 51));
        botaoVendaAdicionar.setText("Adicionar");
        botaoVendaAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVendaAdicionarActionPerformed(evt);
            }
        });
        jPanel19.add(botaoVendaAdicionar);

        botaoVendaDetalhes.setBackground(new java.awt.Color(255, 255, 153));
        botaoVendaDetalhes.setText("Detalhes");
        jPanel19.add(botaoVendaDetalhes);

        tabelaVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ));
        jScrollPane5.setViewportView(tabelaVenda);

        jPanel20.setBackground(java.awt.Color.white);
        jPanel20.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel16.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cledson\\Downloads\\magnifying-glass (1).png")); // NOI18N

        jTextField5.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addGap(0, 0, 0)
                .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jTextField5)
        );

        jLabel17.setBackground(new java.awt.Color(86, 102, 117));
        jLabel17.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("VENDAS");

        javax.swing.GroupLayout panelVendasLayout = new javax.swing.GroupLayout(panelVendas);
        panelVendas.setLayout(panelVendasLayout);
        panelVendasLayout.setHorizontalGroup(
            panelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVendasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 2148, Short.MAX_VALUE)
                    .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelVendasLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelVendasLayout.setVerticalGroup(
            panelVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVendasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 778, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelBody.add(panelVendas, "card4");

        panelUsuarios.setBackground(new java.awt.Color(86, 102, 117));

        jPanel17.setBackground(java.awt.Color.white);
        jPanel17.setLayout(new java.awt.GridLayout(1, 0));

        botaoUsuarioAdicionar.setBackground(new java.awt.Color(0, 204, 51));
        botaoUsuarioAdicionar.setText("Adicionar");
        botaoUsuarioAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoUsuarioAdicionarActionPerformed(evt);
            }
        });
        jPanel17.add(botaoUsuarioAdicionar);

        botaoUsuarioEditar.setBackground(new java.awt.Color(255, 153, 0));
        botaoUsuarioEditar.setText("Editar");
        jPanel17.add(botaoUsuarioEditar);

        botaoUsuarioApagar.setBackground(new java.awt.Color(255, 51, 0));
        botaoUsuarioApagar.setText("Apagar");
        jPanel17.add(botaoUsuarioApagar);

        jScrollPane4.setBackground(java.awt.Color.white);

        tabelaUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ));
        jScrollPane4.setViewportView(tabelaUsuario);

        jPanel18.setBackground(java.awt.Color.white);
        jPanel18.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtUsuarioPesquisar.setToolTipText("Pesquisar pelo Nome");
        txtUsuarioPesquisar.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel14)
                .addGap(0, 0, 0)
                .addComponent(txtUsuarioPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(txtUsuarioPesquisar)
        );

        jLabel15.setBackground(java.awt.Color.white);
        jLabel15.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("USUARIOS");

        javax.swing.GroupLayout panelUsuariosLayout = new javax.swing.GroupLayout(panelUsuarios);
        panelUsuarios.setLayout(panelUsuariosLayout);
        panelUsuariosLayout.setHorizontalGroup(
            panelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 2148, Short.MAX_VALUE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelUsuariosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelUsuariosLayout.setVerticalGroup(
            panelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelBody.add(panelUsuarios, "card5");

        panelSobre.setPreferredSize(new java.awt.Dimension(1507, 1006));

        jPanel34.setBackground(new java.awt.Color(229, 229, 229));

        jPanel35.setBackground(new java.awt.Color(100, 158, 204));

        jLabel94.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cledson\\Downloads\\icons8-phone-16.png")); // NOI18N

        jLabel95.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel95.setForeground(new java.awt.Color(255, 255, 255));
        jLabel95.setText("(84) 98372-9876");

        jLabel96.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cledson\\Downloads\\icons8-email-16.png")); // NOI18N

        jLabel97.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel97.setForeground(new java.awt.Color(255, 255, 255));
        jLabel97.setText("techsolutions@gmail.com");

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel94)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel95)
                .addGap(18, 18, 18)
                .addComponent(jLabel96)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel97)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel96)
                    .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel94)
                        .addComponent(jLabel95))
                    .addComponent(jLabel97))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel36.setBackground(new java.awt.Color(30, 113, 183));

        jLabel98.setBackground(new java.awt.Color(51, 51, 0));
        jLabel98.setForeground(new java.awt.Color(51, 255, 51));
        jLabel98.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cledson\\Downloads\\SOFTWARE_LOGO.png")); // NOI18N

        jLabel99.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel99.setForeground(new java.awt.Color(255, 255, 255));
        jLabel99.setText("Tech");

        jLabel100.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        jLabel100.setForeground(new java.awt.Color(51, 255, 255));
        jLabel100.setText("Solutions");

        jLabel101.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel101.setForeground(new java.awt.Color(255, 255, 255));
        jLabel101.setText("A T. Solutions foi idealizado ");

        jLabel102.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel102.setForeground(new java.awt.Color(255, 255, 255));
        jLabel102.setText("para atender a todos");

        jLabel103.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel103.setForeground(new java.awt.Color(255, 255, 255));
        jLabel103.setText("aqueles que buscam");

        jLabel104.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel104.setForeground(new java.awt.Color(255, 255, 255));
        jLabel104.setText("nas área de logística e ");

        jLabel105.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel105.setForeground(new java.awt.Color(255, 255, 255));
        jLabel105.setText("setores varejistas.");

        jLabel106.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel106.setForeground(new java.awt.Color(255, 255, 255));
        jLabel106.setText("controle no seu estoque");

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel36Layout.createSequentialGroup()
                        .addComponent(jLabel98)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel100)))
                    .addComponent(jLabel102, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel103)
                    .addComponent(jLabel106)
                    .addComponent(jLabel104)
                    .addComponent(jLabel105)
                    .addComponent(jLabel101)))
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel36Layout.createSequentialGroup()
                        .addComponent(jLabel99)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel98, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel101)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel102)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel103)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel106)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel104)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel105)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        jPanel37.setBackground(new java.awt.Color(51, 51, 51));
        jPanel37.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jLabel107.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel107.setForeground(new java.awt.Color(255, 255, 255));
        jLabel107.setText("     Somos uma empresa focada na geração de soluções e conhecimento técnico");

        jLabel108.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel108.setForeground(new java.awt.Color(255, 255, 255));
        jLabel108.setText("empresarial para os diferentes tipos de organizações e profissionais que buscam");

        jLabel109.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel109.setForeground(new java.awt.Color(255, 255, 255));
        jLabel109.setText("melhor desempenho e alcançar os melhores resultados.");

        jLabel110.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel110.setForeground(new java.awt.Color(255, 255, 255));
        jLabel110.setText("A Tech Solutions foi idealizado para atender todas as empresas");

        jLabel111.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel111.setForeground(new java.awt.Color(255, 255, 255));
        jLabel111.setText("melhoria de desempenho e excelentes resultados de uma maneira diferente,");

        jLabel112.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel112.setForeground(new java.awt.Color(255, 255, 255));
        jLabel112.setText("adequada, eficiente e eficaz!");

        jLabel113.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel113.setForeground(new java.awt.Color(255, 255, 255));
        jLabel113.setText("MISSÃO: Atender e suprir com excelência e elevado padrão de qualidade às");

        jLabel114.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel114.setForeground(new java.awt.Color(255, 255, 255));
        jLabel114.setText("necessidades mercadológicas atuais de serviços de consultoria empresarial,");

        jLabel115.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel115.setForeground(new java.awt.Color(255, 255, 255));
        jLabel115.setText("capacitação técnica profissional e pessoal, gerando satisfação, agregando valor e");

        jLabel116.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel116.setForeground(new java.awt.Color(255, 255, 255));
        jLabel116.setText("melhorando os resultados atingidos dos nossos clientes, equipe, sociedade e dos");

        jLabel117.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel117.setForeground(new java.awt.Color(255, 255, 255));
        jLabel117.setText("acionistas da empresa de forma confiável e sustentável.");

        jLabel118.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel118.setForeground(new java.awt.Color(255, 255, 255));
        jLabel118.setText("NOSSOS VALORES: Atitude, Transparência, Excelência, Confiança, Compromisso,");

        jLabel119.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel119.setForeground(new java.awt.Color(255, 255, 255));
        jLabel119.setText("Ética, Respeito, Integridade, Modernidade.");

        jLabel120.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel120.setForeground(new java.awt.Color(255, 255, 255));
        jLabel120.setText("profissionalismo, ética, confiança e responsabilidade social.");

        jLabel124.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel124.setForeground(new java.awt.Color(255, 255, 255));
        jLabel124.setText("empresas e profissionais que buscam");

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel108)
                        .addComponent(jLabel107)
                        .addComponent(jLabel109)
                        .addComponent(jLabel110)
                        .addComponent(jLabel124)
                        .addComponent(jLabel111)
                        .addComponent(jLabel112)
                        .addComponent(jLabel113)
                        .addComponent(jLabel114)
                        .addComponent(jLabel115)
                        .addComponent(jLabel116)
                        .addComponent(jLabel117))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel37Layout.createSequentialGroup()
                        .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel120)
                            .addComponent(jLabel119)
                            .addComponent(jLabel118))
                        .addContainerGap())))
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel107, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel108)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel109)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel110, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel124)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel111)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel112)
                .addGap(18, 18, 18)
                .addComponent(jLabel113)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel114)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel115)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel116)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel117)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel118)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel119)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel120)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel38.setBackground(new java.awt.Color(0, 83, 129));

        jLabel121.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jLabel121.setForeground(new java.awt.Color(255, 255, 255));
        jLabel121.setText("Tech");

        jLabel122.setBackground(new java.awt.Color(153, 255, 255));
        jLabel122.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel122.setForeground(new java.awt.Color(255, 255, 255));
        jLabel122.setText("Solutions");

        jLabel123.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cledson\\Downloads\\box-2-120.png")); // NOI18N

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel123)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel121)
                    .addComponent(jLabel122))
                .addContainerGap(1197, Short.MAX_VALUE))
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel38Layout.createSequentialGroup()
                        .addComponent(jLabel121, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel122))
                    .addComponent(jLabel123))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelSobreLayout = new javax.swing.GroupLayout(panelSobre);
        panelSobre.setLayout(panelSobreLayout);
        panelSobreLayout.setHorizontalGroup(
            panelSobreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSobreLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(643, 643, 643))
        );
        panelSobreLayout.setVerticalGroup(
            panelSobreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelBody.add(panelSobre, "card7");

        panelProduto.setBackground(new java.awt.Color(86, 102, 117));
        panelProduto.setMaximumSize(new java.awt.Dimension(2147483647, 0));
        panelProduto.setMinimumSize(new java.awt.Dimension(120, 0));
        panelProduto.setPreferredSize(new java.awt.Dimension(600, 0));

        jPanel2.setBackground(java.awt.Color.white);
        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        botaoProdutoAdicionar.setBackground(new java.awt.Color(0, 204, 51));
        botaoProdutoAdicionar.setText("Adicionar");
        botaoProdutoAdicionar.setPreferredSize(new java.awt.Dimension(20, 23));
        botaoProdutoAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoProdutoAdicionarActionPerformed(evt);
            }
        });
        jPanel2.add(botaoProdutoAdicionar);

        botaoProdutoEditar.setBackground(new java.awt.Color(255, 153, 51));
        botaoProdutoEditar.setText("Editar");
        botaoProdutoEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoProdutoEditarActionPerformed(evt);
            }
        });
        jPanel2.add(botaoProdutoEditar);

        botaoProdutoApagar.setBackground(new java.awt.Color(255, 51, 0));
        botaoProdutoApagar.setText("Apagar");
        botaoProdutoApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoProdutoApagarActionPerformed(evt);
            }
        });
        jPanel2.add(botaoProdutoApagar);

        tabelaProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ));
        jScrollPane1.setViewportView(tabelaProduto);

        jPanel12.setBackground(java.awt.Color.white);
        jPanel12.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cledson\\Downloads\\magnifying-glass (1).png")); // NOI18N

        txtProdutoPesquisar.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        txtProdutoPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProdutoPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtProdutoPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(txtProdutoPesquisar)
        );

        labelP.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        labelP.setForeground(new java.awt.Color(255, 255, 255));
        labelP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelP.setText("PRODUTOS");

        javax.swing.GroupLayout panelProdutoLayout = new javax.swing.GroupLayout(panelProduto);
        panelProduto.setLayout(panelProdutoLayout);
        panelProdutoLayout.setHorizontalGroup(
            panelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelProdutoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(panelProdutoLayout.createSequentialGroup()
                .addGap(291, 291, 291)
                .addComponent(labelP, javax.swing.GroupLayout.PREFERRED_SIZE, 679, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1190, Short.MAX_VALUE))
        );
        panelProdutoLayout.setVerticalGroup(
            panelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProdutoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(labelP, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 846, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelBody.add(panelProduto, "card2");

        jPanel26.setBackground(new java.awt.Color(86, 102, 117));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Controle de Estoque");

        jLabel54.setFont(new java.awt.Font("Segoe UI", 3, 10)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 255, 51));
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel54.setText("Entrada e saida de produtos");

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cledson\\Downloads\\icons8-caixa-32.png")); // NOI18N

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel54)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel54)))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(panelBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelBody, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxProdutoCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxProdutoCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxProdutoCategoriaActionPerformed

    private void comboBoxVendaPesquisarProdutoPelaCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxVendaPesquisarProdutoPelaCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxVendaPesquisarProdutoPelaCategoriaActionPerformed

    private void txtVendaDescontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVendaDescontoActionPerformed
         // TODO add your handling code here:
    }//GEN-LAST:event_txtVendaDescontoActionPerformed

    private void botaoUsuarioAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoUsuarioAdicionarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoUsuarioAdicionarActionPerformed

    private void botaoVendaAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVendaAdicionarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoVendaAdicionarActionPerformed

    private void comboBoxVendaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxVendaProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxVendaProdutoActionPerformed

    private void botaoClienteCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoClienteCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoClienteCancelarActionPerformed

    private void botaoDashboardVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDashboardVendasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoDashboardVendasActionPerformed

    private void botaoDashboardUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDashboardUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoDashboardUsuarioActionPerformed

    private void botaoDashboardClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDashboardClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoDashboardClientesActionPerformed

    private void botaoDashboardProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDashboardProdutosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoDashboardProdutosActionPerformed

    private void botaoDashboardHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDashboardHomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoDashboardHomeActionPerformed

    private void botaoDashboardHomeMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoDashboardHomeMouseDragged
        // TODO add your handling code here:

    }//GEN-LAST:event_botaoDashboardHomeMouseDragged

    private void txtProdutoPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProdutoPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProdutoPesquisarActionPerformed

    private void botaoProdutoAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoProdutoAdicionarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoProdutoAdicionarActionPerformed

    private void botaoDashboardSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDashboardSobreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoDashboardSobreActionPerformed

    private void botaoProdutoApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoProdutoApagarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoProdutoApagarActionPerformed

    private void botaoProdutoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoProdutoEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoProdutoEditarActionPerformed

    private void botaoClienteSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoClienteSalvarActionPerformed
        
    }//GEN-LAST:event_botaoClienteSalvarActionPerformed

    private void txtClienteNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteNascimentoActionPerformed
        DateTimeFormatter date= DateTimeFormatter.ofPattern ("dd/MM/yyyy");
        LocalDate dataNascimento = LocalDate.parse(txtClienteNascimento.getText(), date);
        LocalDate dataAtual = LocalDate.now();
        Period periodo = Period.between (dataNascimento, dataAtual);
        String Resultado = (periodo.getYears () + " Anos " + periodo.getMonths ()+" Meses " + " e " + periodo.getDays() + " Dias");
        txtClienteIdade.setText(Resultado);
        
        
    }//GEN-LAST:event_txtClienteNascimentoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCategoriaApagar;
    private javax.swing.JButton botaoCategoriaCancelar;
    private javax.swing.JButton botaoCategoriaLimpar;
    private javax.swing.JButton botaoCategoriaSalvar;
    private javax.swing.JButton botaoClienteAdicionar;
    private javax.swing.JButton botaoClienteCancelar;
    private javax.swing.JButton botaoClienteSalvar;
    private javax.swing.JButton botaoDashboardClientes;
    private javax.swing.JButton botaoDashboardHome;
    private javax.swing.JButton botaoDashboardProdutos;
    private javax.swing.JButton botaoDashboardSair;
    private javax.swing.JButton botaoDashboardSobre;
    private javax.swing.JButton botaoDashboardUsuario;
    private javax.swing.JButton botaoDashboardVendas;
    private javax.swing.JButton botaoProdutoAdicionar;
    private javax.swing.JButton botaoProdutoAdicionarCategoria;
    private javax.swing.JButton botaoProdutoApagar;
    private javax.swing.JButton botaoProdutoCancelar;
    private javax.swing.JButton botaoProdutoEditar;
    private javax.swing.JButton botaoProdutoSalvar;
    private javax.swing.JButton botaoUsuarioAdicionar;
    private javax.swing.JButton botaoUsuarioApagar;
    private javax.swing.JButton botaoUsuarioCancelar;
    private javax.swing.JButton botaoUsuarioEditar;
    private javax.swing.JButton botaoUsuarioSalvar;
    private javax.swing.JButton botaoVendaAdicionar;
    private javax.swing.JButton botaoVendaCancelar;
    private javax.swing.JButton botaoVendaDetalhes;
    private javax.swing.JButton botaoVendaLimpar;
    private javax.swing.JButton botaoVendaRegistroRemover;
    private javax.swing.JButton botaoVendaResgistroAdicionar;
    private javax.swing.JButton botaoVendaVender;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox checkboxVendaDesconto;
    private javax.swing.JComboBox<String> comboBoxProdutoCategoria;
    private javax.swing.JComboBox<String> comboBoxUsuarioPerfil;
    private javax.swing.JComboBox<String> comboBoxVendaPesquisarProdutoPelaCategoria;
    private javax.swing.JComboBox<String> comboBoxVendaProduto;
    private javax.swing.JDialog dialogCategoria;
    private javax.swing.JDialog dialogCliente;
    private javax.swing.JDialog dialogProduto;
    private javax.swing.JDialog dialogQuemSomos;
    private javax.swing.JDialog dialogUsuario;
    private javax.swing.JDialog dialogVenda;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
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
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel0;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel labelCategoriaMensagem;
    private javax.swing.JLabel labelClienteMensagem;
    private javax.swing.JLabel labelDashboardBemvidoUsuario;
    private javax.swing.JLabel labelHomeCliente;
    private javax.swing.JLabel labelHomeProduto;
    private javax.swing.JLabel labelHomeVenda;
    private javax.swing.JLabel labelP;
    private javax.swing.JLabel labelProdutoMensagem;
    private javax.swing.JLabel labelUsuarioLogadoId;
    private javax.swing.JLabel labelUsuarioMensagem;
    private javax.swing.JLabel labelVendaDesconto;
    private javax.swing.JLabel labelVendaMensagem;
    private javax.swing.JLabel labelVendaNomeDoProduto;
    private javax.swing.JLabel labelVendaPrecoDoProduto;
    private javax.swing.JLabel labelVendaQuantidadeDoProduto;
    private javax.swing.JLabel labelVendaTotalDaVenda;
    private javax.swing.JLabel labelVendaTroco;
    private javax.swing.JLabel labelVendaValorPago;
    private javax.swing.JPanel panelBody;
    private javax.swing.JPanel panelCliente;
    private javax.swing.JPanel panelHome;
    private javax.swing.JPanel panelProduto;
    private javax.swing.JPanel panelSobre;
    private javax.swing.JPanel panelUsuarios;
    private javax.swing.JPanel panelVendas;
    private javax.swing.JRadioButton radioBotaoUsuarioActivo;
    private javax.swing.JRadioButton radioBotaoUsuarioDesativo;
    private javax.swing.JTable tabelaCategoria;
    private javax.swing.JTable tabelaCliente;
    private javax.swing.JTable tabelaProduto;
    private javax.swing.JTable tabelaUsuario;
    private javax.swing.JTable tabelaVendRegistro;
    private javax.swing.JTable tabelaVenda;
    private javax.swing.JTextArea txtCategoriaDescricao;
    private javax.swing.JTextField txtCategoriaId;
    private javax.swing.JTextField txtCategoriaNome;
    private javax.swing.JTextField txtClienteEndereco;
    private javax.swing.JTextField txtClienteId;
    private javax.swing.JTextField txtClienteIdade;
    private javax.swing.JFormattedTextField txtClienteNascimento;
    private javax.swing.JTextField txtClienteNome;
    private javax.swing.JFormattedTextField txtClienteTelefone;
    private javax.swing.JTextField txtClientesPesquisar;
    private javax.swing.JTextArea txtProdutoDescricao;
    private javax.swing.JTextField txtProdutoId;
    private javax.swing.JTextField txtProdutoNome;
    private javax.swing.JTextField txtProdutoPesquisar;
    private javax.swing.JTextField txtProdutoPreco;
    private javax.swing.JSpinner txtProdutoQuantidade;
    private javax.swing.JTextField txtUsuarioId;
    private javax.swing.JTextField txtUsuarioNome;
    private javax.swing.JTextField txtUsuarioPesquisar;
    private javax.swing.JPasswordField txtUsuarioSenha;
    private javax.swing.JTextField txtUsuarioUsername;
    private javax.swing.JTextField txtVendaCliente;
    private javax.swing.JTextField txtVendaDesconto;
    private javax.swing.JTextField txtVendaId;
    private javax.swing.JTextField txtVendaPesquisarProduto;
    private javax.swing.JSpinner txtVendaQuantidade;
    private javax.swing.JTextField txtVendaValorPago;
    // End of variables declaration//GEN-END:variables

    public JButton getBotaoDashboardHome() {
        return botaoDashboardHome;
    }

    public JButton getBotaoDashboardProdutos() {
        return botaoDashboardProdutos;
    }
    
    public JButton getBotaoDashboardClientes() {
        return botaoDashboardClientes;
    }
    
    public JButton getBotaoDashboardVendas() {
        return botaoDashboardVendas;
    }
    
    public JButton getBotaoDashboardUsuarios() {
        return botaoDashboardUsuario;
    }
    
    public JButton getBotaoDashboardSair() {
        return botaoDashboardSair;
    }
    
    public JPanel getPanelHome() {
        return panelHome;
    }
    
    public JPanel getPanelSobre() {
        return panelSobre;
    }
    
    public JPanel getPanelBody() {
        return panelBody;
    }
    
    public JPanel getPanelProduto() {
        return panelProduto;
    }
    
    public JPanel getPanelCliente() {
        return panelCliente;
    }
    
    public JPanel getPanelVenda() {
        return panelVendas;
    }
    
    public JPanel getPanelUsuario() {
        return panelUsuarios;
    }
    
    public JTable getTabelaUsuarios(){
        return tabelaUsuario;
    }    
    
    public JLabel getLabelBenvindoUsuario() {
        return labelDashboardBemvidoUsuario;
    }

    public JLabel getLabelUsuarioLogadoId() {
        return labelUsuarioLogadoId;
    }
    
    public JButton getBotaoUsuarioAdicionar() {
        return botaoUsuarioAdicionar;
    }
    
    public JButton getBotaoUsuarioEditar() {
        return botaoUsuarioEditar;
    }
    
    public JButton getBotaoUsuarioApagar() {
        return botaoUsuarioApagar;
    }
    
    public JDialog getDialogUsuario() {
        return this.dialogUsuario;
    }
    
    public JComboBox getComboBoxUsuarioPerfil() {
        return comboBoxUsuarioPerfil;
    }
    
    public JTextField getTxtUsuarioId() {
        return txtUsuarioId;
    }
    
    public JTextField getTxtUsuarioNome() {
        return txtUsuarioNome;
    }
    
    public JTextField getTxtUsuarioSenha() {
        return txtUsuarioSenha;
    }
    
    public JTextField getTxtUsuarioUsername() {
        return txtUsuarioUsername;
    }
    
    public JRadioButton getRadioBotaoActivo() {
        return radioBotaoUsuarioActivo;
    }
    
    public JRadioButton getRadioBotaoDesativo() {
        return radioBotaoUsuarioDesativo;
    }
    
    public JLabel getLabelUsuarioMensagem() {
        return labelUsuarioMensagem;
    }
    
    public JTextField getTxtUsuarioPesquisar() {
        return txtUsuarioPesquisar;
    }
    
    public JButton getBotaoCategoriaSalvar() {
        return botaoCategoriaSalvar;
    }
    
    public JButton getBotaoCategoriaCancelar() {
        return botaoCategoriaCancelar;
    }
    
    public JButton getBotaoCategoriaApagar() {
        return botaoCategoriaApagar;
    }
    
    public JButton getBotaoCategoriaLimpar() {
        return botaoCategoriaLimpar;
    }
    
    public JTextField getTxtCategoriaId() {
        return txtCategoriaId;
    }
    
    public JTextField getTxtCategoriaNome() {
        return txtCategoriaNome;
    }
    
    public JTextArea getTxtCategoriaDescricao() {
        return txtCategoriaDescricao;
    }
    
    public JTable getTabelaCategoria() {
        return tabelaCategoria;
    }
    
    public JDialog getDialogProduto() {
        return dialogProduto;
    }
    
    public JButton getBotaoProdutoAdicionarCategoria() {
        return botaoProdutoAdicionarCategoria;
    }
    
    public JDialog getDialogCategoria() {
        return dialogCategoria;
    }
    
    public JButton getBotaoProdutoAdicionar() {
        return botaoProdutoAdicionar;
    }
    
    public JButton getBotaoProdutoEditar() {
        return botaoProdutoEditar;
    }
    
    public JButton getBotaoProdutoApagar() {
        return botaoProdutoApagar;
    }
    
    public JLabel getLabelCategoriaMensagem() {
        return labelCategoriaMensagem;
    }
    
    public JComboBox getComboBoxProdutoCategoria() {
        return comboBoxProdutoCategoria;
    }
    
    public JTextField getTxtProdutoId() {
        return txtProdutoId;
    }
    
    public JTextField getTxtProdutoNome() {
        return txtProdutoNome;
    }
    
    public JButton getButtonQuemSomos(){
        return botaoDashboardSobre;
    }
    
    public JTextField getTxtProdutoPreco() {
        return txtProdutoPreco;
    }
    
    public JSpinner getTxtProdutoQuantidade() {
        return txtProdutoQuantidade;
    }
    
    public JTextArea getTxtProdutoDescricao() {
        return txtProdutoDescricao;
    }
 
    public JLabel getLabelProdutoMensagem() {
        return labelProdutoMensagem;
    }
    
    public JTable getTabelaProduto() {
        return tabelaProduto;
    }
    
    public JTextField getTxtProdutoPesquisar() {
        return txtProdutoPesquisar;
    }
    
    public JDialog getDialogVenda() {
        return dialogVenda;
    }
    
    public JLabel getLabelVendaPrecoDoProduto() {
        return labelVendaPrecoDoProduto;
    }
    
    public JLabel getLabelVendaQuantidadeDoProduto() {
        return labelVendaQuantidadeDoProduto;
    }
    
    public JLabel getLabelVendaNomedeDoProduto() {
        return labelVendaNomeDoProduto;
    }
    
    public JTextField getTxtVendaPesquisarProduto() {
        return txtVendaPesquisarProduto;
    }
    
    public JComboBox getComboBoxVendaPesquisarProdutoPelaCategoria() {
        return comboBoxVendaPesquisarProdutoPelaCategoria;
    }
    
    public JComboBox getComboBoVendaProduto() {
        return comboBoxVendaProduto;
    }
    
    public JLabel getLabelVendaMensagem() {
        return labelVendaMensagem;
    }
    
    public JTable getTabelaVendaRegistro() {
        return tabelaVendRegistro;
    }
    
    public JTextField getTxtVendaId() {
        return txtVendaId;
    }
    
    public JSpinner getTxtVendaQuantidade() {
        return txtVendaQuantidade;
    }
    
    public JTextField getTxtVendaValorPago() {
        return txtVendaValorPago;
    }
    
    public JTextField getTxtVendaDesconto() {
        return txtVendaDesconto;
    }
    
    public JLabel getLabelVendaTotalDaVenda() {
        return labelVendaTotalDaVenda;
    }
    
    public JLabel getLabelVendaValorPago() {
        return labelVendaValorPago;
    }
    
    public JLabel getLabelVendaTotalDoDesconto() {
        return labelVendaDesconto;
    }
    
    public JLabel getLabelVendaTroco() {
        return labelVendaTroco;
    }
    
    public JCheckBox getCheckBoxVendaDesconto() {
        return checkboxVendaDesconto;
    }
    
    public JLabel getLabelClienteMensagem() {
        return labelClienteMensagem;
    }
    
    public JTextField getTxtClienteId() {
        return txtClienteId;
    }
    
    public JTextField getTxtClienteNome() {
        return txtClienteNome;
    }
    
    public JTextField getTxtClienteTelefone() {
        return txtClienteTelefone;
    }
    
    public JTextField getTxtClienteEndereco() {
        return txtClienteEndereco;
    }
    
    public JDialog getDialogCliente() {
        return dialogCliente;
    }
    
    public JTextField getTxtVendaCliente() {
        return txtVendaCliente;
    }
    
    public JTable getTabelaVenda() {
        return tabelaVenda;
    }
    
    public JButton getBotaoVendaDetalhes() {
        return botaoVendaDetalhes;
    }
    
    
    public JLabel getLabelHomeProduto() {
        return labelHomeProduto;
    }
    
    public JLabel getLabelHomeCliente() {
        return labelHomeCliente;
    }
    
    public JLabel getLabelHomeVenda() {
        return labelHomeVenda;
    }
    
    public JTable getTabelaCliente() {
        return tabelaCliente;
    }
    
    public JTextField getTxtClientePesquisar(){
        return txtClientesPesquisar;
    }
    
    public JDialog getDialogQuemSomos(){
        return dialogQuemSomos;
    }
    
    public JFormattedTextField getTxtClienteNascimento(){
        return txtClienteNascimento;
    }
    
    public JTextField getTxtClienteIdade(){
        return txtClienteIdade;
    }
}

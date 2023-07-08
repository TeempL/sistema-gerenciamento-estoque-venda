/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techsolutions.gestaovenda.modelo.controller;

import com.techsolutions.gestaovenda.modelo.conexao.Conexao;
import com.techsolutions.gestaovenda.modelo.conexao.ConexaoMysql;
import com.techsolutions.gestaovenda.modelo.dao.AutenticacaoDao;
import com.techsolutions.gestaovenda.modelo.dao.ClienteDao;
import com.techsolutions.gestaovenda.modelo.dao.UsuarioDao;
import com.techsolutions.gestaovenda.modelo.entidades.Cliente;
import com.techsolutions.gestaovenda.modelo.entidades.Produto;
import com.techsolutions.gestaovenda.modelo.entidades.Usuario;
import com.techsolutions.gestaovenda.modelo.util.ClienteTableModel;
import com.techsolutions.gestaovenda.modelo.util.UsuarioTableModel;
import com.techsolutions.gestaovenda.view.formulario.Dashboard;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;


public class ClienteController implements ActionListener, MouseListener, KeyListener {
    
    private Dashboard dashboard;
    private AutenticacaoDao autenticacaoDao;
    private UsuarioTableModel usuarioTableModel;
    private ClienteDao clienteDao;
    private Cliente cliente;
    private final Conexao conexao;
    private UsuarioDao usuarioDao;
    private ClienteTableModel clienteTableModel;

    public ClienteController(Dashboard dashboard) {
        this.conexao = new ConexaoMysql();
        this.dashboard = dashboard;
        this.clienteDao = new ClienteDao();
        this.usuarioDao = new UsuarioDao();
        this.autenticacaoDao = new AutenticacaoDao();
        actualizarTabelaCliente();
    }
    

    @Override
    public void actionPerformed(ActionEvent ae) {
        String accao = ae.getActionCommand().toLowerCase();
        
        switch(accao) {
            case "adicionar": adicionar(); break;
            case "salvar": salvar(); break;
            case "apagar": apagar(); break;
            case "cancelar": cancelar();break;
        }
    }
    

    public void salvar() {
        ValidarCPF Cpf = new ValidarCPF();
        String idString = this.dashboard.getTxtClienteId().getText();
        String nome = this.dashboard.getTxtClienteNome().getText();
        String cpf = this.dashboard.getTxtClienteTelefone().getText();
        String endereco = this.dashboard.getTxtClienteEndereco().getText();
        String nascimento = this.dashboard.getTxtClienteNascimento().getText();
        Long id = Long.valueOf(idString);
           
        Cliente cliente = new Cliente(id, nome, cpf, endereco, nascimento);
        
        DateTimeFormatter date= DateTimeFormatter.ofPattern ("dd/MM/yyyy");
        LocalDate dataNascimento = LocalDate.parse(this.dashboard.getTxtClienteNascimento().getText(), date);
        LocalDate dataAtual = LocalDate.now();
        Period periodo = Period.between (dataNascimento, dataAtual);
       
        

        if(ValidarCPF.validarCPF(cpf) && periodo.getYears() <= 120){
            String mensagem = clienteDao.salvar(cliente);
            mensagemNaTela(mensagem, Color.GREEN);
            String Resultado = (periodo.getYears () + " Anos " + periodo.getMonths ()+" Meses " + " e " + periodo.getDays() + " Dias");
            this.dashboard.getTxtClienteIdade().setText(Resultado);
            actualizarTabelaCliente();
        }else if(periodo.getYears() > 120){
            mensagemNaTela("Idade não pode ser maior que 120 anos!", Color.RED);
        }
        else{
            mensagemNaTela("CPF inválido", Color.RED);
        }
    }
    
    private void mensagemNaTela(String mensagem, Color color) {
         this.dashboard.getLabelClienteMensagem().setBackground(color);
         this.dashboard.getLabelClienteMensagem().setText(mensagem);
    }

    private void cancelar() {
        limpar();
        this.dashboard.getDialogCliente().setVisible(false);
    }
    
    private void limpar() {
        this.dashboard.getTxtClienteId().setText("0");
        this.dashboard.getTxtClienteNome().setText("");
        this.dashboard.getTxtClienteTelefone().setText("");
        this.dashboard.getTxtClienteEndereco().setText("");
    }
    
    private void mostrarTela() {
        this.dashboard.getDialogCliente().pack();
        this.dashboard.getDialogCliente().setLocationRelativeTo(dashboard);
        this.dashboard.getDialogCliente().setVisible(true);
    }

    private void adicionar() {
        mostrarTela();
    }
   
    private void actualizarTabelaCliente() {
        List<Cliente> clientes = clienteDao.todosCliente();
        this.clienteTableModel = new ClienteTableModel(clientes);
        this.dashboard.getTabelaCliente().setModel(clienteTableModel);
        this.dashboard.getLabelHomeCliente().setText(String.format("%d", clientes.size()));
    }
    
    private Usuario usuarioLogado() {
        Long usuarioLogadoId = Long.valueOf(this.dashboard.getLabelUsuarioLogadoId().getText());
        return usuarioDao.buscarUsuarioPeloId(usuarioLogadoId);
    }

   private void apagar() {
        Usuario usuario = usuarioLogado();
        if(autenticacaoDao.temPermissao(usuario)){
            if(this.cliente != null) {
                int confirmar = JOptionPane.showConfirmDialog(dashboard, 
                        String.format("Certeza que desejas apagar? \nNome: %s", this.cliente.getNome()), 
                        "Apagar produto", JOptionPane.YES_NO_OPTION);
                
                    if(confirmar == JOptionPane.YES_OPTION) {
                        String mensagem = clienteDao.deleteClientePeloId(this.cliente.getId());
                        JOptionPane.showMessageDialog(dashboard, mensagem);
//                        limpaCampo();
                    }
            } else {
                JOptionPane.showMessageDialog(dashboard, "Deve selecionar um produto na tabela", "Seleciona um produto", 0);
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void keyPressed(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void keyReleased(KeyEvent e) {
    
    }
}

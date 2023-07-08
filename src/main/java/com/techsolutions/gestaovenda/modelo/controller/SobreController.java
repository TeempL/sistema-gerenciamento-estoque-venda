/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.techsolutions.gestaovenda.modelo.controller;

import com.techsolutions.gestaovenda.modelo.conexao.Conexao;
import com.techsolutions.gestaovenda.modelo.conexao.ConexaoMysql;
import com.techsolutions.gestaovenda.modelo.dao.AutenticacaoDao;
import com.techsolutions.gestaovenda.modelo.dao.UsuarioDao;
import com.techsolutions.gestaovenda.modelo.entidades.Usuario;
import com.techsolutions.gestaovenda.view.formulario.Dashboard;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Cledson
 */
public class SobreController implements ActionListener{
    
    private final Conexao conexao;
    private final Dashboard dashboard;
    private final AutenticacaoDao autenticacaoDao;
    private final UsuarioDao usuarioDao;

    public SobreController(Conexao conexao, Dashboard dashboard, AutenticacaoDao autenticacaoDao, UsuarioDao usuarioDao) {
        this.conexao = new ConexaoMysql();
        this.usuarioDao = new UsuarioDao();
        this.autenticacaoDao = new AutenticacaoDao();
        this.dashboard = dashboard;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String accao = ae.getActionCommand().toLowerCase();
        
        switch(accao) {
            case "adicionar": adicionar(); break;
            case "voltar": voltar(); break;
        }
    }

    private void adicionar() {
        Usuario usuario = usuarioLogado();
        if(autenticacaoDao.temPermissao(usuario))
            mostrarTelaProduto();
        
    }
    
    private Usuario usuarioLogado() {
        Long usuarioLogadoId = Long.valueOf(this.dashboard.getLabelUsuarioLogadoId().getText());
        return usuarioDao.buscarUsuarioPeloId(usuarioLogadoId);
    }
    
    private void mostrarTelaProduto() {
        this.dashboard.getDialogQuemSomos().pack();
        this.dashboard.getDialogQuemSomos().setLocationRelativeTo(dashboard);
        this.dashboard.getDialogQuemSomos().setVisible(true);
    }
    
    private void voltar() {
       this.dashboard.getDialogProduto().setVisible(false);
    }
    

    
    
    
    
}

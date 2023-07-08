/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techsolutions.gestaovenda.modelo.dao;

import com.techsolutions.gestaovenda.modelo.entidades.PERFIL;
import com.techsolutions.gestaovenda.modelo.entidades.Usuario;
import com.techsolutions.gestaovenda.modelo.exception.NegocioException;
import com.techsolutions.gestaovenda.view.modelo.LoginDto;
import javax.swing.JOptionPane;


public class AutenticacaoDao {
    
    private final UsuarioDao usuarioDao;

    public AutenticacaoDao() {
        this.usuarioDao = new UsuarioDao();
    }
    
    public boolean temPermissao(Usuario usuario) {
        try {
            permissao(usuario);
            return true;
        } catch (NegocioException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Usuario sem permissao", 0);
            System.out.println("ERROR: " + e.getMessage());
            return false;
        }
    }
    
    private void permissao(Usuario usuario) {
        if(!PERFIL.ADMIN.equals(usuario.getPerfil())) {
            throw new NegocioException("Sem permissao para realizar essa acao.");
        }
    }

    public Usuario login(LoginDto login) {
        Usuario usuario = usuarioDao.buscarUsuarioPeloUsername(login.getUsername());
        
        if(usuario == null || !usuario.isEstado()) 
            return null;
       
        if(usuario.isEstado() && validaSenha(usuario.getSenha(), login.getSenha())) {
            usuarioDao.actualizarUltimoLogin(usuario);
            return usuario;
        }
        
        return null;
    }
    
//    private boolean validaSenha(String usuarioSenha, String loginSenha) {
//        return usuarioSenha.equals(loginSenha);
//    }
    
    private boolean validaSenha(String usuarioSenha, String senhaLogin) {
        return usuarioSenha.equals(senhaLogin);
    }
    
}

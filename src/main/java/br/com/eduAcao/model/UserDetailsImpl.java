package br.com.eduAcao.model;


import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;



public class UserDetailsImpl implements UserDetails {

  
	private static final long serialVersionUID = 1L;
	private Administrador administrador;

    public UserDetailsImpl(Administrador administrador) {
        this.administrador = administrador;
    }

    @Override
    public String getPassword() {
        return administrador.getSenha();
    }

    @Override
    public String getUsername() {
        return administrador.getEmail();
    }

    @Override
    public boolean isAccountNonExpired() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public boolean isEnabled() {
        // TODO Auto-generated method stub
        return true;
    }

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}
    
}



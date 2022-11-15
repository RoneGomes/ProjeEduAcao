package br.com.eduAcao.model;



import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


import br.com.eduAcao.model.Ong;

public class Ong extends Entidade{
	
	 @Column(nullable = false, columnDefinition = "TEXT")
	    private String nomeOng;

	    @Column(nullable = false, columnDefinition = "TEXT")
	    private String telefone;

	    @Column(nullable = false, columnDefinition = "TEXT")
	    private String email;
	    
	    @Column(nullable = false, columnDefinition = "TEXT")
	    private String descricao;
	    
	    @Column(nullable = false, columnDefinition = "TEXT")
	    private String link;
	   
	    @ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name = "doador_id_fk", nullable = false)
	    private Doador doador;

	  
	    public String getAcompanhantes() {
	        return nomeOng;
	    }

	    public void setNomeOng(String nomeOng) {
	        this.nomeOng = nomeOng;
	    }

	    public String getDescricao() {
	        return telefone;
	    }

	    public void setDescricao(String telefone) {
	        this.telefone = telefone;
	    }

	     

}

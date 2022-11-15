package br.com.eduAcao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.eduAcao.model.Ong;
import br.com.eduAcao.repositorio.DoadorRepositorio;
import br.com.eduAcao.repositorio.OngRepositorio;




@Controller
@RequestMapping("/ong")
public class OngController {

	/* @Autowired
	    private OngRepositorio ongRepositorio;

	    @Autowired
	    private ClienteRepositorio clienteRepositorio;

	    @GetMapping
	    public ModelAndView home() {
	        ModelAndView modelAndView = new ModelAndView("/home");

	        modelAndView.addObject("ong", ongRepositorio.findAll());

	        return modelAndView;
	    }

	    @GetMapping("/{id}")
	    public ModelAndView detalhes(@PathVariable Long id) {
	        ModelAndView modelAndView = new ModelAndView("/detalhes");

	        modelAndView.addObject("ong", ongRepositorio.getOne(id));

	        return modelAndView;
	    }

	    @GetMapping("/cadastrarOng")
	    public ModelAndView cadastrar() {
	        ModelAndView modelAndView = new ModelAndView("cliente/formularioOng");

	        modelAndView.addObject("ong", new Ong());
	        modelAndView.addObject("clientes", clienteRepositorio.findAll());


	        return modelAndView;
	    }

	    @GetMapping("/{id}/editar")
	    public ModelAndView editar(@PathVariable Long id) {
	        ModelAndView modelAndView = new ModelAndView("/formularioOng");

	        modelAndView.addObject("ong", ongRepositorio.getOne(id));
	        modelAndView.addObject("clientes", clienteRepositorio.findAll());


	        return modelAndView;
	    }

	    @PostMapping({"/cadastrarOng", "/{id}/editar"})
	    public String salvar(Ong ong) {
	        ongRepositorio.save(ong);

	        return "redirect:/cliente";
	    }

	    @GetMapping("/{id}/excluir")
	    public String excluir(@PathVariable Long id) {
	        ongRepositorio.deleteById(id);

	        return "redirect:/cliente";*/
	
	    }
	    

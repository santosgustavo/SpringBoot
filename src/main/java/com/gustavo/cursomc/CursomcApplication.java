package com.gustavo.cursomc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.gustavo.cursomc.dominio.Categoria;
import com.gustavo.cursomc.dominio.Cidade;
import com.gustavo.cursomc.dominio.Cliente;
import com.gustavo.cursomc.dominio.Endereco;
import com.gustavo.cursomc.dominio.Estado;
import com.gustavo.cursomc.dominio.Produto;
import com.gustavo.cursomc.dominio.enums.TipoCliente;

import br.com.gustavo.cursomc.repositories.CategoriaRepository;
import br.com.gustavo.cursomc.repositories.CidadeRepository;
import br.com.gustavo.cursomc.repositories.ClienteRepository;
import br.com.gustavo.cursomc.repositories.EnderecoRepository;
import br.com.gustavo.cursomc.repositories.EstadoRepository;
import br.com.gustavo.cursomc.repositories.ProdutoRepository;

@EnableJpaRepositories(basePackages="br.com.gustavo.cursomc.repositories")
@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {
	
	@Autowired
	private CategoriaRepository categoriaRepositorie;
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Autowired
	private EstadoRepository estadoRespository;
	
	@Autowired
	private CidadeRepository cidadeRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
		
	}

	@Override
	public void run(String... arg0) throws Exception {
		
		Categoria cat1 = new Categoria(null, "Informatica");
		Categoria cat2 = new Categoria(null, "Escritorio");
		
		Produto p1 = new Produto(null, "Computador", 2000);
		Produto p2 = new Produto(null, "Impressora", 800);
		Produto p3 = new Produto(null, "Mouse", 80);
		
		Estado est1 = new Estado(null, "Minas Gerais");
		Estado est2 = new Estado(null, "São Paulo");
		
		Cidade c1 = new Cidade(null,"Uberlandia", est1);
		Cidade c2 = new Cidade(null, "São Paulo", est2);
		Cidade c3 = new Cidade(null, "Campinas", est2);
		
		est1.getCidades().addAll(Arrays.asList(c1));
		est2.getCidades().addAll(Arrays.asList(c2, c3));
		
		cat1.getProdutos().addAll(Arrays.asList(p1,p2,p3));
		cat2.getProdutos().addAll(Arrays.asList(p2));
		
		p1.getCategorias().addAll(Arrays.asList(cat1));
		p2.getCategorias().addAll(Arrays.asList(cat1, cat2));
		p3.getCategorias().addAll(Arrays.asList(cat1));
		
		Cliente cli1 = new Cliente(null, "Maria Silva", "maria@gmail.com", "42598236987", TipoCliente.PESSOAFISICA);
		cli1.getTelefones().addAll(Arrays.asList("963258741","1140558796"));
		
		Endereco e1 = new Endereco(null, "Rua Flores", "300", "apt. 303", "Jardim", "38025548", c1, cli1);
		Endereco e2 = new Endereco(null, "Av Matos", "105", "Sala 800", "Centro", "38025587", c2, cli1);
		
		cli1.getEndereco().addAll(Arrays.asList(e1,e2));
		
		/*categoriaRepositorie.save(Arrays.asList(cat1, cat2));
		produtoRepository.save(Arrays.asList(p1,p2,p3));
		estadoRespository.save(Arrays.asList(est1,est2));
		cidadeRepository.save(Arrays.asList(c1,c2,c3));
		
		clienteRepository.save(Arrays.asList(cli1));
		enderecoRepository.save(Arrays.asList(e1, e2));*/
	}
}

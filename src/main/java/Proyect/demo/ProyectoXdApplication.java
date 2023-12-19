package Proyect.demo;

import Proyect.demo.Entidades.Categoria;
import Proyect.demo.Repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
public class ProyectoXdApplication {
	@Autowired
	CategoriaRepository categoriaRepository;
	public static void main(String[] args) {
		SpringApplication.run(ProyectoXdApplication.class, args);
	}
	@Bean
	CommandLineRunner init(CategoriaRepository categoriaRepository) {
		return args -> {
			System.out.println("/-/-/-/--- * ESTOY FUNCIONANDO * ---/-/-/-/");
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			Date fechaAlta = sdf.parse("23/10/2023");
			Date fechaPedido = sdf.parse("15/10/2023");

		//categoria
			Categoria categoria1 = Categoria.builder()
					.nombreCategoria("Limpieza")
					.fechaAlta(fechaAlta)
					.urlImagen("https://i.pinimg.com/564x/ff/51/d0/ff51d05b9e1de2071f6b2db9e9b112a8.jpg")
					.build();
			categoriaRepository.save(categoria1);
		};

	}

}

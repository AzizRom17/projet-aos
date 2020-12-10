package tn.isg.projet.ElectionTunisie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import tn.isg.projet.ElectionTunisie.model.Avis;
import tn.isg.projet.ElectionTunisie.repository.AvisRepository;
@Component
@ComponentScan
@EnableAutoConfiguration
@SpringBootApplication
public class ElectionTunisieApplication implements ApplicationRunner {
	@Autowired
	private AvisRepository AvisRepository;



	public static void main(String[] args) {
		SpringApplication.run(ElectionTunisieApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {



	}
}

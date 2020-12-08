package tn.isg.projet.ElectionTunisie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tn.isg.projet.ElectionTunisie.model.Avis;
import tn.isg.projet.ElectionTunisie.repository.AvisRepository;

@SpringBootApplication
public class ElectionTunisieApplication implements ApplicationRunner {
	@Autowired
	private AvisRepository AvisRepository;



	public static void main(String[] args) {
		SpringApplication.run(ElectionTunisieApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {

		Avis avis1 = new Avis("a","a","a");
		AvisRepository.save(avis1);

	}
}

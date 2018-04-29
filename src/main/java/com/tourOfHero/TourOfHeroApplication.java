package com.tourOfHero;

import com.tourOfHero.entities.Hero;
import com.tourOfHero.repository.HeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.h2.server.web.WebServlet;
import org.springframework.context.event.ContextRefreshedEvent;

import java.util.logging.Logger;

@SpringBootApplication
public class TourOfHeroApplication implements ApplicationListener<ContextRefreshedEvent>{

	private Logger log = Logger.getLogger(TourOfHeroApplication.class.getSimpleName());
	@Autowired
	private HeroRepository heroRepository;

	public static void main(String[] args) {
		SpringApplication.run(TourOfHeroApplication.class, args);
	}

	@Bean
	ServletRegistrationBean h2servletRegistration() {
		ServletRegistrationBean registrationBean = new ServletRegistrationBean(new WebServlet());
		registrationBean.addUrlMappings("/console/*");
		return registrationBean;
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {

		heroRepository.deleteAll();

		Hero hero1 = new Hero("YAO MARC ETIENNE",   "ZORO", 7, "ATTAQUE À L'EPEE");
		Hero hero2 = new Hero("ABIZI JEAN-MICHELLE","LE MAITRE", 5, "ATTAQUE À LA HACHE");
		Hero hero3 = new Hero("ASSUE BIENVENU",     "NIJA BLACK", 2, "ATTAQUE À ARME À FEU");
		Hero hero4 = new Hero("LOGBO EMAUS",        "LE LION", 4, "ATTAQUE AU COUTEAU");
		Hero hero5 = new Hero("KOUASSI BECATIAN",   "LE REDOUTÉ", 5, "ATTAQUE À MAIN SIMPLE");
		Hero hero6 = new Hero("LAURENT FLORE",      "LE GUERRIER", 3, "ATTAQUE AU BATON");
		Hero hero7 = new Hero("DU BOIT LE-MAITRE",  "LE RENARD", 6, "ATTAQUE AUX CAILLOUX");
		Hero hero8 = new Hero("COULIBALY AMADOU",   "KPRASS", 8, "ATTAQUE A LA HACHE");
		Hero hero9 = new Hero("TRAORE MOHAMED",     "MOMO DJIDJI", 1, "ATTAQUE À ARME À FEU");
		Hero hero10 =new Hero("ANGE EVARISTE",      "LE DUR", 9, "ATTAQUE AU COUTEAU");

		heroRepository.save(hero1);
		heroRepository.save(hero2);
		heroRepository.save(hero3);
		heroRepository.save(hero4);
		heroRepository.save(hero5);
		heroRepository.save(hero6);
		heroRepository.save(hero7);
		heroRepository.save(hero8);
		heroRepository.save(hero9);
		heroRepository.save(hero10);


	}
}

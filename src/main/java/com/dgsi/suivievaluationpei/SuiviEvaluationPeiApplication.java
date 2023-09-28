package com.dgsi.suivievaluationpei;

import com.dgsi.suivievaluationpei.model.*;
import com.dgsi.suivievaluationpei.model.typeEquipement.DisqueDur;
import com.dgsi.suivievaluationpei.model.typeEquipement.Ordinateur;
import com.dgsi.suivievaluationpei.repository.*;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@AllArgsConstructor
@SpringBootApplication
public class SuiviEvaluationPeiApplication 	implements CommandLineRunner {


	public static void main(String[] args) {
		SpringApplication.run(SuiviEvaluationPeiApplication.class, args);
	}
public final StructutureRepository structutureRepository;
	private final RegionRepository regionRepository;
	private final EquipementInformatiqueRepository equipementInformatiqueRepository;
	private final PrevisionRepository previsionRepository;
	private final RoleRepository roleRepository;
	private final UtilisateurRepository utilisateurRepository;
	@Override
	public void run(String... args) throws Exception {
		Role role =  new Role(1,"admin");
		roleRepository.save(role);


		Region region1 = new Region(1,"centre");
		Region region2 = new Region(2,"cascades");
		Region region3 = new Region(3,"sahel");
		Region region4 = new Region(4,"fada");
		Region region5 = new Region(5,"comoe");


		List<Region> regions = Arrays.asList(region1,region2,region3);
		Structure structure = new Structure(5,"dgi", "direction bla bla", regions);
		structutureRepository.save(structure);

		List<Region> region = List.of(region1,region2);
		Structure structure2 = new Structure(5,"dgd", "direction...", region);
		structutureRepository.save(structure2);

		List<Region> regio = List.of(region1);
		Structure structure4 = new Structure(8,"author", "direction... one", regio);
		structutureRepository.save(structure4);

		List<Region> regionAuther = Arrays.asList(region1,region2,region3, region4, region5);
		Structure structure3 = new Structure(7,"AJE","another", regionAuther);
		structutureRepository.save(structure3);
		Ordinateur ordinateur = new Ordinateur();
		ordinateur.setLibelle("ordinateur");
		ordinateur.setProcesseur("core i3");
		ordinateur.setRAM("4 Go");
		ordinateur.setCout(255.000);
		ordinateur.setMarque("HP");
		ordinateur.setModele("blablabla");
		equipementInformatiqueRepository.save(ordinateur);
		Ordinateur ordinateur1 = new Ordinateur();
		ordinateur1.setLibelle("ordinateur");
		ordinateur1.setProcesseur("core i7");
		ordinateur1.setRAM("4 Go");
		ordinateur1.setCout(2550000.000);
		ordinateur1.setTailleEcran("17 pouces");
		ordinateur1.setVersionOffice("windows");
		ordinateur1.setVersionAntivirus("Kaspersky");
		ordinateur1.setMarque("DELL");
		ordinateur1.setModele("HP");
		equipementInformatiqueRepository.save(ordinateur1);
		System.out.println(ordinateur.getLibelle() +" "+ ordinateur.getProcesseur()
		+" "+ ordinateur.getRAM()+ " "+ ordinateur.getMarque() +" "+ ordinateur.getModele()
		);
		EquipementInformatique disque = new DisqueDur();
		disque.setCout(22552202.00);
		disque.setLibelle("disque dur");
		disque.setModele("HP");
		equipementInformatiqueRepository.save(disque);
	}
}



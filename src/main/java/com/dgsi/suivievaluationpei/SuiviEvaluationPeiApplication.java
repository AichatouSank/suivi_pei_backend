package com.dgsi.suivievaluationpei;

import com.dgsi.suivievaluationpei.model.EquipementInformatique;
import com.dgsi.suivievaluationpei.model.Prevision;
import com.dgsi.suivievaluationpei.model.Region;
import com.dgsi.suivievaluationpei.model.Structure;
import com.dgsi.suivievaluationpei.model.typeEquipement.DisqueDur;
import com.dgsi.suivievaluationpei.model.typeEquipement.Ordinateur;
import com.dgsi.suivievaluationpei.repository.EquipementInformatiqueRepository;
import com.dgsi.suivievaluationpei.repository.PrevisionRepository;
import com.dgsi.suivievaluationpei.repository.RegionRepository;
import com.dgsi.suivievaluationpei.repository.StructutureRepository;
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

	@Override
	public void run(String... args) throws Exception {
		Region region2 = new Region(1,"centre");

		regionRepository.save(region2);
		Ordinateur ordi;
		Prevision prevision = new Prevision(
		);
		Structure structure = new Structure(1, "DRH", "",new ArrayList<>(1));
		structutureRepository.save(structure);
		/*Region region1 = new Region("centre");
		Region region2 = new Region("cascades");
		Region region3 = new Region("sahel");
		Region region4 = new Region("fada");
		Region region5 = new Region("comoe");

		List<Region> regions = Arrays.asList(region1,region2,region3);
		Structure structure = new Structure("DRH", regions);

		List<Region> region = Arrays.asList(region1,region2);
		Structure structure2 = new Structure("DGSI", region);
		structutureRepository.save(structure2);

		List<Region> regionAuther = Arrays.asList(region1,region2,region3, region4, region5);
		Structure structure3 = new Structure("AJE", regionAuther);
		structutureRepository.save(structure3);*/
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



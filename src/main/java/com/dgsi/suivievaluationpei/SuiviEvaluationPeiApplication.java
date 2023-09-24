package com.dgsi.suivievaluationpei;

import com.dgsi.suivievaluationpei.model.Region;
import com.dgsi.suivievaluationpei.model.Structure;
import com.dgsi.suivievaluationpei.model.typeEquipement.Ordinateur;
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

	@Override
	public void run(String... args) throws Exception {
		Region region2 = new Region(1,"centre", new ArrayList<>());

		regionRepository.save(region2);

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
		System.out.println(ordinateur.getLibelle() +" "+ ordinateur.getProcesseur()
		+" "+ ordinateur.getRAM()+ " "+ ordinateur.getMarque() +" "+ ordinateur.getModele()
		);
	}
}



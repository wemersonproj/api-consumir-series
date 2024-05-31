package br.com.wau.screenmatch;

import br.com.wau.screenmatch.model.DadosSerie;
import br.com.wau.screenmatch.service.ConsumoAPI;
import br.com.wau.screenmatch.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		ConsumoAPI consumoAPI = new ConsumoAPI();
		var json = consumoAPI.obterDados("https://www.omdbapi.com/?t=gilmore+girls&apikey=9577d937");
		System.out.println(json);
		ConverteDados conversor = new ConverteDados();
		DadosSerie dadosSerie = conversor.obeterDados(json, DadosSerie.class);
		System.out.println(dadosSerie);
		System.out.println(dadosSerie);


	}
}
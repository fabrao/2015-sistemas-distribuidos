package projects.SimuladorRSSF.models.interferenceModels;

import java.util.Random;

import projects.SimuladorRSSF.Configuracoes;
import sinalgo.models.InterferenceModel;
import sinalgo.nodes.messages.Packet;

//classe que implementa um modelo de interferencia aleatória
public class InterferenciaAleatoria extends InterferenceModel{

	Random random = new Random();
	
	//neste método é implementado a definição se um pacote sofre ou não interferência
	// a partir da geração de um numero aleatório de 0 a 100
	// onde se este for maior que a porcentagem definida na configuracao de interferencia
	@Override
	public boolean isDisturbed(Packet p) {
		if(random.nextInt(100)>Configuracoes.pcInterferencia){
			return true;
		}else{
			return false;
		}
	}

}


public class main {

	public static void main(String[] args) {
		
		PalioPrototype protoPalio = new PalioPrototype();
		GolPrototype protoGol = new GolPrototype();
		FiestaPrototype protoFiesta = new FiestaPrototype();
		
		CarroPrototype palioNovo = protoPalio.clonar(); 
		palioNovo.setValorCompra(27900.0); 
		CarroPrototype palioUsado = protoPalio.clonar(); 
		palioUsado.setValorCompra(21000.0);
		
		
		CarroPrototype GolNovo = protoGol.clonar(); 
		GolNovo.setValorCompra(28000.0); 
		CarroPrototype GolUsado = protoGol.clonar(); 
		GolUsado.setValorCompra(19000.0);
		
		CarroPrototype FiestaNovo = protoFiesta.clonar(); 
		FiestaNovo.setValorCompra(19000.0); 
		CarroPrototype FiestaUsado = protoFiesta.clonar(); 
		FiestaUsado.setValorCompra(8200.0);
		
		System.out.println(palioNovo.exibirInfo()); 
		System.out.println(palioUsado.exibirInfo()); 
		
		System.out.println(GolNovo.exibirInfo()); 
		System.out.println(GolUsado.exibirInfo()); 
		
		System.out.println(FiestaNovo.exibirInfo()); 
		System.out.println(FiestaUsado.exibirInfo()); 
		
		
	}

}

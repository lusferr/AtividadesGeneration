package br.com.generation.entrega05;

public class objetoPaciente {

	public static void main(String[] args) {
		paciente pac = new paciente();
		
		pac.setNome("Gian Miguel");
		pac.setId(1584);
		pac.setSitu("Cr�tica");
		pac.setStatus(0);
		
		System.out.println("Nome: " + pac.getNome());
		System.out.println("N� de identifica��o: " + pac.getId());
		System.out.println("Situa��o do paciente: " + pac.getSitu());
		System.out.println("Status -> [0] N�o admitido | [1] Admitido no hospital" + pac.getStatus());
		pac.adms(1);
		System.out.println("Status -> " + pac.getStatus());

	}

}

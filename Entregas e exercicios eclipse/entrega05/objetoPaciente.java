package br.com.generation.entrega05;

public class objetoPaciente {

	public static void main(String[] args) {
		paciente pac = new paciente();
		
		pac.setNome("Gian Miguel");
		pac.setId(1584);
		pac.setSitu("Crítica");
		pac.setStatus(0);
		
		System.out.println("Nome: " + pac.getNome());
		System.out.println("N° de identificação: " + pac.getId());
		System.out.println("Situação do paciente: " + pac.getSitu());
		System.out.println("Status -> [0] Não admitido | [1] Admitido no hospital" + pac.getStatus());
		pac.adms(1);
		System.out.println("Status -> " + pac.getStatus());

	}

}

package entities;

public class Department {
	
	private String name;
	
	public Department() { /* Construtores:Este é um construtor padrão que não recebe argumentos. Ele não executa nenhuma ação especial, apenas inicializa um objeto  */
	}

	public Department(String name) { /* Construtores: Este é um construtor que aceita um argumento do tipo String chamado name. Ele é utilizado para criar um novo objeto Department e definir o nome do departamento.*/
		this.name = name;
	}

	public String getName() {  /**/
		return name;
	}

	public void setName(String name) {  /**/
		this.name = name;
	}
	
	
}

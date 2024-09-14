package entities;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Funcionario {

	private UUID id;
	private String nome;
	private String cpf;
	private String matricula;
	private Endereco endereco;

}

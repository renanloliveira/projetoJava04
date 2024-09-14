package repositories;

import java.io.PrintWriter;

import entities.Funcionario;
import interfaces.FuncionarioRepository;

public class FuncionarioRepositoryXml implements FuncionarioRepository {

	@Override
	public void exportarDados(Funcionario funcionario) {

		try {

			var printWriter = new PrintWriter("funcionario_" + funcionario.getId() + ".xml");

			printWriter.println("<?xml version='1.0' encoding='ISO-8859-1'?>");
			printWriter.println("<funcionario>");
			printWriter.println("    <id>" + funcionario.getId() + "</id>");
			printWriter.println("    <nome>" + funcionario.getNome() + "</nome>");
			printWriter.println("    <cpf>" + funcionario.getCpf() + "</cpf>");
			printWriter.println("    <matricula>" + funcionario.getMatricula() + "</matricula>");
			printWriter.println("    <endereco>");
			printWriter.println("        <id>" + funcionario.getEndereco().getId() + "</id>");
			printWriter.println("        <logradouro>" + funcionario.getEndereco().getLogradouro() + "</logradouro>");
			printWriter.println("        <numero>" + funcionario.getEndereco().getNumero() + "</numero>");
			printWriter
					.println("        <complemento>" + funcionario.getEndereco().getComplemento() + "</complemento>");
			printWriter.println("        <bairro>" + funcionario.getEndereco().getBairro() + "</bairro>");
			printWriter.println("        <cidade>" + funcionario.getEndereco().getCidade() + "</cidade>");
			printWriter.println("        <estado>" + funcionario.getEndereco().getEstado() + "</estado>");
			printWriter.println("        <cep>" + funcionario.getEndereco().getCep() + "</cep>");
			printWriter.println("    </endereco>");
			printWriter.println("</funcionario>");
			
			printWriter.close();
			System.out.println("\nARQUIVO XML GRAVADO COM SUCESSO!");

		} catch (Exception e) {
			System.out.println("\nERRO:" + e.getMessage());
		}

	}

}

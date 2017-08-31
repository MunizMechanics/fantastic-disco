package com.example.demo;

import java.util.List;

public interface GraduacaoRepositorio {
	void inserir(Graduacao g);
	Graduacao consultarPorId(int idGraduacao);
	List<Graduacao> consultarTodos();
}

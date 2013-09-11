package model;

import java.util.Date;

public abstract class Tarefa {

	private Date dataInicio;
	private Date dataTermino;
	private String titulo;
	private String texto;
	private String dificuldade;
	private int bitmapId;
	
	public Tarefa(Date dataInicio, Date dataTermino, String titulo, String texto){
		this.dataInicio = dataInicio;
		this.dataTermino = dataTermino;
		this.titulo = titulo;
		this.texto = texto;
		definirDificuldade();
	}
	
	/*
	 * Atribuir valo às variáveis "dificuldade"
	 * e "bitmapId"
	 */
	protected abstract void definirDificuldade();
	
	
}

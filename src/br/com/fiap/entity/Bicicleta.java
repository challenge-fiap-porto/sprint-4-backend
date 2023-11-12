package br.com.fiap.entity;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Bicicleta {

	private int NumeroSerie;
	private int AnoFabricacao;
	private String modelo;
	private String cor;
	private String avarias;
	public int getNumeroSerie() {
		return NumeroSerie;
	}
	public void setNumeroSerie(int numeroSerie) {
		NumeroSerie = numeroSerie;
	}
	public int getAnoFabricacao() {
		return AnoFabricacao;
	}
	public void setAnoFabricacao(int anoFabricacao) {
		AnoFabricacao = anoFabricacao;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getAvarias() {
		return avarias;
	}
	public void setAvarias(String avarias) {
		this.avarias = avarias;
	}
}

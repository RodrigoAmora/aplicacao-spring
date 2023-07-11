package br.com.rodrigoamora.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Pedido {

	private String nomeDoProduto;
	private BigDecimal valorNegociado;
	private LocalDate dataDeEntrega;
	private String urlProduto;
	private String urlImage;
	private String descricao;

	public String getNomeDoProduto() {
		return nomeDoProduto;
	}

	public void setNomeDoProduto(String nomeDoProduto) {
		this.nomeDoProduto = nomeDoProduto;
	}

	public BigDecimal getValorNegociado() {
		return valorNegociado;
	}

	public void setValorNegociado(BigDecimal valorNegociado) {
		this.valorNegociado = valorNegociado;
	}

	public LocalDate getDataDeEntrega() {
		return dataDeEntrega;
	}

	public void setDataDeEntrega(LocalDate dataDeEntrega) {
		this.dataDeEntrega = dataDeEntrega;
	}

	public String getUrlProduto() {
		return urlProduto;
	}

	public void setUrlProduto(String urlProduto) {
		this.urlProduto = urlProduto;
	}

	public String getUrlImage() {
		return urlImage;
	}

	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;

	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}

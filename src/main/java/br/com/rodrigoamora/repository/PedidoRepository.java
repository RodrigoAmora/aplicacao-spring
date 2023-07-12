package br.com.rodrigoamora.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rodrigoamora.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}

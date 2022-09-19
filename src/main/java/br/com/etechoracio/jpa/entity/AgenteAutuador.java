package br.com.etechoracio.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.etechoracio.jpa.enums.StatusAgenteEnum;
import br.com.etechoracio.jpa.enums.TipoAgenteEnum;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "TBL_AGENTE_AUTUADOR")
public class AgenteAutuador {
	
	@Id
	@Column (name = "ID_AGENTE_AUTUADOR")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column (name = "TX_NOME")
	private String nome;
	
	@Column (name = "TX_FONE")
	private String telefone;
	
	@Enumerated(EnumType.STRING)
	@Column (name = "TP_AGENTE")
	private TipoAgenteEnum tipo;
	
	@Enumerated(EnumType.ORDINAL)
	@Column (name = "ST_AGENTE")
	private StatusAgenteEnum status;
}

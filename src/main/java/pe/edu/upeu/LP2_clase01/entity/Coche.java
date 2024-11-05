package pe.edu.upeu.LP2_clase01.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name="coches")
public class Coche {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	@Column(name="matricula")
	private String matricula;
	@Column(name="numpuertas")
	private int numpuertas;
	
	@ManyToOne
	@JoinColumn(name="marca_id", nullable = false)
	private Marca marca;
	@ManyToOne
	@JoinColumn(name="tipo_id", nullable = false)
	private Tipo tipo;

}

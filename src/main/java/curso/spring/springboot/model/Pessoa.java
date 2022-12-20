
	package curso.spring.springboot.model;

	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;

	@Entity
	public class Pessoa {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		Long id;

		String nome;
		String sobrenome;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getNome() {
			return this.nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getSobrenome() {
			return this.sobrenome;
		}

		public void setSobrenome(String sobrenome) {
			this.sobrenome = sobrenome;
		}
	}



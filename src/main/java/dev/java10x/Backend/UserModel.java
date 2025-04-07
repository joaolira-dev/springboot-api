package dev.java10x.Backend;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


// Transforma uma classe em model no BD
@Entity
@Table(name = "tb_cadastro")
public class UserModel {


      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      Long id;

     
      String nome;
      String email;
      int idade;

      public UserModel(){
      }

    public UserModel(String email, int idade, String nome) {
        this.email = email;
        this.idade = idade;
        this.nome = nome;
    }

    public String getNome() {
       return nome;
    }

    public void setNome(String nome) {
       this.nome = nome;
    }

    public String getEmail() {
       return email;
    }

    public void setEmail(String email) {
       this.email = email;
    }

    public int getIdade() {
       return idade;
    }

    public void setIdade(int idade) {
       this.idade = idade;
    }
}

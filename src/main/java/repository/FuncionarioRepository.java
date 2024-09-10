package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
}

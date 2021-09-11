package songnan.bao.demo.resposiitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import songnan.bao.demo.entity.Student;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface StudentRepo extends JpaRepository<Student, Integer> {
    List<Student> findByFirstname(String firstname);
}

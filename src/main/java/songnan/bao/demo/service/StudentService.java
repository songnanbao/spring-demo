package songnan.bao.demo.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import songnan.bao.demo.entity.Student;
import songnan.bao.demo.resposiitory.StudentRepo;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class StudentService {
    private static final Logger LOG = LogManager.getLogger(StudentService.class);

    @Autowired
    private StudentRepo studentRepo;

    public Student getById(int id) {
        try {
            return studentRepo.findById(id).get();
        } catch (Exception e) {
            LOG.error(e.getMessage() + ". Invalid student ID: " + id);
        }
        return null;
    }

    public List<Student> findByFirstname(String firstname) {
        return studentRepo.findByFirstname(firstname);
    }

    public List<Student> getAll() {
        return studentRepo.findAll();
    }

    public Student save(Student student) {
        return studentRepo.save(student);
    }

    public void removeById(int id) {
        studentRepo.delete(getById(id));
    }
}

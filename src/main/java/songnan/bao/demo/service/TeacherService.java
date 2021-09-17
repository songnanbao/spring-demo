package songnan.bao.demo.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import songnan.bao.demo.entity.Teacher;
import songnan.bao.demo.resposiitory.TeacherRepo;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class TeacherService {
    private static final Logger LOG = LogManager.getLogger(TeacherService.class);

    @Autowired
    private TeacherRepo teacherRepo;

    public Teacher getById(int id) {
        try {
            return teacherRepo.findById(id).get();
        } catch (Exception e) {
            LOG.error(e.getMessage() + ". Invalid teacher ID: " + id);
        }
        return null;
    }

    public List<Teacher> getAll() {
        return teacherRepo.findAll();
    }

    public Teacher save(Teacher teacher) {
        return teacherRepo.save(teacher);
    }

    public void removeById(int id) {
        teacherRepo.delete(getById(id));
    }
}

package songnan.bao.demo.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import songnan.bao.demo.entity.Course;
import songnan.bao.demo.resposiitory.CourseRepo;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CourseService {
    private static final Logger LOG = LogManager.getLogger(CourseService.class);

    @Autowired
    private CourseRepo courseRepo;

    public Course getById(int id) {
        try {
            return courseRepo.findById(id).get();
        } catch (Exception e) {
            LOG.error(e.getMessage() + ". Invalid course ID: " + id);
        }
        return null;
    }

    public List<Course> getAll() {
        return courseRepo.findAll();
    }

    public Course save(Course course) {
        return courseRepo.save(course);
    }

    public void removeById(int id) {
        courseRepo.delete(getById(id));
    }
}

package StudentLife.StudentLifeWithSpringBootAndAngular.service;

import StudentLife.StudentLifeWithSpringBootAndAngular.exception.UserNotFoundException;
import StudentLife.StudentLifeWithSpringBootAndAngular.model.Course;
import StudentLife.StudentLifeWithSpringBootAndAngular.repo.CourseRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class CourseService {
    private final CourseRepo courseRepo;

    @Autowired
    public CourseService(CourseRepo courseRepo) {
        this.courseRepo = courseRepo;
    }

    public Course addCourse(Course course) {
        return courseRepo.save(course);
    }

    public void deleteCourse(Long id) {
        courseRepo.deleteCourseById(id);
    }

    public Course updateCourse(Course course) {
        return courseRepo.save(course);
    }

    public Course findCourseById(Long id) {
        return courseRepo.findCourseById(id).orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found"));
    }

    public List<Course> findAllCourses() {
        return courseRepo.findAll();
    }
}

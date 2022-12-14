package StudentLife.StudentLifeWithSpringBootAndAngular.repo;

import StudentLife.StudentLifeWithSpringBootAndAngular.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CourseRepo extends JpaRepository<Course, Long> {
    void deleteCourseById(Long id);

    Optional<Course> findCourseById(Long id);
}

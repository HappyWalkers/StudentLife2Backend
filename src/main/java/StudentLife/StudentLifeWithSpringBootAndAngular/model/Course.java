package StudentLife.StudentLifeWithSpringBootAndAngular.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Course implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String description;
    private String college;
    private String professor;
    private Integer rating;
    private String imgUrl;

    public Course() {}

    public Course(String name, String description, String college, String professor, Integer rating, String imgUrl){
        this.name = name;
        this.description = description;
        this.college = college;
        this.professor = professor;
        this.rating = rating;
        this.imgUrl = imgUrl;
    }

    public Long getId(){
        return id;
    }

    public  void setId(Long id){
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    @Override
    public  String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", idOfParentCollege=" + college +
                ", idOfProfessor=" + professor +
                ", rating=" + rating +
                ", imgUrl=" + imgUrl +
                '}';
    }
}

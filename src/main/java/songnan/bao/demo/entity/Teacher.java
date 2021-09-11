package songnan.bao.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity(name = "t_teacher")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Teacher implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String firstname;

    @Column
    private String lastname;

    @Column
    private int sex;

    @OneToMany(mappedBy = "teacher")
    private List<Course> courses;

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", sex=" + sex +
                ", courses=" + courses +
                '}';
    }
}

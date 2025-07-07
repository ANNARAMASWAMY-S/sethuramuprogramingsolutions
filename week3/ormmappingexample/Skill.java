import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "skill")
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

   
    @ManyToMany(mappedBy = "skillList", fetch = FetchType.LAZY)
    private List<Employee> employeeList;

    
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public List<Employee> getEmployeeList() { return employeeList; }
    public void setEmployeeList(List<Employee> employeeList) { this.employeeList = employeeList; }

    @Override
    public String toString() {
        return "Skill [id=" + id + ", name=" + name + "]";
    }
}

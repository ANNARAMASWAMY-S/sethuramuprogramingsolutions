import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import jakarta.transaction.Transactional;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    @Transactional
    public Department get(int id) {
        return departmentRepository.findById(id).get();
    }

    @Transactional
    public void save(Department department) {
        departmentRepository.save(department);
    }
}

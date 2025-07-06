import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Testing {

     public Integer addEmployee(Employee employee){
      Session session = factory.openSession();
      Transaction tx = null;
      Integer employeeID = null;
      
      try {
         tx = session.beginTransaction();
         employeeID = (Integer) session.save(employee); 
         tx.commit();
      } catch (HibernateException e) {
         if (tx != null) tx.rollback();
         e.printStackTrace(); 
      } finally {
         session.close(); 
      }
      return employeeID;
   }


	public static void main(String[] args) 
	{
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		
		Session session = factory.openSession();
		
		
		session.beginTransaction();
		
		Employee user1=new Employee();
		
		user1.setId(55);
		
		user1.setName("abc");
		
		
		
		
		session.persist(user1);
		
		
		
		
		session.getTransaction().commit();
		
		
		session.close();
		
		
		
        factory.close();
		
		
	}

}

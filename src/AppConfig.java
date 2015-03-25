import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;


@Configuration
@ComponentScan({"com.pluralsight"})
public class AppConfig {

	@Bean(name="customerService")
	public CustomerService getCustomerService() {
		CustomerServiceImpl customerServiceImpl = new CustomerServiceImpl();
		//customerServiceImpl.setCustomerRepository(getCustomerRepository());
		return customerServiceImpl; 		
	}
	
//	@Bean(name ="customerRepository")
//	public CustomerRepository getCustomerRepository() {
//		return new HibernateCustomerRepositoryImpl();
//	}
}

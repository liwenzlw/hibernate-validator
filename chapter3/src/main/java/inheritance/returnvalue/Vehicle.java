//tag::include[]
package inheritance.returnvalue;

//end::include[]

import javax.validation.constraints.NotNull;
import java.util.List;

//tag::include[]
public interface Vehicle {

	@NotNull
	List<Person> getPassengers();
}
//end::include[]

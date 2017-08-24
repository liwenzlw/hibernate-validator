//tag::include[]
package inheritance.returnvalue;

//end::include[]

import javax.validation.constraints.Size;
import java.util.List;

//tag::include[]
public class Car implements Vehicle {

	@Override
	@Size(min = 1)
	public List<Person> getPassengers() {
		//...
		return null;
	}
}
//end::include[]

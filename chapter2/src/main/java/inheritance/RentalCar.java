//tag::include[]
package inheritance;

//end::include[]

import javax.validation.constraints.NotNull;

//tag::include[]
public class RentalCar extends Car {

	private String rentalStation;

	@NotNull
	public String getRentalStation() {
		return rentalStation;
	}

	//...
}
//end::include[]

//tag::include[]
package containerelement.custom;

//end::include[]

//tag::include[]
public class Car {

	private GearBox<@MinTorque(100) Gear> gearBox;

	public void setGearBox(GearBox<Gear> gearBox) {
		this.gearBox = gearBox;
	}

	//...

}
//end::include[]

package springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Test {
	
	@NotNull(message="is required!")
	@Size(min=1, message="is required!")
	private String carMark;
	
	Test(){
		
	}
	
	public String getCarMark() {
		return carMark;
	}

	public void setCarMark(String carMark) {
		this.carMark = carMark;
	}

}

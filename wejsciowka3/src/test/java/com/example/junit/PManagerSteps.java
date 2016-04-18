package com.example.junit;

import static org.junit.Assert.assertEquals;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class PManagerSteps {
	
	private PlaneManager man;
	
	@Given("a plane")
	public void planeSetup(){
		PlaneManager planeManager = new PlaneManager();
	}
	
	@When("add to list $a $b $c")
	public void setArguments(String a, String b, int c){
		
		int planeSizeBeforeAdd = 0;

		Plane samolot = new Plane(String name, String type, int amount);

		planeManager.addPlane(samolot);

		int planeSizeAfterAdd = planeManager.planes.size();

		int planesSub = planeSizeAfterAdd - planeSizeBeforeAdd;

		assertEquals(1, planesSub);

		assertEquals(NAME_1, planeManager.planes.get(planeManager.planes.size() - 1).getName());
		assertEquals(TYPE_1, planeManager.planes.get(planeManager.planes.size() - 1).getType());
		assertEquals(AMOUNT_1, planeManager.planes.get(planeManager.planes.size() - 1).getAmount());

	}
	
    @Then("adding should return $result")
	public void shouldAdd(int result){
		assertEquals(result, calc.add());
	}
    
    @Then("subtracting should return $result")
  	public void shouldSubstract(int result){
  		assertEquals(result, calc.subtract());
  	}
}

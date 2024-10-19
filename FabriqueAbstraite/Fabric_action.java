package FabriqueAbstraite;

public class Fabric_action extends Fabric_abstraite_film{

	@Override
	public Actor creerActor() {
		// TODO Auto-generated method stub
		return new Ji_chang_wook();
	}

	@Override
	public Scenario creerScenario() {
		// TODO Auto-generated method stub
		return new Action_scenario();
	}

}

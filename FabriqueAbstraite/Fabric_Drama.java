package FabriqueAbstraite;

public class Fabric_Drama extends Fabric_abstraite_film{

	@Override
	public Actor creerActor() {
		// TODO Auto-generated method stub
		return new Lee_min_hoo();
	}

	@Override
	public Scenario creerScenario() {
		// TODO Auto-generated method stub
		return new Drama_scenario();
	}

}

package FabriqueAbstraite;

public class Fabric_fantasty extends Fabric_abstraite_film{

	@Override
	public Actor creerActor() {
		// TODO Auto-generated method stub
		return new Lee_seung_ji();
	}

	@Override
	public Scenario creerScenario() {
		// TODO Auto-generated method stub
		return new Fantastic_scenario();
	}

}

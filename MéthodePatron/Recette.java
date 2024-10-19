package MéthodePatron;

public abstract class Recette {
	 public void preparer() {
	        preparerIngredients();
	        cuire();
	        servir();
	    }

	    protected abstract void preparerIngredients();

	    protected abstract void cuire();

	    protected void servir() {
	        System.out.println("Servir dans une assiette.");
	    }

}

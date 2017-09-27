public class Roll {
	public final int amountOfPinsKnocked;
	public final boolean isStrike;
	private final int amountOfPinsNeededForStrike = 10;

	public Roll(int amountOfPinsKnocked) {
		this.amountOfPinsKnocked = amountOfPinsKnocked;
		this.isStrike = this.isStrike(); // Je pourrais aussi juste mettre `amountOfPinsKnocked == amountOfPinsNeededForStrike`
	}

	private boolean isStrike() {
		return amountOfPinsKnocked == amountOfPinsNeededForStrike;
	}
}

import java.util.LinkedList;

public abstract class Frame {
	private final int pinsPerSet = 10;
	private final LinkedList<Roll> rolls;
	private int pinsKnocked;

	Frame() {
		this.pinsKnocked = 0;
		this.rolls = new LinkedList<Roll>();
	}

	void Roll(int amountOfPinsKnocked) throws KnockedMorePinsThanPossibleException {
		preconditionsForRoll(amountOfPinsKnocked);
		pinsKnocked += amountOfPinsKnocked;
		manageRoll(amountOfPinsKnocked);
	}

	private void preconditionsForRoll(int amountOfPinsKnocked) throws KnockedMorePinsThanPossibleException {
		if (this.pinsKnocked + amountOfPinsKnocked > pinsPerSet) {
			throw new KnockedMorePinsThanPossibleException();
		}
	}

	protected abstract void manageRoll(int amountOfPinsKnocked);
}

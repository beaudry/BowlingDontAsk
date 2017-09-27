import java.util.LinkedList;

public abstract class Frame {
	final int pinsPerSet = 10;
	LinkedList<Roll> rolls;
	int pinsKnocked;

	public Frame() {
		this.pinsKnocked = 0;
		this.rolls = new LinkedList<Roll>();
	}

	void Roll(int amountOfPinsKnocked) throws KnockedMorePinsThanPossibleException {
		preconditionsForRoll(amountOfPinsKnocked);
		manageRoll();
	}

	private void preconditionsForRoll(int amountOfPinsKnocked) throws KnockedMorePinsThanPossibleException {
		if (this.pinsKnocked + amountOfPinsKnocked > pinsPerSet) {
			throw new KnockedMorePinsThanPossibleException();
		}
	}

	protected abstract void manageRoll();
}

public class HomeTheatre {
    private static int stateCount = 0;
    private LedTV ledTV;
    private Speaker speaker;

    public HomeTheatre(LedTV ledTV, Speaker speaker) {
        this.ledTV = ledTV;
        this.speaker = speaker;
        // __________(1)__________++;
        stateCount++;
    }

    public static int getStateCount() {
        return stateCount;
    }

    public Memento getMemento() {
        // return __________(2)__________(ledTV, speaker);
        return new Memento(ledTV, speaker);
    }

    public void setMemento(Memento memento) {
        // ledTV = __________(3)__________();
        ledTV = memento.getLedTV();
        // speaker = __________(4)__________();
        speaker = memento.getSpeaker();
    }

    @Override
    public String toString() {
        return ledTV + "\n    " + speaker;
    }
}

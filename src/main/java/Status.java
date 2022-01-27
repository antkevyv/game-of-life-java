public enum Status {
    NONE,
    BORN,
    LIVE,
    DIED;

    /**
     * Rules of game
     * @param around cell
     * @return behaviour
     */

    public Status stepOne(int around) {
        switch (this) {
            case NONE: return (around == 3) ? BORN : NONE;
            case LIVE: return (around <= 1 || around > 4) ? DIED : LIVE;
            default: return this;
        }
    }

    public Status stepTwo() {
        switch (this) {
            case BORN: return LIVE;
            case DIED: return NONE;
            default: return this;
        }
    }

    public boolean isCell() {
        return this == LIVE || this == DIED;
    }
}

class FeedAction implements Action {
    @Override
    public String execute(Creature creature) {
        creature.feed();
        return creature.toString() + " has been fed";
    }

    @Override
    public String menuDescription(Creature creature) {
        return "Feed this " + creature.getClass().getSimpleName() + " " + creature.toString();
    }
}

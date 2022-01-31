class MakeACaptain {
    private static MakeACaptain captain;
    // ! private
    private MakeACaptain() {}

    public static MakeACaptain getCaptain() {
        if (captain == null)
            captain = new MakeACaptain();
        return captain;
    }
}

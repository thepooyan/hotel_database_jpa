package Model;

public enum RoomType {
    STANDARD("Standard Room"),
    DELUXE("Deluxe Room");

    private final String displayName;

    RoomType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
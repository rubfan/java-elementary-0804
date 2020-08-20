package adapter;

public class HelmetVR implements PlaystationVR {
    private GamePlayer player;

    public HelmetVR(GamePlayer player) {
        this.player = player;
    }

    @Override
    public void connectToVirtualReality() {
        this.player.startVideoGame();
        this.player.finishVideoGame();
    }
}

package storage;

public class KitchenTool extends StorageElement {
    /**
     * KitchenTool class shall be used to follow the states of our tools
     * The tools shall be identified by name (creating new classes are not necessary)
     * The amount of each tool shall be also followed
     * The following states are mandatory:
     *      available
     *      in use
     *      dirty
     *      depreciated
     *
     * hint: Map
     */

    public final String State_AVAILABLE = "available";
    public final String State_IN_USE = "in use";
    public final String State_DIRTY = "dirty";
    public final String DEPRECIATED = "depreciated";

    private String state;
}

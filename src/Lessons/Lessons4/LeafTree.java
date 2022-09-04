package Lessons.Lessons4;

public abstract class LeafTree extends Tree{
    private boolean  hasLeaf;

    public LeafTree(int height, boolean hasLeaf){
            super (height);
            this.hasLeaf = hasLeaf;
        }
}

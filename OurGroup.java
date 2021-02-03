import java.util.Vector;

public class OurGroup {

    private Vector<String> groupMembers;
    public OurGroup()
    {
        groupMembers = new Vector<String>();
        groupMembers.add("Chisanucha"); //PUT YOUR NAME HERE
        groupMembers.add("Suckchai"); //PUT YOUR NAME HERE
        groupMembers.add("Krisda"); //PUT YOUR NAME HERE
    }
    public Vector<String> getGroupMembers () {
        return groupMembers;
    }

}
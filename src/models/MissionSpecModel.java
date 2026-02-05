package models;

public class MissionSpecModel extends BaseModel {

    public static final Field<String> TITLE = new Field<>("Title", String.class);
    public static final Field<String> CONTENT = new Field<>("Content", String.class);

    public MissionSpecModel(String title, SecurityLevel securityLevel) {
        super(securityLevel);
        this.objectApiName = "Mission Spec";
        this.fields.put(TITLE, title);
        this.fields.put(CONTENT, null);
    }
}

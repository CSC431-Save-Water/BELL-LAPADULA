package models;

public class WeaponsSpecModel extends BaseModel {

    public static final Field<String> NAME = new Field<>("Name", String.class);
    public static final Field<String> DESCRIPTION = new Field<>("Description", String.class);
    public static final Field<String> CLASSIFICATION = new Field<>("Classification", String.class);

    public WeaponsSpecModel(String name, SecurityLevel securityLevel) {
        super(securityLevel);
        this.objectApiName = "Weapon Spec";
        this.fields.put(NAME, name);
        this.fields.put(DESCRIPTION, null);
        this.fields.put(CLASSIFICATION, null);
    }
}
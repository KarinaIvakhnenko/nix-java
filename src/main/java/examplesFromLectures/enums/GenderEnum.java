package examplesFromLectures.enums;

public enum GenderEnum {
    MALE("male", "м"),
    FEMALE("female", "ж"),
    AGENDER("agender", "неоп");

    private final String typeOfGender;
    private final String ruTypeOfGender;

    GenderEnum(String typeOfGender, String ruTypeOfGender) {
        this.typeOfGender = typeOfGender;
        this.ruTypeOfGender = ruTypeOfGender;
    }

    public String getTypeOfGender(){
        return typeOfGender;
    }

    public String getRuTypeOfGender(){
        return ruTypeOfGender;
    }
}

package gt.edu.umg.solidPrinciplesHt1.model;

public class SpaceMission {


    public String getNameMission(int yearMission){

        switch (yearMission){
            case 1961:
                return  "Mercury Program";
            case 1965:
                return "Gemini Program";
            case 1968:
                return "Apollo Program";
            case 1973:
                return "Skylab Program";
            case 1975:
                return "Apollo–Soyuz Test Project";
            default:
                return "no information found";
        }
    }
}

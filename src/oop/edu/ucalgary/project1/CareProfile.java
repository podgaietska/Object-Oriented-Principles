package oop.edu.ucalgary.project1;

public class CareProfile {
    private String[] medList;
    private String medInstrucations;
    private String feedingInstructions;

    public CareProfile(String[] meds, String medInstr, String feedingInstr){
        this.medList = meds;
        this.medInstrucations = medInstr;
        this.feedingInstructions = feedingInstr;
    }

    public String summarizeCareInstructions(){
        String summary = "";
        for (int i = 0; i < this.medList.length; i++){
            summary += this.medList[i] + ", ";
        }
        summary += "\n" + this.medInstrucations + "\n" + this.feedingInstructions;
        return summary;
    }
}

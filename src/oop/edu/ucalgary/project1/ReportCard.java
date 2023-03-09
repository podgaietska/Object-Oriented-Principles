package oop.edu.ucalgary.project1;

public class ReportCard {
    private final Booking REPORT;

    public ReportCard(Booking reportInfo){
        this.REPORT = reportInfo;
    }

    public String printReport(){
        String report = this.REPORT.getCaregiver().getName() + " enjoyed taking care of " + this.REPORT.getBookedPet().getName() + ". See you next time!";
        return report;
    }
}

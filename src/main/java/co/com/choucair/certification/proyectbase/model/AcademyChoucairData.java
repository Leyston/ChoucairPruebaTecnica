package co.com.choucair.certification.proyectbase.model;


public class AcademyChoucairData {
    private String strUser;
    private String strPassword;
    private String srtCourse;

    public AcademyChoucairData(String strUser, String strPassword, String srtCourse) {
        this.strUser = strUser;
        this.strPassword = strPassword;
        this.srtCourse = srtCourse;
    }

    public String getStrUser() {
        return strUser;
    }

    public void setStrUser(String strUser) {
        this.strUser = strUser;
    }

    public String getStrPassword() {
        return strPassword;
    }

    public void setStrPassword(String strPassword) {
        this.strPassword = strPassword;
    }

    public String getSrtCourse() {
        return srtCourse;
    }

    public void setSrtCourse(String srtCourse) {
        this.srtCourse = srtCourse;
    }
}

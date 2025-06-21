package entity;

public enum UserRoles {

    ADMIN ("admin"),
    USER ("user"),
    ALUNO ("aluno"),
    PROFESSOR ("professor"),
    COORDENACAO ("coordenacao"),
    DCE ("dce"),
    DA ("da");

    private String role;


     UserRoles(String role){

        this.role = role;

    }

    public String getRole() {

         return role;

    }

}

package org.example;

public class EntrenadorTenis implements Entrenador {

    protected String email;
    protected String equipo;



    @Override
    public String Entrenamiento() {
        return "Hacer 50 saques directos";
    }

    @Override
    public int getExperiencia() {
        return 0;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        System.out.println("Inyeccion de un literal en un metodo setter: " + email);
        this.email = email;
    }

    @Override
    public String getEquipo() {
        return equipo;
    }

    @Override
    public void setEquipo(String equipo) {
        System.out.println("Inyeccion de un literal en un metodo setter: " + equipo);
        this.equipo = equipo;
    }
}

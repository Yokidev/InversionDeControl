package org.example;

public interface Entrenador {

    public String getEmail();
    public void setEmail(String email);
    public String getEquipo();
    public void setEquipo(String equipo);

    public abstract String Entrenamiento();
    public abstract int getExperiencia();
}


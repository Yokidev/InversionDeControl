package org.example;

import org.example.dependencies.ExperienciaServicio;

public class EntrenadorBaloncesto implements Entrenador {

    private ExperienciaServicio experienciaServicio;

    @Override
    public String getEmail() {
        return null;
    }

    @Override
    public void setEmail(String email) {

    }

    @Override
    public String getEquipo() {
        return null;
    }

    @Override
    public void setEquipo(String equipo) {

    }

    @Override
    public String Entrenamiento() {
        return "Lanzar 30 tiros a canasta";
    }

    @Override
    public int getExperiencia() {
        return experienciaServicio.getExperiencia();
    }

    public void setExperienciaServicio(ExperienciaServicio experienciaServicio) {
        System.out.println("Inyección en un método setter");
        this.experienciaServicio = experienciaServicio;
    }
}

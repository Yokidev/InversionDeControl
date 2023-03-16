package org.example;

import org.example.dependencies.ExperienciaServicio;

public class EntrenadorFutbol implements Entrenador {

    private ExperienciaServicio experienciaServicio;

    public EntrenadorFutbol(ExperienciaServicio experienciaServicio) {
        System.out.println("Inyeccion en el constructor");
        this.experienciaServicio = experienciaServicio;
    }

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
        return "Correr durante 30min";
    }

    @Override
    public int getExperiencia() {
        return experienciaServicio.getExperiencia();
    }

}


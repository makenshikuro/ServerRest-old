/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author Estudio
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(Servicio.AsignaturasFacadeREST.class);
        resources.add(Servicio.CORS.class);
        resources.add(Servicio.CoordenadasFacadeREST.class);
        resources.add(Servicio.EdificiosFacadeREST.class);
        resources.add(Servicio.EspaciosFacadeREST.class);
        resources.add(Servicio.PanoramasFacadeREST.class);
        resources.add(Servicio.ProfesorasignaturaFacadeREST.class);
        resources.add(Servicio.ProfesoresFacadeREST.class);
    }
    
}

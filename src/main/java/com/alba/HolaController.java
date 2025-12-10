package com.alba; //modificado desde IntelliJ Idea - Alba Prado

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class HolaController {
    
    @GetMapping("/hola")
    public String holaMundo() {
        System.out.println("✨ Alguien llamó a /hola");
        return "Hola mundo de Alba desde Java Backend";
    }
    
    @GetMapping("/")
    public String paginaInicio() {
        return """
               <div style="
                    font-family: Arial, sans-serif;
                    padding: 40px;
                    max-width: 600px;
                    margin: 0 auto;
               ">
                   <h1 style="color: #4CAF50;">🎯 Backend Java Funcionando</h1>
                   <p>¡Enhorabuena Alba! Tu backend Spring Boot está corriendo.</p>
                   
                   <h3>🔗 Endpoints disponibles:</h3>
                   <ul>
                       <li><a href="/hola" target="_blank">/hola</a> - Saludo básico</li>
                       <li><a href="/saludo/Alba" target="_blank">/saludo/{nombre}</a> - Saludo personalizado</li>
                       <li><a href="/info" target="_blank">/info</a> - Información del sistema</li>
                   </ul>
                   
                   <h3>🚀 Próximo paso:</h3>
                   <p>Conectar con Angular en <code>http://localhost:4200</code></p>
                   
                   <div style="
                        margin-top: 30px;
                        padding: 15px;
                        background: #f5f5f5;
                        border-radius: 5px;
                   ">
                       <strong>Tecnologías:</strong> Java 25 + Spring Boot 3.3 + Maven
                   </div>
               </div>
               """;
    }
    
    @GetMapping("/saludo/{nombre}")
    public String saludar(@PathVariable String nombre) {
        String mensaje = "Hola " + nombre + ", bienvenido/a al backend Java";
        System.out.println("👋 Saludo enviado para: " + nombre);
        return mensaje;
    }
    
    @GetMapping("/info")
    public String info() {
        return """
               {
                 "status": "success",
                 "message": "Backend funcionando correctamente",
                 "technologies": ["Java 25", "Spring Boot 3.3", "Maven 3.9.11"],
                 "student": "Alba",
                 "endpoints": ["/", "/hola", "/saludo/{nombre}", "/info"]
               }
               """;
    }
}
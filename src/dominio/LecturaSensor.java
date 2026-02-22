package dominio;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.*;
import java.util.*;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class LecturaSensor {
    private String id;
    private String valor;
    private String tipo;
    private String timestamp;

    public LecturaSensor(String id, String valor, String tipo, String timestamp) {
        this.id = id;
        this.valor = valor;
        this.tipo = tipo;
        this.timestamp = timestamp;
    }
    public String getId() {
        return id;
    }
    public String getValor() {
        return valor;
    }
    public String getTipo() {
        return tipo;
    }   
    public String getTimestamp() {
        return timestamp;
    }
    public String toString() {
        return "id: " + id + ", valor: " + valor + ", tipo: " + tipo + ", timestamp: " + timestamp;
    }




public static void main(String[] args) throws Exception {
    List<LecturaSensor> lecturas = List.of( 
        new LecturaSensor("1", "25.5", "temperatura", "2024-06-01T10:00:00"),
        new LecturaSensor("2", "60.0", "humedad", "2024-06-01T10:05:00"),
        new LecturaSensor("3", "22.0", "temperatura", "2024-06-01T10:10:00")
    );
    //1. Filtrar lecturas por un tipo específico (ejemplo: "temperatura").
  String tipoBuscado = "temperatura";
List<LecturaSensor> filtradas = lecturas.stream().filter(l->l.getTipo().equals(tipoBuscado)).toList();
System.out.println("Lecturas filtradas por tipo " + tipoBuscado + ":");
filtradas.forEach(System.out::println);

//2
Instant hace24h = Instant.now().minus(24, ChronoUnit.HOURS);
double promedio = lecturas.stream()
    .filter(l -> l.getTipo().equals("temperatura") && Instant.parse(l.getTimestamp()).isAfter(hace24h))
    .mapToDouble(l -> Double.parseDouble(l.getValor()))
    .average()
    .orElse(Double.NaN);
System.out.println("Promedio de temperaturas en las últimas 24 horas: " + promedio);

//3
OptionalDouble maxValor = lecturas.stream()
    .filter(l -> l.getTipo().equals("temperatura"))
    .mapToDouble(l -> Double.parseDouble(l.getValor()))
    .max();
System.out.println("Máximo valor de temperatura: " + maxValor.orElse(Double.NaN));
}
}




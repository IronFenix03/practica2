package practicavectores2;

import java.util.Objects;

public class alumnnosej1 {
private double nota;
private String nombre;



public alumnnosej1(String nombre) {
	super();
	this.nombre = nombre;
}
public alumnnosej1(double nota, String nombre) {
	super();
	this.nota = nota;
	this.nombre = nombre;
}
public double getNota() {
	return nota;
}
public void setNota(double nota) {
	this.nota = nota;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
@Override
public int hashCode() {
	return Objects.hash(nombre, nota);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	alumnnosej1 other = (alumnnosej1) obj;
	return nombre == other.nombre && nota == other.nota;
}


}